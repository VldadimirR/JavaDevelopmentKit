package org.example.seminar_2.Task3;

public class Main {
    public static void main(String[] args) {
        Developer dev = new FrontendDeveloper();
        if (dev instanceof FrontendDeveloper) {
            ((FrontendDeveloper) dev).developGUI();
        }
    }
}
