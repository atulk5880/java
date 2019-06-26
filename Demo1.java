class Demo{
	Demo(){
		System.out.println("Demo Class Constructor....");
	}
}
class Demo1 extends Demo{
	void m1(){
		//super(); ------ Compile Time Error : Must be first statement in constructor of current class....
		System.out.println("Hello m1 in class Demo1...");
	}
	public static void main(String args[]){
		//super(); ------- Compile Time Error : Must be first statement in constructor of current class....
		Demo1 d = new Demo1();
		d.m1();
	}
}