import java.util.Scanner;

public class Pyramid2 {
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
        int gap=(""+(int) Math.pow(2,total)).length()+1;
        //spaces break in front
        for(int i=0; i<total-current; i++) {
            for(int j=0; j<gap; j++) {
                System.out.printf(" ");
            }
        }
        String format= String.format("%%%dd",gap);
        //ascending
        for(int i=1; i<=current; i++) {
            int num=(int) Math.pow(2,i-1);
            System.out.printf(format,num);
        }
        //descending
        for(int i=current-1; i>0; i--) {
            int num=(int) Math.pow(2,i-1);
            System.out.printf(format,num);
        }
        System.out.println(""); //newline
    }
}