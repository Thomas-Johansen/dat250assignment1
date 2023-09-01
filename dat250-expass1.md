# dat250assignment1

## Report 

https://hub.docker.com/repository/docker/thjohansen/dat250/general

### Installation:
  I had little to no problems with the installation itself,  
  I intalled java 17, Intellij, Gradle and Docker.  

### Enviroment validation
  To check that the enviroment was working as intended, i simply did the assigned task, by debugging, refactoring and "exporting" the software

### Techical problems
  An issue i had was first getting used to java again after not having touched it for over a year, but after a few syntax mistakes when importing a class i got it working as expected.  
  The main issue i had was after completing the code part, to actually push to docker.  
  The included code "podman push unit-converter docker://docker.io/<your username>/dat250" did not work (note, i used docker and not podman, replacing the "podman" part with "docker" so that might be why)  
  And instead i had to use two different commands to get it to upload;  
  ``` docker tag unit-converter thjohansen/dat250 ```  and   
  ``` docker push thjohansen/dat250:unit-converter ```
  
