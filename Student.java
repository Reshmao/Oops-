class Student {
    int m1,m2,m3,sum;

    Student(int a,int b,int c)
    {
        m1=a;
        m2=b;
        m3=c;
    }
    public void sum()
    {
        sum=m1+m2+m3;
        System.out.println("sum:"+sum);
    }
    public void percentage()
    {
        int per;
        per =(sum*100)/300;
        System.out.println("percentage:"+per);
    }
    public static void main(String[] args) 
    {
        Student S1=new Student(10,20,30);
        S1.sum();
        S1.percentage();
    }
                
    }
                
                
            
    }
    
    
    
}
