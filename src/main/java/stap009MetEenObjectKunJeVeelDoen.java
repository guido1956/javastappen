public class stap009MetEenObjectKunJeVeelDoen {
    public static void main(String[] args) {
        college();

    }

    public static void college() {
        String tekst = "Dit is een Stringobject met als waarde een tekenreeks";
        System.out.println(tekst);
        tekst = "Een object heeft gedragsmogelijkheden";
        System.out.println(tekst);
        tekst = "Een stringobject heeft veel mogelijkheden";
        System.out.println(tekst);
        System.out.println("Kijk maar");
        System.out.println(tekst.toLowerCase());
        System.out.println(tekst.toUpperCase());
        System.out.println(tekst.substring(0,7));
        System.out.println("Het object is sinds regel 15 niet gewijzigd");
        System.out.println(tekst);
        System.out.println("Als je dat toch wil doen...");
        tekst = tekst.toUpperCase();
        System.out.println(tekst);




    }
}
