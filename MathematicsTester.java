/**
 * <strong>GP2 - PA2</strong>
 * Tester for Mathematics.java.
 * @author Verena Kauth
 *
 */
public class MathematicsTester {
/**
 * main method.
 * @param args - not used
 */
    public static void main(String[] args) {
        System.out.println(Mathematics.gcd(4, 6));
        System.out.println(Mathematics.gcd(6, 4));
        System.out.println(Mathematics.gcd(-4, 6));
        System.out.println(Mathematics.gcd(4, 1));
        System.out.println(Mathematics.gcd(4, 0));
        System.out.println(Mathematics.gcd(-4, 0));
        System.out.println(Mathematics.gcd(0, 0));
        System.out.println("--------------------");
        System.out.println(Mathematics.lcm(4, 6));
        System.out.println(Mathematics.lcm(6, 4));
        System.out.println(Mathematics.lcm(0, 0));
    }

}
