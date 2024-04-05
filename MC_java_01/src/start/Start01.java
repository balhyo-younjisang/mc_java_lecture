package start;

public class Start01 {

	public static void main(String[] args) {
		// 나이, 이름, 키(실수), 남자는 false 여자는 true
		int age = 18;
		float height = 178.3f;
		boolean isFemale = true;
		String name = "yunjisang";
		
		System.out.println(age); // 줄바꿈 o
		System.out.print(height); // 줄바꿈 x
		System.out.print(name); // 줄바꿈 x
		System.out.printf("여자인가요? : %b", isFemale); // 변수 바인딩
	}

}
