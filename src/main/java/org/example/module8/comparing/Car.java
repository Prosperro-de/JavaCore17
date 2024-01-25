package org.example.module8.comparing;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Comparable<Car> {
    private String name;
    private int horsePower;

//    @Override
//    public int compareTo(Car o) {
//        if (horsePower < o.horsePower) {
//            return 1;
//        } else if (horsePower > o.horsePower) {
//            return -1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Car o) {
        return name.compareTo(o.name);
    }
}
