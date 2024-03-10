class GuessGame {
    private int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {
        return Integer.compare(num, pick);  //returns 1 when num is greater than pick; returns -1 when opposite; and returns 0 when num and pick is equal
    }
}

public class guessNumberHigherOrLower extends GuessGame {
    public guessNumberHigherOrLower(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int left=1;
        int right=n;

        while(left<=right) {
            int mid=left+(right-left)/2;
            int result=guess(mid);

            if(result==0) {
                return mid;
            } 
            else if(result==-1) {
                right=mid-1;
            } 
            else {
                left=mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int pick=6;
        guessNumberHigherOrLower solution=new guessNumberHigherOrLower(pick);
        System.out.println(solution.guessNumber(10));
    }
}
