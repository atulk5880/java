	class B{
		void demo(){
			System.out.println("Hello in class A...");
		}
	}
	class A extends B {
		public static void main(String args[]){
			A o = new A();
			o.demo();
		}
	}