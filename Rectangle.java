package Lab;

public class Rectangle
{
	private int width;
	private int height;
	boolean filled;

	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public void draw()
	{
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
