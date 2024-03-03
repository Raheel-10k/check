public class greatestCommonDivisorString {
    public static String gcd(String str1, String str2) {
        if(str2.length()>str1.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if(str2.length()==0) {
            return str1;
        }

        String gcd="";
        int i=0;
        while(i<str2.length() && str1.charAt(i)==str2.charAt(i)) {
            gcd=gcd+str2.charAt(i);
            i++;
        }

        if (gcd.length() > 0) {
            String rem = str1.substring(i);
            String res=gcd(str2.substring(i), rem);
            if(res.length()>0 && str1.equals(gcd+res+res)) {
                return (gcd+res);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(gcd("ABCABC", "ABC"));
        System.out.println(gcd("ABABAB", "ABAB"));
        System.out.println(gcd("LEET", "CODE"));
    }
}
