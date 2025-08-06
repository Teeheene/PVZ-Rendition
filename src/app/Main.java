package app;

import model.*;
import view.*;

public class Main
{
	public static void main(String[] args)
	{
		Board board = new Board(5,5);
		View view = new CliView();
		
		MainController controller = new MainController(board, view);
		
		board.printDebug();
		
		controller.start();
	}
}