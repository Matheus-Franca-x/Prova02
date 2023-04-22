package view;


import controll.ControllerCalc;

public class Main {

	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 3; i++)
		{
			Thread calc = new ControllerCalc(i);
			calc.start();
		}

	}

}
