package Konular;

public class DiziTanimi {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // metot overloading tekrarı
    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        return reverse;
    }

    public static void main(String[] args) {
        //  1. tanımlama şekli
        int[] list1 = new int[10];
        list1[0] = 10;
        list1[1] = 20;
        list1[2] = 30;
        list1[3] = 40;
        list1[4] = 50;
        list1[5] = 60;
        list1[6] = 70;
        list1[7] = 80;
        list1[8] = 90;
        list1[9] = 100;
        printArray(list1);
        //  System.out.println(list1[4]); eğer 4. eleman tanımlanmazsa ekrana yazdırılmak istenirse değeri 0 gözükür
        //  list1[13] = 140; hata verir dizinin uzunluğundan yüksek değer girildiği için
        System.out.println("\n------------------------");

        //  2. tanımlama şekli
        int list2[] = new int[10];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = (i * 10) + 10;
            System.out.print(list2[i] + " ");
        }
        System.out.println("\n------------------------");

        //  3. tanımlama şekli
        int list3[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        printArray(list3);
        System.out.println("\n------------------------");

        // metot overloading tekrarı
        double list4[] = {1.0, 1.1, 1.2, 1.3};
        printArray(list4);
        System.out.println("\n------------------------");

        int[] reverseList3 = reverse(list3);
        printArray(reverseList3);
        System.out.println("\n------------------------");

    }
}
