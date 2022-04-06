import java.util.Scanner;
class Sorting
{
    public static void main(String args[])
    {
        int n;
        String temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the string");
        n=sc.nextInt();
        String str[]=new String[n];
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        System.out.println("Strings before sorting:");
        for(int i=0;i<n;i++)
        {
          System.out.println(str[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                  temp=str[i];
                  str[i]=str[j];
                  str[j]=temp;
                  
                }
            }
        }
        System.out.println("String after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
        
    }
}