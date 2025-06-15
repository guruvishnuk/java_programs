import java.util.Scanner;
class findx
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int x = sc.nextInt();
         for(int i =0;i<num.length;i++)
         {
            num[i] = sc.nextInt();
         }
         for(int i =0;i<num.length;i++)
         {
                if( x == num[i])
            System.out.println(" x found at index:"+i);
         }
    }
}