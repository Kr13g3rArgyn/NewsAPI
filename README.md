
# News Portal Project

This project is a news portal service that allows users to create news posts with authors. It utilizes various technologies for development and deployment. Project about News-service, where you can post your own news, with source, topic and the whole description of the news.


## Technologies Used
- Spring Security
- Docker
- PostgreSQL
- JPA (Java Persistence API)
- Hibernate
- Spring Boot

## Project Description

The News Portal Project is designed to facilitate the creation and management of news articles. It includes features for user authentication and authorization using Spring Security. News posts are categorized by topics and each post includes information about its author.

## Getting Started

Follow these instructions to get the project up and running on your local machine.

### Prerequisites
- Docker installed on your machine. Linux is preferable for work with docker.
- Java Development Kit (JDK) 8 or higher. (I used 17)
- Maven/Gradle installed on your machine. I used gradle, but you do you.

### Setting Up PostgreSQL with Docker
1. Pull the PostgreSQL Docker image from Docker Hub:
   ```bash
   docker pull postgres
   ```
2. Start a Postgresql container:
  ```bash
  docker run --name news-portal-db -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres
  ```
3. Verify that the PostgreSQL container is running:
   ```bash
   docker ps
   ```
### Running the Spring Boot Application
1. Clone the repo :3
   ```bash
   git clone https://github.com/your-username/news-portal.git
   ```
2. Navigate into the project directory:
  ```bash
  cd news-portal
  ```
3. Build the project using Gradle:
  ```bash
  ./gradlew build  
  ```
4. Run the Spring Boot application:
  ```bash
  ./gradlew bootRun
  ```
5. Access the application in your web browser at http://localhost:8080.
### Stopping and Removing the PostgreSQL Container
```bash
docker stop news-portal-db
docker rm news-portal-db 
```
### Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
License

MIT

### Explanation of Changes:

1. **Technologies Used**:
   - Added `Gradle` to the list of technologies used.

2. **Running the Spring Boot Application**:
   - Replaced Maven commands (`mvn`) with Gradle commands (`./gradlew build` and `./gradlew bootRun`). 
   - Gradle Wrapper (`./gradlew`) is used to ensure the correct Gradle version is used, even if Gradle is not installed globally on the system.

3. **Additional Notes**:
   - Ensure that your `build.gradle` file (or `build.gradle.kts` for Kotlin DSL) includes the necessary dependencies for Spring Boot, Spring Security, PostgreSQL, JPA, and Hibernate.
   - Adjust the application configuration in `application.properties` or `application.yml` to connect to the PostgreSQL database running in Docker.

This template can be customized further based on specific requirements or additional setup steps your project may have.
