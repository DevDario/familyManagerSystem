package familymanagersystem;

/**
 *
 * @author Dário Silva
 * @since 2023
 * @version 1.0
 */
public class Familia extends Localizacao {
    static protected int phoneNumber;
    static protected int familyId;
    static protected int numberOfMembers;
    static protected String familyLastname;

    public static int getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(int phoneNumber) {
        Familia.phoneNumber = phoneNumber;
    }

    public static int getFamilyId() {
        return familyId;
    }

    public static void setFamilyId(int familyId) {
        Familia.familyId = familyId;
    }

    public static int getNumberOfMembers() {
        return numberOfMembers;
    }

    public static void setNumberOfMembers(int numberOfMembers) {
        Familia.numberOfMembers = numberOfMembers;
    }

    public static String getFamilyLastname() {
        return familyLastname;
    }

    public static void setFamilyLastname(String familyLastname) {
        Familia.familyLastname = familyLastname;
    }
    
}
