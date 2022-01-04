/**
 * <strong>GP2-PA2</strong> Creates rational numbers from given ints and
 * normalizes them. puts them out in String and double format.
 * 
 * @author Verena Kauth
 * @version 1.0 26 Nov 2018
 *
 */
public class Rational {
    /**
     * numerator of the rational.
     */
    private int numerator;
    /**
     * denominator of the rational.
     */
    private int denominator;

    /**
     * Contructor for creating a rational from a given numerator and denominator.
     * 
     * @param numerator
     *            - the numerator of the rational
     * @param denominator
     *            - the denominator of the rational
     */
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.normalize();
    }

    /**
     * Constructor for a given int which is used as numerator. denumerator is set to
     * 1 to get a rational.
     * 
     * @param numerator
     *            - the numerator of the rational
     */
    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
        this.normalize();
    }

    /**
     * Copy Constructor.
     * 
     * @param myRational
     *            - Rational object to be copied
     */
    public Rational(Rational myRational) {
        this.numerator = myRational.numerator;
        this.denominator = myRational.denominator;
    }

    /**
     * Getter for Numerator.
     * 
     * @return numerator - the numerator of the rational
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * Getter for Denominator.
     * 
     * @return denominator - the denominator of the rational
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * normalizes the rational to the lowest possible value. If denominator is
     * negative it is made positive and the numerator is set to negative, if
     * numerator is 0, denominator is set to 1 if denominator is 0, nominator is set
     * to 1 Mathematics.gcd is called to get the greatest common divisor and the
     * rational is divided by this
     */
    private void normalize() {
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        if (this.numerator == 0 && this.denominator != 0) {
            this.denominator = 1;
        } else {
            if (this.denominator == 0) {
                this.numerator = 1;

            }
        }
        int gcd = Mathematics.gcd(numerator, denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    /**
     * interprets the rational as a double number.
     * 
     * @return the rational as double value
     * @throws ArithmeticException 
     *              - if denominator is 0
     */
    public double toDouble() throws ArithmeticException {
        try {
            if (denominator == 0) {
                throw new ArithmeticException();
            } else {
                return this.numerator / (double) this.denominator;
            }
        } catch (ArithmeticException e) {
            System.out.print("Denominator is ");
            return 0;

        }

    }

    /**
     * creates a String representation of the Rational numerator / denominator. if
     * the denominator is zero, output is "NaN"
     * 
     * @return the rational as String or NaN if denominator is zero
     */
    @Override
    public String toString() {
        if (this.denominator == 0) {
            return "NaN";
        } else {
            return this.numerator + "/" + this.denominator;
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + denominator;
        result = prime * result + numerator;
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Rational other = (Rational) obj;
        if (denominator != other.denominator) {
            return false;
        }
        if (numerator != other.numerator) {
            return false;
        }
        return true;
    }
}
