class Parent{
	int a = 10;
	void m(){
		System.out.println("In Class Parent....");
	}
}
class SupKey extends Parent {
	int a = 20;
	/* static void m(){
		//int b = super.a; --------- Error: non-static variable super cannot be referenced from a static context
		//System.out.println(b);
		System.out.println("In Class SupKey....");
	}*/   //   Error: m() in SupKey cannot override m() in Parent
	void m1(){
		int b = super.a;
		System.out.println(b);
	}
	public static void main(String args[]){
		SupKey s = new SupKey();
		s.m();
		s.m1();
		System.out.println(s.a);
		//int b = super.a; --------- Error: non-static variable super cannot be referenced from a static context
	}
}