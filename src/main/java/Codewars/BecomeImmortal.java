package Codewars;

public class BecomeImmortal {

    static long elderAge(long n, long m, long k, long newp) {
        long age = 0;

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                long donation = (x^y) - k;
                if (donation > 0) {
                    age += donation;
                }
            }
        }
        return age % newp;
    }
}
