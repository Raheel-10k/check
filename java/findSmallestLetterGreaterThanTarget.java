public class findSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;

        while(left<=right) {
            int mid=left+(right-left)/2;

            if(letters[mid]<=target) {
                left=mid+1;
            } 
            else {
                right=mid-1;
            }
        }

        if(left==letters.length) {
            return letters[0];
        }

        return letters[left];
    }

    public static void main(String[] args) {
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';

        System.out.println(nextGreatestLetter(letters1, target1));
        System.out.println(nextGreatestLetter(letters2, target2));
        System.out.println(nextGreatestLetter(letters3, target3));
    }
}
