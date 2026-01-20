# Rock Paper Scissors Game

A simple Java console application that allows a user to play **Rock, Paper, Scissors** against the computer. The program takes user input, randomly generates the computer’s choice, and determines the winner based on classic game rules.

---

## 🎮 Features

* Interactive console-based gameplay
* Input validation to prevent invalid choices
* Randomized computer moves using `java.util.Random`
* Clear display of results and winner determination

---

## 📝 How It Works

1. The program displays a welcome message and prompts the user to choose:

   * `0` → Rock
   * `1` → Paper
   * `2` → Scissors

2. The user enters their selection.

3. The program validates the input.
   If the input is not `0`, `1`, or `2`, it stops and asks the user to try again.

4. The computer generates a random choice (also between `0` and `2`).

5. The program compares both choices and prints:

   * `"It's a tie!"` if both choose the same
   * `"You win; congratulations!"` if the user’s choice beats the computer’s
   * `"Computer wins!"` otherwise

---

## 🧠 Game Rules

* Rock (`0`) beats Scissors (`2`)
* Paper (`1`) beats Rock (`0`)
* Scissors (`2`) beats Paper (`1`)

---

## ▶️ Running the Program

1. Ensure you have **Java 8 or later** installed.
2. Compile the program:

   ```bash
   javac RockPaperScissorsGame.java
   ```
3. Run it:

   ```bash
   java RockPaperScissorsGame
   ```

---

## 📁 Project Structure

```
rockPaperScissorsGame/
└── RockPaperScissorsGame.java
```

---

## 💡 Possible Improvements

* Add a loop to allow multiple rounds
* Provide text labels (“Rock”, “Paper”, “Scissors”) instead of numeric output
* Track score over several rounds
* Add error handling for non-numeric inputs
* Build a simple GUI version
