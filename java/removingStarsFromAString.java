import java.util.Scanner;

class removeStarsFromAString {
    public static String removeStars(String s) {
        String res="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='*' && i>0) {
                res=res.substring(0,res.length()-1);
            }
            else {
                res=res+s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String inp;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a string with * after letter to delete from string: ");
        inp=scan.nextLine();
        System.out.println("New String: "+removeStars(inp));
        scan.close();
    }
}