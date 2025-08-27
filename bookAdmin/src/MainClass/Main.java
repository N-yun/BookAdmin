package MainClass;

import java.io.IOException;
import java.util.Scanner;

import Function.*;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	
//	 * 인트로기능 (ADD02)
	public static void printIntro() throws IOException, CloneNotSupportedException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		2-1) 사용자에게 선택지 제시 & 수행할 기능번호 입력받기
		System.out.println("1. 도서등록");
		System.out.println("2. 도서조회");
		System.out.println("3. 도서삭제");
		System.out.println("4. 도서수정");
		System.out.print("수행할 번호를 입력해 주세요. : ");
		
		String menu = sc.next();

//		int menu = Integer.parseInt(br.readLine());
		
//		2-2) 입력받은 기능 수행
		switch (menu) {
		case "1":	// 3. 도서등록
			System.out.println("<1. 도서등록>를 수행합니다");
			MainFunc.addBook();
			break;
		case "2":
			System.out.println("<2. 도서조회>를 수행합니다");
			MainFunc.readBook(); // 4. 도서조회
			break;
		case "3":
			System.out.println("<3. 도서삭제>를 수행합니다");
			MainFunc.removeBook(); // 5. 도서삭제
			break;
		case "4":
			System.out.println("<4. 도서수정>를 수행합니다");
			MainFunc.editBook(); // 6. 도서 수정
			break;
		default:
			System.out.println("잘못된 정보를 입력했습니다. 다시 입력 바랍니다.");
			printIntro();  // 인트로 기능 재실행
			break;
		}

//		br.close();
	}
	
//	 * 로그인 기능 (ADD01)
	public static void doLogin() throws IOException, CloneNotSupportedException {
//		1. 로그인 수행(login) 
//		1-1) 사용자에게 아이디,비밀번호값 요청
		System.out.println("아이디와 비밀번호를 순차적으로 입력해 주세요.");
		System.out.print("아이디 :");
		String id = sc.next();	//id
		System.out.print("비밀번호 :");
		String pw = sc.next();	//pw
		
//		System.out.println("ID :" + id + ", PW : " + pw); // 입력 체크
		
//		1-2) 관리자 계정 정보와 일치한지 확인
		if (id.equals("admin") && pw.equals("0000")) { // 로그인 성공
			System.out.println(id +" 님 환영합니다.");
//			2. 인트로 수행(intro)
			printIntro(); // 인트로 접속
			
		} else {	// 로그인 실패
			System.out.println("아이디 또는 비밀번호가 일치하지않습니다.");
			doLogin();  // 로그인 재시도
		}	
		
//		boolean chk = true;
//		do {
////			1-1) 사용자에게 아이디,비밀번호값 요청
//				System.out.println("아이디와 비밀번호를 순차적으로 입력해 주세요.");
//				System.out.print("아이디 :");
//				String id = sc.next();	//id
//				System.out.print("비밀번호 :");
//				String pw = sc.next();	//pw
//			
////			System.out.println("ID :" + id + ", PW : " + pw); // 입력 체크
//			
////			1-2) 관리자 계정 정보와 일치한지 확인
//			if (id.equals("admin") && pw.equals("0000")) {
//				System.out.println(id +" 님 환영합니다.");
//				chk = !chk;
//			} else {
//				System.out.println("아이디 또는 비밀번호가 일치하지않습니다.");
//			}
//		}while(chk);	// 로그인시도

		
	}
	
	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		
//		1. 로그인 수행(login) 
		doLogin();


//		Book[] b = new Book[5]; // b = Book 인스턴스를 5개 저장
//		
//		for (int i = 0; i < b.length; i++) {
////			b[i].setPage(sc.nextInt());
////			b[i].setName(sc.nextLine());
////			b[i].setAuthor(sc.nextLine());
//			
//			int p = sc.nextInt();
//			String n = sc.next();
//			String a = sc.next();
//			Book bk = new Book();
//			
//			bk.setPage(p);
//			bk.setName(n);
//			bk.setAuthor(a);
//			
//			b[i] = bk;
//		}
		
		
	}

}
