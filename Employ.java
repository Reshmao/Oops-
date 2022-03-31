class Employ 
{
    int emp_id,salary,totalsalary;
    String name;

    Employ(int a,int b, String c)
    {
        emp_id=a;
        salary=b;
        name=c;
    }
    public void total()
    {
        totalsalary = salary+(salary*20/100);
        System.out.println("salary:"+totalsalary);
    }
    public static void main(String[] args) 
    {
    Employ e1 = new Employ(1, 2000 ,"Abcd");
    Employ e2 = new Employ(2, 1000 , "Efgh");
    e1.total();
    e2.total();
    }
            
            
    
}
        
    
    
    
    
}
