# PVZ-Rendition [WIP]
A personal project where I try to recreate Plants vs Zombies. This project is written in Java using the Model-View-Controller (MVC) pattern. -- no external game libraries were used. 

## Project Structure
src/</br>
├── app/      # Main.java resides</br>
├── model/    # Core game logic (Plants, Zombies, Board, etc.)</br>
├── view/     # Display and rendering logic</br>
run.bat       # Windows batch script for compiling and running</br>

## Implemented Features
- Base Plant and Zombie classes
- Grid-like Board system for entities

## August Goals
- [ ] Working placement system for entities
- [ ] Win/loss conditions
- [ ] Implement Projectiles
- [ ] Implement Damage handling system
- [ ] MVC Cleanup

## How to Run

### Widnows
Simple double click the following file
```bash
run.bat
```
OR compile manually from the folder root
```bash
javac src\app\*.java src\model\*.java src\vew\*.java
java -cp src app.Main
```
