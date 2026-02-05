package IpPackage;

// ❗ pas public (package-private)
class IpPackage {

    // attributs privés
    private int o1, o2, o3, o4;

    // constructeur privé
    private IpPackage(int o1, int o2, int o3, int o4) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
    }

    // seule méthode publique de création
    public static IpPackage getInstance(int o1, int o2, int o3, int o4) {
        if (!octetValide(o1) || !octetValide(o2)
         || !octetValide(o3) || !octetValide(o4)) {
            System.out.println("Valeur impossible");
            return null;
        }
        return new IpPackage(o1, o2, o3, o4);
    }

    // méthode utilitaire privée
    private static boolean octetValide(int o) {
        return o >= 0 && o <= 255;
    }

    // affichage
    @Override
    public String toString() {
        return o1 + "." + o2 + "." + o3 + "." + o4;
    }

    // 🔥 MAIN POUR EXECUTER LE FICHIER
    public static void main(String[] args) {
        IpPackage ip = IpPackage.getInstance(192, 168, 0, 7);
        System.out.println(ip);
    }
}
