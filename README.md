# Java AWS DevOps Starter

Docker-free Java Spring Boot starter for Jenkins + Gradle + Terraform + Ansible + AWS EC2.

## First-time setup (PowerShell)
```powershell
gradle wrapper --gradle-version 8.14.3
.\gradlew.bat --version
.\gradlew.bat clean test
.\gradlew.bat bootRun
```

Open http://localhost:8080/health and expect `{"status":"UP"}`.

## API endpoints
- GET /
- GET /health
- GET /api/message

Build the executable JAR with:
```powershell
.\gradlew.bat clean bootJar
```
The JAR is generated in `build/libs/`.

Later stages add GitHub, Jenkins, SonarQube, Terraform, Ansible and AWS EC2. No Docker or Kubernetes is required. Never commit AWS keys, passwords, tokens or private keys.
