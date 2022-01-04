/**
 * <strong>GP2 - PA2</strong> Tester class for Rational.java.
 * 
 * @author Verena Kauth
 *
 */
public class RationalTester {
    /**
     * main method.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args) {
        Rational rationalOne = new Rational(6);
        System.out.println("rationalOne: ");
        System.out.println(rationalOne.toString());
        System.out.println(rationalOne.toDouble());
        System.out.println("----------------------------");
        Rational newRational = new Rational(4, 6);
        System.out.println("newRational: ");
        System.out.println(newRational.toString());
        System.out.println(newRational.toDouble());
        System.out.println("----------------------------");
        Rational copiedRational = new Rational(newRational);
        System.out.println("copiedRational: ");
        System.out.println(copiedRational.toString());
        System.out.println(copiedRational.toDouble());
        System.out.println("----------------------------");
        Rational numeratorZero = new Rational(0, 7);
        System.out.println("numeratorZero: ");
        System.out.println(numeratorZero.toString());
        System.out.println(numeratorZero.toDouble());
        System.out.println("----------------------------");
        Rational denominatorZero = new Rational(7, 0);
        System.out.println("denominatorZero: ");
        System.out.println(denominatorZero.toString());
        System.out.println(denominatorZero.toDouble());
        System.out.println("----------------------------");
        System.out.println("4/6 = 4/6? " + newRational.equals(copiedRational));
        System.out.println("4/6 = 6/1? " + newRational.equals(rationalOne));
        System.out.println("----------------------------");
        System.out.println("6/1 + 4/6 = " + Mathematics.add(newRational, rationalOne));
        System.out.println(Mathematics.add(newRational, rationalOne).toDouble());
        System.out.println("----------------------------");
        System.out.println("6/1 - 4/6 = " + Mathematics.subtract(rationalOne, newRational));
        System.out.println(Mathematics.subtract(rationalOne, newRational).toDouble());
        System.out.println("----------------------------");
        System.out.println("6/1 * 4/6 = " + Mathematics.multiply(rationalOne, newRational));
        System.out.println(Mathematics.multiply(rationalOne, newRational).toDouble());
        System.out.println("----------------------------");
        System.out.println("6/1 / 4/6 = " + Mathematics.divide(rationalOne, newRational));
        System.out.println(Mathematics.divide(rationalOne, newRational).toDouble());
        System.out.println("----------------------------");
        Rational ra = new Rational(1, 2);
        Rational r1a = new Rational(3, 6);
        Rational r2a = new Rational(2, 4);
        Rational r3a = new Rational(-1, -2);
        Rational rb = new Rational(-1, 2);
        Rational r1b = new Rational(2, -4);
        Rational r2b = new Rational(1, -2);
        Rational r3b = new Rational(-3, 6);
        Rational rc = new Rational(0, 1);
        Rational r1c = new Rational(0, -3);
        Rational r2c = new Rational(0, 4);
        Rational r3c = new Rational(0, 2);
        Rational rd = new Rational(1, 0);
        Rational r1d = new Rational(-1, 0);
        Rational r2d = new Rational(3, 0);
        Rational r3d = new Rational(0, 0);

        System.out.println("ra : ");
        System.out.println(ra.toString());
        System.out.println(ra.toDouble());
        System.out.println("----------------------------");
        System.out.println("r1a: ");
        System.out.println(r1a.toString());
        System.out.println(r1a.toDouble());
        System.out.println("----------------------------");
        System.out.println("r2a: ");
        System.out.println(r2a.toString());
        System.out.println(r2a.toDouble());
        System.out.println("----------------------------");
        System.out.println("r3a: ");
        System.out.println(r3a.toString());
        System.out.println(r3a.toDouble());
        System.out.println("----------------------------");
        System.out.println("rb : ");
        System.out.println(rb.toString());
        System.out.println(rb.toDouble());
        System.out.println("----------------------------");
        System.out.println("r1b: ");
        System.out.println(r1b.toString());
        System.out.println(r1b.toDouble());
        System.out.println("----------------------------");
        System.out.println("r2b: ");
        System.out.println(r2b.toString());
        System.out.println(r2b.toDouble());
        System.out.println("----------------------------");
        System.out.println("r3b: ");
        System.out.println(r3b.toString());
        System.out.println(r3b.toDouble());
        System.out.println("----------------------------");
        System.out.println("rc : ");
        System.out.println(rc.toString());
        System.out.println(rc.toDouble());
        System.out.println("----------------------------");
        System.out.println("r1c: ");
        System.out.println(r1c.toString());
        System.out.println(r1c.toDouble());
        System.out.println("----------------------------");
        System.out.println("r2c: ");
        System.out.println(r2c.toString());
        System.out.println(r2c.toDouble());
        System.out.println("----------------------------");
        System.out.println("r3c: ");
        System.out.println(r3c.toString());
        System.out.println(r3c.toDouble());
        System.out.println("----------------------------");
        System.out.println("rd : ");
        System.out.println(rd.toString());
        System.out.println(rd.toDouble());
        System.out.println("----------------------------");
        System.out.println("r1d: ");
        System.out.println(r1d.toString());
        System.out.println(r1d.toDouble());
        System.out.println("----------------------------");
        System.out.println("r2d: ");
        System.out.println(r2d.toString());
        System.out.println(r2d.toDouble());
        System.out.println("----------------------------");
        System.out.println("r3d: ");
        System.out.println(r3d.toString());
        System.out.println(r3d.toDouble());
    }
}
