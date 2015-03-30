package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		
		for(int i=1;i<11;i++)
		{
			for(int j=1;j<11;j++)
			{
				if(j==i)
				{
					System.out.print("*");
					continue;
				}
					
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}

}
