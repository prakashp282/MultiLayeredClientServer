# MultiLayeredClientServer
A General 3tier java client server program with threads ,Socket  implementation running JDBC MySql connection on server.

Project : A generic 3 tier architecture that can be applicable to most general problem.


Run on Seperate Terminal.

Console Compile Server: 
X:\Path\to\Your\Files>javac -g -cp mysql-connector-java-8.0.12.jar; *.java 
X:\Path\to\Your\Files>java -cp mysql-connector-java-8.0.12.jar; Server

Console Compile Middle:
X:\Path\to\Your\Files>javac *.java
X:\Path\to\Your\Files>java Intermediate

Console Compile Client:
X:\Path\to\Your\Files>javac Client.java
X:\Path\to\Your\Files>java Client
