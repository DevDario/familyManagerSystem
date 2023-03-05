package familymanagersystem;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */

/**
 * The account class representes<br>
 * the <strong>'father'</strong> account from personal<br>
 * and companies accounts.<br>
 */
public class Conta {
    protected long accountNumber;
    protected float amout;
    protected String IBAN;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAmout() {
        return amout;
    }

    public void setAmout(float amout) {
        this.amout = amout;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }
    
    
}
