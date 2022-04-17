interface I { }
public class Parent implements I {
    public String toString() { return "P "; }
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = c;
        I inter = p;
        System.out.print(p);
        System.out.print((Child)p);
        System.out.print(inter);
    }
}
class Child extends Parent {
    public String toString() { return "C "; }
}