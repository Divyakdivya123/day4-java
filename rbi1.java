public class rbi1 {
    void sample(){
        System.out.println("This is parent");
    }
}
class sbi extends rbi1{
    sbi(){
        System.out.println("This is child1");
    }
}
class hdfc extends rbi1{
    hdfc(){
        System.out.println("this is child2");
    }
}
class Main{
    public static void main(String[] args) {
        sbi s=new sbi();
        hdfc h=new hdfc();
    }
}