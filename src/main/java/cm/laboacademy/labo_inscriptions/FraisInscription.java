package cm.laboacademy.inscriptions;

public class FraisInscription {

    public int calculer(String niveau, boolean boursier) {
        return calculer(niveau, boursier, false);
    }

    public int calculer(String niveau, boolean boursier, boolean avantDateLimite) {
        if (niveau == null) {
            throw new IllegalArgumentException("Niveau manquant");
        }
        int base = switch (niveau) {
            case "L1", "L2", "L3" -> 50000;
            case "M1", "M2" -> 75000;
            default -> throw new IllegalArgumentException("Niveau inconnu : " + niveau);
        };
        int frais = boursier ? base / 2 : base;
        if (avantDateLimite) {
            frais = frais * 90 / 100;
        }
        return frais;
    }
}