package Konular;

public class TekBoyutluDiziler {
    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------");
    }

    public static void main(String[] args) {
        //  TÜM ARRAY TANIMLAMALARI
        double[] arr1 = new double[5];   // değerler tanımlanmazsa 0 olarak belirlenir
        double arr2[] = new double[5];
        double[] arr3 = {0, 0, 0, 0, 0};
        double arr4[] = {0, 0, 0, 0, 0};
        double[] arr5;
        arr5 = new double[5];
        double arr6[];
        arr6 = new double[5];
        double[] arr7 = new double[]{0, 0, 0, 0, 0};
        double arr8[] = new double[]{0, 0, 0, 0, 0};
        //  TÜM ARRAY TANIMLAMALARI
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
        printArray(arr5);
        printArray(arr6);
        printArray(arr7);
        printArray(arr8);

        double[] list = new double[5];
        String[] days = {"pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"};
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
        }
        System.out.println("\n---------------------");
        System.out.println(days.length);
        System.out.println("\n---------------------");

        int cars[], count = 3;
        cars = new int[count];
        for (int i = 0; i < cars.length; i++)
            cars[i] = (i + 1) * 2;
        for (int j = 0; j < cars.length; j++)
            System.out.print(cars[j] + ",");
    }
}
