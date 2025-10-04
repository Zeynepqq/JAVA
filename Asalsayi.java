package asalsayi;
import java.util.*;
public class Asalsayi {

    public static void main(String[] args) {
        int sayac,i,j,n=10;
        System.out.print("asal sayilari bulmak istediginiz n sayisini giriniz: ");
        Scanner klavye=new Scanner(System.in);
        n=klavye.nextInt();
        for(i=2;i<=n;i++){
            sayac=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                 sayac++;
                }
            }
            if(sayac==0){
                System.out.print(i+" ");
            }
        }  
    }   
}

