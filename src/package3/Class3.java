package package3;

public class Class3 {

    private String bezeichner;

    public static void main(String[] args) {
        String x = "matteo";
        int y = 18;
        System.out.println(x);
        System.out.println(y);

        /*variablenname wurde auf fhKufsteinTirol gekürzt*/

        String fachhochschuleKufsteinTirol = "fhKufsteinTirol";

        final String FH_KUFSTEIN_TIROL = "fachhochschuleKufsteinTirol";
        /*final string wurde bezeichner benannt*/
        final String bezeichner;
        /* STRG+Alt+L + = man rückt um eines rein*/


//mit kann man " und ' inerhalb von sout eingeben
        System.out.println("Java verwendet für Strings \" doppelte Anführungszeichen\" und einzelne Anführungszeichen wie \'c\'um einzelne Zeichen zu definieren.");
        //setzt man einen backslash vor einen backslash kann dieser beliebig oft in sout ausgegeben werden
        System.out.println( "durch \\ kann man auch den backslash beliebig oft ausgeben: \\\\" );
        // \b zeigt buchstaben davor nicht an, \n macht zeilenumnruch, \t macht mehr lehrräume
        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator");
        //
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt die bestehende Zeile. \f ist in der Konsole nicht bemerkbar, da es einen Seitenumbruch erzwingt.");
    }
}
