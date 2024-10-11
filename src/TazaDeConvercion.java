import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TazaDeConvercion {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public void Taza(String base_code, Map<String, Double> conversion_rates) {
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    public List<Conversion> getTasasDeConversion() {
        List<Conversion> tasas = new ArrayList<>();
        for (Map.Entry<String, Double> entry : conversion_rates.entrySet()) {
            tasas.add(new Conversion(entry.getKey(), entry.getValue()));
        }
        return tasas;
    }

    @Override
    public String toString() {
        return "Moneda Base: " + base_code + "\nTasas de Conversión: " + conversion_rates;
    }
}
