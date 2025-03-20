class Musician extends Performer {
    private String instrument;

    public Musician() {
        super();
        instrument = "Voice";
    }

    public Musician(String inst) {
        super();
        instrument = inst;
    }

    public Musician(String inst, String n, int a, String h, String agent) {
        super(n, a, h, agent);
        instrument = inst;
    }

    public String getInstrument() {
        return instrument;
    }

    public void playInstrument() {
        System.out.println("Playing music");
    }

}