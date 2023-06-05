package org.example.tarefa;

public class ThreadImprimeString {

    public static void main(String[] args) {
        ImprimeString string = new ImprimeString("Hello world!");
        Thread thread = new Thread(string, "Thread ImprimeString");
        thread.start();
    }
}
