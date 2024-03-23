import java.util.*;
public class armstrong{
      public static void main(String[] args){
          int sum=0,n,orn;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number");
          n=sc.nextInt();
          orn=n;
          while(orn!=0){
               int rem=orn%10;
               sum+=rem*rem*rem;
               orn/=10;
          }

   if(sum==n){
        System.out.println("armstrong number");
     }
   else{
       System.out.println("not an armstrong number");
    }
  sc.close();
}
}
       
         