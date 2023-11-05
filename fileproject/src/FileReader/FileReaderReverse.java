package FileReader;
import java.util.ArrayList;

public class FileReaderReverse extends MyFileReader {
    private String path;

    public FileReaderReverse(String path) {
        this.path = path;
    }

    public ArrayList<String> stream() {
        if (!super.isFileReadable(this.path)) {
            System.out.println("An error occured ! verify that your file exist or if the path isn't wrong");
            return null;
        } else {
            super.readFile();

            for(int i = this.content.size() - 1; i >= 0; --i) {
                System.out.println((String)this.content.get(i));
            }

            return this.content;
        }
    }
}

