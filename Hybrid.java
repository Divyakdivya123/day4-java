public class Hybrid {
    void name(){
        System.out.println("This is Grand Parent");
    }
}
class parent extends Hybrid{
    parent(){
        System.out.println("This is parent");
    }
}
class Child1 extends parent{
    Child1(){
        System.out.println("This is Child1");
    }
}
class Child2 extends parent{
    Child2(){
        System.out.println("This is child2");
    }
}
class Main{
    public static void main(String[] args) {
        Child1 ch=new Child1();
        ch.name();
    }
}