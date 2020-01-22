class Parent{
    static int x = 5;
    int y=10;
    void m1(){
        System.out.println(y);
    }
}
public class SuperKeywordTest extends Parent{
    static int x = 12;
    int y=11;
    void m1(){
        System.out.println(super.x);
        super.m1();
    }
    public static void main(String args[]){
        SuperKeywordTest s = new SuperKeywordTest();
        s.m1();
    }
}