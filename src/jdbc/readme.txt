# 🏨 Hotel Management System (JDBC + MySQL)

A simple console-based Hotel Management System built using **Java (JDBC)** and **MySQL**.
This project demonstrates core JDBC concepts including database connectivity, CRUD operations, PreparedStatement usage, and SQL query handling.

---

## 🚀 Features

- ✅ Book Room (Create Reservation)
- ✅ View All Reservations (Formatted Table View)
- ✅ Get Room Number by Reservation ID & Guest Name
- ✅ Update Reservation Details
- ✅ Delete Reservation
- ✅ Auto Increment Reset when table becomes empty
- ✅ Case-insensitive Guest Name Matching
- ✅ Date formatting (Only Date, No Time)

---

## 🛠️ Technologies Used

- Java (Core Java)
- JDBC (Java Database Connectivity)
- MySQL Database
- MySQL Connector/J Driver
- Console-Based UI

---

## 🗂️ Database Structure

### 📌 Database Name:
```
jdbc_db
```

### 📌 Table Name:
```
reservation
```

### 📌 Table Structure:

| Column Name      | Data Type     | Description |
|------------------|--------------|------------|
| reservation_id   | INT (PK, AUTO_INCREMENT) | Unique Reservation ID |
| guest_name       | VARCHAR(50)  | Guest Name |
| room_number      | INT          | Room Number |
| contact_number   | VARCHAR(15)  | Contact Number |
| reservation_date | TIMESTAMP    | Auto-generated Date |

---

## 🧠 JDBC Concepts Covered

This project demonstrates:

- Loading MySQL Driver
- Establishing Database Connection
- Using Statement & PreparedStatement
- Executing Queries (SELECT, INSERT, UPDATE, DELETE)
- Handling ResultSet
- Auto Increment Handling
- Case-insensitive Search using LOWER()
- Proper Resource Closing
- Exception Handling

---

## 📌 How It Works

1. User selects an option from menu.
2. System connects to MySQL database.
3. Based on selection, corresponding SQL query executes.
4. Data is inserted, updated, deleted, or retrieved.
5. Output is displayed in formatted table style.

---

## 💻 Sample Console Output

```
===== HOTEL MANAGEMENT SYSTEM =====
1. Book Room
2. View Reservations
3. Get Room Number
4. Update Reservation
5. Delete Reservation
0. Exit
```

Formatted Table View:

```
+----+------------+----------+---------------+------------+
| ID | Guest Name | Room No  | Contact No    | Date       |
+----+------------+----------+---------------+------------+
| 1  | sufi       | 121      | 67890         | 04-03-2026 |
+----+------------+----------+---------------+------------+
```

---

## ⚙️ Setup Instructions

1. Install MySQL.
2. Create database:

```sql
CREATE DATABASE jdbc_db;
```

3. Create reservation table (as shown above).
4. Add MySQL Connector JAR to project.
5. Update DB credentials in code:
   - URL
   - Username
   - Password
6. Run the program.

---

## 📚 Additional Practice Files Included

This repository also includes:

- Basic JDBC Retrieve Example
- Basic JDBC Insert Example
- Statement vs PreparedStatement comparison

---

## 🎯 Learning Outcomes

After completing this project, I gained understanding of:

- Real-world CRUD operations
- JDBC architecture
- SQL query execution
- Secure query handling with PreparedStatement
- Database table design
- Console-based application logic

---

## 📌 Future Improvements

- Room availability check
- Duplicate booking prevention
- Admin authentication
- GUI version (JavaFX / Swing)
- MVC architecture implementation
- REST API version (Spring Boot)

---

## 👨‍💻 Author

**Mohd Sufiyan**
Java Developer | JDBC | MySQL | Backend Enthusiast

---

⭐ If you found this helpful, feel free to star the repository!