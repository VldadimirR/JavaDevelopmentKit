package org.example.seminar_2.Task1_2;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //new ChatWindow(new Server(new ConsoleServerListener()));
        try {
            new ChatWindow(new ConsoleServerListener(), new Server(new LogServerListener(
                    "C:\\Users\\rasal\\Программирование\\Java Development Kit\\JDK\\src\\main\\java\\org\\example\\seminar_2\\Task_1_2\\ServerLogfile.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}