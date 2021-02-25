package team4_git_test;

public class Test3 {

	public Test3() {
		
	}

	public void start() {
		
		int dan;
		for(dan = 1; dan<10; dan++) {
			for(int j = 1; j<10; j++) {
				System.out.print(dan + "*" + j + "=" + (dan*j));
				System.out.println();
			}
		}
		System.out.println("김용우");
	}
	public static void main(String[] args) {
		new Test3().start();

	}

}
