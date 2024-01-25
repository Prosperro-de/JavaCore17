package org.example.module8.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
//        int[] intArray = {12, 4, 134, 65, 231, 54};
//        String[] stringArray = {"v", "a", "d", "t", "d", "s", "k", "f"};
//
//        if (12 > 4 ){
//
//        }
//
//        if ("v".compareTo("a") > 0 ) { // -1  0  1
//
//        }
//
//        System.out.println("g".compareTo("d"));


//        Arrays.sort(intArray);
//        System.out.println("intArray = " + Arrays.toString(intArray));
//        Arrays.sort(stringArray);
//        System.out.println("stringArray = " + Arrays.toString(stringArray));

        Car bmw = new Car("BMW", 250);
        Car toyota = new Car("Toyota", 200);
        Car vw = new Car("Volkswagen", 350);

        if (bmw.compareTo(toyota) > 0) {
            System.out.println("bmw is bigger");
        } else {
            System.out.println("toyota is bigger");
        }
//
//        Car[] carArray = { vw, bmw, toyota};
//        Arrays.sort(carArray);
//        System.out.println("carArray = " + Arrays.toString(carArray));

        Student oleg = new Student("Oleg", 10);
        Student natalia = new Student("Natalia", 11);
        Student mykola = new Student("Mykola", 8);
        Student[] students = {oleg, natalia, mykola};
        StudentNameComparator nameComparator = new StudentNameComparator();
        StudentGradeComparator gradeComparator = new StudentGradeComparator();

        int compare = nameComparator.compare(oleg, natalia);
        System.out.println("compare = " + compare);

        Arrays.sort(students, gradeComparator);

        System.out.println("students = " + Arrays.toString(students));
    }
}
