import java.util.*;
import smarthome.*;

public class SmartHomeApp {
    public static void main(String[] args) {

        SmartController controller = new SmartController();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Smart Home App!");

        while (true) {
            System.out.println("\n--- Smart Home Menu ---");
            System.out.println("1. Add Device");
            System.out.println("2. Turn ON Device");
            System.out.println("3. Turn OFF Device");
            System.out.println("4. Set AC Temperature");
            System.out.println("5. Show All Device Status");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter device type (Fan, Light, TV, AC): ");
                    String type = sc.nextLine();
                    System.out.print("Enter device name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter room name: ");
                    String room = sc.nextLine();

                    switch (type.toLowerCase()) {
                        case "fan":
                            controller.addDevice(new SmartFan(name, room));
                            break;
                        case "light":
                            controller.addDevice(new SmartLight(name, room));
                            break;
                        case "tv":
                            controller.addDevice(new SmartTV(name, room));
                            break;
                        case "ac":
                            controller.addDevice(new SmartAC(name, room));
                            break;
                        default:
                            System.out.println("Invalid device type!");
                    }
                    break;

                case 2:
                    System.out.print("Enter device name to turn ON: ");
                    String onName = sc.nextLine();
                    controller.ControllDevice(onName, true);
                    break;

                case 3:
                    System.out.print("Enter device name to turn OFF: ");
                    String offName = sc.nextLine();
                    controller.ControllDevice(offName, false);
                    break;

                case 4:
                    System.out.print("Enter AC device name to set temperature: ");
                    String acName = sc.nextLine();
                    System.out.print("Enter temperature (16-30): ");
                    int temp = sc.nextInt();
                    controller.setACTemperature(acName, temp);
                    break;

                case 5:
                    controller.showAllStatuses();
                    break;

                case 6:
                    System.out.println("Exiting the app. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


// ✅ How to Compile and Run
// ⏳ 1. Open terminal inside SmartHomeApp/ directory
// 🔧 2. Compile everything:
//  in bash

// javac smarthome/*.java SmartHomeApp.java


// ▶️ 3. Run the app:
//  inbash

// java SmartHomeApp