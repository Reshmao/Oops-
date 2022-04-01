/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

class Product
{
    int pcode;
    String pname;
    float price;
    Scanner sc = new Scanner(System.in);
    public void get_d()
    {
        System.out.println("enter the pcode:");
        pcode = sc.nextInt();
        System.out.println("enter the pname:");
        pname = sc.next();
        System.out.println("enter the price:");
        price = sc.nextFloat();
    }
}
  public class Prdct
    {
       public static void main(String args[])
       {
           Product p1=new Product();
           p1.get_d();
           Product p2=new Product();
           p2.get_d();
           Product p3=new Product();
           p3.get_d();
           if (p1.price<p2.price)
           {
               if (p1.price<p3.price)
               {
                   System.out.println("p3 is the highest price");
               }
               else
               {
                   System.out.println("p1 is the highest price");
               }
           }
           else
           {
               if (p2.price<p3.price)
               {
                   System.out.println("p3 is the highest price");
               }
               else
               {
                   System.out.println("p2 is the highest price");
               }  
           }
           
        }
    }