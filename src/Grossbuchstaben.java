public class Grossbuchstaben {
    public static void main(String[] args) {


    }

    public static String toUpperCase (String sentence) {
        sentence = "Wörter starten mit großbuchstaben!";
        char upper = sentence.charAt(8);
        String newSentence;

        while (upper < sentence.length()) {
            upper = sentence.charAt(8);
            newSentence = sentence + Character.toUpperCase(upper);
        }
            return newSentence;

//        while (sentence = sentence.length()) {
//            upper = sentence.charAt(8);
//            sentence.charAt(16);
//            sentence.charAt(20);
//
//            if ((sentence.charAt(8)) || (sentence.charAt(16)) || ((sentence.charAt(20)){
//               newSentence = sentence + Character.toUpperCase(upper);

    }

}
