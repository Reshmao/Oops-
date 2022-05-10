import java.util.Scanner;
class Person 
{
String Name, Gender , Address ;
protected int Age ;
public Person ( ) { }
public Person ( String n , String g , String addr , int a )
{
this . Name = n ;
this . Gender = g ;
this . Address = addr ;
this . Age = a ;
}
public void displayPerson ( ) 
{
System.out.println ( "Name: "+Name ) ;
System.out.println ( "Gender : " + Gender ) ;
System.out.println ( " Address : " + Address ) ;
System.out.println ( "Age : " + Age ) ;
}
}
class Employee extends Person 
{
int Empid , Salary ;
String Companyname , Qualification ;
public Employee ( ) { }
public Employee ( String n , String g , String addr , int a , int eid , String cname , String qual , int sal)
{
super ( n , g , addr , a ) ;
Empid = eid ;
Companyname = cname ;
Qualification= qual ;
Salary = sal ;

}
public void displayEmployee ( ) 
{
super . displayPerson ( ) ;
System.out.println ( "Empid : "+Empid ) ;
System.out.println ( "Company name : " + Companyname ) ;
System.out.println( " Qualification : " + Qualification ) ;
System.out.println ( " Salary : " + Salary ) ;
}
}
class Teacher1 extends Employee
{
String Subject , Department ;
int Teacherid ;
public Teacher1 ( String n , String g , String addr , int a ,
int eid , String cname , String qual , int sal ,
String sub , String dept , int tid ){
super ( n , g , addr , a , eid , cname , qual , sal ) ;
Subject = sub ;
Department = dept ;
Teacherid = tid ;
}
public void displayTeacher ( ) {
super . displayEmployee ( ) ;
System.out.println( "Teacherid : " + Teacherid ) ;
System.out.println( "Subject : " + Subject ) ;
System.out.println( "Department : " + Department ) ;
}
}

public class InheritencePersonExample 
{
public static void main ( String args[ ] ) 
{
System.out.println( "Enter number of teachers " ) ;
Scanner sc=new Scanner(System.in);

int N = sc . nextInt ( ) ;
Teacher1[ ] teacher1s = new Teacher1 [N ] ;
Scanner scs = new Scanner ( System.in ) ;
for ( int i = 0 ; i<N; i ++){
System.out.println( "Enter name of the teacher " ) ;
String name = scs . next ( ) ;
System.out.println ( "Enter gender of the teacher " ) ;
String gen = scs.next ( ) ;
System.out.println ( "Enter address of the teacher ") ;
String addr = scs.next( ) ;
System.out.println( "Enter age of the teacher " ) ;
int ag = sc.nextInt( ) ;
System.out.println( "Enter Empid o f the teacher ") ;
int eid = sc. nextInt( ) ;
System.out.println ( " Enter Company name " ) ;
String cn = scs.next ( ) ;
System.out.println ( "Enter qualification of the teacher " ) ;
String quali = scs . next ( ) ;
System.out.println ( "Enter salary of the teacher " ) ;
int sal = sc.nextInt( ) ;
System.out.println( " Enter Teacher id " ) ;
int tid = sc.nextInt( ) ;
System.out.println ( " Enter Subject of the teacher " ) ;
String sub = scs.next ( ) ;
System.out.println ( " Enter Department of the teacher " ) ;
String dept = scs.next( ) ;
Teacher1 t = new Teacher1 ( name , gen , addr , ag , eid , cn , quali , sal , sub , dept , tid ) ;

teacher1s[ i ]=t ;
}
for(Teacher1 t : teacher1s ) {

t . displayTeacher( ) ;
}
}
}