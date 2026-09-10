# 🎮 Stacked Tic-Tac-Toe

A Java twist on classic Tic-Tac-Toe: instead of one mark per cell, each cell holds a **stack** of pieces. Players can also deploy special obstacle pieces to disrupt their opponent's board — turning a simple grid game into a layered strategy game.

## ✨ Features

- **Stacked cells** — each of the 16 board cells holds a stack, not just a single piece
- **Special moves / obstacles:**
  - 💣 **Bomb** — clears an opponent's stack from a cell
  - 🚀 **Transporter** — moves a piece between cells
  - 🎨 **Paint Brush** — repaints an opponent's piece
  - 🔀 **Shifter** — pops the top of a stack, revealing what's underneath
- **Two ways to play:**
  - **GUI mode** — a Swing/`StdDraw`-based visual board with keyboard navigation
  - **Text mode** — a console-driven version that reads moves from an input file, useful for automated testing

## 🕹️ How to Run

**GUI mode:**
```bash
javac SU_25433423.java
java SU_25433423
```

**Text mode** (reads moves from a file):
```bash
javac SU_25433423.java
java SU_25433423 <input-file>.txt
```

## 🧰 Built With

- Java (core game logic, `Stack<String>` data structures)
- Swing + `StdDraw` (Princeton's standard drawing library) for the GUI

## 📚 Background

This started as a university assignment exploring stack-based data structures, and grew into a full two-player game with a graphical interface, custom obstacle mechanics, and win/draw detection.

## 🚧 Known Limitations / Roadmap

- Refactor duplicated turn-handling logic between the two players into shared methods
- Replace raw coordinate variables with structured board-state objects
- Add unit tests for win/draw detection logic