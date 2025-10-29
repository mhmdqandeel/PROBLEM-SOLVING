package smallestNumber;

public class Solution {

    public int smallestNumber(int n) {
        if (n == 1) return 1;

        if (n%2 == 0) n = n+1;

        int pow = (int) Math.ceil(Math.log(n) / Math.log(2));

        return (1 << pow) - 1;
    }
}
