import java.util.Scanner;
class matrixaddition
{
    public static void main(String[] args) 
    {
        int n1=0,n2=01;
        int arr1[][]=new int[5][5];
        int arr2[][]=new int[5][5];
        int sum[][]=new int[5][5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for n1 and n2");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Enter the element");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the element");
        for(int i=0;i<n1;i++)
        {
           for(int j=0;j<n2;j++)
           {
               arr2[i][j]=sc.nextInt();
           }
        }
        System.out.println("matrix after addition");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<n2;j++)
                {
                    System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }
            
        }
        
    }

