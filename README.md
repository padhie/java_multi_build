# Commands

## Install Application
### nativ
```bash
mvn clean install
```

### docker
```bash
docker compose run --rm -it maven mvn clean install
```

## Package Application
```bash
mvn clean package
```

### docker
```bash
docker compose run --rm -it maven mvn clean package
```

## Run Application

### nativ
```bash
java -jar console/target/console.jar
java -jar desktop/target/desktop.jar
```

### docker
```bash
docker compose run --rm -it java java -jar console/target/console.jar
docker compose run --rm -it java java -jar desktop/target/desktop.jar
```