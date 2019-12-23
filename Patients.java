import java.io.*;
import java.util.*;
class Patient
{
String name;
double weight;
double height;
double BMI(double weight,double height)
{

double result=((weight/0.45359237)/((height*0.394)*(height*0.394)))*703;
return result;
}
}

class Patients
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name;
System.out.println("enter the patients name");
sc.next();
double w;
System.out.println("enter the patients weight");
w=sc.nextDouble();
System.out.println("enter the patients height");
double h=sc.nextDouble();
Patient p1=new Patient();
System.out.println("the patients BMI is:");
System.out.println(p1.BMI(w,h));
}
}