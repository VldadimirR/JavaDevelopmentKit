package org.example.seminar_2.Task1_2;

import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame implements ClientListener{

    JButton btnStart = new JButton("Start");
    JButton btnStop = new JButton("Stop");
    JPanel grid;
    Server server;
    BaseListener listener;

    ChatWindow(BaseListener listener, Server server){
        this.listener = listener;
        this.server = server;
        setBounds(100, 300, 360, 240);

        grid = new JPanel(new GridLayout(1, 2));
        grid.add(btnStart);
        grid.add(btnStop);

        btnStart.addActionListener(e -> {
            server.start();
            event("Нажата кнопка пуск сервер");
        });

        btnStop.addActionListener(e -> {
            server.stop();
            event("Нажата кнопка стоп сервер");
        });

        add(grid);
        setVisible(true);
    }

    @Override
    public void event(String msg) {
        listener.generateMessage(msg);
    }


}
