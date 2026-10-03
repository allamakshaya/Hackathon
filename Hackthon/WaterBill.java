import java.util.*;
public class WaterBill {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double waterConsumed;
double waterBill;

System.out.print("Enter water consumed in litres: ");
waterConsumed = sc.nextDouble();

if (waterConsumed <= 500) {
waterBill = 100;
} else {
waterBill = 200;
}

System.out.println("Water bill: Rs." + waterBill);
sc.close();
}
}