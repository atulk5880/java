import java.util.Scanner;
class MultipleIntInput{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter 4 numbers: ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		System.out.println("Your Nubmbers are : "+a+" "+b+" "+c+" "+d);
	}
}