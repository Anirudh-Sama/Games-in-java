Tic-Tac-Toe Game
This is a simple console-based implementation of the classic Tic-Tac-Toe game in Java.

Overview
The program allows two players to play Tic-Tac-Toe on a 3x3 board. Players take turns to input their moves, and the game checks for a win condition after each move. The game ends when a player wins or when the board is full and there is no winner (a draw).

How to Play
Start the Game: Run the Main class to start the game.
Input Moves: Players take turns to input their move. Each move consists of two integers representing the row and column where they want to place their mark (X or O).
Check for Valid Moves: The program checks if the move is valid (i.e., the chosen cell is empty). If the move is invalid, the player is prompted to try again.
Winning Condition: The game checks for a winning condition after each move. A player wins if they have three of their marks in a row, column, or diagonal.
End of Game: The game ends when a player wins or when the board is full and there is no winner.
Implementation Details
Board Initialization: The board is represented as a 2D char array, initially filled with empty spaces.
Player Alternation: The players alternate between 'X' and 'O' for each move.
Win Check: The game checks for a win condition by examining all rows, columns, and diagonals.
Print Board: The current state of the board is printed after each move.