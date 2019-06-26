import java.util.Scanner;
class MultipleCharInput{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char color, other;
		System.out.println("Enter your color char and other char: ");
		color = in.nextChar();
		other = in.nextChar();
		System.out.println("You are entered : "+color+" "+other);
	}
}