public class Assgn1_1
{
 public static void main(String [] args)
 {
  int a=5,b=10,c;
  System.out.println("a="+a);
  System.out.println("b="+b);
  c=add(a,b);
  System.out.println("a+b="+c);
 }

 public static int add(int k,int l)
 {
  if(l==0)
   return k;
  else
   return add(k^l,(k&l)<<1);
 }
}
