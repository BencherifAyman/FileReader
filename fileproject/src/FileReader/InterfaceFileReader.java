package FileReader;


import java.util.ArrayList;

public interface InterfaceFileReader {
    boolean isFileReadable(String var1);

    void readFile();

    ArrayList<String> stream();
}
