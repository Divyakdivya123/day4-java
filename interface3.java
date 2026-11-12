interface animal{
    void sound();
}
class Dog implements animal{
    public void sound(){
        System.out.println("BOW BOW...");
    }
}
 class interface3{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
    
}
