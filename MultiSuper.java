class GParent{
	void m(){
		System.out.println("Hello I am GParent....");
	}
}
class Parent extends GParent{
	void m(){
		System.out.println("Hello I am Parent....");
	}
}
class Child extends Parent{
	void m(){
		super.m();
		//super.super.m(); Error : We can not skip the parent class....
		System.out.println("Hello I am Child....");
	}
	public static void main(String args[]){
		Child c = new Child();
		c.m();
		
	}
}