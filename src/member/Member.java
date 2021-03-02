package member;

public class Member {

	public Member() {
		do {
			MemLogin . name = input ( " 회원 이름을 입력하세요 " );
			MemLogin . pwd = input ( " 비밀번호를 입력하세요 " );
			
			
			if ( MemLogin . memCheck () == true ) {
				휴식 ;
			}
			} while ( true );
		do {
			String menu = input("메뉴[1.책목록, 2.책검색, 3.비밀번호 변경, 4.현재 대출권수, 5.종료");
			if(menu.equals("1")) {
				bkAllList(1);
			}else if(menu.equals("2")) {
				bookSearch();
			}else if(menu.equals("3")){//비밀번호 변경 
				memPwdChange(MemLogin.name);
			}else if(menu.equals("4")) { //4.현재 대출책 현황
				nowOut(MemLogin.name);
			}
			else if(menu.equals("5")){
				System.out.println("회원 모드가 종료되었습니다.");
				System.out.println();
				break;
			}
		}while(true);
	}

		
		
		
	}

}
