import java.util.*;
import java.io.*;
public class Box
{
double width;
double height;
double depth;

Box(double width,double height,double depth)
{
 this.width=width;
this.height=height;
this.depth=depth;
}
public void volume()
{
double result=(width*height*depth);
System.out.println("the volume of the box is:"+result);
}
public static void main(String args[])
{
Box b=new Box(75,65,52);
b.volume();
}
}