package team4_git_test;

public class Test {

	public Test() {
		// 각 자 브런치 생성 후, 소스를 추가해서 마스터에 머지해봅시다.
		System.out.println("testing Git by TEAM 4");
		
		Character cha1 = 'A';
		Character cha2 = 'B';
		
		if(cha1 <= cha2) {
			System.out.println("A는 B보다 작거나 같다");
		}else {
			System.out.println("A는 B보다 크다");
		}
		
		System.out.println("김현정 브런치: 깃허브 테스트 합니다.");
	}
	
	
	public static void main(String[] arg) {
		new Test();
	}
}
