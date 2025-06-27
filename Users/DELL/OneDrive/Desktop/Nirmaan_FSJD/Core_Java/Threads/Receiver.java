package Threads;

public class Receiver extends Thread {
    PostBox box;

    public Receiver(PostBox box) {
        this.box = box;
    }

    public void run() {
        box.receiveLetter();
    }
}