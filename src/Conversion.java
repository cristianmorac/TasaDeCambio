import java.util.HashMap;
import java.util.Map;

public class Conversion {

    public String filtrarMonedas(String consultaMoneda,String filtrarMoneda) {
        try {
            ConsultaAPI consulta = new ConsultaAPI();
            Moneda respuesta = consulta.obtenerDatos(consultaMoneda);
            Map<String, Double> tasasConversion = respuesta.conversion_rates();
            Map<String, Double> monedasFiltradas = new HashMap<>();
            String[] monedasDeseadas = {"ARS", "COP", "BRL", "USD"};
            for (String moneda : monedasDeseadas) {
                if (tasasConversion.containsKey(moneda)) {
                    monedasFiltradas.put(moneda, tasasConversion.get(moneda));
                }
            }
            String tasaFormateada = String.format("%.8f",monedasFiltradas.get(filtrarMoneda));
            return tasaFormateada;

        } catch (Exception e) {
            System.out.println("Error al consultar la API: " + e.getMessage());
            return null;
        }

    }
}
