package Threads;

public class PostBox {
    String letter;
    boolean isLetterAvailable = false;

    public synchronized void receiveLetter() {
        System.out.println("Receiver: Waiting for the letter...");
        while (!isLetterAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: Letter received - " + letter);
        isLetterAvailable = false;
    }

    public synchronized void deliverLetter(String newLetter) {
        System.out.println("Postman: Delivering the letter...");
        letter = newLetter;
        isLetterAvailable = true;
        notify();
    }
}