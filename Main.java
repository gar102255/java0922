public class Main{
    public static void main(String[] args) {
        Human a = new Human("Raiden Ei", 170, 60);
        Human b = new Human("Yae Miko", 168, 60);
        System.out.println(a.getName());
        System.out.println(b.getName());
        a.hello();
        b.hello();
        System.out.printf("%.2f\n",a.callBMI());
        System.out.println(a.myHeath());
        
    }
}