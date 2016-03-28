public class Main {
    public static void main(String[] args) {
        Human hanazawaKana = new HanazawaKana();
        Human tamuraYukari = new TamuraYukari();

        int year = 2016;
        System.out.println(hanazawaKana.introduce(year));
        System.out.println(tamuraYukari.introduce(year));
    }
}
