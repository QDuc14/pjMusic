package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class client {
        public static int buffsize = 512 ;
        public static int desPort = 1234;
        public static String hostname = "localhost";
        public static void main (String [] args) {
                DatagramSocket socket;
                DatagramPacket dpreceive, dpsend;
                InetAddress add;
                Scanner stdIn;
                try{
                        add = InetAddress.getByName(hostname);
                        socket = new DatagramSocket();
                        stdIn = new Scanner(System.in);
                        while (true){
                                System.out.println("Client input: ");
                                String tmp = stdIn.nextLine();

                                        byte[] data = tmp.getBytes();
                                        dpsend = new DatagramPacket(data, data.length, add, desPort);
//                                        System.out.println(Pattern.matches("[[^a-z A-Z]&&[0-9]]","Client sent " + tmp + "to" + add.getHostAddress() + "form port" + socket.getLocalPort())) ;
                                        System.out.println("Client sent " + tmp + "to" + add.getHostAddress() + "form port" + socket.getLocalPort());
                                        socket.send(dpsend);
                                        if(tmp.equals("bye")){
                                                System.out.println("Client socket closed");
                                                stdIn.close();
                                                socket.close();
                                                break;
                                        }
                                        // nhận từ server
                                        dpreceive = new DatagramPacket(new byte[512],512);
                                        socket.receive(dpreceive);
                                        tmp = new String(dpreceive.getData(), 0, dpreceive.getLength());
                                        System.out.println("Client get: " + tmp +" form server");
                                }

                }
                catch(IOException e) {
                        System.err.println(e);
                }
        }
}
