// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class prog03 {
    public static void main(String[] args) {
        // Генерация случайных чисел
        ArrayList<Integer> arr = new ArrayList<>();
        Integer sum = 0;
        
        for (int i = 0; i < 10; i++) {
            Random r = new Random(); 
            arr.add(i, r.nextInt(100));
            sum += arr.get(i);
        }
        Double avg = sum.doubleValue() / arr.size();

        System.out.println(arr);
        System.out.println("Максимальное число: " + Collections.max(arr)); 
        System.out.println("Минимальное число: " + Collections.min(arr));
        System.out.println("Среднее: " + avg);
    }

}