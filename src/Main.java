public class Main {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b++;
        if ((b % 2) == 0) System.out.println("even number");
        else System.out.println("odd number");

        if ((b * ++b) % 3 == 0) System.out.println("multiple of 3");
        else System.out.println("not a multiple of 3");
    }
}