class BalletDancer extends Dancer {
    private Object balletShoes;

    public BalletDancer(Object balletShoeType) {
        super();
        balletShoes = balletShoeType;
    }

    public BalletDancer(Object balletShoeType, int size) {
        super(size);
        balletShoes = balletShoeType;
    }

    public Object getBalletShoes() {
        return balletShoes;
    }

    public void jete(){
        System.out.println("Performing a jete");
    }
    public void priouette(){
        System.out.println("Performing a pirouette");
    }
}