package hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
/*
This code represents a console-based hotel management system.
It allows users to interact with different functionalities based on their roles:
manager, staff, or guest.
Here's an overview of the main features and functionality:
1-  The program uses the Scanner class to read input from the user.

2-  The 'Hotel' class represents the hotel and contains methods to manage different
    aspects of the hotel, such as
    reception, business center, library, parking, restaurant, staff, guests, and rooms.
3-  The program uses a 'do-while' loop to continuously prompt the user for options
    until they choose to exit by entering '0'.
4-  The manager section allows the manager to perform various operations,
    such as updating information about the reception, business center, library, parking, restaurant, adding staff, deleting staff
    , and generating a report about the hotel.
5-  The staff section allows the staff to perform operations 
    like adding guests, deleting guests, adding rooms, generating guest reports, and generating room reports.

6-  The guest section allows guests to view information about
    different areas of the hotel, generate room reports, and get their bill.
7-  The program handles incorrect input by catching
    'InputMismatchException' and displaying an error message.

this code is a basic skeleton for a hotel management system,
and you can further customize and extend it based on your specific requirements.
 */
public class HotelManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char choice = ' ';
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("\u001B[41m" + "0- Exit");
                System.out.println("\u001B[44m" + "1- Manager");
                System.out.println("\u001B[42m" + "2- Staff");
                System.out.println("3- Guest");
                System.out.print("Enter your option: ");
                int mainMenuOption = scanner.nextInt();
                System.out.println();

                switch (mainMenuOption) {
                    case 0:
                        choice = 'y';
                        break;

                    case 1:
                        System.out.print("Enter the manager password: ");
                        int managerPassword = scanner.nextInt();
                        System.out.println();
                        if (managerPassword == 1234) {
                            do {
                                System.out.println("0- Logout");
                                System.out.println("1- Update Reception information");
                                System.out.println("2- Update Business Center information");
                                System.out.println("3- Update Library information");
                                System.out.println("4- Update Parking information");
                                System.out.println("5- Update Restaurant information");
                                System.out.println("6- Add staff");
                                System.out.println("7- Delete staff");
                                System.out.println("8- Generate hotel report");
                                System.out.print("Enter your option: ");
                                int managerSubMenuOption = scanner.nextInt();
                                System.out.println();
                                switch (managerSubMenuOption) {
                                    case 0:
                                        choice = 'y';
                                        break;
                                    case 1:
                                        System.out.print("Enter Reception capacity: ");
                                        int receptionCapacity = scanner.nextInt();
                                        System.out.print("Enter Reception manager name: ");
                                        String receptionManagerName = scanner.next();
                                        System.out.print("Enter Reception staff number: ");
                                        int receptionStaffNumber = scanner.nextInt();
                                        hotel.setReceptionInfo(receptionCapacity, receptionManagerName, receptionStaffNumber);
                                        break;
                                    case 2:
                                        System.out.print("Enter Business Center manager name: ");
                                        String businessCenterManagerName = scanner.next();
                                        System.out.print("Enter Business Center number of Offices: ");
                                        int businessCenterNumberOfOffices = scanner.nextInt();
                                        System.out.print("Enter Business Center staff number: ");
                                        int businessCenterStaffNumber = scanner.nextInt();
                                        hotel.setBusinessCenterInfo(businessCenterNumberOfOffices, businessCenterManagerName, businessCenterStaffNumber);
                                        break;
                                    case 3:
                                        System.out.print("Enter Library book number: ");
                                        int libraryBookNumber = scanner.nextInt();
                                        System.out.print("Enter Library capacity: ");
                                        int libraryCapacity = scanner.nextInt();
                                        System.out.print("Enter Library manager name: ");
                                        String libraryManagerName = scanner.next();
                                        System.out.print("Enter Library staff number: ");
                                        int libraryStaffNumber = scanner.nextInt();
                                        hotel.setLibraryInfo(libraryBookNumber, libraryCapacity, libraryManagerName, libraryStaffNumber);
                                        break;
                                    case 4:
                                        System.out.print("Enter Parking capacity: ");
                                        int parkingCapacity = scanner.nextInt();
                                        System.out.print("Enter Parking price: ");
                                        int parkingPrice = scanner.nextInt();
                                        System.out.print("Enter Parking manager name: ");
                                        String parkingManagerName = scanner.next();
                                        System.out.print("Enter Parking staff number: ");
                                        int parkingStaffNumber = scanner.nextInt();
                                        hotel.setParkingInfo(parkingCapacity, parkingPrice, parkingManagerName, parkingStaffNumber);
                                        break;
                                    case 5:
                                        System.out.print("Enter Restaurant booking price: ");
                                        int restaurantBookingPrice = scanner.nextInt();
                                        System.out.print("Enter Restaurant manager name: ");
                                        String restaurantManagerName = scanner.next();
                                        System.out.print("Enter Restaurant staff number: ");
                                        int restaurantStaffNumber = scanner.nextInt();
                                        hotel.setRestaurantInfo(restaurantBookingPrice, restaurantManagerName, restaurantStaffNumber);
                                        break;

                                    case 6:
                                        System.out.print("Enter staff name: ");
                                        String staffName = scanner.next();
                                        System.out.print("Enter staff SSN: ");
                                        String staffSSN = scanner.next();
                                        System.out.print("Enter staff salary: ");
                                        int staffSalary = scanner.nextInt();
                                        System.out.print("Enter staff bonus: ");
                                        int staffBonus = scanner.nextInt();
                                        int staffAutoNumber = hotel.getStaffautoNumber();
                                        System.out.print("Enter staff age: ");
                                        int staffAge = scanner.nextInt();
                                        System.out.print("Enter staff phone number: ");
                                        String staffPhoneNumber = scanner.next();
                                        System.out.print("Enter staff email: ");
                                        String staffEmail = scanner.next();
                                        hotel.addStaff(staffSalary, staffBonus, staffSSN, staffName, staffAutoNumber, staffAge, staffPhoneNumber, staffEmail);
                                        break;
                                    case 7:
                                        System.out.print("Enter the staff ID to delete: ");
                                        int staffID = scanner.nextInt();
                                        hotel.deleteStaff(staffID);
                                        break;
                                    case 8:
                                        hotel.getAllInfo();
                                        break;
                                    default:
                                        System.out.println("Option not found");
                                        break;
                                }
                            } while (choice != 'y');
                            choice = ' ';
                        } else {
                            System.out.println("The password is incorrect");
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.print("Enter the staff password: ");
                        int staffPassword = scanner.nextInt();
                        System.out.println();

                        if (staffPassword == 4567) {
                            do {
                                System.out.println("0- Logout");
                                System.out.println("1- Add guest");
                                System.out.println("2- Delete guest");
                                System.out.println("3- Add room");
                                System.out.println("4- Generate guest report");
                                System.out.println("5- Generate room report");
                                System.out.print("Enter your option: ");
                                int staffSubMenuOption = scanner.nextInt();
                                System.out.println();

                                switch (staffSubMenuOption) {
                                    case 0:
                                        choice = 'y';
                                        break;
                                    case 1:
                                        System.out.println("The numbers of the available rooms are: " + hotel.getUnbookedRooms());
                                        System.out.print("Enter the room number: ");
                                        int roomNumber = scanner.nextInt();
                                        System.out.print("Enter the number of nights: ");
                                        int numberOfNights = scanner.nextInt();
                                        System.out.print("Enter the guest name: ");
                                        String guestName = scanner.next();
                                        int guestAutoNumber = hotel.getGuestautoNumber();
                                        System.out.print("Enter the guest age: ");
                                        int guestAge = scanner.nextInt();
                                        System.out.print("Enter the guest phone number: ");
                                        String guestPhoneNumber = scanner.next();
                                        System.out.print("Enter the guest email: ");
                                        String guestEmail = scanner.next();
                                        hotel.addGuest(roomNumber, numberOfNights, guestName, guestAutoNumber, guestAge, guestPhoneNumber, guestEmail);
                                        break;
                                    case 2:
                                        System.out.print("Enter the guest ID to delete: ");
                                        int guestID = scanner.nextInt();
                                        hotel.deleteGuest(guestID);
                                        break;
                                    case 3:
                                        int roomNumberAuto = hotel.getNumberOfRooms() + 1;
                                        System.out.print("Enter the night price: ");
                                        int roomNightPrice = scanner.nextInt();
                                        hotel.addRoom(roomNumberAuto, roomNightPrice);
                                        break;
                                    case 4:
                                        hotel.getGuestsInfo();
                                        break;
                                    case 5:
                                        hotel.getRoomsInfo();
                                        break;
                                    default:
                                        System.out.println("Option not found");
                                        break;
                                }
                            } while (choice != 'y');
                            choice = ' ';
                        } else {
                            System.out.println("The password is incorrect");
                            System.out.println();
                        }
                        break;

                    case 3:
                        do {
                            System.out.println("0- Logout");
                            System.out.println("1- Get information about the Reception");
                            System.out.println("2- Get information about the Business Center");
                            System.out.println("3- Get information about the Library");
                            System.out.println("4- Get information about the Parking");
                            System.out.println("5- Get information about the Restaurant");
                            System.out.println("6- Generate room report");
                            System.out.println("7- Get my bill");
                            System.out.print("Enter your option: ");
                            int guestSubMenuOption = scanner.nextInt();
                            System.out.println();

                            switch (guestSubMenuOption) {
                                case 0:
                                    choice = 'y';
                                    break;
                                case 1:
                                    System.out.println(hotel.getReceptionInfo());
                                    break;
                                case 2:
                                    System.out.println(hotel.getBusinessCenterInfo());
                                    break;
                                case 3:
                                    System.out.println(hotel.getLibraryInfo());
                                    break;
                                case 4:
                                    System.out.println(hotel.getParkingInfo());
                                    break;
                                case 5:
                                    System.out.println(hotel.getRestaurantInfo());
                                    break;
                                case 6:
                                    hotel.getRoomsInfo();
                                    break;
                                case 7:
                                    System.out.print("Enter the guest number: ");
                                    int guestNumber = scanner.nextInt();
                                    System.out.println(hotel.getBill(guestNumber));
                                    break;
                                default:
                                    System.out.println("Option not found");
                                    break;
                            }
                        } while (choice != 'y');
                        choice = ' ';
                        break;
                    default:
                        System.out.println("Option not found");
                        System.out.println();
                        break;
                }
            } catch (InputMismatchException ex) {
                System.err.println("Error: " + ex);
                System.exit(0);
            }
        } while (choice != 'y');

    }
}
