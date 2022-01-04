/**
 * <strong>GP2 - PA2</strong>
 * Class to calculate with rationals.
 * 
 * @author Verena Kauth
 * @version 1.0
 *
 */
public class Mathematics {
    /** 
     * the numerator of the rational.
     */
    static int numerator;
    /**
     * the denominator of the rational.
     */
    static int denominator;
/**
 * method to find the greatest common divisor for two integers.
 * @param numerator - the numerator of the rational
 * @param denominator - the denominator of the rational
 * @return - the greatest common divisor of two ints
 */
    public static int gcd(int numerator, int denominator) {
        int n = numerator;
        int d = denominator;
        int gcd = 0;
        while (d != 0) {
            int result = n % d;
            n = d;
            d = result;
            gcd = n;
        }
        if (d == 0) {
            gcd = Math.abs(n);
        }
        if (d == 0 && n == 0) {
            gcd = 0;
        }
        return gcd;

    }
/** 
 * method to find the lowest common multiplier of two integers.
 * @param numerator - the numerator (first int) of the rational
 * @param denominator - the denominator (second int) of the rational
 * @return the lowest commom multiplier of two ints
 */
    public static int lcm(int numerator, int denominator) {
        if (denominator == 0) {
            return 0;
        } else {
            return Math.abs(numerator * denominator) / gcd(numerator, denominator);
        }
    }
/**
 * adds two rationals.
 * @param myRational1 - the first rational for the addition
 * @param myRational2 - the second rational for the addition
 * @return the result of the addition as rational
 */
    public static Rational add(Rational myRational1, Rational myRational2) {
        if (myRational1.getDenominator() == 0 || myRational2.getDenominator() == 0) {
            return new Rational(1, 0);
        } else {
            numerator = myRational1.getNumerator() * myRational2.getDenominator()
                    + myRational1.getDenominator() * myRational2.getNumerator();
            denominator = myRational1.getDenominator() * myRational2.getDenominator();
            return new Rational(numerator, denominator);

        }
    }
/**
 * subtracts two rational.
 * @param myRational1 - the first rational for the subtraction
 * @param myRational2 - the second rational for the subtraction
 * @return the result of the subtraction as rational
 */
    public static Rational subtract(Rational myRational1, Rational myRational2) {
        if (myRational1.getDenominator() == 0 || myRational2.getDenominator() == 0) {
            return new Rational(1, 0);
        } else {
            numerator = myRational1.getNumerator() * myRational2.getDenominator()
                    - myRational2.getNumerator() * myRational1.getDenominator();
            denominator = myRational1.getDenominator() * myRational2.getDenominator();
            return new Rational(numerator, denominator);
        }
    }
/**
 * multiplies two rationals.
 * @param myRational1 - the first rational for the multiplication
 * @param myRational2 - the second rational for the multiplication
 * @return the result from the multiplication as rational
 */
    public static Rational multiply(Rational myRational1, Rational myRational2) {
        if (myRational1.getDenominator() == 0 || myRational2.getDenominator() == 0) {
            return new Rational(1, 0);
        } else {
            numerator = myRational1.getNumerator() * myRational2.getNumerator();
            denominator = myRational1.getDenominator() * myRational2.getDenominator();
            return new Rational(numerator, denominator);
        }

    }
/**
 * divides two rationals.
 * @param myRational1  - the first rational for the division
 * @param myRational2 - the second rational for the divsion
 * @return the result of the division as rational
 */
    public static Rational divide(Rational myRational1, Rational myRational2) {
        if (myRational1.getDenominator() == 0 || myRational2.getDenominator() == 0) {
            return new Rational(1, 0);
        } else {
            numerator = myRational1.getNumerator() * myRational2.getDenominator();
            denominator = myRational1.getDenominator() * myRational2.getNumerator();
            return new Rational(numerator, denominator);
             
        }
    }

}
