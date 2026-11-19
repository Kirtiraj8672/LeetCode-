class Solution {
    public double myPow(double x, int n) {

        long N = n;
        boolean isNegative = N < 0;

        if (isNegative) {
            N = -N;
        }

        double result = fastPow(x, N);

        if (isNegative) {
            return 1.0 / result;
        }

        return result;
    }

    public double fastPow(double x, long n) {

        if (n == 0) {
            return 1.0;
        }

        double halfpow = fastPow(x, n / 2);
        double halfpowsq = halfpow * halfpow;

        if (n % 2 != 0) {
            halfpowsq = x * halfpowsq;
        }

        return halfpowsq;
    }
}