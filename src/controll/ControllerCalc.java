package controll;


public class ControllerCalc extends Thread
{
	
	private int idThread;
	private static double valor;
	
	public ControllerCalc(int i)
	{
		this.idThread = i;
		
	}
	
	@Override
	public void run()
	{
		calculo();
	}
	
	private void calculo()
	{
		valor /= (double) idThread;
		System.out.println(valor);
		
	}
	
}
