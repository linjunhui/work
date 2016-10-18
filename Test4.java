public class Test4
{
 public static Test1 t = new Test1();
 static {
 	System.out.println(Test4.a);
 }
 public static int a = 0;
 public static int b;
 
 public static void main(String[] arg)
 {
  System.out.println(Test4.a);
  System.out.println(Test4.b);
 }
}
 
class Test1
{
 public Test1()
 {
  Test4.a++;
  Test4.b++;
 }
}