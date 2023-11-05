package FileReader;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public  class FileGlobalReader extends MyFileReader {
    private String path;

    public FileGlobalReader(String path) {
        this.path = path;
    }

    public ArrayList<String> stream() {
        if (!super.isFileReadable(this.path)) {
            System.out.println("An error occured ! verify that your file exist or if the path isn't wrong");
            return null;
        } else {
            super.readFile();

            for(int i = 0; i < this.content.size(); ++i) {
                System.out.println((String)this.content.get(i));
            }

            return this.content;
        }
    }

    public void diff(ArrayList<String> content1, ArrayList<String> content2) {
        List<String> difference = (List)content1.stream().filter((aObject) -> {
            return !content2.contains(aObject);
        }).collect(Collectors.toList());
        List<String> difference2 = (List)content2.stream().filter((aObject) -> {
            return !content1.contains(aObject);
        }).collect(Collectors.toList());
        System.out.println("Elements that are not contained on both files :" + difference + " " + difference2);
    }
}

