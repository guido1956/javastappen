public class Stap007MethodsNaarJeHandZetten1 {
    public static void main(String[] args) {
        maakTekstBox("Deze box wordt 43 sterren breed");
        maakTekstBox("Mm, zo ziet-ie er toevallig goed uit");
        maakTekstBox("Hoe zorg ik ervoor dat-ie er altijd goed uitziet?");
    }

    private static void maakTekstBox(String tekst) {
        System.out.println(sterretjesregel(43));
        System.out.println("***" + tekst + "***");
        System.out.println(sterretjesregel(43));
    }


    private static String sterretjesregel(int aantal) {
        String sterren = "";
        for (int x = 1 ; x <=aantal; x++) {
            sterren += "*";
        }
        return sterren;
    }
}
