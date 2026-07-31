# AgentDemo

MuleSoft 4 API Implementation

[![MuleSoft](https://img.shields.io/badge/MuleSoft-4.x-blue.svg)](https://www.mulesoft.com/)
[![Maven](https://img.shields.io/badge/Maven-3.8+-red.svg)](https://maven.apache.org/)

## Description
**Created:** 05-04-2026  
**Author:** anirban37  
Auto-generated MuleSoft application following APIkit and best practices.

## Technical Stack

<div align="center">

| Component | Version | Badge |
|-----------|---------|-------|
| **Mule Runtime** | 4.9.0 | ![Mule](https://img.shields.io/badge/Mule-4.x-00A8E1?style=flat-square&logo=mulesoft) |
| **Java** | 8+ | ![Java](https://img.shields.io/badge/Java-8+-ED8B00?style=flat-square&logo=openjdk) |
| **Maven** | 3.8+ | ![Maven](https://img.shields.io/badge/Maven-3.8+-C71A36?style=flat-square&logo=apache-maven) |
| **HTTP Connector** | 1.9.3 | ![Connector](https://img.shields.io/badge/HTTP-Connector-blue?style=flat-square) |
| **Anypoint Studio** | 7.x | ![Studio](https://img.shields.io/badge/Studio-7.x-00A8E1?style=flat-square) |

</div>

## Project Structure
```
src/main/mule/        - Mule configuration files
src/main/resources/   - RAML, properties, log4j2
pom.xml               - Maven build configuration
```

## Local Development
1. Import project into Anypoint Studio
2. Configure properties in dev.yaml
3. Run the application
4. Test via Postman or Insomnia

## Deployment
Configured for CloudHub deployment via Maven plugin.

### Installation

```bash
# Clone the repository
git clone https://github.com/anirban37/AgentDemo.git
cd AgentDemo

# Build the project
mvn clean install
```

### 💡 *Building the Future of API Integration*







GET /getdocrules

With category filter

GET /getdocrules?category=Architecture
GET /getdocrules?category=Architecture, Design Quality

With docType filter

GET /getdocrules?docType=hld
GET /getdocrules?docType=hld,sdd
GET /getdocrules?docType=lld

With both filters

GET /getdocrules?category=Architecture&docType=hld
GET /getdocrules?category=Architecture, Design Quality&docType=hld,sdd

All prefixed with your CloudHub base URL:

https://user-lookup-server-czif7s.ga8jrk.usa-e1.cloudhub.io/getdocrules

**Created:** 05-04-2026 | **Author:** [@anirban37](https://github.com/anirban37) | **Type:** RESTful API

[Features](#-features) • [Quick Start](#-quick-start) • [Documentation](#-api-documentation) • [Deployment](#-deployment) • [Contributing](#-contributing)

---
