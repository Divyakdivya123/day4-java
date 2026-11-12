public class rbi {
    void sample(){
        System.out.println("This is parent");
    }
}
class sbi extends rbi{
    sbi(){
        System.out.println("this is child");
    }
}
class Main{
    public static void main(String[] args) {
        sbi sb=new sbi();
        sb.sample();
    }
}