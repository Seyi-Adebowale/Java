import java.util.Scanner;

enum firstEnum {
    Distinction, VeryGood, Good, Pass, Fail;
}

public class Enum {
    public static void main(String[] args) {
        firstEnum[] x = firstEnum.values();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your score (or press 5 to exit)");
            int score = sc.nextInt();

            if (score == 5) {
                break;
            } 
            else if (score > 100 || score < 0) {
                System.out.println("Please enter a number between 0 and 100");
                continue;
            } 
            else {
                if (score >= 80) {
                    System.out.println(x[0]);
                } 
                else if (score < 80 && score >= 65) {
                    System.out.println(x[1]);
                } 
                else if (score < 65 && score >= 50) {
                    System.out.println(x[2]);
                } 
                else if (score < 50 && score >= 40) {
                    System.out.println(x[3]);
                } 
                else {
                    System.out.println(x[4]);
                }
            }
        }
        sc.close();
    }
}