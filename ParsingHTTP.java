
import com.sun.net.httpserver.Request;

public class ParsingHTTP {
    public static void main(String[] args) {
        private static void parseRawHttpRequest(String rawRequest) throw Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(rawRequest));
            String line = reader.readLine();
            String[] parts = line.split(" ");

            String method = requestLine[0];
            String path = requestLine[1];
            String version = requestLine[2];
            Map<String, String> headers = new HashMap<>();
            while ((line = reader.readLine()) != null) {
        }
    }
    
}
