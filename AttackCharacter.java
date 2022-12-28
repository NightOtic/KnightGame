class AttackCharacter extends CharacterBuild {
    private final Double extraAttack;

    public AttackCharacter(String name, Integer energy, Integer attack, Integer defense, Double extraAttack, Integer ApDefense) {
        super(name, energy, attack, defense, 0, ApDefense);
        this.extraAttack = extraAttack;
    }

    @Override
    protected Integer totalAttack() {
        double sum = getAttack() + extraAttack * getAttack();
        return (int) sum;
    }
}