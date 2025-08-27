package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Class.Book;
import MainClass.*;

public class MainFunc {
	private static Scanner sc = new Scanner(System.in);
	
	public static HashMap<String, Book> data = new HashMap<String, Book>();

	public static void addBook() throws IOException, CloneNotSupportedException {	// 도서정보 등록(REQ01)
//		3-1) Book에 필요한 5개 입력값 받기 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("도서 등록에 필요한 정보를 순차적으로 입력해 주세요.");
		System.out.println("추가하실 도서의 ISBN을 입력하세요.");
		System.out.print("책번호(ISBN) : ");
//		String isbn = sc.next();
		String isbn = br.readLine();
		
		System.out.println("추가하실 도서의 책이름을 입력하세요.");
		System.out.print("책이름 : ");
//		String name = sc.next();
		String name = br.readLine();
		
		System.out.println("추가하실 도서의 저자를 입력하세요.");
		System.out.print("저자 : ");
//		String author = sc.next();
		String author = br.readLine();
		
		System.out.println("추가하실 도서의 페이지 수를 입력하세요.");
		System.out.print("페이지 수 : ");
//		int page = sc.nextInt();
		int page = Integer.parseInt(br.readLine());
		
		System.out.println("추가하실 도서의 출판사를 입력하세요.");
		System.out.print("출판사 : ");
//		String pub = sc.next();
		String pub = br.readLine();
		
//		3-2) 인스턴스 생성 & 입력갑으로 멤버값 설정
		Book book = new Book(isbn, name, author, page, pub);

//		동일 도서 번호 있는가 조회
		if(data.containsKey(isbn)) {
			
			System.out.println("동일한 책번호(ISBN)가 이미 등록되어 있습니다. 다시 입력해 주세요.");
			System.out.println();
			addBook();
		}
		
//		3-3) 인스턴스를 data에 추가
		data.put(isbn, book);
		System.out.println("추가가 완료 되었습니다.");

		Main.printIntro();
		
	}
	
	public static void readBook() throws IOException, CloneNotSupportedException { // 도서정보 조회 (REQ02) 도서전체 조회 > 특정 도서 정보 조회
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		4-1) 조회하고자 하는 도서의 isbn값 검색
		System.out.println("0. 전체 조회");
		System.out.println("1. ISBN");
		System.out.println("2. 책이름");
		System.out.println("3. 출판사");
		System.out.println("4. 조회 종료");
		System.out.print("도서 조회에 필요한 정보를 입력해 주세요. : ");
		int s = Integer.parseInt(br.readLine());
		String search = "";
		switch (s) {
		case 0:
			break;
		case 1:
			System.out.println("조회하실 도서의 ISBN을 입력하세요.");
			System.out.print("책번호(ISBN) : ");
			search = br.readLine();
			break;
		case 2:
			System.out.println("조회하실 도서의 책이름을 입력하세요.");
			System.out.print("책이름 : ");
			search = br.readLine();
			break;
		case 3:
			System.out.println("조회하실 도서의 출판사를 입력하세요.");
			System.out.print("출판사 : ");
			search = br.readLine();
			break;
		case 4:
			System.out.println("조회를 종료합니다.");
			Main.printIntro();
			break;
		default:
			System.out.println("잘못 입력 하셨습니다. 다시 입력 바랍니다.");
			System.out.println();
			readBook();
			break;
		}
		
//		4-2) 검색값을 기반으로, 데이터 조회
		HashMap<String, Book> srh = new HashMap<String, Book>();
		for (Map.Entry<String, Book> entry : data.entrySet()) {
			String key = entry.getKey();
			Book val = entry.getValue();
			switch (s) {
			case 0:
				srh.put(key, val.clone());
				break;
			case 1:
				if(key.contains(search)) {
					srh.put(key, val.clone());
				}
				break;
			case 2:
				if(val.getName().contains(search)) {
					srh.put(key, val.clone());
				}
				break;
			case 3:
				if(val.getPub().contains(search)) {
					srh.put(key, val.clone());
				}
				break;
			}
		}

		if (srh.size() == 0 || srh == null) {
			System.out.println("검색하신 isbn이 없습니다 다시 조회 부탁드립니다.");
			System.out.println();
			readBook();
		} else {
			System.out.println("조회 되었습니다.");
			System.out.println("=============================");
			for (Map.Entry<String, Book> entry : srh.entrySet()) {
				Book b = entry.getValue();
				System.out.println("책번호(ISBN) : " + b.getIsbn());
				System.out.println("책이름 : " + b.getName());
				System.out.println("저자 : " + b.getAuthor());
				System.out.println("페이지 수 : " + b.getPage());
				System.out.println("출판사 : " + b.getPub());
				System.out.println("=============================");
			}
		}
		
		Main.printIntro();
	}
		
	public static void removeBook() throws IOException, CloneNotSupportedException { // 도서 정보 삭제 (REQ04)
		System.out.println("삭제하실 도서의 책번호(ISBN)을 명확히 입력 하세요.");
		System.out.print("책번호(ISBN) :");
		String search = sc.next();
		
		Book b = data.getOrDefault(search, null);
		if(b == null) {
			System.out.println("검색하신 isbn이 없습니다. 다시 조회 부탁드립니다.");
			System.out.println();
			removeBook();
		}else {
//		4-3) 조회된 데이터 순차 출력
			System.out.println("조회 되었습니다.");
			System.out.println("책번호(ISBN) : " + b.getIsbn());
			System.out.println("책이름 : " + b.getName());
			System.out.println("저자 : " + b.getAuthor());
			System.out.println("페이지 수 : " + b.getPage());
			System.out.println("출판사 : " + b.getPub());
		}
		
		System.out.println("해당 도서를 삭제 하시겠습니까? (Y/N)");
		System.out.print("입력 : ");
		String yOn = sc.next();
		
		if (yOn.toUpperCase().equals("Y")) {
			data.remove(b.getIsbn());			
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("취소되었습니다.");
		}


		Main.printIntro();
	}
	
	public static void editBook() throws CloneNotSupportedException, IOException { // 도서 정보 수정 (REQ03)
		
		Book b = editBookSearch();
		
		Book editB = bookEdit(b);
		
		System.out.println("해당 도서를 수정 하시겠습니까? (Y/N)");
		System.out.print("입력 : ");
		String yOn = sc.next();
		
		if (yOn.toUpperCase().equals("Y")) {
			data.put(b.getIsbn(),editB);			
			System.out.println("수정되었습니다.");
		}else {
			System.out.println("취소되었습니다.");
		}


		Main.printIntro();
	}
	
	public static Book bookEdit(Book b) throws CloneNotSupportedException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Book eb = b.clone();
		int s = 0;

		do {
			System.out.println("수정하실 내용을 선택하세요.");
			System.out.println("0. 수정 종료");
			System.out.println("1. 책이름");
			System.out.println("2. 저자");
			System.out.println("3. 페이지 수");
			System.out.println("4. 출판사");
			s = sc.nextInt();
			
			switch (s) {
			case 0:
				break;
			case 1:
				System.out.print("책이름 : ");
				eb.setName(br.readLine());
				break;
			case 2:
				System.out.print("저자 : ");
				eb.setAuthor(br.readLine());
				break;
			case 3:
				System.out.print("페이지 수 : ");
				eb.setPage(Integer.parseInt(br.readLine()));
				break;
			case 4:
				System.out.print("출판사 : ");
				eb.setPub(br.readLine());
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println();
				eb = bookEdit(b);
				break;
			}
			
		}while(s != 0);

		return eb;
	}
	
	public static Book editBookSearch() {
		System.out.println("수정하실 도서의 책번호(ISBN)을 명확히 입력 하세요.");
		System.out.print("책번호(ISBN) :");
		String search = sc.next();
		
		Book b = data.getOrDefault(search, null);
		if(b == null) {
			System.out.println("검색하신 isbn이 없습니다. 다시 조회 부탁드립니다.");
			System.out.println();
			editBookSearch();
		}else {
//		4-3) 조회된 데이터 순차 출력
			System.out.println("조회 되었습니다.");
			System.out.println("책번호(ISBN) : " + b.getIsbn());
			System.out.println("책이름 : " + b.getName());
			System.out.println("저자 : " + b.getAuthor());
			System.out.println("페이지 수 : " + b.getPage());
			System.out.println("출판사 : " + b.getPub());
		}
		return b;
	}
}
