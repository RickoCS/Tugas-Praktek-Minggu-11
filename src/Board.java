//Nama  : Ricko Chandra Saputra
//NIM   : 5311421075

package TicTacToe;
import java.awt.*;

/**
* The Board class models the ROWS-by-COLS game-board.
*/
public class Board {
    // package access
    // composes of 2D array of ROWS-by-COLS Cell instances
    Cell[][] cells; 
    /** Constructor to initialize the game board */
    public Board() {
        
        // allocate the array
         cells = new Cell[GameMain.ROWS][GameMain.COLS]; 
         for (int row = 0; row < GameMain.ROWS; ++row) {
         for (int col = 0; col < GameMain.COLS; ++col) {
         // allocate element of array
         cells[row][col] = new Cell(row, col); 
         }
         
    }
 }
 /** Initialize (or re-initialize) the game board */
 public void init() {
        for (int row = 0; row < GameMain.ROWS; ++row) {
            for (int col = 0; col < GameMain.COLS; ++col) {
            // clear the cell content
            cells[row][col].clear(); 
        }
    }
 }
 
 /** Return true if it is a draw (i.e., no more EMPTY cell) */
 public boolean isDraw() {
    for (int row = 0; row < GameMain.ROWS; ++row) {
        for (int col = 0; col < GameMain.COLS; ++col) {
           if (cells[row][col].content == Seed.EMPTY) {
            // an empty seed found, not a draw, exit
            return false; 
            }
        }
    }
    return true; // no empty cell, it's a draw
 }
 
 /** Return true if the player with "seed" has won after placing at
 (seedRow, seedCol) */
 public boolean hasWon(Seed seed, int seedRow, int seedCol) {
    return (cells[seedRow][0].content == seed // 3-in-the-row
                && cells[seedRow][1].content == seed
                && cells[seedRow][2].content == seed
            || cells[0][seedCol].content == seed // 3-in-the-column
                && cells[1][seedCol].content == seed
                && cells[2][seedCol].content == seed
            || seedRow == seedCol // 3-in-the-diagonal
                && cells[0][0].content == seed
                && cells[1][1].content == seed
                && cells[2][2].content == seed
            || seedRow + seedCol == 2 // 3-in-the-opposite-diagonal
                && cells[0][2].content == seed
                && cells[1][1].content == seed
                && cells[2][0].content == seed);
 }
 
    /** Paint itself on the graphics canvas, given the Graphics context */
    public void paint(Graphics g) {
        // Draw the grid-lines
        g.setColor(Color.GRAY);
        for (int row = 1; row < GameMain.ROWS; ++row) {
            g.fillRoundRect(0, GameMain.CELL_SIZE * row -
GameMain.GRID_WIDHT_HALF,
                GameMain.CANVAS_WIDTH-1, GameMain.GRID_WIDTH,
                GameMain.GRID_WIDTH, GameMain.GRID_WIDTH);
    }
    for (int col = 1; col < GameMain.COLS; ++col) {
    g.fillRoundRect(GameMain.CELL_SIZE * col -
GameMain.GRID_WIDHT_HALF, 0,
        GameMain.GRID_WIDTH, GameMain.CANVAS_HEIGHT - 1,
        GameMain.GRID_WIDTH, GameMain.GRID_WIDTH);
    }
    
    // Draw all the cells
    for (int row = 0; row < GameMain.ROWS; ++row) {
        for (int col = 0; col < GameMain.COLS; ++col) {
            cells[row][col].paint(g); // ask the cell to paint itself
        }
    }
  }
}