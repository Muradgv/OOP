public class Main {
    public static void main(String[] args) {
        // Task first for catching exceptions (array index out of bounds)
        try {
            int a[] = {1, 2, 3, 4, 5};
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("first exception caught");
        }

        // Task second for catching exceptions (division by zero)
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i / 0);
            } catch (Exception e) {
                System.out.println("second exception caught");
                break;
            }
        }

        // Task third for catching exceptions (stack overflow)
        try {
            infiniteRecursion(1);
        } catch (StackOverflowError e) {
            System.out.println("third exception caught");
        }

        // Task fourth for catching exceptions (out of memory)
        try {
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("fourth exception caught");
        }

        // Task fifth for catching exceptions (custom exception)
        try {
            throw new CustomException();
        } catch (CustomException e) {
            System.out.println("Fifth exception (custom) caught");
        }
    }

    private static void infiniteRecursion(int a) {
        if (a == 1) {
            infiniteRecursion(1);
        }
    }
}

class CustomException extends Exception {}
