class Dancer extends Performer {
    private double shoeSize;

    public Dancer() {
        shoeSize = 10.0;
    }

    public Dancer(int size) {
        shoeSize = size;
    }

    public void dance() {
        System.out.println("Dancing");
    }
    public void selectMusic() {
        System.out.println("Selecting music");
    }
}