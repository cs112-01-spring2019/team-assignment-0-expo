import java.util.Random;
public class Coin{
	private final int MAX = 2;
	private int face;



	public Coin()
	{
		flip();
	}

	public int flip()
	{
		Random generator = new Random();
		face = generator.nextInt(MAX);

		return face;
	}

	public boolean isHeads()
	{
		if (face == 0)
		{
			return true;
		}
		else
		{
			return false;
		}

			
	}

	public int getFace()
	{
		return face;
	}



	public String toString()
	{
		if (face == 0)
			return "Heads";
		else
			return "Tails";
	}
		
		
		
		
}
