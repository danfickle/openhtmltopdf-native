## OpenHTMLtoPDF with native-image

Aim is to make a blazing fast PDF generator. This is a proof-of-concept. See also [danfickle/openhtmltopdf](https://github.com/danfickle/openhtmltopdf)

## Instructions

I did this on an Oracle Cloud Ampere ARM compute instance (Oracle Linux 8) with 18GB of memory (always free eligible). I'd recommend an instance with at least 8GB of memory. It may also work on x86 (with a different yum repo below).

Create the instance and SSH into it:
+ `sudo yum update`
+ `sudo reboot`
+ `sudo yum install git`
+ `sudo yum install graalvm21-ee-11`
+ `sudo yum-config-manager --add-repo=http://yum.oracle.com/repo/OracleLinux/OL8/codeready/builder/aarch64`
+ `sudo yum install graalvm21-ee-11-native-image`
+ `git clone https://github.com/danfickle/openhtmltopdf-native.git`
+ `cd openhtmltopdf-native`
+ `chmod u+x build.sh`
+ `chmod u+x mvnw`
+ `./build.sh`
+ `cd target`
+ `./com.example.app` to run, will produce `test.pdf`.
+ At the moment testing consists of downloading `test.pdf` with `scp` and confirming it opens.

## Feedback welcome
+ Have you got this working on x86?
+ Have you got it working with a web server?
+ Serverless?
