public class CalculateG {
    public static double multiply(double n, double y) {
        return n * y;
    }

    public static double square(double n)
    {
        return n * n;
    }

    public static double sum(double n, double y)
    {
        return n + y;
    }

    public static void printResult(String question, String result) {
        System.out.println(question + result);
    }

    public static void main(String[] args) {
        double gravity = -9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;
        double finalVelocity = gravity * fallingTime + initialVelocity;
        double finalPosition = 0.5 * gravity * square(fallingTime) + initialVelocity * fallingTime + initialPosition;

        printResult("The object's position after " + fallingTime + " seconds is ", finalPosition + " m.");
        printResult("The object's velocity after " + fallingTime + " seconds is ", finalVelocity + " m/s.");
    }
}