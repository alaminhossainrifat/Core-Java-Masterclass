public class Practice {
    public static void main(String[] args) {
        double a = 20.5;
        double b = 30.7;
        double c = 45.2;
        double d = 10.8;

        double expression1 = ((a + b) * (c - d)) / (a / d);
        double expression2 = ((a * b) + (c / d)) - (a - d);

        if (expression1 > expression2) {
            System.out.println("Expression 1 is greater than Expression 2");
        }
        else if (expression1 < expression2) {
            System.out.println("Expression 2 is greater than Expression 1");
        }
        else
        {
            System.out.println("Both Expression are equal!!!");
        }
    }
}
