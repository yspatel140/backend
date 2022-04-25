# Few important commands 
# Create executable JAR
mvn clean install
# Start embedded tomcat
java -jar target/backend-0.0.1-SNAPSHOT.jar
# Build docker image
docker build -t backend:1.0.0 .
# Run docker image
docker run -p 8081:8081 -d --name=backend-1 -t backend:1.0.0
# Create pod
kubectl apply -f pod.yaml
# Get pod
kubectl get pod
# Describe pod
kubectl describe pod backend
# To troubleshoot if any error 
kubectl get pod backend -o yaml
# Create Service
kubectl apply -f service.yaml
# Get services 
kubectl get svc


