
public class main {

	public main() {
		
	}
	
	public void start() {
		BookData.setBookList();
		bkMemerData.setbkMemerList();
			
			do {
				String mode=input("[1.관리자 모드  2.회원모드 3.종료]");
			}while(true);
			
	}
	
	public static void main(String[] args) {
		new main().start();
	}

}
