package blog_lecture;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class TcpBlkClientExmpl {
    public static void main(String[] args) {
        SocketChannel socketChannel = null;

        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(true);

            System.out.println("[ask connection]");
            socketChannel.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[success connection]");

            ByteBuffer byteBuffer = null;
            Charset charset = Charset.forName("UTF-8");

            byteBuffer = charset.encode("Hello Server");
            socketChannel.write(byteBuffer);
            System.out.println("[success data send]");

            byteBuffer = ByteBuffer.allocate(100);
            int byteCount = socketChannel.read(byteBuffer);
            byteBuffer.flip();

            String data = charset.decode(byteBuffer).toString();
            System.out.println("[success data receive]: " + data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (socketChannel.isOpen()) {
            try {
                socketChannel.close();
            } catch (IOException el) {
                el.printStackTrace();
            }
        }
    }
}