package FileReader;

import java.util.ArrayList;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        System.out.println("Normal Reader :");
        FileGlobalReader test1 = new FileGlobalReader("src/test1.txt");
        test1.stream();
        System.out.println(" ");
        System.out.println("Reversed Reader :");
        FileReaderReverse test2 = new FileReaderReverse("src/test2.txt");
        test2.stream();
        System.out.println(" ");
        System.out.println("Palindromic Reader :");
        PalindromeFile test3 = new PalindromeFile("src/test3.txt");
        test3.stream();
        System.out.println(" ");
        System.out.println("File comparator :");
        FileGlobalReader test4 = new FileGlobalReader("src/test2.txt");
        FileGlobalReader test5 = new FileGlobalReader("src/test3.txt");
        ArrayList<String> content1 = test4.stream();
        System.out.println(" ");
        ArrayList<String> content2 = test5.stream();
        System.out.println(" ");
        test4.diff(content1, content2);
    }
}
