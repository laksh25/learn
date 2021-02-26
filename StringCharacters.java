public class StringCharacters {

    public static void main(String[] args) {

        String text = "To be or not to be, that is the question;"

                + "Whether this nobler in the mind to suffer"

                + " the slings and arrows of outrageous fortune,"

                + " or to take arms against a sea of troubles,"

                + " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;
        int specialChar = 0;

        // YOUR CODE HERE
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a' || text.charAt(i) == 'E' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'I' || text.charAt(i) == 'i' || text.charAt(i) == 'O' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'U' || text.charAt(i) == 'u') {
                vowels++;
            }

            else if (text.charAt(i) == ' ') {
                spaces++;
            }

            else if (text.charAt(i) == '?' || text.charAt(i) == ',' || text.charAt(i) == ';') {
                specialChar++;
            }

            else {
                letters++;
            }
        }
        letters = letters - specialChar;
        System.out.println(
                "The text contained vowels: " + vowels + "\n" + "consonants: " + letters + "\n" + "spaces: " + spaces);

    }
}


