public class isSubsequence {
    public static boolean IsSubsequence(String s, String t) {
        int sIndex=0, tIndex=0;

        while(tIndex<t.length()) {
            if(sIndex<s.length() && s.charAt(sIndex)==t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex==s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";
        String s2 = "axc";
        String t2 = "ahbgdc";

        System.out.println(IsSubsequence(s1, t1));
        System.out.println(IsSubsequence(s2, t2));
    }
}