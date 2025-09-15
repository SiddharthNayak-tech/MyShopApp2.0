class CheckedException 
{
	public static void main(String[] args) 
	{
		System.out.println("Helllooo...");
		try{
		Thread.sleep(10000);
		}catch(InterruptedException ie){
		}
		System.out.println("Helllooo...");
	}
}
