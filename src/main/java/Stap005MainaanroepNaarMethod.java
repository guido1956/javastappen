public class Stap005MainaanroepNaarMethod {
    public static void main(String[] args) {
        maakTekstBox("Een method voert 1 taak uit");
        maakTekstBox("Die je kan aanroepen met zijn naam");
        maakTekstBox("Output is niet zo mooi. Is daar wat aan te doen?");
        maakTekstBox("Ja, maar je moet dan iets meer kennis hebben");
    }

    private static void maakTekstBox(String tekst) {
        System.out.println("***********************************");
        System.out.println("***" + tekst + "***");
        System.out.println("***********************************");
    }
}
