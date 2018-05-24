@echo off
java -jar DYERCompiler.jar %1 %2
javac -cp "libs\\robocode.jar" %2.java
jar -cf %2.jar %2.class