@echo off
if not exist out mkdir out
javac -Xlint:-deprecation -d out src\*.java && echo Built to out\
