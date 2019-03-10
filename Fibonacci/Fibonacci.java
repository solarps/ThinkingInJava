import java.util.Arrays;

/*
A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
34, and so on, where each number (from the third on) is the sum of the previous two. Create
a method that takes an integer as an argument and displays that many Fibonacci numbers
starting from the beginning, e.g.
*/

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
        System.out.println(Arrays.toString(m.fibonacci(9)));

    }

    public int [] fibonacci(int i){
        int [] arr = new int[i];
        arr[0] = 1;
        arr[1] = 1;
        for(int k=2; k < i; k++){
            arr[k] = arr[k - 2] + arr[k - 1];
        }
        return arr;
    }
}