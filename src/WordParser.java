package src;

import java.util.ArrayList;
import java.util.regex.*;

public class WordParser {
    public static void main(String[] args) {
        String sentence = "I, Scottie, am leaving this review. The food was so bad! Do you think?";
        parseWords(sentence);
        System.out.println();
        ArrayList<String> words = parseWordsToArrayList(sentence);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void parseWords(String sentence) {
        Pattern pattern = Pattern.compile("(\\w+\\s*)");
        Matcher matcher = pattern.matcher(sentence);
        System.out.println("Use the matcher.group().toLowerCase() call to get each individual word.");
        while (matcher.find()) {
            System.out.println(matcher.group().toLowerCase());
        }
    }

    public static ArrayList<String> parseWordsToArrayList(String sentence) {
        ArrayList<String> words = new ArrayList<String>();
        Pattern pattern = Pattern.compile("(\\w+\\s*)");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            words.add(matcher.group().toLowerCase());
        }
        return words;
    }
}