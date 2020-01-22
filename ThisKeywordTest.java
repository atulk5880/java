class ThisParent{
    int x = 10;
    void m1(){
        System.out.println("In parent class method m1.");
        System.out.println("Parent Class x ---- "+x);
        System.out.println("Child class x ----- "+this.x);
        this.m1();
    }
}
public class ThisKeywordTest extends ThisParent{
    int x=12;
    void m1(){
        System.out.println("In Child class method m1.");
    }
    void m2(){
        super.m1();
    }
    public static void main(String args[]){
        ThisKeywordTest t = new ThisKeywordTest();
        t.m2();
    }
}