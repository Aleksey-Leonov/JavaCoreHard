package fi.lahti.unit_2.homework;

import java.io.*;
import java.net.Socket;
import java.util.Date;

/**
 * Input credentials sample
 * "-auth n1@mail.com 1"
 */

public class ClientApp1 {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 3906);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    while (true) {
                        String message = in.readUTF();

                        System.out.println(" in MSN ....."+ message);
                    }
                } catch (IOException e) {
                    throw new RuntimeException("SWW", e);
                }
            }).start();

            doFileReaderDemo();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                try {
                    System.out.println("...");
                    String s = reader.readLine();

                     logger(s);

                    out.writeUTF(s);


                  } catch (IOException e) {
                    throw new RuntimeException("SWW", e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void logger(String msn) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(
                            new File("C:/Users/Sipmsons/Desktop/JAVA/GeekBrains/JavaCoreHard/src/fi/lahti/unit_2/homework/webServerBd/Log/log.text"),
                            true
                    )
            );

            bw.newLine();
            bw.write(
                    String.format(
                            "[Logger] %s: " + msn,
                            new Date()
                    )
            );
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void doFileReaderDemo() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(
                            new File("C:/Users/Sipmsons/Desktop/JAVA/GeekBrains/JavaCoreHard/src/fi/lahti/unit_2/homework/webServerBd/Log/log.text")
                    )
            );

//            String line;
//            while((line = br.readLine()) != null) {
//                System.out.println(line);
//            }


            br.lines().forEach(line -> {
                System.out.println(line);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
