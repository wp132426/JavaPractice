package org.dimigo.basic;

public class Switch {

	public static void main(String[] args) {
		// 주사위 번호 뽑는데
//		for(int i=0; i<10; i++)
//		{
//			double d = Math.random();
//			System.out.println(d);
//			
//			System.out.println((int) (d * 6));
//			System.out.println((int) (d * 6) +1);
//		}
		
		int num = (int) (Math.random() * 6) + 1;
		
		switch(num%2) {
		case 0 :
			System.out.println("짝수입니다.");
			break;
		case 1 :
			System.out.println("홀수입니다.");
			break;
		default:
			System.out.println("???");
			break;
		}
		
		
		
		String season = "봄";
		
		switch(season) {
		case "봄":
			System.out.println("따뜻하네요..");
			break;
		case "여름":
			System.out.println("더워요...");
			break;
		case "가을":
			System.out.println("쌀쌀해요..");
			break;
		case "겨울":
			System.out.println("ㄷㄷㄷㄷ..");
			break;
		default :
			System.out.println("???");
			break;
		}
	}

}
