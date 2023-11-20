import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("2.derece denklem çözme uygulamasına hoş geldiniz");
        System.out.println("Çözümleyeçeğimiz denklem:" + "a*x^2+b*x+c=0");
        System.out.println("a,b,c kat sayı");
        System.out.println("Sistem a,b,c kat sayılarını sır");
        double a = klavye.nextDouble();
        double b = klavye.nextDouble();
        double c = klavye.nextDouble();
        double Diskriminant = b * b - 4 * a * c;
        System.out.println("Sistemin diskirimant değeri:" + Diskriminant);
        if ( Diskriminant> 0) {
            double x1 = (-1 * b - Math.sqrt(Diskriminant)) / 2 * a;
            double x2 = (-1 * b + Math.sqrt(Diskriminant)) / 2 * a;
            System.out.println("Sistemin kökleri:" + x1 + x2);
               double toplam=x1+x2;
               double carpim=x1*x2;
               System.out.println("Sistemin kökler toplamı:" + toplam);
            System.out.println("Sistemin kökler çarpımı" + carpim);
        }


        else if (Diskriminant==0) {
          double kok=(-1 * b - Math.sqrt(Diskriminant)) / 2 * a;
          System.out.println("Denklem tam kare ifade eder çakışık köke sahiptir"+kok);
          double top=2*kok;
          double carp=kok*kok;
          System.out.println("Sistemin kökler toplamı"+top);
          System.out.println("Sistemin kökler çarpımı"+carp);
        }


        else if (Diskriminant<0) {
            System.out.println("Sistemin reel kökü yoktur");
            System.out.println("Sistemin kökler toplamı"+-1*b/a);
            System.out.println("Sistemin kökler çarpımı"+c/a);
        }


    }
    }