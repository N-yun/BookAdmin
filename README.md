# 📚 BookAdmin

🇰🇷 [한국어](README.md) | 🇬🇧 [English](README_EN.md)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Platform](https://img.shields.io/badge/Platform-Console-lightgrey?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

**관리자용 도서 관리 프로그램**  
도서 등록, 조회, 수정, 삭제 기능을 제공하는 Java 기반 콘솔 프로그램

---

## 🛠 프로젝트 정보
- **프로젝트명** : BookAdmin  
- **활용 기술** : Java  

---

## 🚀 사용 방법
### 1. 구동
<img width="454" height="88" alt="image" src="https://github.com/user-attachments/assets/451a5c77-5376-45d0-b11f-bba56366ce63" />  

1. `.jar` 파일이 위치한 폴더로 이동  
2. 아래 명령어 실행  
   ```bash
   java -jar BookAdmin.jar
   ```

---

## 🔑 주요 기능

### 1. 로그인 (`doLogin()`)
- **관리자 계정 로그인** :  
  - ID : `admin`  
  - PW : `0000`  
- **성공 시** : 메인 메뉴 출력  
  <img width="377" height="152" src="https://github.com/user-attachments/assets/a799e708-eb74-4e51-83be-0522363926b3" />  
- **실패 시** : 재입력 요청  
  <img width="400" height="124" src="https://github.com/user-attachments/assets/519af858-61c3-4112-830c-0fd5ba5b4b72" />  

---

### 2. 도서 등록 (`addBook()`)
1. 도서 등록 메뉴 접속  
   <img width="428" height="152" src="https://github.com/user-attachments/assets/45c3f820-f47e-4564-99c3-d9df5227f868" />  
2. 도서 정보 입력  
   <img width="433" height="178" src="https://github.com/user-attachments/assets/08dde1b2-ff27-4231-8ede-dfd0b2235638" />  
3. 등록 완료  
   <img width="262" height="99" src="https://github.com/user-attachments/assets/f4a82c0f-0f70-4980-a827-ca66753fb7e5" />  
4. ISBN 중복 시 재입력 요청  
   <img width="536" height="276" src="https://github.com/user-attachments/assets/cdbf679b-48b3-443f-9d88-98bfd653d368" />  

---

### 3. 도서 조회 (`readBook()`)
- **전체 조회**  
  <img width="358" height="231" src="https://github.com/user-attachments/assets/afa9f63a-9f40-43da-9a8b-e279f7ec6477" />  
- **책번호(ISBN) 조회**  
  <img width="386" height="244" src="https://github.com/user-attachments/assets/2cf1c4ce-7ef3-49b4-acd2-9e7335c1b8e7" />  
- **책이름 조회**  
  <img width="372" height="258" src="https://github.com/user-attachments/assets/7128d45e-fb62-48d5-aa6c-d63de48449a0" />  
- **출판사 조회**  
  <img width="356" height="259" src="https://github.com/user-attachments/assets/13dba8bb-e208-4454-be4a-5c9ea3d65c89" />  
- **조회 종료 → 메인 메뉴 이동**  
  <img width="377" height="113" src="https://github.com/user-attachments/assets/ceba980d-6830-4e82-bbc9-439d71e2b4a6" />  
- **조회 결과 없음**  
  <img width="402" height="179" src="https://github.com/user-attachments/assets/ad84e63e-5bb3-49d0-b2b5-f0bae36f65e0" />  

---

### 4. 도서 삭제 (`removeBook()`)
1. 삭제 대상 도서 조회  
   <img width="413" height="179" src="https://github.com/user-attachments/assets/eb38b14f-b5c2-4d60-843e-41fa4fb7e215" />  
   - 조회 결과 없을 경우  
     <img width="421" height="114" src="https://github.com/user-attachments/assets/95fab357-d71c-4778-b064-cfb08ddfc289" />  
2. 도서 삭제  
   <img width="308" height="133" src="https://github.com/user-attachments/assets/3f6fd97e-508f-4b50-b150-630d6d88c899" />  
   - 삭제된 도서 재조회 가능  
   - `N` 또는 기타 입력 시 취소  

---

### 5. 도서 수정 (`editBook()`)
1. 수정할 도서 조회  
   <img width="442" height="259" src="https://github.com/user-attachments/assets/e3acd98c-d57f-43e7-bc04-3c84d05cbed4" />  
   - 조회 결과 없음 시  
     <img width="418" height="117" src="https://github.com/user-attachments/assets/9a77cb20-85bb-4c2a-98ff-842e7ba1bfb7" />  
2. 수정 항목 선택  
   - 책이름, 저자, 페이지 수, 출판사  
   - 수정 종료 시 저장 여부 확인  
   <img width="324" height="235" src="https://github.com/user-attachments/assets/25181825-89d4-4f24-8362-71a247a6c2cf" />  
3. 수정 완료 & 확인  
   <img width="327" height="135" src="https://github.com/user-attachments/assets/94962c30-a5df-405e-8a36-36536a5bf3be" />  

---

## 📌 정리
- `BookAdmin`은 **관리자 계정 로그인 → 도서 등록/조회/수정/삭제** 기능을 제공하는 콘솔 기반 프로그램입니다.  
- Java 환경에서 실행 가능하며, 기본적인 도서 관리 기능을 빠르게 테스트할 수 있습니다.  
