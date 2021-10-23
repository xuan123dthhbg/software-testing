import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTesting {
    public CountTesting(){}
    @Test
    public void testCase1() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(6, 35);
        boolean check = countPerfectNumber.check();
        assertEquals(true, check);
    }
    @Test
    public void testCase2() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(6, 36);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCase3() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(7, 8);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCase4() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(150, 2);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCase5() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(28, -10);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary1() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(6, 35);
        boolean check = countPerfectNumber.check();
        assertEquals(true, check);
    }
    @Test
    public void testCaseBoundary2() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(0, 35);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary3() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(1, 35);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary4() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(99, 35);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary5() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(100, 35);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary6() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(0, 6);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary7() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(1, 6);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary8() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(99, 6);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
    @Test
    public void testCaseBoundary9() {
        CountPerfectNumber countPerfectNumber = new CountPerfectNumber(100, 6);
        boolean check = countPerfectNumber.check();
        assertEquals(false, check);
    }
}
