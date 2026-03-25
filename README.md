# Simple quiz project

A small console quiz: five geography questions (European capitals). Answers are read from the keyboard and scored against the correct city name.

## How to run

From this folder, compile and start the app:

```bash
javac *.java
java Main
```

## How to play

1. The program asks **five questions** in order. For each one you see:
   - Question number and text  
   - Four options labeled `1.` through `4.`  
2. **Type your answer and press Enter.**  
   Scoring compares what you type to the **exact text of the correct city** (for example `Paris`, `Berlin`), **not** the option number. Match spelling and capitalization as shown in the options.
3. After the last question, the console prints each answer you entered (one per line), then **Your score is:** with a count from **0 to 5** (one point per correct answer).

That is the full loop: run `Main` → answer five questions → see your selections echoed → see your score.

The repository is an early starter and will grow as development continues.
