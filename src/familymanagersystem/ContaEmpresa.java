package familymanagersystem;

/**
 *
 * @author Dário Silva
 * @since 2023
 * @version 1.0
 */
public class ContaEmpresa extends Conta {
    
    protected long companyNIF;

    public long getCompanyNIF() {
        return companyNIF;
    }

    public void setCompanyNIF(long companyNIF) {
        this.companyNIF = companyNIF;
    }
    
    
}
