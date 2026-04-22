FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Optional (not required but ok)
EXPOSE 10000

# IMPORTANT FIX 🔥
CMD ["sh", "-c", "java -Dserver.port=${PORT:-10000} -jar target/*.jar"]