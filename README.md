# boot-oauth2-resource-server
It's a Spring Boot Application and will act a Resource Server 


Its a spring boot application that will take the auth token as input and verifies it with authorization server and sends the requested resources.


Command to generate the keystore and establish the ssl:

keytool -genkey -alias boot-oauth2-resource-server -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore boot-oauth2-resource-server.JKS
