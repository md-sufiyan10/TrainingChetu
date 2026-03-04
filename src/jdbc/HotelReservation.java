package jdbc;

import javax.xml.transform.Source;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HotelReservation {
    private static final String url="jdbc:mysql://localhost:3306/jdbc_db?useSSL=false";
    private static final String user="root";
    private static final String password="sufi";

    static void main() throws ClassNotFoundException {
       Class.forName("com.mysql.cj.jdbc.Driver");

       try{
           Connection connection = DriverManager.getConnection(url,user,password);
           while(true){
               System.out.println("Hotel Management Reservation System");
               Scanner scanner=new Scanner(System.in);
               System.out.println("1. Book Room");
               System.out.println("2. View Reservation");
               System.out.println("3. Get Room Number");
               System.out.println("4. Update Reservation");
               System.out.println("5. Delete Reservation");
               System.out.println("0. Exit");
               System.out.print("Enter your choice: ");
               int choice=scanner.nextInt();

               switch (choice){
                   case 1-> {
                      reserveRoom(connection,scanner);
                      break;
                   }
                   case 2-> {
                      viewReservation(connection);
                   }
                   case 3-> {
                       getRoomNumber(connection,scanner);
                       break;
                   }
                   case 4-> {
                       updateReservation(connection, scanner);
                       break;
                   }
                   case 5-> {
                       deleteReservation(connection, scanner);
                       break;
                   }
                   case 0-> {
                       exit();
                       scanner.close();
                       return;
                   }
                   default-> {
                       System.out.println("Invalid choice. Please try again.");
                   }
               }
           }

       }catch (SQLException e){
           System.out.println("Error :"+e.getMessage());
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
    }

    private static void reserveRoom(Connection connection, Scanner scanner) {
     try{
         System.out.print("Enter guest name: ");
         String guestName=scanner.next();
         scanner.nextLine();
         System.out.print("Enter room number: ");
         int roomNumber=scanner.nextInt();

         System.out.println("Enter Contact Number:");
         String contactNumber=scanner.next();

         String query="INSERT INTO reservation (guest_name,room_number, contact_number)" +
                 " VALUES( '" + guestName + "', '" + roomNumber + "', '" + contactNumber + "' ) ";

       try(Statement statement=connection.createStatement()){
         int affectedRom=  statement.executeUpdate(query);
         if(affectedRom>0){
             System.out.println("Reservation successful");
         }else{
             System.out.println("Reservation failed");
         }
       }
     }catch (SQLException e){
         System.out.println("Error :"+e.getMessage());
     }

    }

    private static void viewReservation(Connection connection) {
        try(Statement statement=connection.createStatement()){
            String query="SELECT * FROM reservation";
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try(Statement stm=connection.createStatement()){
                ResultSet rs=stm.executeQuery(query);
                System.out.println("Reservation Details:");

                System.out.println("+----+------------+----------+---------------+--------------+");
                System.out.println("| ID | Guest Name | Room No  | Contact No    | Date         |");
                System.out.println("+----+------------+----------+---------------+--------------+");

                while(rs.next()) {

                    int id = rs.getInt("reservation_id");
                    String name = rs.getString("guest_name");
                    int room = rs.getInt("room_number");
                    String contact = rs.getString("contact_number");

                    java.sql.Date date = rs.getDate("reservation_date");   // 👈 Only Date
                    String formattedDate = sdf.format(date);

                    System.out.printf("| %-2d | %-10s | %-8d | %-13s | %-12s |\n",
                            id, name, room, contact, formattedDate);
                }

            }

        }catch (SQLException e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    private static void getRoomNumber(Connection connection,Scanner scanner) {
        try{
            System.out.print("Enter Reservation Id: ");
            String reservationId=scanner.nextLine();
             scanner.nextLine();
            System.out.print("Enter Guest Name: ");
            String guestName=scanner.next();
            String query="SELECT room_number FROM reservation " +
                    "WHERE reservation_id = '" + reservationId + "' AND guest_name = '" + guestName + "'";

            try(Statement stm=connection.createStatement()){
                ResultSet resultSet=stm.executeQuery(query);
                if(resultSet.next()){
                int romNumber=resultSet.getInt("room_number");
                System.out.println("Room Number for Reservation Id: " + reservationId +
                        " and Guest Name: " + guestName + " is: " + romNumber);
                }
                else{
                    System.out.println("No room number found for the given Reservation id and Guest name.");
                }
            }
        }catch (SQLException e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    private static void updateReservation(Connection connection, Scanner scanner) {
        try{
            System.out.println("Enter Reservation Id to Update: ");
            int reservationId=scanner.nextInt();
            scanner.nextLine();

            if(!reservationExists(connection, reservationId)){
                System.out.println("Reservation not found. to the Given Id: " + reservationId);
                return;
            }
            System.out.println("Enter new Guest Name: ");
            String newGuestName=scanner.nextLine();
            System.out.println("Enter new Room Number: ");
            int newRoomNumber=scanner.nextInt();
            System.out.println("Enter new Contact Number: ");
            String newContactNumber=scanner.next();

            String query="update reservation set guest_name = '"+newGuestName+
                    "' , room_number = '"+newRoomNumber+"' , contact_number = '"+newContactNumber+
                    "' where reservation_id = '"+reservationId+"'";

            try(Statement stm=connection.createStatement()){
             int affectedRows=   stm.executeUpdate(query);
             if(affectedRows>0){
                 System.out.println("Reservation updated successfully.");
             }else{
                 System.out.println("Reservation updated failed.");
             }

            }
        }catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    private static void deleteReservation(Connection connection, Scanner scanner) {
        try{
            System.out.println("Enter Reservation Id to Delete: ");
            int reservationId=scanner.nextInt();
            scanner.nextLine();

            if(!reservationExists(connection,reservationId)){
                System.out.println("Reservation not found. to the Given Id: " + reservationId);
                return;
            }
            String query="DELETE FROM reservation WHERE reservation_id = '"+reservationId+"'";

            try(Statement stm=connection.createStatement()){
                int affectedRows=stm.executeUpdate(query);
                if(affectedRows>0){
                    System.out.println("Reservation deleted successfully.");
                }else{
                    System.out.println("Reservation deleted failed.");
                }
            }
        }catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    private static boolean reservationExists(Connection connection, int reservationId) {

        String query="SELECT reservation_id FROM reservation WHERE reservation_id = " +reservationId;

        try(Statement stm=connection.createStatement()){
            ResultSet resultSet=stm.executeQuery(query);
            return resultSet.next();
        }catch (SQLException e){
            System.out.println("Error :"+e.getMessage());
            return false;
        }
    }

    private static void exit() throws InterruptedException {
        System.out.print("Exiting the application");

        int i=5;
        while(i>0){
            System.out.print(".");
            Thread.sleep(500);
            i--;
        }
        System.out.println();
        System.out.println("Application is exiting.Thank you for using our services.");
    }
}
