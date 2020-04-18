import java.util.Scanner;

public class hw8 {

	public static void main(String[] args) {
	int x1, y1, x2, y2;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("정수 x1, y1, x2, y2를 순서대로 입력하시오>>"); // 정수를 입력받는다고 가정
	x1 = scanner.nextInt();
	y1 = scanner.nextInt();
	x2 = scanner.nextInt();
	y2 = scanner.nextInt();
	
	if(((100 <= x1 && x1 <= 200) && (100<= y1 && y1 <= 200)) || ((100 <= x2 && x2 <= 200) && (100 <= y2 && y2 <= 200))) { // 1번 구역 조건
		System.out.println("충돌합니다.");
	} else if ((x1<=100 && y1<=100) && (100<=x2 && 100 <= y2) || (x2<=100 && y2<=100) && (100<=x1 && 100 <= y1)) { // 2번 조건
		System.out.println("충돌합니다.");
	} else if ((((100<=x1 && x1 <=200) && y1<=100) && 100<=y2) || (((100<=x2 && x2 <=200) && y2<=100) && 100<=y1)) { // 3번 조건
		System.out.println("충돌합니다.");
	} else if ((200<=x1 && y1<=100) && (x2<=200 && 100<=y2) || (200<=x2 && y2<=100) && (x1<=200 && 100<=y1)) { // 4번 조건
		System.out.println("충돌합니다.");
	} else if (((x1<=100 && (100<=y1 && y1<=200)) && 100<=x2) || ((x2<=100 && (100<=y2 && y2<=200)) && 100<=x1)) { // 5번 조건
		System.out.println("충돌합니다.");
	} else if (((200<=x1 && (100<=y1 && y1<=200)) && x2<=200) || ((200<=x2 && (100<=y2 && y2<=200)) && x1<=200)) { // 6번 조건
		System.out.println("충돌합니다.");
	} else if (((x1<=100 && 200<=y1) && (100<=x2 && y2<=200)) || ((x2<=100 && 200<=y2) && (100<=x1 && y1<=200))) { // 7번 조건
		System.out.println("충돌합니다.");
	} else if ((((100<=x1 && x1<=200) && 200<=y1) && y2<=200) || (((100<=x2 && x2<=200) && 200<=y2) && y1<=200)) { // 8번 조건
		System.out.println("충돌합니다.");
	} else if (((200<=x1 && 200<=y1) && (x2<=200 && y2<=200)) || ((200<=x2 && 200<=y2) && (x1<=200 && y1<=200))) { // 9번 조건
		System.out.println("충돌합니다.");
	} else {
		System.out.println("충돌하지 않습니다.");
	}
	
	scanner.close();
	}

}
