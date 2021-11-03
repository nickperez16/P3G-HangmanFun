import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Reader
{
    //static String url = "https://raw.githubusercontent.com/first20hours/google-10000-english/master/google-10000-english-no-swears.txt";
    static String url = "https://gist.githubusercontent.com/sirkets/7d89492826a0d245a086e8c5c56829a8/raw/307ef87315bf0360f682bf25821fdcf4fe71db8c/nouns.txt";
    public static void readInto(ArrayList<String> list) throws Exception {
        URL wordsURL = new URL(url);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(wordsURL.openStream()));
        String word;
        while ((word = in.readLine()) != null)
            list.add(word);
        in.close();
    }
}