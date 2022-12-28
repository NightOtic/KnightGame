class MageCharacter extends CharacterBuild {
    private final Double extraApAttack;

    public MageCharacter(String name, Integer energy, Integer defense, Integer apAttack, Integer apDefense, Double extraApAttack) {
        super(name, energy, 0, defense, apAttack, apDefense);
        this.extraApAttack = extraApAttack;
    }

    @Override
    protected Integer totalApAttack() {
        double sum = getApAttack() + extraApAttack * getApAttack();
        return (int) sum;
    }
}
