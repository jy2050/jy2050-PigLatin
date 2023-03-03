import java.util.*;
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        String[] letters = in.split(" ");
        StringBuilder result = new StringBuilder();
        for(String letter : letters){
            String firstLetter = letter.substring(0,1);
            String restOfLetters = letter.substring(1);
            String total = restOfLetters + firstLetter + "ay";
            result.append(total);
        }
        
        

        
        
        return result.toString().trim();
    }
}
