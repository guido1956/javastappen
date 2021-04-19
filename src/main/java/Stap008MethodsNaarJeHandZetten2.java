public class Stap008MethodsNaarJeHandZetten2 {
    public static void main(String[] args) {
        maakTekstBox("Deze box gaat goed");
        maakTekstBox("Deze ook! ");
        maakTekstBox("En ook deze tekst past in de box");
    }

    private static void maakTekstBox(String tekst) {
        System.out.println(sterretjesregel(tekst.length() + 6));
        System.out.println("***" + tekst + "***");
        System.out.println(sterretjesregel(tekst.length() + 6));
    }


    private static String sterretjesregel(int aantal) {
        String sterren = "";
        for (int x = 1 ; x <=aantal; x++) {
            sterren += "*";
        }
        return sterren;
    }
}
