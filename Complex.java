import java.util.Scanner;
class Complex
{
    int real;
    int img;
    Complex(int r,int i)
    {
        real=r;
        img=i;
    }
    public void addition()
    {
        System.out.println(real+"+i"+img);
    }
    public static Complex add(Complex n1,Complex n2)
    {
        Complex r3 =new Complex(0, 0);
        r3.real=n1.real+n2.real;
        r3.img=n1.img+n2.img;
        return r3;
    }
    public static void main(String[] args) 
    {
        int r1,i1,r2,i2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real and imaginary part");
        r1=sc.nextInt();
        i1=sc.nextInt();
        Complex n1=new Complex(r1, i1);
        n1.addition();
        System.out.println("enter the real and imaginary part");
        r2=sc.nextInt();
        i2=sc.nextInt();
        Complex n2=new Complex(r2, i2);
        n2.addition();
        System.out.println("sum of the number=");
        Complex r3=add(n1, n2);
        r3.addition();
    }
}
