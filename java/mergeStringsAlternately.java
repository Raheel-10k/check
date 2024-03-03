class mergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int i = 0, j = 0;

        while(i<word1.length() && j<word2.length()) {
            result +=word1.charAt(i++)+""+word2.charAt(j++);
        }
        while (i < word1.length()) {
            result += word1.charAt(i++);
        }

        while (j < word2.length()) {
            result += word2.charAt(j++);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
    }
}