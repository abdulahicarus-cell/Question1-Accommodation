import java.util.Scanner;

class AccommodationArea {
    protected String areaName;
    protected int occupants;
    protected boolean[] lights;

    public AccommodationArea(String name) {
        this.areaName = name;
        this.occupants = 0;
        this.lights = new boolean[3]; // lights 1, 2, 3. Initially all false (OFF)
    }

    public void addOccupants(int n) {
        this.occupants += n;
        System.out.println(n + " occupant(s) added to " + areaName + ". Total: " + this.occupants);
    }

    public void removeOccupants(int n) {
        this.occupants = Math.max(0, this.occupants - n);
        System.out.println(n + " occupant(s) removed from " + areaName + ". Total: " + this.occupants);
    }

    public void switchLight(int lightNum, boolean on) {
        if (lightNum >= 1 && lightNum <= 3) {
            lights[lightNum - 1] = on;
            String status = on ? "ON" : "OFF";
            System.out.println("Light " + lightNum + " in " + areaName + " is now " + status);
        } else {
            System.out.println("Invalid light number. Please use 1, 2, or 3.");
        }
    }

    public void reportStatus() {
        System.out.println("\n--- Status Report for " + areaName + " ---");
        System.out.println("Occupants: " + occupants);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "ON" : "OFF"));
        }
        System.out.println("--------------------------------\n");
    }
}

class GymArea extends AccommodationArea {
    public GymArea() {
        super("Gym Area");
    }
}

class SwimmingArea extends AccommodationArea {
    public SwimmingArea() {
        super("Swimming Area");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GymArea gym = new GymArea();
        SwimmingArea swimmingPool = new SwimmingArea();
        AccommodationArea activeArea = gym; // Gym is default active area

        char choice;
        do {
            System.out.println("\n** Speke Apartments Accommodation Control **");
            System.out.println("S - Select active area");
            System.out.println("W - Add occupants");
            System.out.println("X - Remove occupants");
            System.out.println("Y - Switch a light ON");
            System.out.println("Z - Switch a light OFF");
            System.out.println("R - Report status");
            System.out.println("Q - Quit");
            System.out.print("Choose an option: ");

            choice = scanner.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'S':
                    System.out.print("Select area (G for Gym, P for Swimming): ");
                    char areaChoice = scanner.next().toUpperCase().charAt(0);
                    if (areaChoice == 'G') {
                        activeArea = gym;
                        System.out.println("Gym Area is now active.");
                    } else if (areaChoice == 'P') {
                        activeArea = swimmingPool;
                        System.out.println("Swimming Area is now active.");
                    } else {
                        System.out.println("Invalid area selection. Please use G or P.");
                    }
                    break;

                case 'W':
                    System.out.print("Enter number of occupants to add: ");
                    if (scanner.hasNextInt()) {
                        int addNum = scanner.nextInt();
                        if (addNum > 0) {
                            activeArea.addOccupants(addNum);
                        } else {
                            System.out.println("Please enter a positive integer.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;

                case 'X':
                    System.out.print("Enter number of occupants to remove: ");
                    if (scanner.hasNextInt()) {
                        int removeNum = scanner.nextInt();
                        if (removeNum > 0) {
                            activeArea.removeOccupants(removeNum);
                        } else {
                            System.out.println("Please enter a positive integer.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next();
                    }
                    break;

                case 'Y':
                    System.out.print("Enter light number (1-3) to switch ON: ");
                    if (scanner.hasNextInt()) {
                        int lightOn = scanner.nextInt();
                        activeArea.switchLight(lightOn, true);
                    } else {
                        System.out.println("Invalid input. Please enter an integer 1, 2, or 3.");
                        scanner.next();
                    }
                    break;

                case 'Z':
                    System.out.print("Enter light number (1-3) to switch OFF: ");
                    if (scanner.hasNextInt()) {
                        int lightOff = scanner.nextInt();
                        activeArea.switchLight(lightOff, false);
                    } else {
                        System.out.println("Invalid input. Please enter an integer 1, 2, or 3.");
                        scanner.next();
                    }
                    break;

                case 'R':
                    activeArea.reportStatus();
                    break;

                case 'Q':
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose from the menu.");
                    break;
            }
        } while (choice != 'Q');

        scanner.close();
    }
}