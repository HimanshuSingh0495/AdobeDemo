# Roman Numeral Converter API & UI 🚀

## **Overview**
This project provides a **REST API** and **React UI** for converting numbers (1-3999) into Roman numerals.  
It follows **best practices** for **logging, metrics, CORS, security, and DevOps deployment**.

---

## **📌 Features**
✅ Convert numbers (1-3999) to Roman numerals  
✅ **Spring Boot REST API** with Actuator & Micrometer  
✅ **React UI (Adobe React Spectrum)** for user interaction  
✅ **Dockerized deployment** with **single-container setup**  
✅ **Metrics & Logging** (Prometheus, Grafana-ready) , metrics not implemented yet 
✅ **DevOps-Ready** (AWS, DockerHub, Kubernetes)

---

## **🛠 Tech Stack**
- **Backend:** Java 17, Spring Boot, Maven
- **Frontend:** React, Adobe React Spectrum, Axios
- **Database:** None (Stateless)
- **Containerization:** Docker
- **Monitoring:** Micrometer, Prometheus, Grafana
- **Cloud Deployment:** AWS/GCP/Heroku

---

## **🚀 Running Locally**
### **1️⃣ Prerequisites**
- **Java 17+**
- **Node.js 18+**
- **Maven**
- **Docker (for containerization)**

### **2️⃣ Clone the Repo**
```sh
git clone https://github.com/HimanshuSingh0495/AdobeDemo.git
cd AdobeDemo
```

### **3️⃣ Run Backend Locally**
```sh
mvn clean package -DskipTests
java -jar target/roman-numeral-api-1.0.0.jar
```
- API available at: `http://localhost:8080/romannumeral?query=50`
- Metrics available at: `http://localhost:8080/actuator/metrics`

### **4️⃣ Run Frontend Locally**
```sh
cd roman-numeral-ui
npm install
npm start
```
- UI available at: `http://localhost:3000/`

---

## **🐳 Running with Docker**
### **1️⃣ Build Docker Image**
```sh
docker build -t roman-numeral-app .
```

### **2️⃣ Run Docker Container**
```sh
docker run -p 8080:8080 roman-numeral-app
```

- Access UI & API at: `http://localhost:8080/`

---

## **📊 Logging & Metrics**
- Logs stored in `logs/app.log`
- **Health Check:** `http://localhost:8080/actuator/health`

---

## **🔐 Security & Best Practices**
✅ **CORS Restricted** → Only `localhost:3000` allowed  
✅ **Logging** → Logs API requests & errors in `logs/app.log`  
✅ **Actuator Secured** → Only `health, metrics` exposed  
✅ **Containerized** → Runs fully inside Docker

---

## **📡 DevOps Capabilities**
| Feature        | Implementation |
|---------------|---------------|
| **CI/CD**      | GitHub Actions (Can be added for automatic deployment) |
| **Containerization** | Dockerized backend & frontend |
| **Monitoring** | Prometheus metrics & Actuator endpoints |
| **Cloud Deployment** | Ready for AWS, GCP, or Heroku |
| **Kubernetes** | Can be deployed in k8s cluster |

---

## **📌 Next Steps (Deployment)**
We can deploy the project to:
1. **AWS (Elastic Beanstalk, ECS, EKS)**
2. **Heroku (Simple PaaS Deployment)**
3. **DockerHub & Kubernetes Cluster**
4. **Vercel/Netlify (For UI Deployment Only)**

---

## **👨‍💻 Contributors**
- **HIMANSU SINGH** - [GitHub Profile](https://github.com/HimanshuSingh0495)

---

## **📝 License**
This project is **open-source** under the **MIT License**.