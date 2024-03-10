public class stringCompression {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length) {
            char currentChar=chars[i];
            int count=0;
            
            while(i<chars.length && chars[i]==currentChar) {
                i++;
                count++;
            }
            chars[index++]=currentChar;
            if(count>1) {
                String countStr=Integer.toString(count);
                for(char c : countStr.toCharArray()) {
                    chars[index++]=c;
                }
            }
        }
        
        return index;
    }

    public static void main(String[] args) {
        stringCompression solution = new stringCompression();

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length1 = solution.compress(chars1);
        System.out.println("Output 1: " + length1);
        System.out.print("Chars 1: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(chars1[i] + " ");
        }
        System.out.println();

        char[] chars2 = {'a'};
        int length2 = solution.compress(chars2);
        System.out.println("Output 2: " + length2);
        System.out.print("Chars 2: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(chars2[i] + " ");
        }
        System.out.println();
    }
}

