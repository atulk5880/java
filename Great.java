import java.util.Scanner;
class Great
{
	int a,b,c;
	void input()
	{
		int x,y,z;
		Scanner s = new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		a=x;
		b=y;
		c=z;
	}
	void output()
	{
		if(a>b&&a>c)
		{
			System.out.println("Greater number is: "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Greater number is: "+b);
		}
		else
		{
			System.out.println("Greater number is: "+c);
		}
	}
	public static void main (String args[])
	{
		Great g=new Great();
		g.input();
		g.output();
	}
}