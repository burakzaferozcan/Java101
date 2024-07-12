public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        // KARŞILAŞTIRMA OPERATÖRLERİ
        int a=5;
        int b=4;
        boolean esitmi=a==b;
        System.out.println("a ile b eşit mi "+esitmi);
        boolean esitDegilmi=a!=b;
        System.out.println("a ile b eşit değil mi "+esitDegilmi);
        boolean aBuyukMu=a>b;
        System.out.println("a buyuk mu b'den "+aBuyukMu);
        boolean aKucukMu=a<b;
        System.out.println("a kucuk mu b'den "+aKucukMu);
        boolean aBuyukEsitMi=a>=b;
        System.out.println("a buyuk esit mi b'den "+aBuyukEsitMi);
        boolean aKucukEsitMi=a<=b;
        System.out.println("a kucuk esit mi b'den "+aKucukEsitMi);


    }
}
