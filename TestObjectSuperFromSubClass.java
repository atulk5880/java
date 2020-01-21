class GrandParent{
	GrandParent(){
		System.out.println("In class GrandParent "+this); //     TestObjectSuperFromSubClass@15db9742
	}
}
class Parent extends GrandParent{
	Parent(){
		System.out.println("In class Parent "+this);     //       TestObjectSuperFromSubClass@15db9742
	}
}
public class TestObjectSuperFromSubClass extends Parent{
	TestObjectSuperFromSubClass(){
		System.out.println("In Sub Class "+this);       //        TestObjectSuperFromSubClass@15db9742
	}
	public static void main(String args[]){
		TestObjectSuperFromSubClass t = new TestObjectSuperFromSubClass();
	}
}

// Means if you create a object of subclass it does not create the object of super class