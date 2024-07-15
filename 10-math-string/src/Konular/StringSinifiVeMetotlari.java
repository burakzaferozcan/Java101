package Konular;

import java.util.Arrays;

public class StringSinifiVeMetotlari {
    public static void main(String[] args) {
        String str = "patika";
        String patika = "paTİka";
        System.out.println("string'in karakter uzunlugunu verir str.length() : " + str.length());
        System.out.println("string'in istenilen index'inin karakterini verir str.charAt(x) : " + str.charAt(0));
        System.out.println("string'in istenilen index'inin karakterinin ASCII rakamını verir str.codePointAt(x) : " + str.codePointAt(0));
        System.out.println("string'in istenilen index'inin bir önceki karakterinin ASCII rakamını verir str.codePointBefore(x) : " + str.codePointBefore(2));
        System.out.println("stringler büyük küçük harf duyarlı karşılaştırılır aynı ise 0 döner değil ise uniqe kodlarını karşılaştırır str.compareTo(x) : " + str.compareTo(patika));
        System.out.println("stringler büyük küçük harf duyarsız karşılaştırılır aynı ise 0 döner değil ise uniqe kodlarını karşılaştırır str.compareToIgnoreCase(x) : " + str.compareToIgnoreCase(patika));
        System.out.println("stringin sonuna string ekler str.concat(x) : " + str.concat(".dev"));
        System.out.println("string x değerini kapsıyor mu diye kontrol eder str.contains(x) : " + str.contains(".dev"));
        System.out.println("stringin bitiş karakteri x değeri ile bitiyor mu diye kontrol eder str.endsWith(x) : " + str.endsWith("ka"));
        System.out.println("stringin başlangıç karakteri x değeri ile başlıyor mu diye kontrol eder str.startsWith(x) : " + str.startsWith("p"));
        System.out.println("stringin x değerini büyük küçük harf duyarlı kapsıyor mu diye kontrol eder true/false döndürür : str.equals(x) : " + str.equals(patika));
        System.out.println("stringin x değerini büyük küçük harf duyarsız kapsıyor mu diye kontrol eder true/false döndürür : str.equalsIgnoreCase(x) : " + str.equalsIgnoreCase(patika));
        System.out.println("stringin ilk karşılaştığı x değerinin indexini verir str.indexOf(x) : " + str.indexOf("a"));
        System.out.println("stringin son karşılaştığı x değerinin indexini verir str.lastIndexOf(x) : " + str.lastIndexOf("a"));
        System.out.println("string boş mu dolumu diye kontrol eder true/false str.isEmpty() : " + str.isEmpty());
        System.out.println("stringin x değerlerini arar ve varsa yeni değer atar str.replace(x,y) : " + str.replace("a", "O"));
        System.out.println("stringin x değerini arar ve varsa ilk bulduğuna yeni değer atar str.replaceFirst(x,y) : " + str.replaceFirst("a", "O"));
        String[] sp = str.split("a");
        System.out.println("stringi x değerini arar ve varsa array elemanlarına böler dizi oluşturur str.replaceFirst(x,y) : " + Arrays.toString(sp));
        System.out.println("stringde belirtilen başlangıçtan bitişe kadar karakter sayısını ayıklar yeni bir string oluşturur str.subString(x,y): " + str.substring(1, 4));
        System.out.println("stringi küçük harfe çevirir str.toUpperCase() : " + str.toUpperCase());
        String buyuktenKucuge = "küçülttün";
        System.out.println("stringi büyük harfe çevirir str.toUpperCase() : " + buyuktenKucuge.toLowerCase());
        String boslukluString = "        bosluklari kaldirdin        ";
        System.out.println("stringin başındaki ve sonundaki boşlukları siler str.trim() : " + boslukluString.trim());
        int a = 123;
        String donustur = String.valueOf(a);
        System.out.println("-------------------------------------\n" +
                " valueOf() çeşitli türlerdeki verileri String nesnesine dönüştürmek için kullanılır.\n" +
                " Bu yöntem, Java'nın her türdeki veriyi String'e çevirebilme yeteneği sağlamak için oldukça kullanışlıdır.\n" +
                " int a = 123;\n" +
                " String.valueOf(a) : " + donustur +
                "\n" +
                "------------------------------------- ");
    }
}
