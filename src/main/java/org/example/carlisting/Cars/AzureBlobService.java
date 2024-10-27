package org.example.carlisting.Cars;

import com.azure.storage.blob.*;
import groovy.transform.AutoClone;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;


@Service
public class AzureBlobService {
    private Dotenv dotenv;
    @Autowired
    public AzureBlobService(Dotenv dotenv) {
        this.dotenv = dotenv;
    }


    private final String connectStr = "";

    private final String containerName = "image-containerz";



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
