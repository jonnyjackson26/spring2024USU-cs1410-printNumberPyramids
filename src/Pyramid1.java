import java.util.Scanner;
public class Pyramid1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();

        printPyramid(x);
    }

    public static void printPyramid(int x) {
        for(int i=1; i<x+1; i++) {
            printLine(i,x);
        }
    }
    public static void printLine(int current, int total) {
        int gap=(""+total).length()+1;
        //spaces break in front
        for(int i=0; i<total-current; i++) {
            for(int j=0; j<gap; j++) {
                System.out.printf(" ");
            }
        }
        //descending
        String format= String.format("%%%dd",gap);
        for(int i=current; i>1; i--) {
            System.out.printf(format,i);
        }
        //ascending
        for(int i=1; i<current+1; i++) {
            System.out.printf(format,i);
        }
        System.out.println(""); //newline
    }
}