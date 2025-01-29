docker build command:
============================================
1. docker buildx build --platform linux/amd64 -t 20706215/welcome-service:0.0.2 .
2. docker push 20706215/welcome-service:0.0.2

create AWS EC2 instance
=================================
1. create security group from default VPC
 in AWS console, create sg(java-sb-sg) from default VPC
2. create key-pair(.pem file) and download.
3. create EC2 instance from amazon (AWS linux) image.


connect to EC2 instance
===============================
connect to ec2 instance from local machine:
1. ssh -i java-sb-key-pair.pem ec2-user@13.233.117.135
2. sudo yum update -y
3. sudo yum install docker -y
4. sudo service docker start
5. sudo docker ps
6. sudo docker images
7. sudo docker run -d -p 80:8080 20706215/welcome-service:0.0.2




adding webhook in github repository
=======================================

1. webhook added on http://<<jenkins_host>>>:8080/github-webhook/

