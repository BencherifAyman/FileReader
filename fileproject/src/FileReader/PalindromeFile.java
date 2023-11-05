package FileReader;
import java.util.ArrayList;

public class PalindromeFile  extends MyFileReader {
    private String path;

    public PalindromeFile(String path) {
        this.path = path;
    }

    public ArrayList<String> stream() {
        if (!super.isFileReadable(this.path)) {
            System.out.println("An error occured ! verify that your file exist or if the path isn't wrong");
            return null;
        } else {
            super.readFile();
            String inversedCharacter = "";

            for(int a = 0; a < this.content.size(); ++a) {
                String[] mots = ((String)this.content.get(a)).split(" ");

                for(int b = 0; b < mots.length; ++b) {
                    int taille = mots[b].length();

                    for(int i = taille - 1; i > -1; --i) {
                        inversedCharacter = inversedCharacter + mots[b].substring(i, i + 1);
                    }

                    inversedCharacter = inversedCharacter + " ";
                }

                inversedCharacter = inversedCharacter + "\n";
            }

            System.out.println(inversedCharacter);
            return null;
        }
    }
}
