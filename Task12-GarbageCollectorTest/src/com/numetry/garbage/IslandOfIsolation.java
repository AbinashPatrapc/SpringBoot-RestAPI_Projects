package com.numetry.garbage;

public class IslandOfIsolation {

	private IslandOfIsolation i;
	
	public static void main(String[] args) {
		IslandOfIsolation iland1=new IslandOfIsolation();
		IslandOfIsolation iland2=new IslandOfIsolation();
		
		iland1.i=iland2;
		iland2.i=iland1;
		
		iland1=null;
		iland2=null;
		
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Successfully garbage collected");
	}
}
