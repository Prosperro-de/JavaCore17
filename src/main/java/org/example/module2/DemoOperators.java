package org.example.module2;

public class DemoOperators {
    static int variable = 5;

    public static void main(String[] args) {

        /*
        Арифметичні оператори
        +
        -
        *
        /
        % - остача від ділення
         */

        System.out.println(5 + "10" + (7 + 3)); //51010
        int i = 10 % 4;
        System.out.println("i = " + i);

        /*
        Унарні операції
        ++ - інкремент
        -- - декремент
        - - від'ємне значення
        ! - логічне заперечення
         */

        int input = 5;

        System.out.println("input = " + input);
//        System.out.println("input = " + input);

        /*
        Операції присвоювання
        =
        +=
        -=
        *=
        /=
         */
        input = 10;
        int intValue = 5;
        input *= intValue;
        System.out.println("input = " + input);

        /*
        Операції порівняння
        ==
        !=
        >
        <
        >=
        <=
         */
        System.out.println(10 >= 10);

        /*
        Логічні оператори
        & - і
        | - або
        && - і
        || - або
        ^ - (xor) виключне або
         */

        int a = 5;
        int b = 10;
        int c = 15;
        boolean result = compare(a, b) || compare(b, c);

        System.out.println("result = " + result);

        boolean first = (3 == 3) && (5 != 5); //true false - false
        boolean second = (5 == 2) || (6 > 3); // false true - true
        boolean third = (8 > 5) ^ (3 < 5); // true true - false
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);

        /*
        instanceOf - чи є об'єкт екземпляром класу
         */
        DemoOperators demoOperators = new DemoOperators();

        boolean b1 = demoOperators instanceof DemoOperators;
        System.out.println("b1 = " + b1);

        String name = "Mykola";
//        String join = String.join("-", "a, b");
//        System.out.println("join = " + join);
        String anotherName = "mykola";
        boolean compareResult = name.equalsIgnoreCase(anotherName);
        boolean compareResultByRef = name == anotherName;
        System.out.println("compareResultByRef = " + compareResultByRef);
        System.out.println("compareResult = " + compareResult);

        int nameLength = name.length();
        System.out.println("nameLength = " + nameLength);
        String upperCase = name.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        boolean containsY = name.contains("y");
        System.out.println("containsY = " + containsY);
        char c1 = name.charAt(name.length() - 1);
        System.out.println("c1 = " + c1);

        boolean startsWith = name.startsWith("Mh");
        System.out.println("startsWith = " + startsWith);

        String replace = name.replace("k", "o").toLowerCase();
        System.out.println("replace = " + replace);
        String java = "Java";
        String replace1 = java.replaceAll("a", " ");
        System.out.println("replace1 = " + replace1);

        System.out.print("Hello \t");
        System.out.print("World\n");

        String substring = name.substring(1, 3);
        System.out.println("substring = " + substring);

        if (true) {
            int example = 10;
            System.out.println("example = " + example);
        }
        String concat = name.concat(" Klushyn");
        System.out.println("concat = " + concat);

    }


    public static boolean compare(int a, int b) {

        System.out.println("Comparing: " + a + "and" + b);
        return a < b;
    }
}
