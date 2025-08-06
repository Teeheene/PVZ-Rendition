# PVZ-Rendition [WIP]
A personal project where I try to recreate Plants vs Zombies. This project is written in Java using the Model-View-Controller (MVC) pattern. -- no external game libraries were used. 

<h3>📁 Project Structure</h3>

<ul>
  <li><code>src/</code>
    <ul>
      <li><code>app/</code> – Entry point and controller logic (<code>Main.java</code>)</li>
      <li><code>model/</code> – Core game logic (Plants, Zombies, Board, etc.)</li>
      <li><code>view/</code> – Display and rendering logic</li>
    </ul>
  </li>
  <li><code>run.bat</code> – Batch script for compiling and running (Windows)</li>
</ul>

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
