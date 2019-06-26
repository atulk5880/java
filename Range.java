import java.util.Scanner;
import java.lang.Math;
class Range{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number: ");
		long x = in.nextLong();
		double brange,srange,irange,lrange;
		brange = Math.pow(2,7);
		srange = Math.pow(2,15);
		irange = Math.pow(2,31);
		lrange = Math.pow(2,63);
		if(x>=-brange&&x<=brange-1)System.out.println("* byte");
		if(x>=-srange&&x<=srange-1)System.out.println("* sort");
		if(x>=-irange&&x<=irange-1)System.out.println("* int");
		if(x>=-lrange&&x<=lrange-1)System.out.println("* long");

	}
}