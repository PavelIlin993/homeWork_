import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static int lengthArr = 5;

    public static void main(String[] args) {
        double stor = 0;
        double arr[] = new double[lengthArr];
        double arrCopy[] = new double[lengthArr];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*9 + 1);
            arrCopy[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < (arrCopy.length - 1); i++) {
            if (arrCopy[i] < arrCopy[i+1]) {
                stor = arrCopy[i+1];
                arrCopy[i+1] = arrCopy[i];
                arrCopy[i] = stor;
            }
            stor = 0;
        }
        System.out.println(arrCopy[lengthArr-1] + " -минимальный элемент массива");     //Сложность О(n), поскольку цикл всего 1, а константы, связанные с дополнительными действиями можно откинуть

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(arr) + " -массив квадратов");        //Сложность О(n), над каждым элементом выполняется одно действие

        for (int i = 0; i < arrCopy.length; i++) {
            stor = arrCopy[i] + stor;
            if (i == arrCopy.length-1) {
                stor = stor/lengthArr;
            }
        }
        System.out.println(stor + " -среднее арифмеическое массива");       //Сложность О(n), над каждым элементом выполняется одно действие
    }
}
