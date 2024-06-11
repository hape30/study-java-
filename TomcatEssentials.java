
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import javax.sound.sampled.Port;

public class TomcatEssentials {
    private static final int PORT = 8080;
    private static final int N_THREADS = 10;
    private static final ExecutorService executor = Executors.newFixedThreadPool(N_THREADS);
    private static final BlockingQueue<Socket> connectionQueue = new LinkedBlockingQueue<>();

    public static void main (String[] args) {
        try (ServerSocket serverSocket = new

    Server Socket(PORT)) {
            System.out.println("Echo server with Queue is listening on port " + PORT);

            for (int i = 0; i < N_THREADS; i++) {
                executor.submit(() -> {
                    while (true) {
                        try {
                            Socket socket = connectionQueue.take();
                            new Thread(new EchoHandler(socket)).start();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                

        }
    }
}
}
