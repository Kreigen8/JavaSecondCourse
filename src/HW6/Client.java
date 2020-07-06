package HW6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final int PORT = 8189;
    private final String IP_ADDRESS = "localhost";
    static Socket socket;
    private DataInputStream incoming;
    private DataOutputStream outcoming;
    private Scanner scanner;

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            incoming = new DataInputStream(socket.getInputStream());
            outcoming = new DataOutputStream(socket.getOutputStream());
            scanner = new Scanner(System.in);

            System.out.println("Вы подключились к серверу");

            Thread clientThread = new Thread(() -> {
                while (true) {
                    serverMsg(scanner.nextLine());
                }
            });
            clientThread.setDaemon(true);
            clientThread.start();

            while (true) {
                String text = incoming.readUTF();
                if (text.equals("/end")) {
                    break;
                }
                System.out.println("Сервер: " + text);
            }
            System.out.println("Сервер завершил работу");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                incoming.close();
                outcoming.close();
                socket.close();
                scanner.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сервер выключен");
    }

    private void serverMsg(String text) {
        try {
            outcoming.writeUTF(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
