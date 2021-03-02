
public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		
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
		System.out.println("=관리자모드@실행=");
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
	//4.회원 & 책 등록
		public void allRegister(int a) {
			if(a==2) {
			int bookNum2 = Integer.parseInt(input("책번호"));
			String bookName2 = input("책이름");
			String bookPub2 = input("출판사");
			
			BookData.bookList.put(bookName2, new BookVO(bookNum2,bookName2,bookPub2,"서고",""));
			
			}
			else {
				String memName2 = input("회원 이름");
				int memPwd2=Integer.parseInt(input("회원 비밀번호"));
				bkMemerData.memberList.put(memName2, new bkMemberVO(memName2, 0,memPwd2));
				
			}
			System.out.println();
		}
	
	//1.책목록 출력
		public void bkAllList(int a) {
			if(a ==1) { //책 출력
				Set<String>keyList = BookData.bookList.keySet();
				Iterator<String> i =keyList.iterator();
				
				System.out.println("=================================");
				System.out.println("번호\t 책이름\t 출판사\t 서고/대출");
				System.out.println("=================================");
				
				while(i.hasNext()) {//값이 존재하면 
					BookVO vo = BookData.bookList.get(i.next());//책 1권의 정보를 담기
					
					System.out.printf("%d\t%s\t%s\t    %s\n", vo.getBookNum(),vo.getBookName(),vo.getBookPub(),vo.getBookMng());
				}
				System.out.println("=================================");
			}else {//회원 목록 출력
				Set<String> keyList2 = bkMemerData.memberList.keySet();
				Iterator<String> ii = keyList2.iterator();
				System.out.println("=======================");
				System.out.println("이름\t 대출권수\t 비밀번호");
				System.out.println("=======================");
				while(ii.hasNext()) {  //값이 존재하면 {
					bkMemberVO bo = bkMemerData.memberList.get(ii.next()); //회원 1명의 정보를 담기
					System.out.printf("%S\t   %d\t %d\n",bo.getMemName(),bo.getMemOut(),bo.getMemPwd());
				}
				System.out.println("=======================");
				}
			}
	public static void main(String[] args) {
		new main().start();
	}

}
