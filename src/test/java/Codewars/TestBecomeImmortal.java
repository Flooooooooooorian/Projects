package Codewars;

import Codewars.BecomeImmortal;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBecomeImmortal {

    @Disabled
    @ParameterizedTest
    @CsvSource({"5, 8, 5, 1, 100",
            "224, 8, 8, 0, 100007",
            "11925, 25, 31, 0, 100007",
            "4323, 5, 45, 3, 1000007",
            "1586, 31, 39, 7, 2345",
            "808451, 545, 435, 342, 1000007",
            "5456283, 28827050410, 35165045587, 7109602, 13719506",

    })
    public void example(long expected, long n, long m, long k, long newp) {
        assertEquals(expected, BecomeImmortal.elderAge(n, m, k, newp));
    }

}
