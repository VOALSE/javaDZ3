
// Пусть дан произвольный список целых чисел, удалить из него четные числа 
import java.util.ArrayList;
import java.util.Random;

public class prog02 {
    public static void main(String[] args) {
        
        // Генерация случайных чисел
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random(); 
            arr.add(i, r.nextInt(100));
        }
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i)%2==0){ 
                arr.remove(i); 
                i--;
            }
        }
        System.out.println(arr);

      }

}
