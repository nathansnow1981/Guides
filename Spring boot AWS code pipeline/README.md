# Spring Boot AWS CodeBuild CI/CD

-	Create the spring boot app
-	Specify specific jar name in pom.xml
	-	E.g. At the end of the "build" section, add <finalName>my-deadly-app<finalName>
-	Add buildspec.yml to project root
-	Add code to github 
-	Login to AWS console
	-	Create **Elastic Beanstalk Environment**
	-	Don't upload code at the end of environment setup
	![image](img\environment-code-upload.JPG)
	-	Create a **Code Pipeline**
	-	For "Add Deploy Stage" select **AWS Elastic Beanstalk**
	![image](img\add-deploy-stage.JPG)