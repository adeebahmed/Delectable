# MakeFile
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

default: 
	mvn compile exec:java
	
clean:
	mvn compile

test:
	mvn test

java: 
	sudo apt-get update
	sudo apt-get upgrade
	sudo apt-get dist-upgrade
	sudo apt-get install default-jre
	sudo apt-get install default-jdk
	sudo apt-get install maven
	mvn -version

all: 
	make java
	make clean
	make