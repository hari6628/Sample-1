class Sample
{
public static void main (String [] args)
{

  float num = 45000;
  
  float vum = 459.87f;	
  
  long eum = 4565l;
  
  double oum = 5896325.4564;
  // swap 2 
  int a = 20;
  int b = 63;
  int emp = a;
  // without varioable
  int q = 5;
  int e = 6;
  
  // swap 3
  int r = 56;
  int f = 48;
  int t = 87;
  int tep = r;
  
  // without variable
  
  int x = 78;
  int y = 89;
  int z = 65;
  
  
  // swap 4
  
  int i = 263;
  int o = 698;
  int p = 412;
  int n = 812;
  int temp = i;
  
  // no variable
  int s = 756;
  int g = 321;
  int l = 145;
  int k = 248;
  
  
  s= s+g+l+k;
  g = s - (g+l+k);
 l = s - (g+l+k);
 k = s - (g+l+k);
 s = s - (g+l+k);
  i = o;
  o = p;
  p= n;
  n = temp;
  
  x = x+y+z;
  y= x - (y+z);
   z= x - (y+z);
    x= x - (y+z);
  
  
  
  System.out.println( num+" "+ vum+" "+eum+" "+oum);
  
  a=b;
  b= emp;
  System.out.println(a );      
    System.out.println(b );
	
	
	q = q+e;//q =11
	e = q-e;// e = 5
	q = q-e;// q =6
	
	System.out.println(q );
	System.out.println(e );
	
	r = f;
	f =t;
	t =r;
	
	System.out.println(r );
	System.out.println(f );
	System.out.println(t );
	
	System.out.println(x );
	System.out.println(y );
	System.out.println(z );
	
	System.out.println(i );
	System.out.println(o );
	System.out.println(p );
	System.out.println(n );
	
	System.out.println("  " );
	
	System.out.println(s );
	System.out.println(g );
	System.out.println(l );
	System.out.println(k );

   


}
}