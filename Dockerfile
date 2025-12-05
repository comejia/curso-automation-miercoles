# Creamos nuestra imagen a partir de una imagen base
FROM selenium/standalone-chrome:4.35.0

# Uso de usuario root para instalar maven
USER root

# Instalar Maven y dependencias
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean

# Crea un directorio para el proyecto (en el container) y se lo asigna a seluser
RUN mkdir -p /home/seluser/app && \
    chown -R seluser:seluser /home/seluser/app

# Uso de seluser para ejecutar comandos como un usuario "comun".
# seluser es un usuario que crea la imagen de selenium
USER seluser

# Cambia al directorio de trabajo
WORKDIR /home/seluser/app

# Se copia solamente el pom.xml en la carpeta ./app para descargar
# las dependencias y así optimizar cache de las capas de docker
COPY --chown=seluser:seluser pom.xml .
RUN mvn clean test -DskipTests

# Ahora se copia el resto del codigo en ./app
COPY --chown=seluser:seluser . .

# Defino parametros por defecto para la ejecución
ENV TAGS=@regression

# Comando para ejecutar los tests
CMD ["bash", "-c", "mvn clean test -Dbrowser=chrome -Dheadless=true -Ddocker_enable=true -Dcucumber.filter.tags=${TAGS}"]
