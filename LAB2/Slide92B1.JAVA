import java.util.Scanner;
public class Tinhtoan {
    public static void main(String[] args) {
     double a , b;
     Scanner sc = new scanner(System.in);
     System.out.println("Nhập vào số thứ 1:");
     a = scanner.nextdouble();
     System.out.println("Nhập vào số thứ 2:");
     b = scanner.nextdouble();
    double tong = a + b;
    System.out.println(a + "+" + b + "=" + tong);
    double hieu = a - b;
    System.out.println(a + "-" + b + "=" + hieu);
    double tich = a * b;
    System.out.println(a + "*" + b + "=" + tich);
    double thuong = a / b;
    System.out.println(a + "/" + b + "=" + thuong);
    int phandu = a % b;
    System.out.println(a + "%" + b +"=" + phandu);
    
    System.out.println("Ket qua so sanh bang" + a + "va" + b + "la" + (a == b));
    System.out.println("Ket qua so sanh khong bang" + a + "va" + b + "la" + (a != b));
    System.out.println("Ket qua so sanh lon hon" + a + "va" + b + "la" + (a > b));
    System.out.println("Ket qua so sanh lon hon hoac bang" + a + "va" + b + "la" + (a >= b));
    System.out.println("Ket qua so sanh nho hon" + a + "va" + b + "la" + (a < b));
    System.out.println("Ket qua so sanh nho hon hoac bang" + a + "va" + b + "la" + (a <= b));
    }
  }
    

    
    

    
      
    