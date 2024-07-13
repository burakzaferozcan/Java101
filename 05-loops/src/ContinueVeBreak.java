public class ContinueVeBreak {
    public static void main(String[] args) {
       for(int i=1;i<=10;i++){
           System.out.println(i);
           if(i==5){
               System.out.println("i değeri 5 oldu ve break ile döngüden çıkıldı");
               break;
           }else{
               System.out.println(i);

           }
       }
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println("i değeri 5 oldu ve continue ile döngüde bir aşama atlandı");
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
