class FileWriter implements Writer{
    private String filename;

    FileWriter(String filename) {
        this.filename = filename
    }
    public void write(String encodedData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(encodedData)
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}