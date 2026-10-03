import java.util.*;
public class Waterconsumption {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int morningUsage, eveningUsage, totalConsumption;

System.out.print("Enter morning water usage (litres): ");
morningUsage = sc.nextInt();

System.out.print("Enter evening water usage (litres): ");
eveningUsage = sc.nextInt();

totalConsumption = calculateTotal(morningUsage, eveningUsage);

System.out.println("Total water consumption: " + totalConsumption + " litres");
sc.close();
}

public static int calculateTotal(int morningUsage, int eveningUsage) {
return morningUsage + eveningUsage;
}
}