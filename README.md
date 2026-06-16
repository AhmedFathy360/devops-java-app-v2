# DevOps Java App v2

A Spring Boot application used to demonstrate a full DevSecOps CI/CD pipeline.

## Pipeline Overview

### GitHub Actions
- **PR Quality Gate** — SonarQube static analysis on every Pull Request
- **CI Pipeline** — triggered on push to main:
  - Maven build
  - Docker build + Trivy vulnerability scan
  - Push to Docker Hub
  - Update Helm chart tag (GitOps)

### Tekton Pipeline
- Kubernetes-native CD pipeline triggered by GitHub webhook
- Tasks: git-clone → maven-build → docker-build-push → trivy-scan → update-helm-tag → helm-deploy
- Deploys to local minikube cluster via Helm

## Tech Stack
- Java 17 + Spring Boot
- Maven
- Docker + Kaniko
- Kubernetes + Helm
- Tekton Pipelines + Triggers
- SonarQube (SonarCloud)
- Trivy (vulnerability scanning)
- GitHub Actions 
 
 
