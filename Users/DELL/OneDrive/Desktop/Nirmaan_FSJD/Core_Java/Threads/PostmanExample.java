package Threads;

public class PostmanExample {
    public static void main(String[] args) {
        PostBox box = new PostBox();

        Receiver receiver = new Receiver(box);
        Postman postman = new Postman(box);

        receiver.start();
        postman.start();
    }
}