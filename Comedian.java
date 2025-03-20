class Comedian extends Performer {
    private String joke;

    public Comedian() {
        super();
        joke = "Why did the chicken cross the road?";
    }

    public Comedian(String quip) {
        super();
        joke = quip;
    }

    public Comedian(String quip, String n, int a, String h, String agent) {
        super(n, a, h, agent);
        joke = quip;
    }

    public void writeJokes() {
        System.out.println("Writing jokes");
    }
}