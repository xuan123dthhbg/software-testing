public class CountPerfectNumber {
    public int n;
    public int a;

    public CountPerfectNumber(int n, int a) {
        this.n = n;
        this.a = a;
    }

    boolean  check(){
        if(checkPerfectNumber(n)){
            return checkTwoNumbers(n, a);
        }
        return false;
    }
    public boolean checkTwoNumbers(int a, int b) {
        if (a>= 0 && b >= 0){
            int gcd;
            if (a == 0 || b == 0) {
                gcd = a + b;
            }
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            gcd = a;
            return gcd == 1;
        }
        return false;
    }

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num && num > 1;
    }
}
