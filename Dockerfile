FROM bellsoft/liberica-openjdk-alpine:latest

COPY ./src ./src

RUN mkdir .out

RUN javac -sourcepath ./src -d out ./src/Main.java

CMD java -classpath ./out Main