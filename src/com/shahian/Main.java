package com.shahian;

public class Main {

    public static void main(String[] args) {
        simple();
        expressionBody();
        methodParameter();
        variableScop();
    }

    private static void variableScop() {
        int c = 5;
        Calculater calculater = (a, b) -> a + c;
        System.out.println(calculater.calc(5, 9));
    }

    private static void methodParameter() {
        System.out.println(runTester(str -> str.length() > 6, "HamidRezaShahian"));
        System.out.println(runTester(str -> str.startsWith("Q"), "HamidRezaShahian"));
    }


    private static void simple() {
        TestInterface testInterface = s -> s.length() > 5;
        System.out.println(testInterface.test("HamidReza"));
    }

    private static void expressionBody() {
        TestInterface testInterface1 = str -> {
            String s = str.substring(0, str.length() - 1);
            if (s.length() == str.length()) {
                return true;
            } else
                return false;
        };
        System.out.println(testInterface1.test("Shahian"));
    }

    public static boolean runTester(TestInterface t, String str) {
        return t.test(str);
    }
}
