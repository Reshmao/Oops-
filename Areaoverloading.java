import java.util.Scanner;
public class Areaoverloading
{
  Scanner sc= new Scanner(System.in);
  public void area(int s)
  {
      System.out.println("Enter the value of s:");
      s = sc.nextInt();
      System.out.println("Area of the squareis:"+s*s);
  }
  public void area(int l, int b)
  {
      System.out.println("Enter the length:");
      l = sc.nextInt();
      System.out.println("Enter the breadth:");
      b = sc.nextInt();
      System.out.println("Area of rectangle:"+l*b);
  }
  public void area(double r)
  {
      System.out.println("Enter the radius:");
      r = sc.nextDouble();
      System.out.println("Area of circle:"+3.14*r*r);
  }
    public static void main(String[] args) 
    {
        Areaoverloading ob = new Areaoverloading();
        ob.area(0);
        ob.area(0,0);
        ob.area(0.00);
    }
    
}

