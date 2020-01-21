import java.util.Scanner;
public class PassingArray{
	public void printArray(int a[]){
		int i;
		for(i=1; i<=5; i++){
			System.out.println("i = "+i);
		}
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int i;
		for(i = 0; i<5; i++){
			a[i] = s.nextInt();
		}
		PassingArray p = new PassingArray();
		p.printArray(a);
	}
}