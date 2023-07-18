import java.util.Scanner;

public class DecimalToBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal= sc.nextInt();
        String dec="";
        int q=decimal,r=q%2;
        while(q!=0){
            r=q%2;
            q=q/2;
            dec+=r;
        }
        String ans="";
        for(int i=dec.length()-1;i>=0;i--){
            ans+=dec.charAt(i);
        }
        System.out.println(ans);
    }
}
