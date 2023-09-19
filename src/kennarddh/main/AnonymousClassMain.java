package kennarddh.main;

interface HelloWorld {
    void sayHello();
}

public class AnonymousClassMain {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        english.sayHello();
    }
}
