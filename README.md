# CheckHosts
Simple Java program to ping hosts

## Manual build instructions
```bash
echo 'Main-Class: CheckHosts' > Manifest.txt
javac -g:none *.java
jar cvfm CheckHosts.jar Manifest.txt *.class
java -jar CheckHosts.jar
```
## Automatic build instructions
```bash
ant
java -jar CheckHosts.jar
```
