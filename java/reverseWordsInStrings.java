public class reverseWordsInStrings {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String result1 = reverseWords(s1);
        System.out.println(result1);

        String s2 = "  hello world  ";
        String result2 = reverseWords(s2);
        System.out.println(result2);

        String s3 = "a good     example";
        String result3 = reverseWords(s3);
        System.out.println(result3);
    }
}
