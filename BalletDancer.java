class BalletDancer extends Dancer {
    private Object balletShoes;

    public BalletDancer(Object balletShoeType) {
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