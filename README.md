# PVZ-Rendition [WIP]
A personal project where I try to recreate Plants vs Zombies. This project is written in Java using the Model-View-Controller (MVC) pattern. -- no external game libraries were used. 

## Project Structure
src/
├── app/      # Main.java resides
├── model/    # Core game logic (Plants, Zombies, Board, etc.)
├── view/     # Display and rendering logic
run.bat       # Windows batch script for compiling and running

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
```bash
double click run.bat
```
OR compile manually from the folder root
```bash
javac src\app\*.java src\model\*.java src\vew\*.java
java -cp src app.Main
```
