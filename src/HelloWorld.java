import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fib(5));
        System.out.println(memoizedFib(50));

        System.out.println(mean(1.1f, 2, 3));
    }

    public static float mean(float... numbers) {
        float sum = 0;

        for (float number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static int factorial(int value) {
        if (value == 1) return 1;

        return value * factorial(value - 1);
    }

    /**
     * @param value n fib number. Starts from 0.
     * @return nth fib value
     */
    public static int fib(int value) {
        if (value == 0 || value == 1) return value;

        return fib(value - 1) + fib(value - 2);
    }

    /**
     * Memoized Fib
     *
     * @param value n fib number. Starts from 0.
     * @return nth fib value
     */
    public static long memoizedFib(int value) {
        return memoizedFib(value, new HashMap<Integer, Long>());
    }

    /**
     * Memoized Fib
     *
     * @param value n fib number. Starts from 0.
     * @return nth fib value
     */
    public static long memoizedFib(int value, HashMap<Integer, Long> memo) {
        if (value == 0 || value == 1) return value;

        if (memo.containsKey(value)) return memo.get(value);

        long result = memoizedFib(value - 1, memo) + memoizedFib(value - 2, memo);

        memo.put(value, result);

        return result;
    }
}
