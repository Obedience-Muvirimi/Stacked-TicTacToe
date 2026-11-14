@echo off
if not exist out call build.bat
cd assets
java -cp ..\out StackedTicTacToe
