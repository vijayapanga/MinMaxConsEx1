package javaLearning;

class PracticeMethodOverriding1 {

    {
        System.out.println("GIT Branch Testing");//test Devlop
        System.out.println("GIT vijaya Testing");//test vijaya
        System.out.println("---instant block 1");
    }
    void display()
    {
        System.out.println(" method 1 ");
    }

    PracticeMethodOverriding1()
    {
        System.out.println("constructor 1");
    }

    static
    {
        System.out.println("static block 1");
    }

}
class PracticeMethodOverriding2 extends PracticeMethodOverriding1{
    {
        System.out.println("---instant block 2");
    }
    void display()
    {
        System.out.println("method 2 ");
    }

    PracticeMethodOverriding2()
    {
        System.out.println("constructor 2");
    }
    static
    {
        System.out.println("static block 2");
    }

}
class PracticeMethodOverriding3 extends PracticeMethodOverriding2{
    {
        System.out.println("---instant block 3");
    }
    void display()
    {
        System.out.println("method 3 ");
    }

    PracticeMethodOverriding3()
    {
        System.out.println("constructor 3");
    }

    static
    {
        System.out.println("static block 3");
    }
}
class PracticeMethodOverriding {

    public static void main(String[] args) {
    PracticeMethodOverriding1 P1=new PracticeMethodOverriding1();
       P1.display();
        System.out.println();
    PracticeMethodOverriding2 P2=new PracticeMethodOverriding2();
       P2.display();
        System.out.println();
    PracticeMethodOverriding3 P3=new PracticeMethodOverriding3();
       P3.display();

    }
}

