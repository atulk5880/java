class Parent{
	Parent(){
		System.out.println("This is default constructer of Parent....");
	}
	Parent(int a){
		System.out.println("Constructor Parameter "+a);
	}
}
class DemoConst extends Parent{
	DemoConst(){
		super(10);
		//super(); ---------- Compile time error.....
		System.out.println("This is Default constuctor of DemoConst....");
	}
	public static void main(String args[]) {
		DemoConst d = new DemoConst();
	}
}