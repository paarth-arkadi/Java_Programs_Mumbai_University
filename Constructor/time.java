import java.io.*;
class Time24
{
int hour;
int min;
int sec;
public void Time2(int h,int m, int s)
{
hour=h;
min=m;
sec=s;
}
}
class Time12 extends Time24
{
public void Time1(int h,int m,int s)
{
super.Time2(h,m,s);
}
public void show()
{
String str;
if(hour>=12)
{
hour=hour-12;
str="pm";
}
else
{
str="am";
}
System.out.println("time in 12 hour format is "+hour+":"+min+":"+sec+" "+str);
}
}
public class time
{
public static void main(String args[])
{
Time12 t1=new Time12();
t1.Time1(17,15,00);
t1.show();
}
}
