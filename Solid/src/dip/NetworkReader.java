public class NetworkReader {
    private String url;

    NetworkReader(String url) {
        this.url = url
    }

    public string read() {
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
            return inputString1.toString()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}