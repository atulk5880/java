class SuperMethodParent{
	SuperMethodParent(){
		System.out.println("In Parent default constructor");
	}
	SuperMethodParent(int i){
		System.out.println("In parent class-----"+i);
	}
}
public class SuperMethod extends SuperMethodParent{
	SuperMethod(int j){
		super(10);
		System.out.println("In Child class-----"+j);
	}
	//void m1(){
		//super(); -------------------------> Error
	//}
	public static void main(String args[]){
		SuperMethod s = new SuperMethod(12);
		//s.m1() 
	}
}