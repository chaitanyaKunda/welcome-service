docker build command:
============================================
docker buildx build --platform linux/amd64 -t 20706215/welcome-service:0.0.2 .
docker push 20706215/welcome-service:0.0.2

create AWS EC2 instance
=================================
1. create security group from default VPC
 in AWS console, create sg(java-sb-sg) from default VPC
2. create key-pair(.pem file) and download.
3. create EC2 instance from amazon (AWS linux) image.


connect to EC2 instance
===============================
connect to ec2 instance from local machine:
> ssh -i java-sb-key-pair.pem ec2-user@13.233.117.135
> sudo yum update -y
> sudo yum install docker -y
> sudo service docker start
> sudo docker ps
> sudo docker images
> sudo docker run -d -p 80:8080 20706215/welcome-service:0.0.2




spring boot with docker applicaiton 
endpoint: 

webhook added on http://13.60.88.21:8080/github-webhook/
jenkinks URL: http://13.60.88.21:8080/

