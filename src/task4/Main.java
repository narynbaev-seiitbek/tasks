package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();
        int counter=0;
        for (int i = 0; i < 20; i++) {
            counter++;
            hashSet.add(random.nextInt(12,35));
        }
        System.out.println(hashSet+" "+counter);


    }
}
