public class Herarical {
    void name(){
        System.out.println("This is parent");
    }
}
class Child1 extends Herarical{
    Child1(){
    System.out.println("This is child");
    }
}
class Child2 extends Herarical{
    Child2(){
        System.out.println("This is child2");
    }
}
class Main{
    public static void main(String[] args) {
        Child1 ch1=new Child1();
        ch1.name();
        Child2 ch2=new Child2();
    }
}