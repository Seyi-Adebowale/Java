import java.util.Scanner;

interface Doubler {
    int doubleNumber(int x);
}

interface Tripler {
    int tripleNumber(int x);
}

interface Squarer {
    int squareNumber(int x);
}

interface Incrementer {
    int incrementNumber(int x);
}

public class functionalInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        Doubler obj1 = (int x) -> x * 2;
        int ans1 = obj1.doubleNumber(num);
        System.out.println("Doubled: " + ans1);

        Tripler obj2 = (int x) -> x * 3;
        int ans2 = obj2.tripleNumber(num);
        System.out.println("Tripled: " + ans2);

        Squarer obj3 = (int x) -> x * x;
        int ans3 = obj3.squareNumber(num);
        System.out.println("Squared: " + ans3);

        Incrementer obj4 = (int x) -> x + 1;
        int ans4 = obj4.incrementNumber(num);
        System.out.println("Incremented: " + ans4);

        sc.close();
    }
}
