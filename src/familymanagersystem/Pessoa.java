package familymanagersystem;

/**
 *
 * @author Dário Silva
 * @since 2023
 * @version 1.0
 */
public abstract class Pessoa {
    static protected String name;
    static protected String bornDate;
    static protected String gender;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Pessoa.name = name;
    }

    public static String getBornDate() {
        return bornDate;
    }

    public static void setBornDate(String bornDate) {
        Pessoa.bornDate = bornDate;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Pessoa.gender = gender;
    }
}
