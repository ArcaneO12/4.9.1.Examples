class Dancer extends Performer {
    private double shoeSize;

    public Dancer() {
        super();
        shoeSize = 10.0;
    }

    public Dancer(int size) {
        super();
        shoeSize = size;
    }

    public Dancer(int size, String n, int a, String h, String agent) {
        super(n, a, h, agent);
        shoeSize = size;
    }

    public void dance() {
        System.out.println("Dancing");
    }
    public void selectMusic() {
        System.out.println("Selecting music");
    }
}