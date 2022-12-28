class CharacterBuild {
    private final String name;
    private final Integer energy;
    private final Integer attack;
    private final Integer defense;
    private final Integer apAttack;
    private final Integer apDefense;

    public CharacterBuild(String name, Integer energy, Integer attack, Integer defense, Integer apAttack, Integer apDefense ) {
        this.name = name;
        this.energy = energy;
        this.attack = attack;
        this.defense = defense;
        this.apAttack = apAttack;
        this.apDefense = apDefense;
    }

    protected Integer totalAttack() {
        return attack;
    }

    protected Double totalDefense() {
        return (double) defense;
    }

    protected Integer totalApAttack() {
        return apAttack;
    }

    protected Double totalApDefense() {
        return (double) apDefense;
    }

    public String getName() {
        return name;
    }


    public Integer getEnergy() {
        return energy;
    }


    public Integer getAttack() {
        return attack;
    }


    public Integer getDefense() {
        return defense;
    }


    public Integer getApAttack() {
        return apAttack;
    }


    public Integer getApDefense() {
        return apDefense;
    }

}
