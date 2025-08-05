package app;

import model.*;

public class Main
{
	public static void main(String[] args)
	{
		MainController controller = new MainController();
		
		Board test = new Board(5,5);
		test.printDebug();
	}
}