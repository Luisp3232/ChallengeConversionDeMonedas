//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class FiltroMonedas {
//
//    public Map<String, Double> filtrarConversiones(Moneda moneda, Set<String> divisasDeseadas) {
//        Map<String, Double> conversionesFiltradas = new HashMap<>();
//        for (String divisa : divisasDeseadas) {
//            if (moneda.conversion_rates().containsKey(divisa)) {
//                conversionesFiltradas.put(divisa, moneda.conversion_rates().get(divisa));
//            }
//        }
//        return conversionesFiltradas;
//    }
//}