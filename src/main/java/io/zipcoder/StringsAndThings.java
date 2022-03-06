package io.zipcoder;



import java.util.Locale;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    //i = index marker
    public Integer countYZ(String input) {
        String[] splitWords = input.split(" ");
        Integer counter = 0;
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].substring(splitWords[i].length() - 1).toLowerCase(Locale.ROOT).equals("y")
                    || splitWords[i].substring(splitWords[i].length() - 1).toLowerCase(Locale.ROOT).equals("z")) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    //created a new base and set it equal. Replaces the first substring of this string that matches the given regular expression with the given replacement.
    public String removeString(String base, String remove) {

        String newBase = base.replace(remove, "");

        return newBase;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    //
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        //Boolean newInput = Boolean.parseBoolean(input);
        //get count for's is and nots
        //   input ==
        //return ;
        //char sample  = input.charAt(1)
        //.length() is the size of the string
        int isCounter = 0;
        int notCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i+1 <input.length()&& input.charAt(i) == 'i' && input.charAt(i + 1) == 's' ) { // this is not i+1 it looks at 1 char then goes to the next if its true
                isCounter++;
            } else {
                if (i +2< input.length() && input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't') { //i +2 stops it from running at the end of the string  index
                    notCounter++;
                }
            }
           // return
            //[ this is not
            //  012345678910
        }
        return (isCounter == notCounter);
    }





    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
   public Boolean gIsHappy(String input) {
       boolean happy = false;
       char[] words = input.toCharArray();
       for ( int i = 0; i < words.length; i++){
           if( (words[i] == 'g') && (words[i+1] == 'g')){
               happy = true;
           } else if (i < 0 && (words[i-1] !='g') && (words[i] == 'g') && (words[i+1] != 'g')){
               happy = false;
               break;
           } else {
           }
       }
//        for ( char letter : input.toCharArray())
//            if (letter.)
       return happy;
   }

    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1  -----> The X's are the triple
     *            countTriple("xxxabyyyycd") // Should return 3 ------> 1st tripple is x 2nd triple is Y and #rd triple is Y because it can overlap
     *            countTriple("a") // Should return 0
     */
    // i is a loop counter ; reference point ; i always changes
    public Integer countTriple(String input){
        int isTriple =0;
        //int notTriple =0;

        for(int i=0; i<input.length()-2; i++ ){ //the -2 looks @ the last 2 letters of the size. shortens the lap of the loop at a

            if(input.charAt(i) == input.charAt(i+1) && input.charAt(i+1)== input.charAt(i+2)){ //if 1 letter matches and the 2nd match then the 3rd letter matches is true
                    isTriple++;                                                                     //it adds 1
            }
        }

        return isTriple;
    }
}
// given a string reads the char in each string
//each char that is by itself 3 times return count ++ (count +1)
//print integer