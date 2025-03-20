class Comedian extends Performer {
    private String joke;

    public Comedian() {
        joke = "Why did the chicken cross the road?";
    }

    public Comedian(String quip) {
        joke = quip;
    }

    public void writeJokes() {
        System.out.println("Writing jokes");
    }
}