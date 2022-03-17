public class Grossbuchstaben {
    public static void main(String[] args) {

        System.out.println(toUpperCase("I want some food and i want it now!"));
        System.out.println(toUpperCase("If you can read this, bring me coffee."));


    }

    public static String toUpperCase (String sentence) {
        String newSentence = new String();
        char c = ' ';
        newSentence = newSentence + sentence.charAt(0);

        for (int i = 1; i < sentence.length(); i++) {
            c = sentence.charAt(i);

            if (sentence.charAt(i - 1 ) == ' ') {
                c = Character.toUpperCase(sentence.charAt(i));
            }

            newSentence = newSentence + c;
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
