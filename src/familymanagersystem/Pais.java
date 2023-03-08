package familymanagersystem;

/**
 *
 * @author Dário Silva
 * @since 2023
 * @version 1.0
 */
public class Pais extends Pessoa {

    static protected Boolean isWorking = true;

    public static Boolean getIsWorking() {
        return isWorking;
    }

    public static void setIsWorking(Boolean isWorking) {
        Pais.isWorking = isWorking;
    }

    public static void goWork() {
        System.out.println("Working...");
    }

    public static void goShop() {
        System.out.println("Shopping...");
    }

    public static void educateKids() {
        System.out.println("Razing...");
    }

    public static void goToChurch() {
        System.out.println("Going to Church...");
    }

}
