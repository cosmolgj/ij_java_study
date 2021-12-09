package blog_lecture;

import java.net.InetSocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;

public class UdpBlkSendExmpl {
    public static void main(String[] args) throws Exception {
        DatagramChannel datagramChannel = DatagramChannel.open(StandardProtocolFamily.INET);

        System.out.println("[start send]");

        for (int i = 1; i < 3; i++) {
            String data = "message " + i;
            Charset charset = Charset.forName("UTF-8");
            ByteBuffer byteBuffer = charset.encode(data);

            int byteCount = datagramChannel.send(byteBuffer, new InetSocketAddress("localhost", 5001));

            System.out.println("[send bytes ] : " + byteCount + " bytes");
        }

        System.out.println("[closed connection]");

        datagramChannel.close();
    }
}
