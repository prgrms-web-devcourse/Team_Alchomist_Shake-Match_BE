package com.shake_match.alchomist.amazon.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Service
@NoArgsConstructor
public class S3Service {
    private AmazonS3 s3Client;

    @Value("${cloud.aws.credentials.accessKey}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secretKey}")
    private String secretKey;

    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    @Value("${cloud.aws.region.static}")
    private String region;

    @PostConstruct
    public void setS3Client() {
        AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
        s3Client = AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(this.region)
                .build();
    }

    public void getImage(MultipartFile file) throws IOException {
//        String fileName = file.getOriginalFilename();
//        s3Client.getObject(new GetObjectRequest(bucket, fileName));
//        return fileName;

        String destFilename = "C:/Users/wooko/Desktop/칵테일 사진모음";
        S3Object s3object = s3Client.getObject(bucket, "cake.jpg");
    }

    public String upload(String currentFilePath, MultipartFile file) throws IOException {
//        고유한 key 값을 갖기위해 현재 시간을 postfix로 붙여줌
//        SimpleDateFormat date = new SimpleDateFormat("yyyyMMddHHmmss");
//        String fileName = file.getOriginalFilename() + "-" + date.format(new Date());

        // 파일 업로드
        String fileName = file.getOriginalFilename();
        s3Client.putObject(new PutObjectRequest(bucket, fileName, file.getInputStream(), null)
                .withCannedAcl(CannedAccessControlList.PublicRead));
        return fileName;
    }

    public void delete(String currentFilePath, MultipartFile file) {
        // key가 존재하면 기존 파일은 삭제
        if (!"".equals(currentFilePath) && currentFilePath != null) {
            boolean isExistObject = s3Client.doesObjectExist(bucket, currentFilePath);

            if (isExistObject) {
                s3Client.deleteObject(bucket, currentFilePath);
            }
        }
    }
}
