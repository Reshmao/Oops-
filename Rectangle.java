 class Rectangle 
 {
     int l,b;
     Rectangle(int length, int breadth)
     {
         l=length;
         b=breadth;
    }
    public void rectarea()
    {
        int area;
        area = l*b;
        System.out.println("area:"+area);
    }
    public void rectperi()
    {
        int peri;
        peri = 2*(l+b);
        System.out.println("peri:"+peri);
    }
    public static void main(String[] args) 
    {
        Rectangle r1=new Rectangle(4, 5);
        r1.rectarea();
        r1.rectperi();
    }
}
    
    

