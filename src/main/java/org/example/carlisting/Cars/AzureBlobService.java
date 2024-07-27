package org.example.carlisting.Cars;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobClientBuilder;
import com.azure.storage.blob.BlobContainerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class AzureBlobService {

    private final String connectStr = "DefaultEndpointsProtocol=https;AccountName=imagestoragez;AccountKey=OIfXrUWnbXkQVV18Isf09Ft9hJhcPJ0sovQb36OE2bqnU7U+s8GEq4sxFjmVyfyCGZKUPrfD9UHc+ASt64bo3w==;EndpointSuffix=core.windows.net";
    private final String containerName = "image-containerz";


    private BlobContainerClient getBlobContainerClient(){
        return new BlobClientBuilder().connectionString(connectStr).containerName(containerName).buildClient().getContainerClient();
    }

    public String uploadImage(MultipartFile file) throws IOException {
        BlobClient blobClient = getBlobContainerClient().getBlobClient(file.getOriginalFilename());
        blobClient.upload(file.getInputStream(), file.getSize(), true);
        return blobClient.getBlobUrl();

    }


}
