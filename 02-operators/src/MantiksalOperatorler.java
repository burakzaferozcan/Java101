public class MantiksalOperatorler {
    public static void main(String[] args) {
        // MANTIKSAL OPERATÖRLER
        int a=5,b=1,c=5;
       boolean kosul1=a==c;
        boolean kosul2=a>=b;
        boolean sonuc=kosul1&&kosul2;
        System.out.println("a ile c birbirine eşit mi ve a büyük eşit mi b'den = "+ sonuc);
        kosul1=a<b;
        kosul2=a<=c;
        sonuc=kosul1||kosul2;
        System.out.println("a b'den küçük mü yada a küçük eşit mi b'ye = "+ sonuc);
        sonuc=!(kosul1||kosul2);
        System.out.println("a b'den küçük mü yada a küçük eşit mi b'ye sonucunun tersi (değili) = "+ sonuc);
    }
}
