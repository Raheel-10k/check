public class harshadNumber {
        public static int sumOfTheDigitsOfHarshadNumber(int x) {
            int temp=x;
            int sum=0;
            while(x>0) {
                sum+=x%10;
                x=x/10;        
            }
            if(temp%sum==0) {
                return sum;
            }
            else {
                return -1;
            }
        }
        public static void main(String[] args) {
            System.out.println(sumOfTheDigitsOfHarshadNumber(20));
        }
}
