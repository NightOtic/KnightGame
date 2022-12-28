class FightTeam {
    private final String name;
    private final CharacterBuild[] characters = new CharacterBuild[3];

    public FightTeam(String name, CharacterBuild character1, CharacterBuild character2, CharacterBuild character3) {
        this.name = name;
        this.characters[0] = character1;
        this.characters[1] = character2;
        this.characters[2] = character3;
    }

    public String getName() {
        return name;
    }

    Double attack() {
        double attack = 0;
        for (CharacterBuild character : characters) {
            attack += character.totalAttack();
        }
        return attack;
    }

    Double defense() {
        double defense = 0;
        for (CharacterBuild character : characters) {
            defense += character.totalDefense();
        }
        return defense;
    }

    Double energy() {
        double energy = 0;
        for (CharacterBuild character : characters) {
            energy += character.getEnergy();
        }
        return energy;
    }

    Double apAttack() {
        double apAttack = 0;
        for (CharacterBuild character : characters) {
            apAttack += character.totalApAttack();
        }
        return apAttack;
    }

    double apDefence() {
        double apDefence = 0;
        for (CharacterBuild character : characters) {
            apDefence += character.totalApDefense();
        }
        return apDefence;
    }
}
