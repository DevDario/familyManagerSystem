package familymanagersystem;

/**
 *
 * @author Dário Silva
 * @since 2023
 * @version 1.0
 */
public class Localizacao {
    static protected String Province;
    static protected String hood;
    static protected String City;

    public static String getProvince() {
        return Province;
    }

    public static void setProvince(String Province) {
        Localizacao.Province = Province;
    }

    public static String getHood() {
        return hood;
    }

    public static void setHood(String hood) {
        Localizacao.hood = hood;
    }

    public static String getCity() {
        return City;
    }

    public static void setCity(String City) {
        Localizacao.City = City;
    }
    
}
