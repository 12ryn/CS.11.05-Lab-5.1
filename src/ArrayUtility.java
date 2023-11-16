import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {

        System.out.println(Arrays.toString(array));

    }

    public static int sum(int[] array) {

        int n = 0;

        for(int i = 0; i < array.length; i++){

            n += array[i];

        }

        return n;
    }

    public static double average(int[] array) {

        int n = 0;

        for(int i = 0; i < array.length; i++){

            n += array[i];

        }

        Double nDouble = Double.valueOf(n);

        nDouble =  nDouble / array.length;

        return Math.floor(nDouble * 100.0) / 100.0;

    }

    public static int minimum(int[] array) {

        int minimum = array[0];

        for (int i = 0; i < array.length; i++){

            if (array[i] < minimum){

                minimum = array[i];

            }

        }

        return minimum;
    }

    public static int maximum(int[] array) {

        int maximum = array[0];

        for (int i = 0; i < array.length; i++){

            if(array[i] > maximum){

                maximum = array[i];

            }

        }

        return maximum;
    }

    public static int evenCount(int[] array) {

        int count = 0;
        for (int i: array){

            if(i % 2 == 0){ // we do not need to do array[i], instead we can straight up compare i when using an enhanced for loop

                count++;

            }

        }

        return count;
    }

    public static int[] reverseOne(int[] array) {

        for(int i = 0; i < array.length / 2; i++){

            int start = array[i];
            int end = array[array.length - i - 1];

            array[i] = end;
            array[array.length - i - 1] = start;

        }

        return array;

    }

    public static void reverseTwo(int[] array) {

        for(int i = 0; i < array.length / 2; i++) {

            int start = array[i];
            int end = array[array.length - i - 1];

            array[i] = end;
            array[array.length - i - 1] = start;

        }

    }

    public static boolean linearSearchInt(int[] array, int num) {

        for(int i = 0; i < array.length; i++){

            if(array[i] == num){

                return true;

            }

        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {

        for(int i = 0; i < array.length; i++){

            if(array[i].equals(str)){

                return true;

            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {

        for(int i = 0; i < array.length; i++){

            array[i] = array[i] * 2;

        }

    }

    public static void multiplyByN(int[] array, int n) {

        for(int i = 0; i < array.length; i++){

            array[i] = array[i] * n;

        }

    }

    public static String toString(int[] array) {

        String str = "";
        for(int i: array) {

            str += i + ", ";

        }

        return str.substring(0, str.length()-2);

    }

    public static boolean twoSum(int[] array, int num) {

        for(int i = 0; i < array.length; i++){

            int a = array[i];

            for(int j = 0; j < array.length && j != i; j++){

                int b = array[j];

                if(b + a == num){

                    return true;

                }

            }

        }
        return false;
    }

    public static void shiftRight(int[] array) {

        int[] dupe = new int[array.length];
        int end = array[array.length - 1];

        for(int i = 0; i < array.length; i++){

            dupe[i] = array[i];

        }

        for(int a = 0; a < array.length - 1; a++){

            int temp = dupe[a];
            array[a + 1] = temp;

        }

        array[0] = end;

    }

    public static void shiftLeft(int[] array) {

        int[] dupe = new int[array.length];
        int start = array[0];

        for(int i = 0; i < array.length; i++){

            dupe[i] = array[i];

        }

        for(int a = array.length - 1; a > 0; a--){

            int temp = dupe[a];
            array[a - 1] = temp;

        }

        array[array.length - 1] = start;

    }

    public static void shiftRightNTimes(int[] array, int n) {

        int[] dupe = new int[array.length];

        for(int i = 0; i < array.length; i++){

            dupe[i] = array[i];

        }

        for(int a = 0; a < array.length - n; a++){

            int temp = dupe[a];
            array[a + n] = temp;

        }

        for(int b = 0; b < n; b++) {

            int temp2 = dupe[array.length - n + b]; // e.g. If 1234567 is shifted 3 times to the right, it becomes 5671234
            array[b] = temp2;                       // array.length = 7, n = 3, b starts at 0 and is smaller than n
                                                    // array.length - n + b = for index 0 of array, we switch it to what was index 7 - 3 + 0 = 4
        }                                           // of the previous array


    }

    public static void shiftLeftNTimes(int[] array, int n) {

        int[] dupe = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            dupe[i] = array[i];
        }

        for (int a = 0; a < array.length - n; a++) {
            int temp = dupe[a + n];
            array[a] = temp;
        }

        for (int b = array.length - n; b < array.length; b++) {
            int temp2 = dupe[b - (array.length - n)];
            array[b] = temp2;
        }

    }


}
