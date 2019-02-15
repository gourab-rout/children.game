
# children game
This project will take two inputs.
* Number of children standing around the circle.
* Elimination number

The output will be the ChildIds in the order they get eliminated. The last one is the winner.

## Prerequisites
Install JDK.
```
https://www.oracle.com/technetwork/java/javase/downloads/index.html
```
Install maven
```
https://maven.apache.org/install.html
```
Install Docker
```
https://docs.docker.com/install/
```

## Installing
Clone the project from GitHub using the below command.
```
git clone https://github.com/gourab-rout/children.game.git
```

Please run the below mvn command from the directory where pom.xml resides.
```
mvn install -s ./settings.xml
```

 Run docker build from the directory where Dockerfile  resides (same as above).
```
docker build -t grout/childrengame .
```

##  Running
The below command executes the program and prints the results. It accepts the below parameters as argument.
* Number of children standing around the circle.
* Elimination number
```
docker run --rm -w /app/target grout/childrengame java -jar children.game-0.0.1-SNAPSHOT.jar 5 2
```
