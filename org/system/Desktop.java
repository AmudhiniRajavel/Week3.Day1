package org.system;

public class Desktop extends Computer
{
	
	public void desktopSize() {
	
	System.out.println("Size is 1440");

	}
	
	
	public static void main(String[] args) {
		Desktop system = new Desktop();
		system.computerModel();
		system.desktopSize();
	}
}
