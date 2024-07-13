package Ornekler;

public class PolindromSayilariBulanProgram {
    static boolean isPolindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp/=10;
        }
        System.out.println("girilen sayı : " +number);
        System.out.println("sayının tersi : " +reverseNumber);
        if (reverseNumber == number) {
            System.out.println(number + " sayısı polindromdur");
            System.out.println("--------------------");
            return true;
        }else {
            System.out.println(number + " sayısı polindrom değildir");
            System.out.println("--------------------");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPolindrom(141) );
        System.out.println(isPolindrom(158) );
        System.out.println(isPolindrom(199) );

    }
}
