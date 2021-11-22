package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class server {
    public static int buffsize = 512;
    public static int port = 1234;
    public static void main (String [] args) {
        DatagramSocket socket;
        DatagramPacket dpreceive, dpsend;
        try{
            socket = new DatagramSocket(port);
            dpreceive = new DatagramPacket(new byte[buffsize], buffsize);

            while (true) {
                socket.receive(dpreceive);
                String tmp = new String(dpreceive.getData(), 0, dpreceive.getLength());
                System.out.println("Server đã nhận: " + tmp + " form" + dpreceive.getAddress().getHostAddress() + " at port" + socket.getLocalPort());
                if (tmp.equals("bye")) {
                    System.out.println("Server đã đóng!");
                    socket.close();
                    break;
                }


                    // nối chuỗi
//                    StringBuilder sb = new StringBuilder(tmp);
//                    sb.append("789");
//                    tmp = sb.toString();
//                    //In hoa
//                   tmp = tmp.toUpperCase();
                //trả về client
                String str = checkinput(tmp);
                dpsend = new DatagramPacket(tmp.getBytes(), tmp.getBytes().length, dpreceive.getAddress(), dpreceive.getPort());
                System.out.println("Server sent back " + str + " to client");
                socket.send(dpsend);
            }

        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
    public static String checkinput(String input){
                Pattern pattern = Pattern.compile("[[^a-z A-Z]&&[0-9]]");
                Matcher matcher = pattern.matcher(input);
                String xoakytuDB = matcher.replaceAll("");
                return xoakytuDB;
        }
}
