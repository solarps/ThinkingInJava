public class controllingExecution {

/*
1)Write a program that generates 25 random int values. For each value,
use an if-else statement to classify it as greater than, less than, or equal to a second
randomly generated value
*/

    public static void main(String[] args){

        int[] arr = new int[10];

        for(int i: arr){
            arr[i] = (int) (Math.random() * 10);
            if(arr[i] > Math.random()*10){
                System.out.println("Больше");
            }else if(arr[i] < Math.random()*10){
                System.out.println("Меньше");
            }else {
                System.out.println("равно");
            }
        }

    }
}
