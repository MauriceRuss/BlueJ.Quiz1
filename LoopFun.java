 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int answer = 1;
          for(int q = 1; q <= number; q++){
              answer = answer * q;
            }
          return answer;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String answer = "";
          for(String q : phrase.split(" ")){
              answer += q.charAt(0);
              answer = answer.toUpperCase();
            }
          
            
          return answer;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      /*for each loop to iterate?????
      make array of alpha*/
      /*else/if through alphabit???*/
      public String encrypt(String word) {
          String answer = "";
          char[] alphabet = "abcdefghifklmnopqrstuvwxyz".toCharArray();
          return answer;
      }
}
