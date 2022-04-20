package com.developmentsolutions.AmazonRSH.awsCode;

import java.util.*;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.InternalServerErrorException;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputExceededException;
import com.amazonaws.services.dynamodbv2.model.RequestLimitExceededException;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
// include the following class when using DynamoDB Local
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.developmentsolutions.AmazonRSH.models.Call;

/**
 *  Following generated code sample describes use of AWS SDK for Java v1 for calling Amazon DynamoDB APIs
 *
 *  This generated code sample requires Java version 1.6 or higher
 *  NOTE: The decodeBinaryString method below uses java.util.Base64 which is only available since Java 1.8
 *
 *  Before running the code below, please follow these steps to setup your workspace if you have not
 *  set it up already:
 *  1) Setup the AWS SDK for Java v1. Instructions for setup using Maven (one of the supported build systems):
 *    To select individual SDK modules, use the AWS SDK for Java v1 bill of materials (BOM) for Maven, which will ensure
 *      that the modules you specify use the same version of the SDK and that they're compatible with each other.
 *    To use the BOM, add a <dependencyManagement> section to your application's pom.xml file,
 *     adding aws-java-sdk-bom as a dependency and specifying the version of the SDK you want to use:
 *
 *     <dependencyManagement>
 *       <dependencies>
 *         <dependency>
 *           <groupId>com.amazonaws</groupId>
 *           <artifactId>aws-java-sdk-bom</artifactId>
 *           <version>1.11.327</version>
 *           <type>pom</type>
 *           <scope>import</scope>
 *         </dependency>
 *       </dependencies>
 *     </dependencyManagement>
 *
 *    You can now select individual modules from the SDK that you use in your application. Because you already declared
 *    the SDK version in the BOM, you don't need to specify the version number for each component.
 *      <dependencies>
 *       <dependency>
 *         <groupId>com.amazonaws</groupId>
 *         <artifactId>aws-java-sdk-dynamodb</artifactId>
 *       </dependency>
 *     </dependencies>
 *
 *   Please refer the following guide for other supported build systems:
 *     https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-install.html
 *
 *  2) Setup credentials for DynamoDB access. One of the ways to setup credentials is to add them to
 *    ~/.aws/credentials file (C:\Users\USER_NAME\.aws\credentials file for Windows users) in
 *    following format:
 *
 *    [<profile_name>]
 *    aws_access_key_id = YOUR_ACCESS_KEY_ID
 *    aws_secret_access_key = YOUR_SECRET_ACCESS_KEY
 *
 *    If <profile_name> is specified as "default" then AWS SDKs and CLI will be able to read the credentials
 *    without any additional configuration. But if a different profile name is used then it needs to be
 *    specified while initializing DynamoDB client via AWS SDKs or while configuring AWS CLI.
 *    Please refer following guide for more details on credential configuration:
 *    https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html
 */
public class CallAmazonDynamoDBScanGeneratedCode {

    public static void main(String[] args) {
        // Create the DynamoDB Client with the region you want
        AmazonDynamoDB dynamoDB = createDynamoDbClient("us-west-1");

        try {
            // Create ScanRequest
            ScanRequest scanRequest = createScanRequest();
            ScanResult scanResult = dynamoDB.scan(scanRequest);
            /*for (Map<String, AttributeValue> item: scanResult.getItems()){
                printItem(item);
                //System.out.println(item);

            }*/
            //System.out.println(scanResult.getItems());
            System.out.println("Scan successful.");
            // Handle scanResult

        } catch (Exception e) {
            handleScanErrors(e);
        }
    }
    private static void printItem(Map<String, AttributeValue> attributeList) {
        for (Map.Entry<String, AttributeValue> item : attributeList.entrySet()) {
            String attributeName = item.getKey();
            AttributeValue value = item.getValue();
            System.out.println(attributeName + " " + (value.getS() == null ? "" : "S=[" + value.getS() + "]")
                    + (value.getN() == null ? "" : "N=[" + value.getN() + "]")
                    + (value.getB() == null ? "" : "B=[" + value.getB() + "]")
                    + (value.getSS() == null ? "" : "SS=[" + value.getSS() + "]")
                    + (value.getNS() == null ? "" : "NS=[" + value.getNS() + "]")
                    + (value.getBS() == null ? "" : "BS=[" + value.getBS() + "] \n"));
        }
    }

    public static List<Call> LoadCalls(){

        List<Call> employees = new ArrayList<Call>();
        AmazonDynamoDB dynamoDB = createDynamoDbClient("us-west-2");

        try {
            // Create ScanRequest
            ScanRequest scanRequest = createScanRequest();
            ScanResult scanResult = dynamoDB.scan(scanRequest);
            System.out.println("Scan successful.");


            for (Map<String, AttributeValue> item: scanResult.getItems()){
                employees.add(addCall(item));
                //System.out.println(item);

            }

            System.out.println(employees);


            // Handle scanResult


        } catch (Exception e) {
            handleScanErrors(e);

        }
        return employees;
    }

    private static Call addCall(Map<String, AttributeValue> attributeList) {

        Call c = new Call();

        for (Map.Entry<String, AttributeValue> item : attributeList.entrySet()) {
            String attributeName = item.getKey();
            AttributeValue value = item.getValue();

            if (attributeName == "call_reason"){ c.setCall_reason(value.getS());}
            if (attributeName == "user_name"){ c.setUser_name(value.getS());}
            if (attributeName == "timestamp"){ c.setTimestamp(value.getS());}
            if (attributeName == "description"){ c.setDescription(value.getS());}
            if (attributeName == "video_reference"){ c.setVideo_reference(value.getS());}

            if (attributeName == "agent_id"){ c.setAgent_id(Integer.parseInt(value.getN()));}
            if (attributeName == "duration"){ c.setDuration(Integer.parseInt(value.getN()));}


            if (attributeName == "video_settings"){ c.setVideo_settings(value.getNS());}
            if (attributeName == "tags"){ c.setTags(value.getNS());}
            if (attributeName == "permissions"){ c.setPermissions(value.getNS());}



            /*System.out.println(attributeName + " " + (value.getS() == null ? "" : "S=[" + value.getS() + "]")
                    + (value.getN() == null ? "" : "N=[" + value.getN() + "]")
                    + (value.getB() == null ? "" : "B=[" + value.getB() + "]")
                    + (value.getSS() == null ? "" : "SS=[" + value.getSS() + "]")
                    + (value.getNS() == null ? "" : "NS=[" + value.getNS() + "]")
                    + (value.getBS() == null ? "" : "BS=[" + value.getBS() + "] \n"));*/
        }

        System.out.println(c.getUser_name());
        return c;
    }



    private static AmazonDynamoDB createDynamoDbClient(String region) {
        // Use the following builder instead when using DynamoDB Local
        return AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "localhost")).withCredentials(
                        new AWSStaticCredentialsProvider(new BasicAWSCredentials("8mip6g", "w9eesa"))
                )
                .build();
        //return AmazonDynamoDBClientBuilder.standard().withRegion(region).build();
    }

    private static ScanRequest createScanRequest() {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName("Call");
        scanRequest.setConsistentRead(false);
        System.out.println(scanRequest);
        return scanRequest;
    }

    // Handles errors during Scan execution. Use recommendations in error messages below to add error handling specific to
    // your application use-case.
    private static void handleScanErrors(Exception exception) {
        try {
            throw exception;
        } catch (Exception e) {
            // There are no API specific errors to handle for Scan, common DynamoDB API errors are handled below
            handleCommonErrors(e);
        }
    }

    private static void handleCommonErrors(Exception exception) {
        try {
            throw exception;
        } catch (InternalServerErrorException isee) {
            System.out.println("Internal Server Error, generally safe to retry with exponential back-off. Error: " + isee.getErrorMessage());
        } catch (RequestLimitExceededException rlee) {
            System.out.println("Throughput exceeds the current throughput limit for your account, increase account level throughput before " +
                    "retrying. Error: " + rlee.getErrorMessage());
        } catch (ProvisionedThroughputExceededException ptee) {
            System.out.println("Request rate is too high. If you're using a custom retry strategy make sure to retry with exponential back-off. " +
                    "Otherwise consider reducing frequency of requests or increasing provisioned capacity for your table or secondary index. Error: " +
                    ptee.getErrorMessage());
        } catch (ResourceNotFoundException rnfe) {
            System.out.println("One of the tables was not found, verify table exists before retrying. Error: " + rnfe.getErrorMessage());
        } catch (AmazonServiceException ase) {
            System.out.println("An AmazonServiceException occurred, indicates that the request was correctly transmitted to the DynamoDB " +
                    "service, but for some reason, the service was not able to process it, and returned an error response instead. Investigate and " +
                    "configure retry strategy. Error type: " + ase.getErrorType() + ". Error message: " + ase.getErrorMessage());
        } catch (AmazonClientException ace) {
            System.out.println("An AmazonClientException occurred, indicates that the client was unable to get a response from DynamoDB " +
                    "service, or the client was unable to parse the response from the service. Investigate and configure retry strategy. "+
                    "Error: " + ace.getMessage());
        } catch (Exception e) {
            System.out.println("An exception occurred, investigate and configure retry strategy. Error: " + e.getMessage());
        }
    }

}