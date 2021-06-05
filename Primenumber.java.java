public class Primenumber
{
     public static void main(String[] args) 
     {
     int i,temp=0,j;
       for(i=1;i<=100;i++) 
       {
       for(j=1;j<=100;j++)
       {
         if(i%j==0) 
         {
         temp++;			
         }			
       }
         if(temp ==2) 
         {
       System.out.println(""+i);
       }
         else 
         {
         temp =0;
         }
      }
      }
}