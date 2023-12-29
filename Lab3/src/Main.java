public class Main
{
    public static void main(String[] args) {
        Head head = new Head("Brown");
        Leg leftLeg = new Leg(10);
        Leg rightLeg = new Leg(10);
        Hand leftHand = new Hand(20);
        Hand rightHand = new Hand(20);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        human.walk();
        human.wave();
        human.jump();
    }
}