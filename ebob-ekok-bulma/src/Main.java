import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1,n2;
        System.out.print("n1 sayisini giriniz:");
        n1 =input.nextInt();
        System.out.print("n2 sayisini giriniz:");
        n2 =input.nextInt();
        int i =1;
        int ebob=1,ekok=1;

        if (n1<n2){
            while(i<n1){
                if (n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;
            }
            System.out.println("EBOB:"+ebob);
        }
        else{
            while(i<n2){
                if(n1%i==0 && n2%i==0){
                    ebob =i;
                }
                i++;
            }
            System.out.println("EBOB:"+ebob);
        }


        while (i<= (n1*n2)){
            if (i%n1==0 && i%n2==0 ){
                ekok=i;
                System.out.println("EKOK:"+ ekok);
                break;
            }
            i++;
        }

        /*for (int i=1; i<n1;i++){
            if (n1%i==0 && n2%i==0){
                System.out.println(i);
            }
        }

         */
    }
}
