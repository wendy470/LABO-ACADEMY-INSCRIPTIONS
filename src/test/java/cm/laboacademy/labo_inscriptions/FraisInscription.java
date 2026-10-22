package cm.laboacademy.inscriptions;

public class FraisInscription {

    public int calculer(String niveau, boolean boursier) {
        if (niveau == null) {
            throw new IllegalArgumentException("Niveau manquant");
        }
        int base = switch (niveau) {
            case "L1", "L2", "L3" -> 50000;
            case "M1", "M2" -> 75000;
            default -> throw new IllegalArgumentException("Niveau inconnu : " + niveau);
        };
        return boursier ? base / 2 : base;
    }
}