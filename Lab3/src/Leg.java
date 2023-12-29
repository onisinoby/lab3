
class Leg
{
    private int size;

    public Leg(int size) {
        this.size = size;
    }

    // геттер и сеттер для size

    public void step() {
        System.out.println("Leg is stepping");
    }

    public void kick() {
        System.out.println("Leg is kicking");
    }
}
