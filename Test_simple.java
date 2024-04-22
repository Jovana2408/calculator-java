public class Simple_Test {

    public static void main(String[] args) {
        testExpression();
    }

    public static void testExpression() {
        String[] expressions = {
                "2+2",
                "5-3",
                "2*2",
                "2/2",
                "7/0"
        };

        String[] expectedResults = {
                "4.0",
                "2.0",
                "4.0",
                "1.0",
                "0.0"
        };

        for (int i = 0; i < expressions.length; i++) {
            String expression = expressions[i];
            String expectedResult = expectedResults[i];
            String actualResult = Calculator.Run(expression);

            if (expectedResult.equals(actualResult)) {
                System.out.println("Test case " + (i + 1) + " Passed");
            } else {
                System.out.println("Test case " + (i + 1) + "Failed" + "Expected: " + expectedResult);
                System.out.println("Actual: " + actualResult);
            }
        }
    }

}