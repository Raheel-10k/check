public class canPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(CanPlaceFlowers(flowerbed1, n1)); // Output: true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(CanPlaceFlowers(flowerbed2, n2)); // Output: false
    }//using testcases from leetcode itself.

    public static boolean CanPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int len1=flowerbed.length;

        for(int i=0;i<len1;i++) {
            if (flowerbed[i]==0) {
                int prev= (i==0) ? 0 : flowerbed[i-1];
                int next= (i==len1-1) ? 0 : flowerbed[i+1];
                if(prev==0 && next==0) {
                    flowerbed[i]=1;
                    count++;
                    i++;
                }
            }
        }

        return (count>=n);
    }
}
