#-----PASSO A PASSO DO DOCKERFILE-----#
#
# - Usa uma imagem base com JDK 17 e Maven para build.
# - Define o diretório de trabalho dentro do container.
# - Copia o arquivo pom.xml para o diretório de trabalho.
# - Baixa as dependências do Maven.
# - Copia todos os arquivos de código fonte para o diretório de trabalho.
# - Faz o build do projeto com Maven.
# - Segunda fase do build, agora cria a imagem final.
# - Define o diretório de trabalho dentro do container.
# - Copia o JAR gerado na fase anterior para dentro do container.
# - Expõe a porta 8080.
# - Comando para executar a aplicação Spring Boot quando o container iniciar.
#
#--------------------------------------#

FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app
COPY ../pom.xml .

RUN mvn dependency:go-offline

COPY ../src ./src

RUN mvn package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]