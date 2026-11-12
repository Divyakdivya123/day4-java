class rbi{
    void loan(){
        System.out.println("This is Grandparent rbi");
    }
}
class sbi extends rbi{
    sbi(){
        System.out.println("this is parent sbi");
    }
}
class Hdfc extends sbi{
    Hdfc(){
        System.out.println("This is child1 Hdfc");
    }
}
class  user extends sbi{
    user(){
        System.out.println("This is child1 user");
    }
}
class Main{
    public static void main(String[] args) {
        user u=new user();
        u.loan();
        
    }
}