public class Stap006MethodsRoepenMethodsAan {
    public static void main(String[] args) {
        maakTekstBox("Deze method maakt een box en zet hem op de console");
        maakTekstBox("Mmm, dat zijn eigenlijk twee taken");
    }

    private static void maakTekstBox(String tekst) {
        System.out.println(sterretjesregel());
        System.out.println("***" + tekst + "***");
        System.out.println(sterretjesregel());
    }

    private static String sterretjesregel() {
        return "***********************************";
    }
}
