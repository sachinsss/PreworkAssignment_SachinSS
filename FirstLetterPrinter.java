import java.util.Scanner;
class FirstLetterPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }

    static String firstLetterPrinter(String str) {
        // write your code here
        String result="";
        String[] temp;
        temp=str.split(" ");
        for ( int i=0;i< temp.length;i++) {
            result+= temp[i].charAt(0);
        }
        return result;
    }
}