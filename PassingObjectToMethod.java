public class PassingObjectToMethod{
	int i;
	public void print(PassingObjectToMethod p){
		System.out.println(p.i);
	}
	
	public static void main(String args[]){
		PassingObjectToMethod p = new PassingObjectToMethod();
		p.i = 6;
		p.print(p);
	}
}