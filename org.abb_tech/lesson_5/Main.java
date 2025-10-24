package lesson_5;

import lesson_5.enums.TransportType;
import lesson_5.model.Transport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir nəqliyyat tipi daxil edin: ");
        String type = sc.nextLine();

        System.out.println("Məsafə qeyd edin: ");
        double distance = sc.nextDouble();

        int passengers;
        while (true) {
            System.out.println("Sərnişin sayı daxil edin: ");
            passengers = sc.nextInt();

            if (type.equalsIgnoreCase("SCOOTER") && passengers > 1){
                System.out.println("Skooter sadəcə 1 sərnişin üçün nəzərdə tutulub. Yenidən daxil edin: ");
            }else if(type.equalsIgnoreCase("BICYCLE") && passengers > 2) {
                System.out.println("Velosiped maksimum 2 sərnişin üçün nəzərdə tutulub. Yenidən daxil edin:\"");
            }else if(type.equalsIgnoreCase("TAXI") && passengers > 7){
                System.out.println("Taksi maksimum 7 sərnişin üçün nəzərdə tutulub. Yenidən daxil edin:");
            } else {
                break;
            }
        }

        Transport transport = TransportManagement.getTransport(TransportType.valueOf(type));
        System.out.println("Nəqliyyat Məlumatı: " + transport.getTransportInfo());
        var fare = transport.calculateFare(distance, passengers);
        if(fare != 0){
            System.out.println(passengers + " sərnişin üçün gediş haqqı:" +
                    transport.calculateFare(distance, passengers));
            System.out.println("Təxmini vaxt: " +
                    transport.calculateTime(distance) +"saat");
        }
    }
}
