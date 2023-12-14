package org.example.module2;

public class DemoTypes {

    /*
    1 byte = 8 bit
    byte = 1
    short = 2
    int = 4
    long = 8

    char = 2

    float = 4
    double = 8

    boolean = 1
     */

    public static void main(String[] args) {
        byte byteVar = 1;
        short shortVar = Short.MAX_VALUE;
        int intVar = 10;
        long longVar = 3_000_000_000L;

        float floatVar = 10321.53f;
        double doubleVar = 10321.534512321211;

        double first = 0.2;
        double second = 0.1;
//        System.out.println("Sum = " + (first + second));
        boolean bool = false;

        String name = "Mykola";
        char charM = 'M';
        char charP = 'P';
        System.out.println(charM + charP); //157

        int defaultInt; // = 0;
        boolean defaultBool; // = false;

        short shortExample = 5;
        int intExample = 2132132;
//        intExample = shortExample;
//        System.out.println("intExample = " + intExample);
        shortExample = (short) intExample;
        System.out.println("shortExample = " + shortExample);
        int maxValue = Integer.MAX_VALUE; //2_123_231_324
        int maxValuePlusOne = maxValue + 2;
        System.out.println("maxValuePlusOne = " + maxValuePlusOne);

        int intPrimitive = 10; // 4 byte
//        ++intPrimitive;
//
//         int intPrimitive2 = intPrimitive++;
//        intPrimitive = intPrimitive + 1;
        System.out.println("intPrimitive = " + intPrimitive);
        Integer intObject = 15; // 16 byte - 4 byte = value, 4 byte - link in memory
        intPrimitive = intObject;
        String age = "25";
        int ageInteger = Integer.parseInt(age);
        System.out.println("ageInteger = " + (ageInteger + 10));

        Integer integerDemo = null;
        System.out.println("integerDemo = " + integerDemo);

        int sh = byteVar + shortVar;
        System.out.println("sh = " + sh);


    }

    public static int sum () {
        return 1 + 2;
    }
}
