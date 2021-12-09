package blog_lecture;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;
import java.util.Optional;

public class UdpBlkReceiveExmpl {
    public static void main(String[] args) throws Exception {
        DatagramChannel datagramChannel = DatagramChannel.open(StandardProtocolFamily.INET);
        datagramChannel.bind(new InetSocketAddress(5001));

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("[start receive]");

                try {
                    while (true) {
                        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
                        SocketAddress socketAddress = datagramChannel.receive(byteBuffer);
                        byteBuffer.flip();

                        Charset charset = Charset.forName("UTF-8");
                        String data = charset.decode(byteBuffer).toString();
                        System.out.println("[received data: " + socketAddress.toString() + "] " + data);
                    }
                } catch (Exception e) {
                    System.out.println("[terminated receive]");
                }
            }
        };
        thread.start();

        Thread.sleep(10000);
        datagramChannel.close();
    }
}
