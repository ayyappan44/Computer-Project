package org.computer;

public class Desktop implements Hardware,Software{

	private void desktopSize() {
		System.out.println("Desktop Size");
	}
	
	@Override
	public void softwareResources() {
		System.out.println("SR");
		
	}
	
	@Override
	public void hardwareResources() {
		System.out.println("HR");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.hardwareResources();
		d.softwareResources();
	}
	
	
	
}
