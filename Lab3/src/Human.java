class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    // геттеры и сеттеры для каждого члена

    public void walk() {
        leftLeg.step();
        rightLeg.step();
    }

    public void wave() {
        leftHand.wave();
        rightHand.wave();
    }

    public void jump() {
        System.out.println("Human is jumping");
    }
}

