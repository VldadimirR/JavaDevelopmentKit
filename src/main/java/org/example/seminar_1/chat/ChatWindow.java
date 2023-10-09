package org.example.seminar_1.chat;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatWindow extends JFrame {
    static private final int WINDOW_HEIGHT = 640;
    static private final int WINDOW_WIDTH = 720;
    static private final int WINDOW_POS_X = 300;
    static private final int WINDOW_POS_Y = 100;
    static private final String WINDOW_NAME = "Чат с сервером";
    private final String LOG_PATH="C:\\Users\\rasal\\Программирование\\Java Development Kit\\JDK\\src\\main\\java\\org\\example\\Seminar_1\\chat\\log.txt";
    static private JTextArea textOutputLog;
    JTextArea textOutput = new JTextArea("");
    JLabel label = new JLabel("Введите сообщение серверу: ");
    JTextField textInput = new JTextField();
    JButton buttonConnect = new JButton("Отправить");
    JPanel grid = new JPanel(new GridLayout(4,1));

    ChatWindow(String login) {
        logRecovery();

        //свойства окна
        setTitle(WINDOW_NAME);
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);

        textOutput.setEditable(false);
        textOutput.setBackground(Color.GRAY);
        grid.add(textOutput);
        grid.add(label);
        grid.add(textInput);
        grid.add(buttonConnect);

        buttonConnect.addActionListener(e -> {
            String logMessage = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss")) + " " + login + " : " + textInput.getText() + "\n";
            writerLog(logMessage);
            textOutput.append(logMessage);
        });

        getRootPane().setDefaultButton(buttonConnect);

        add(grid);
        setVisible(true);
    }

    public void writerLog(String logMessage){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_PATH, true))){
            writer.write(logMessage);
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    public void logRecovery(){
        textOutputLog = new JTextArea();
        textOutputLog.setEditable(false);

        String logFileName = LOG_PATH;
        if (fileExists(logFileName)) {
            loadChatHistory(logFileName);
        }
    }

    public boolean fileExists(String fileName){
        return new File((fileName)).exists();
    }

    private void loadChatHistory(String logFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(logFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textOutput.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка загрузки логов");
        }
    }

}
