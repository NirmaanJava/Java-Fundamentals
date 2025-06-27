package Threads;

public class Postman extends Thread {
    PostBox box;

    public Postman(PostBox box) {
        this.box = box;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        box.deliverLetter("You have a new message!");
    }
}