package Konular.ArraySinifiVeMetotlari;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
//        HelperArray helper = new HelperArray();
//        metodu static tanımladığımız için sınıftan nesne üretmemize gerek yok
        System.out.println("kendi yaptığımız HelperArray : ");
        HelperArray.print(list1);
        System.out.println("Arrays sınıfının toString() metodu : ");
        System.out.println(Arrays.toString(list1));
        System.out.println("----------------------");
        System.out.println("Arrays sınıfının fill() metodu 1. kullanım : ");
        Arrays.fill(list1, 5);
        System.out.println(Arrays.toString(list1));
        System.out.println("----------------------");
        System.out.println("Arrays sınıfının fill() metodu 2. kullanım : ");
        Arrays.fill(list1, 0, 2, 856);
        System.out.println(Arrays.toString(list1));
        System.out.println("----------------------");
        int[] list2 = {1, 95, -87, 162, 85, 11, 27, 6, -2};
        System.out.println(Arrays.toString(list2));
        System.out.println("Arrays sınıfının sort() metodu : ");
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));
        System.out.println("----------------------");
        System.out.println("Arrays sınıfının binarySearch() metodu bir elemanın indis degerini bulur  : ");
        int[] list3 = {1, 95, -87, 162, 85, 11, 27, 6, -2};
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));
        System.out.println("girilen sayının indexi : " + Arrays.binarySearch(list3, -2));
        System.out.println("----------------------");
        System.out.println("Arrays sınıfının copyOf() metodu : ");
        int[] copyList = Arrays.copyOf(list3, list3.length);
        System.out.println("oluşan yeni dizi : " + Arrays.toString(copyList));
        System.out.println("----------------------");
        System.out.println("Arrays sınıfının copyOfRange() metodu : ");
        int[] copyList2 = Arrays.copyOfRange(list3, 0, 3);
        System.out.println("oluşan yeni dizi : " + Arrays.toString(copyList2));
        System.out.println("----------------------");
        System.out.println("Arrays sınıfının equals() metodu : ");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};
        System.out.println("arr1 ile arr2 karşılaştırması : " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 ile arr3 karşılaştırması : " + Arrays.equals(arr1, arr3));


    }
}
