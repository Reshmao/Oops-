import java.util.Scanner;
public class StringManip
{
    String str1, str2 ;

    public StringManip(String s1)
    {
        str1 =s1;
    }
    public void strlength()
    {
        System.out.println("\n the length of the string1:"+str1.length());
    }
    public void strconcat()
    {
        System.out.println("\n Concatenated string 'HELLO':"+str1.concat("HELLO"));
    }
    public void charpos()
    {
        System.out.println("\n Character of position 4 in string:"+str1.charAt(3));
    }
    public void compare()
    {
        String s2 = "halloo";
        System.out.println("\n string after comparison:"+str1.compareTo(s2));
        
        if(str1.compareTo(s2)==0)
        {
            System.out.println("string is same");
        }
        else
        {
             System.out.println("not same");
        }
    }
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);   
        
        System.out.println("enter the string:");
        str = sc.nextLine();
        
        StringManip s1= new StringManip(str);
          s1.strlength();
          s1.strconcat();
          s1.charpos();
          s1.compare();
    }
}
