class MethodEx1 
{
	public static int m1(){
		System.out.println("m1-method");
		return 100;
	}
   public static String m2(int a,String b){
		System.out.println("m2-method");
		return "Siddharth";
	}
	public static double m3(int i1, String s1,double d,char c){
		System.out.println("m3-method");
		return 20.0;
	}
	public  int m4(){
		System.out.println("m4-method");
		return 10;
	}
	public  void m5(String s2,String s3,double d1,double d2){
		System.out.println("m5-method");
	}
	public  String m6(int p,String q,double r,char t){
		System.out.println("m6-method");
		return "Rama";
	}
public static void main(String[] args)
{
	MethodEx1.m1();
	MethodEx1.m2(101,"Manoranjan");
	MethodEx1.m3(500,"Jagannath",100.0,'A');
	MethodEx1 m=new MethodEx1();
	m.m4();
	m.m5("Chandan","Pratyush",200.0,1000.0);
	m.m6(2000,"Sumeet",5000.0,'1');
}
}



	


