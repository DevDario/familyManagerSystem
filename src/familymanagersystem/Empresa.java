package familymanagersystem;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class Empresa extends Localizacao{
    protected String companyName;
    protected long NIF;
    protected String companyType;
    protected long lucro, despesas;

    public long getLucro() {
        return lucro;
    }

    public void setLucro(long lucro) {
        this.lucro = lucro;
    }

    public long getDespesas() {
        return despesas;
    }

    public void setDespesas(long despesas) {
        this.despesas = despesas;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getNIF() {
        return NIF;
    }

    public void setNIF(long NIF) {
        this.NIF = NIF;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    
    
}
