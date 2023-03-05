package familymanagersystem;

/**
 *
 * @author Dário Silva 6 Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class GastosPessoais extends Pessoa {
    protected Double value;
    protected String item;
    protected String date;

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
