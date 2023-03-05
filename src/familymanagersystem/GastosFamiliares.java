package familymanagersystem;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class GastosFamiliares extends Familia {
    protected Double value;
    protected String item;
    protected String date;
    Conta contaFamilia;

    public Conta getContaFamilia() {
        return contaFamilia;
    }

    public void setContaFamilia(Conta contaFamilia) {
        this.contaFamilia = contaFamilia;
    }

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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
