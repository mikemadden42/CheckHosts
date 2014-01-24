STD BUILD METHOD
================
$ cat Manifest.txt
Main-Class: CheckHosts

javac -g:none *.java
jar cvfm CheckHosts.jar Manifest.txt *.class
java -jar CheckHosts.jar

ANT BUILD METHOD
================
ant
java -jar CheckHosts.jar
