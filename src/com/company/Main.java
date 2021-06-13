package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance, age, tripType;
        double distanceFee = 0.10, total;
        System.out.print("Mesafe giriniz (KM cinsinden giriniz.) : ");
        distance = scanner.nextInt();
        System.out.print("Yaşını giriniz : ");
        age = scanner.nextInt();
        System.out.print("Yolculuk için ; \nTek yön için bire basınız \nGidiş-Dönüş için ikiye basınız : ");
        tripType = scanner.nextInt();
        total =distance*distanceFee;
        if (distance > 0 && age > 0) {
            if (age<=12){
                double yasİndirimi=((total*50)/100);
                switch (tripType){
                    case 1:
                        System.out.println("Toplam ÜCretiniz : " + (total-yasİndirimi) + " TL");
                        break;
                    case 2:
                        System.out.println("Toplam Ücretiniz : " + ((total-((total-yasİndirimi)*0.20)))*2 + " TL" ) ;
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz ! ");
                        break;
                }
            }
           else if (age>12 && age<=24){
                double yasİndirimi=((total*10)/100);
                switch (tripType){
                    case 1:
                        System.out.println("Toplam ÜCretiniz : " + (total-yasİndirimi) + " TL");
                        break;
                    case 2:
                        System.out.println("Toplam Ücretiniz : " + ((total-((total-yasİndirimi)*0.20)))*2 + " TL");
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz ! ");
                }
            }
           else if (age<65){
                switch (tripType){
                    case 1:
                        System.out.println("Toplam ÜCretiniz : " + (total) + " TL");
                        break;
                    case 2:
                        System.out.println("Toplam Ücretiniz : " + ((total-((total)*0.20)))*2 + " TL");
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz ! ");
                }

            }
         else if (age>=65){
                double yasİndirimi=((total*30)/100);
                switch (tripType){
                    case 1:
                        System.out.println("Toplam ÜCretiniz : " + (total-yasİndirimi) + " TL");
                        break;
                    case 2:
                        System.out.println("Toplam Ücretiniz : " + ((total-((total-yasİndirimi)*0.20)))*2 + " TL");
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz ! ");
                }
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}



