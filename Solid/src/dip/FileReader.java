class FileReader implements Reader{
    private String filename;

    FileReader(String filename) {
        this.filename = filename
    }

    public String read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String aLine;
            String data = "";
            while ((aLine = reader.readLine()) != null) {
                data += aLine
            }
            return data;
        } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}