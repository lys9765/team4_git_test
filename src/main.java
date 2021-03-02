
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
	//초기 관리자 모드 
	public void admin() { //관리자 모드 
		do {
		Login.id=input("아이디를 입력하세요.");
		Login.pwd = input("비밀번호를 입력하세요.");
		if (Login.loginCheck()==true) {
			break;
		}
		}while(true);
		System.out.println();
		System.out.println("=관리자모드 실행=");
		System.out.println();
		do {
			
			String menu = input("메뉴 [1.책목록, 2.대출/반납, 3.책 검색, 4.책 등록, 5.회원 등록, 6.책 삭제, 7.회원 삭제, 8.종료, 9.회원목록]");	
				if(menu.equals("1")) {
					bkAllList(1);
				}else if(menu.equals("2")) {//2.대출 반납
					bookout();
				}else if(menu.equals("3")) {//3.책 검색
					bookSearch();
				}else if(menu.equals("4")) {//4.책 등록
					allRegister(2);
				}else if(menu.equals("5")) {//5.회원등록
					allRegister(1);
				}else if(menu.equals("6")) {//6.책 삭제
					allRemove("2");
				}else if(menu.equals("7")) {//7.회원 삭제
					allRemove("1");
				}else if(menu.equals("9")) { //9.회원목록 출력
					bkAllList(2);
				}
				else if(menu.equals("8")) {//8.종료
					System.out.println("관리자 모드가 종료되었습니다.");
					System.out.println();
						break;
				}
		}while(true);
	}
	
	public static void main(String[] args) {
		new main().start();
	}

}
