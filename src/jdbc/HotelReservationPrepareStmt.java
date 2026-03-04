package jdbc;

import java.sql.*;
import java.util.Scanner;

public class HotelReservationPrepareStmt {
    static void main() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_db?useSSL=false";
        String user = "root";
        String password = "sufi";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Hotel Management Reservation System");
                System.out.println("1. Book Room");
                System.out.println("2. View Reservation");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservation");
                System.out.println("5. Delete Reservation");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> reserveRoom(connection, scanner);
                    case 2 -> viewReservation(connection);
                    case 3 -> getRoomNumber(connection, scanner);
                    case 4 -> updateReservation(connection, scanner);
                    case 5 -> deleteReservation(connection, scanner);
                    case 0 -> {
                        exit();
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    private static void reserveRoom(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter guest name: ");
            String name = scanner.next().toLowerCase();
            scanner.nextLine();
            System.out.print("Enter Room number: ");
            int room = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Contact Number:");
            String contact = scanner.nextLine();

            String query = "INSERT INTO reservation (guest_name,room_number,contact_number) VALUES(?,?,?)";
            try (var preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, room);
                preparedStatement.setString(3, contact);

                int affectedRows = preparedStatement.executeUpdate();
                if (affectedRows > 0) {
                    System.out.println("Room reserved successfully.");
                } else {
                    System.out.println("Failed to reserve room.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error while reserving room: " + e.getMessage());
        }

    }

    private static void viewReservation(Connection connection) {
        try {
            String query = "SELECT * FROM reservation";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            System.out.println("Reservation Details:");
            System.out.println("+----+------------+----------+---------------+--------------+");
            System.out.println("| ID | Guest Name | Room No  | Contact No    | Date         |");
            System.out.println("+----+------------+----------+---------------+--------------+");
            while (rs.next()) {
                System.out.printf("| %-2d | %-10s | %-8d | %-13s | %-12s |\n",
                        rs.getInt("reservation_id"),
                        rs.getString("guest_name"),
                        rs.getInt("room_number"),
                        rs.getString("contact_number"),
                        rs.getDate("reservation_date")); // date only
            }
            System.out.println("+----+------------+----------+---------------+--------------+");
        } catch (Exception e) {
            System.out.println("Error while reserving room: " + e.getMessage());
        }
    }

    private static void getRoomNumber(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Reservation Id: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Guest Name: ");
            String guestName = scanner.nextLine().toLowerCase();

            String sql = "SELECT room_number FROM reservation WHERE reservation_id = ? AND LOWER(guest_name) = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, reservationId);
            ps.setString(2, guestName);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int roomNumber = rs.getInt("room_number");
                System.out.println("Room Number for Reservation Id: " + reservationId + " and Guest Name: " + guestName + " is: " + roomNumber);
            } else {
                System.out.println("No room number found for the given Reservation id and Guest name.");
            }

        } catch (Exception e) {
            System.out.println("Error while reserving room: " + e.getMessage());
        }
    }

    private static void updateReservation(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Reservation Id: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter New Guest Name: ");
            String newGuestName = scanner.nextLine().toLowerCase();
            System.out.print("Enter New Room Number: ");
            int newRoomNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter New Contact Number: ");
            String newContactNumber = scanner.nextLine();

            String sql = "UPDATE reservation SET guest_name = ?, room_number = ?, contact_number = ? WHERE reservation_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, newGuestName);
            ps.setInt(2, newRoomNumber);
            ps.setString(3, newContactNumber);
            ps.setInt(4, reservationId);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Reservation updated successfully: " + affectedRows+ " Row(s) affected:");

            } else {
                System.out.println("Failed to update reservation.");
            }

        } catch (Exception e) {
            System.out.println("Error while updating reservation: " + e.getMessage());
        }
    }

    private static void deleteReservation(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Reservation Id to Delete: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            String sql = "DELETE FROM reservation WHERE reservation_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, reservationId);

            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Reservation deleted successfully: " + affectedRows+ " Row(s) affected:");

                // check if table is empty
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM reservation");
                rs.next();
//            int count=rs.getInt(1);
//            if(count==0){
//                System.out.println("Reservation table is empty.");
//            }
                if (rs.getInt(1) == 0) {
                    stmt.execute("ALTER  TABLE reservation Auto_increment=1");
                    System.out.println("Reservation table is empty. Auto increment reset to 1.");
                }
            } else {
                System.out.println("Failed to delete reservation.");
            }
        } catch (Exception e) {
            System.out.println("Error while deleting reservation: " + e.getMessage());
        }
    }

    private static void exit() {
        System.out.print("Exiting the application");
        int i = 5;
        while (i > 0) {
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i--;
        }
        System.out.println();
        System.out.println("Application is exiting.Thank you for using our services.");
    }


}
