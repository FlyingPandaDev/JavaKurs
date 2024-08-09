class Main {
  public static void main(String[] args) {
    String begruessung = "Hallo";

    int laengeDesFeldes = begruessung.length();

    int zahl = 4;

    int gesamt = laengeDesFeldes + zahl;

    int gesamtAlt = addieren(laengeDesFeldes, zahl);

    System.out.println("Die Länge des Feldes und die Zahl selbst ergeben summiert: " + gesamt);
  }

  public static int addieren(int a, int b) {
    return a + b;
  }

  public static double durchschnitt(int a, int b, int anzahlAnWerten) {
    int summe = a + b;
    // oder auch: int summe = addieren(a, b)
    return summe / anzahlAnWerten;
  }
}
