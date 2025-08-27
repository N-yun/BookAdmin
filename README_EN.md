# 📚 BookAdmin

🇰🇷 [한국어](README.md) | 🇬🇧 [English](README_EN.md)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Platform](https://img.shields.io/badge/Platform-Console-lightgrey?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

**Library Management Program for Administrators**  
A Java-based console application for registering, searching, editing, and deleting books.

---

## 🛠 Project Information
- **Project Name** : BookAdmin  
- **Technology** : Java  

---

## 🚀 How to Run
### 1. Execution
<img width="454" height="88" alt="image" src="https://github.com/user-attachments/assets/451a5c77-5376-45d0-b11f-bba56366ce63" />  

1. Navigate to the folder containing the `.jar` file  
2. Run the following command:  
   ```bash
   java -jar BookAdmin.jar
   ```

---

## 🔑 Main Features

### 1. Login (`doLogin()`)
- **Admin Account** :  
  - ID : `admin`  
  - PW : `0000`  
- **On Success** : Displays main menu  
  <img width="377" height="152" src="https://github.com/user-attachments/assets/a799e708-eb74-4e51-83be-0522363926b3" />  
- **On Failure** : Requests re-entering ID & PW  
  <img width="400" height="124" src="https://github.com/user-attachments/assets/519af858-61c3-4112-830c-0fd5ba5b4b72" />  

---

### 2. Add Book (`addBook()`)
1. Access the Add Book menu  
   <img width="428" height="152" src="https://github.com/user-attachments/assets/45c3f820-f47e-4564-99c3-d9df5227f868" />  
2. Enter required book information  
   <img width="433" height="178" src="https://github.com/user-attachments/assets/08dde1b2-ff27-4231-8ede-dfd0b2235638" />  
3. Registration completed automatically  
   <img width="262" height="99" src="https://github.com/user-attachments/assets/f4a82c0f-0f70-4980-a827-ca66753fb7e5" />  
4. If ISBN is duplicated, system asks for re-entry  
   <img width="536" height="276" src="https://github.com/user-attachments/assets/cdbf679b-48b3-443f-9d88-98bfd653d368" />  

---

### 3. Search Book (`readBook()`)
- **Search All**  
  <img width="358" height="231" src="https://github.com/user-attachments/assets/afa9f63a-9f40-43da-9a8b-e279f7ec6477" />  
- **Search by ISBN**  
  <img width="386" height="244" src="https://github.com/user-attachments/assets/2cf1c4ce-7ef3-49b4-acd2-9e7335c1b8e7" />  
- **Search by Title**  
  <img width="372" height="258" src="https://github.com/user-attachments/assets/7128d45e-fb62-48d5-aa6c-d63de48449a0" />  
- **Search by Publisher**  
  <img width="356" height="259" src="https://github.com/user-attachments/assets/13dba8bb-e208-4454-be4a-5c9ea3d65c89" />  
- **Exit Search → Back to Main Menu**  
  <img width="377" height="113" src="https://github.com/user-attachments/assets/ceba980d-6830-4e82-bbc9-439d71e2b4a6" />  
- **No Results Found**  
  <img width="402" height="179" src="https://github.com/user-attachments/assets/ad84e63e-5bb3-49d0-b2b5-f0bae36f65e0" />  

---

### 4. Delete Book (`removeBook()`)
1. Search for the book to delete  
   <img width="413" height="179" src="https://github.com/user-attachments/assets/eb38b14f-b5c2-4d60-843e-41fa4fb7e215" />  
   - If no results found  
     <img width="421" height="114" src="https://github.com/user-attachments/assets/95fab357-d71c-4778-b064-cfb08ddfc289" />  
2. Delete the book  
   <img width="308" height="133" src="https://github.com/user-attachments/assets/3f6fd97e-508f-4b50-b150-630d6d88c899" />  
   - Re-check deleted book  
   - Input `N` or other key to cancel  

---

### 5. Edit Book (`editBook()`)
1. Search for the book to edit  
   <img width="442" height="259" src="https://github.com/user-attachments/assets/e3acd98c-d57f-43e7-bc04-3c84d05cbed4" />  
   - If no results found  
     <img width="418" height="117" src="https://github.com/user-attachments/assets/9a77cb20-85bb-4c2a-98ff-842e7ba1bfb7" />  
2. Select field to edit  
   - Title, Author, Page Count, Publisher  
   - Option to exit and confirm saving changes  
   <img width="324" height="235" src="https://github.com/user-attachments/assets/25181825-89d4-4f24-8362-71a247a6c2cf" />  
3. Confirm and save changes  
   <img width="327" height="135" src="https://github.com/user-attachments/assets/94962c30-a5df-405e-8a36-36536a5bf3be" />  

---

## 📌 Summary
- `BookAdmin` provides **Admin Login → Book Add/Search/Edit/Delete** features.  
- Runs in Java environment and allows quick testing of library management operations.  
