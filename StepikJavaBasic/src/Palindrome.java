public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));

        for (int i = 1; i < 10; i++) {
           int k=i;
            System.out.println(k);
          if (k%2==0) {
              break;
          }
        }
        System.out.println();
        for (int i = 1; i < 10; ) {
            int k=i;
            System.out.println(k);
            if (k%2==0) {
                break;
            }
            i++;
        }

    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
//        return ...; // your implementation here

//        System.out.println(text);
        text = text.replaceAll("[^a-zA-Z0-9]","");
        text= text.toLowerCase();
//        System.out.println(text);

        StringBuilder text1 = new StringBuilder(text);
        text1=text1.reverse();
        String text2 = new String(text1);




        return text.equals(new String(new StringBuilder(text).reverse()));
    }
}
