package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of family members: ");
        int numFamilyMembers = scanner.nextInt();
        ArrayList<String> familyMembers = new ArrayList<>();
        for (int i = 0; i < numFamilyMembers; i++) {
            System.out.print("Enter family member's name: ");
            String name = scanner.next();
            familyMembers.add(i, name);
        }
        String familyMember;
        String secretSanta;
        Random random = new Random();
        HashMap<String, String> secretSantaMap = new HashMap<>();
        ArrayList<String> secretSantaList = (ArrayList<String>)familyMembers.clone();
        for (int i = 0; i < numFamilyMembers; i++) {
            familyMember = familyMembers.get(random.nextInt(numFamilyMembers - i));
            familyMembers.remove(familyMember);
            secretSantaList.remove(familyMember);
            secretSanta = secretSantaList.get(random.nextInt(secretSantaList.size()));
            while (secretSantaMap.containsValue(secretSanta)) {
                secretSanta = secretSantaList.get(random.nextInt(secretSantaList.size()));
            }
            secretSantaMap.put(familyMember, secretSanta);
            secretSantaList.remove(secretSanta);
            secretSantaList.add(familyMember);
        }

        System.out.println("The Secret Santa for each family member is: "+secretSantaMap);
    }

}
