/**
 * Created by Администратор on 19.02.2016.
 */
public class Mamath {
    public static int findMin( int[] arr){
        int min = arr[0];
        for (int element :arr) {if (element< min) min=element; }
return  min;
    }
   public static int findMax(int[] arr){
       int max = arr[0];
       for (int element :arr) {if (element> max) max=element; }
       return max;
   }
}
