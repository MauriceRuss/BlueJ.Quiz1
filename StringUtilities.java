
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String answer = String.join(baseValue, valueToBeAdded);
        return answer;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        //String answer = "";
      /** char[] answer = valueToBeReversed.toCharArray();
       for(int q = valueToBeReversed.le ngth - 1; q >= 0;){
        }*/
        
     return null;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        String midChar = "";
        int r=word.length();
        int q=r/2;
        char answer[] =word.toCharArray();
        return answer[q];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String answer = "";
        String q = String.valueOf(charToRemove);
        answer = value.replaceAll(q, "");
        return answer;
       
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String answer = "";
        answer = sentence.substring(sentence.lastIndexOf(" ")+1);
        return answer;
    }
}
