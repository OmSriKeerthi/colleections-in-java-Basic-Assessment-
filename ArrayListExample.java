import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListExample{
    public static void main (String args[]){
        Scanner voters=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(80);
        numbers.add(20);
        numbers.add(40);
        numbers.add(60);
        Collections.sort(numbers);

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.indexOf(20));
        for(int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        for(Integer value:numbers){
            System.out.println(value);

        }
        System.out.println(numbers.remove(numbers.size()-1));

    }
}
