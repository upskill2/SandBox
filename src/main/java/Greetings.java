class Greetings {

    String str = "Hello!";

    Greetings(String str) {
        this.str = str;
    }

    void greet() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        new Greetings("Hi!").greet();
    }

}