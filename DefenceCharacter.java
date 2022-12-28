class DefenceCharacter extends CharacterBuild {
    private final Double extraDefense;
    private final Double extraApDefense;

    public DefenceCharacter(String name, Integer energy, Integer attack, Integer defense, Double extraDefense, Double extraApDefense, Integer ApAttack, Integer ApDefense) {
        super(name, energy, attack, defense, ApAttack, ApDefense);
        this.extraDefense = extraDefense;
        this.extraApDefense = extraApDefense;
    }

    @Override
    protected Double totalDefense() {
        return getDefense() + getDefense() * extraDefense;
    }

    @Override
    protected Double totalApDefense() {
        return getApDefense() + getApDefense() * extraApDefense;
    }
}