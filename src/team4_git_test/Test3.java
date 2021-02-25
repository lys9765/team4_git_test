package team4_git_test;

public class Test3 {

	public Test3() {
		
	}
	//fetch 업데이트  된 사항이 있는지 여부확인
	public void start() {
		
		int dan;
		for(dan = 1; dan<10; dan++) {
			for(int j = 1; j<10; j++) {
				System.out.print(dan + "*" + j + "=" + (dan*j));
				System.out.println();
			}
		}
		System.out.println("김용우: merge 확인합니다.");
	}
	public static void main(String[] args) {
		new Test3().start();

	}

}
