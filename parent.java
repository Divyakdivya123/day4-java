abstract class parent{
    abstract void Bank();
    void money(){
        System.out.println("Balance");
    }
}
class SBI extends parent{
    void Bank(){
        System.out.println("Money Accepted!!");
    }

}
class Main{
    public static void main(String[] args) {
        SBI s=new SBI();
        s.money();
        s.Bank();

    }
}