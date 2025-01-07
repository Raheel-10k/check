class StringToInteger {
    public static int myAtoi(String s) {
        int res=0;
        boolean numFound=false,charFound=false, flag=false;
        for(int i=0;i<s.length();i++) {
            if(!numFound && !charFound) {
                if(s.charAt(i)==' ') {
                    continue;
                }
                if(s.charAt(i)=='+') {
                    charFound=true;
                    continue;
                }
                if(s.charAt(i)=='-') {
                    charFound=true;
                    flag=true;
                    continue;
                }
                if(Character.isDigit(s.charAt(i))) {
                    numFound=true;
                    int d=s.charAt(i)-'0';
                    res=res*10+d;
                }
                else {
                    break;
                }
            }
            else {
                if(!Character.isDigit(s.charAt(i))) {
                    break;
                }
                else {
                    int d=s.charAt(i)-'0';
                    if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && d > 7)) {
                        return flag == false ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    res=res*10+d;
                }
            }
        }
        if(flag) {
            return (res*-1);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("-012"));

    }
}