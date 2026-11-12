public class Hdfc {
    void loan(){
        System.out.println("loan from Rbi");
    }
    
}
class sbi extends Rbi{
    sbi(){
        System.out.println("loan from sbi");
    }
}
class Rbi extends Hdfc{
    Rbi(){
        System.out.println("loan from hdfc");
    }
}
class Main{
    public static void main(String[] args) {
        sbi r=new sbi();
        r.loan();
    }
}
