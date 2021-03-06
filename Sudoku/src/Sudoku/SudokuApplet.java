package Sudoku;

import java.util.Random;

import javax.swing.JApplet;

/* Rather than a frame, put the game inside of an applet. */
@SuppressWarnings("deprecation")
public class SudokuApplet extends JApplet {

    private static final long serialVersionUID = 2598809732909851801L;

    private Sudoku sudoku;

    Random rand = new Random();
    		
    /* {@inheritDoc} */
    public final void init() {
        sudoku = new Sudoku();
        add(sudoku);
    }

    /* {@inheritDoc} */
    @SuppressWarnings("static-access")
	public final void start() {
        sudoku.createSudoku(Sudoku.EASY);
    }
}