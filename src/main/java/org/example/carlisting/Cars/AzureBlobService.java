package org.example.carlisting.Cars;

import com.azure.storage.blob.*;
import groovy.transform.AutoClone;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;


@Service
public class AzureBlobService {

    @Value("${secret.connectStr}")
    private String connectStr;

    @Value("${secret.containerName}")
    private String containerName;



    private BlobContainerClient getBlobContainerClient(){
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();
        return blobServiceClient.getBlobContainerClient(containerName);    }

    public String uploadImage(MultipartFile file) throws IOException {
        String originalFilename = Objects.requireNonNullElse(file.getOriginalFilename(), "default-filename");

        // Optionally, sanitize the filename to remove any special characters
        String sanitizedFilename = originalFilename.replaceAll("[^a-zA-Z0-9-_\\.]", "_");

        BlobClient blobClient = getBlobContainerClient().getBlobClient(sanitizedFilename);
        blobClient.upload(file.getInputStream(), file.getSize(), true);
        return blobClient.getBlobUrl();
    }


}
