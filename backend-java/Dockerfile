FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
# Gradleラッパーに実行権限を付与して起動
RUN chmod +x ./gradlew
CMD ["./gradlew", "bootRun"]