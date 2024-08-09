class Main {
  public static void main(String[] args) {
    String begruessung = "Hallo";

    int laengeDesFeldes = begruessung.length();

    int zahl = 4;

    int gesamt = laengeDesFeldes + zahl;

    int gesamtAlt = hinzufuegen(laengeDesFeldes, zahl);

    System.out.println("Die Länge des Feldes und die Zahl selbst ergeben summiert: " + gesamt);
  }

  public static int hinzufuegen(int a, int b) {
    return a + b;
  }
}
