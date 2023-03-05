package familymanagersystem;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class EmpresaGrande extends Empresa {
    protected long imposto;

    public long getImposto() {
        return imposto;
    }

    public void setImposto(long imposto) {
        this.imposto = imposto;
    }
    
}
