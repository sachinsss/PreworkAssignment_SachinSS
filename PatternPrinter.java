import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
    static void patternPrinter(int n) {
        // write your code here
        int value=n, lines=n;
        for(int l=lines;l>0;l--) {
            for (int j = value; j > 0; j--) {
                for (int i = l; i > 0; i--)
                    System.out.print(j);
            }
            System.out.println();
        }

    }
}

