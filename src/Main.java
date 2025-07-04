public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミナト");
        h.setHp(40);
        Matango m = new Matango();
        m.setSuffix('A');
        m.setHp(20);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());

        King k = new King();
        k.talk(h);

        Inn i = new Inn();
        i.checkIn(h);

        h.attack(m);
    }
}