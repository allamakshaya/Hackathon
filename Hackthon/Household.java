import java.util.*;
public class Household {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int familyMembers;
double waterConsumed;
int houseNo;
char waterUsageStatus;

familyMembers = 8;
waterConsumed = 20.4;
houseNo = 4567;
waterUsageStatus = 'A';

System.out.println("No of family members: " + familyMembers);
System.out.println("Water consumed in litres: " + waterConsumed);
System.out.println("House no: " + houseNo);
System.out.println("Water usage status: " + waterUsageStatus);
sc.close();
}
}