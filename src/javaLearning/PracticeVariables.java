package javaLearning;

public class PracticeVariables {

    int a=10;
    int b=20;
    static int c=30;
    static int d=40;

    void m1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);//static calling method 1
        System.out.println(PracticeVariables.d);// static calling method 2
    }

    static void m2()
    {
        PracticeVariables p=new PracticeVariables(); // to use instance variables in static
       System.out.println(p.a); // instance variable calling in static
       System.out.println(p.b); // instance variable calling in static
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        PracticeVariables pv=new PracticeVariables();
        pv.m1();
        pv.m2();// static calling method 3
        PracticeVariables.m2();// static calling Method 1

        System.out.println(pv.a);
        System.out.println(pv.d); // static calling method 3

    }
}
