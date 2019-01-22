import java.util.Scanner;
class Ascii
{
Scanner in;
char ch;
int ascii=ch;
Ascii()
{
in=new Scanner(System.in);
}
public void display()
{
for(ch='A';ch<='Z';ch++)
{
int castAscii=(int)ch;
System.out.println(ch + "=" + castAscii);
}
}
public static void main(String args[])
{
Ascii ob=new Ascii();
ob.display();
}
}