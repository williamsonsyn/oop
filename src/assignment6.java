/*
    Assignment 6: Interface 
    PAWAN KOSHTI
    125B1F079
    A2
*/
/*
6) Create an application for a transportation system where different modes of transport (e.g., car, bus, train) 
demonstrate polymorphism in their pricing strategies. Implement a common "Transport" interface with a polymorphic 
method for calculating fares, and each transport type overrides this method to apply its specific fare calculation logic.
*/

import java.util.Scanner;

public class assignment6 {

    // Common interface
    public interface Transport {
        double calculateFare(double distance, int type);
    }

    // Car: Different pricing for AC and night travel
    static class Car implements Transport {

        private static final double BASE_FARE = 50;
        private static final double PER_KM_RATE = 18;
        private static final double AC_CHARGE = 50;
        private static final double NIGHT_SURCHARGE = 50;

        @Override
        public double calculateFare(double distance, int type) {

            switch (type) {

                case 1: // Non-AC daytime
                    return BASE_FARE + (distance * PER_KM_RATE);

                case 2: // AC daytime
                    return BASE_FARE + (distance * PER_KM_RATE)
                            + AC_CHARGE;

                case 3: // Non-AC nighttime
                    return BASE_FARE + (distance * PER_KM_RATE)
                            + NIGHT_SURCHARGE;

                case 4: // AC nighttime
                    return BASE_FARE + (distance * PER_KM_RATE)
                            + AC_CHARGE + NIGHT_SURCHARGE;

                default:
                    return -1;
            }
        }
    }

    // Bus: Different pricing for AC and passenger category
    static class Bus implements Transport {

        private static final double BASE_FARE = 5;
        private static final double PER_KM_RATE = 4;
        private static final double AC_CHARGE = 5;
        private static final double MALE_SURCHARGE = 15;

        @Override
        public double calculateFare(double distance, int type) {

            double fare = BASE_FARE + (distance * PER_KM_RATE);

            switch (type) {

                case 1: // Male, non-AC
                    return fare + MALE_SURCHARGE;

                case 2: // Male, AC
                    return fare + MALE_SURCHARGE + AC_CHARGE;

                case 3: // Female, non-AC
                    return fare;

                case 4: // Female, AC
                    return fare + AC_CHARGE;

                default:
                    return -1;
            }
        }
    }

    // Train: Different pricing based on coach class
    static class Train implements Transport {

        private static final double BASE_FARE = 5;
        private static final double PER_KM_RATE = 2;
        private static final double RESERVATION_CHARGE = 10;

        @Override
        public double calculateFare(double distance, int type) {

            double baseAmount = BASE_FARE + (distance * PER_KM_RATE);

            switch (type) {

                case 1: // General coach
                    return baseAmount;

                case 2: // Sleeper coach
                    return baseAmount * 1.5;

                case 3: // AC first class
                    return (baseAmount * 3.0) + RESERVATION_CHARGE;

                case 4: // AC second class
                    return (baseAmount * 2.0) + RESERVATION_CHARGE;

                case 5: // AC third class
                    return (baseAmount * 1.5) + RESERVATION_CHARGE;

                default:
                    return -1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double distance = scanner.nextDouble();

        int choice;

        do {
            System.out.println("\nSelect Transport Mode:");
            System.out.println("1. Car");
            System.out.println("2. Bus");
            System.out.println("3. Train");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            Transport transport;
            int type;
            double fare;

            switch (choice) {

                case 1:
                    transport = new Car();

                    System.out.println("\nSelect Car Type:");
                    System.out.println("1. Non-AC daytime");
                    System.out.println("2. AC daytime");
                    System.out.println("3. Non-AC nighttime");
                    System.out.println("4. AC nighttime");
                    System.out.print("Enter choice: ");

                    type = scanner.nextInt();
                    fare = transport.calculateFare(distance, type);

                    if (fare >= 0) {
                        System.out.println("Car fare: Rs. " + fare);
                    } else {
                        System.out.println("Invalid car type.");
                    }
                    break;

                case 2:
                    transport = new Bus();

                    System.out.println("\nSelect Bus Type:");
                    System.out.println("1. Male, non-AC");
                    System.out.println("2. Male, AC");
                    System.out.println("3. Female, non-AC");
                    System.out.println("4. Female, AC");
                    System.out.print("Enter choice: ");

                    type = scanner.nextInt();
                    fare = transport.calculateFare(distance, type);

                    if (fare >= 0) {
                        System.out.println("Bus fare: Rs. " + fare);
                    } else {
                        System.out.println("Invalid bus type.");
                    }
                    break;

                case 3:
                    transport = new Train();

                    System.out.println("\nSelect Train Coach:");
                    System.out.println("1. General");
                    System.out.println("2. Sleeper");
                    System.out.println("3. AC first class");
                    System.out.println("4. AC second class");
                    System.out.println("5. AC third class");
                    System.out.print("Enter choice: ");

                    type = scanner.nextInt();
                    fare = transport.calculateFare(distance, type);

                    if (fare >= 0) {
                        System.out.println("Train fare: Rs. " + fare);
                    } else {
                        System.out.println("Invalid train class.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}