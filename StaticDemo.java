class Parent {
	int a=10;
	void m1(){
		System.out.println("In Class Parent.....");
	}
	static{
		System.out.println("In Class Parent Static Block....");
	}
	public static void main(String args[]){
		Parent p = new Parent();
		System.out.println("Hello");
		p.a = 20;
		System.out.println(p.a);
	}
}