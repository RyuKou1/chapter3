public class Matango {
    private int hp;
    final int LEVEL = 10;
    private char suffix;

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
    public char getSuffix(){
        return this.suffix;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public int  getHp(){
        return this.hp;
    }

    public void run(){
        System.out.println("お化けキノコ"+this.suffix+"は逃げ出した！");
    }
}
