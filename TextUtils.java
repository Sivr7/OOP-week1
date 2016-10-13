package task;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class TextUtils {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @param text
     * @return sorted by natural order array of unique words
     */
    public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        if (text == null || text.isEmpty()) return new String[0];
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(uniqueWords);
    }

    /**
     * @param text
     * @return array with words, get from receive text
     * if received argument is null
     * or text length is zero
     * return array with zero length
     */
    public static String[] getWords(String text) {

//        TODO write your code here
        if (text == null || text.isEmpty()) return new String[0];

        String[] words = text.split("; ");

        return words;
    }

    /**
     * @param words array with words
     * @return array with unique words
     */
    public static String[] getUniqueWords(String[] words) {

//        TODO write your code here
        if(words == null) return new String[0];

        String result = "";

        for(int i = 0; i < words.length; i++){
            int count = 0;
            for(int j = words.length - 1; j > i; j--){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            if(count == 0){
                result += words[i] + " ";
            }
        }

        return result.split(" ");
    }
    /**
     * @param uniqueWords array with unique words
     * @return sorted by natural order array of unique words
     */
    public static String[] sortWords(String[] uniqueWords) {

//        TODO write your code here
        if(uniqueWords == null) return new String[0];

        for (int j = uniqueWords.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (uniqueWords[i].compareTo(uniqueWords[i + 1]) > 0) {
                    swap(uniqueWords, i, i + 1);
                }
            }
        }
        return uniqueWords;
    }

    // swaps i-element for j-element in given Object
    private static void swap(Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
