import java.util.Scanner;
class que2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str=s.next();
int n=str.length();
for(int i=0;i<n;i++)
{
for(int j=1;j<=n-i;j++)
{
String a=str.substring(i,i+j);
System.out.println(a);
}
}
}
}