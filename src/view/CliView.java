package view;

import model.*;

public class CliView implements View
{
	@Override
	public void showBoard(Board board)
	{
		for(int i = 0; i < board.getHeight(); i++)
		{
			for(int j = 0; j < board.getWidth(); j++)
			{
				System.out.print("|  " + (board.getEntity(j,i) != null ? board.getEntity(j,i).getName() : "a") + "  ");
			}
			System.out.print("|\n");
		}
	}
}