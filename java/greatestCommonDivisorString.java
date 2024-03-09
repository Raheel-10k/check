public class greatestCommonDivisorString {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int gcdLength = gcd(len1, len2);
        String candidate = str1.substring(0, gcdLength);

        if (isDivisor(candidate, str1) && isDivisor(candidate, str2)) {
            return candidate;
        } 
        else {
            return "";
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private boolean isDivisor(String candidate, String str) {
        int candidateLength = candidate.length();
        int strLength = str.length();
        if (strLength % candidateLength != 0) {
            return false;
        }
        for (int i = 0; i < strLength; i += candidateLength) {
            if (!str.substring(i, i + candidateLength).equals(candidate)) {
                return false;
            }
        }
        return true;
    }
}
