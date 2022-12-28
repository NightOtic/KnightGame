class Game {
    public static void main(String[] args) {
        AttackCharacter character1 = new AttackCharacter("Wojtek", 100, 100, 150, 0.2, 70);
        MageCharacter character2 = new MageCharacter("Michal", 125, 150, 140, 30, 0.1);
        DefenceCharacter character3 = new DefenceCharacter("Daniel", 150, 0, 130, 0.4, 0.4, 0, 20);
        AttackCharacter character4 = new AttackCharacter("Marek", 100, 130, 120, 0.5, 40);
        MageCharacter character5 = new MageCharacter("Antoni", 190, 140, 110, 60, 0.6);
        DefenceCharacter character6 = new DefenceCharacter("Zygmunt", 220, 150, 100, 0.7, 0.7, 20, 100);

        FightTeam fightTeam1 = new FightTeam("Fight Team One", character1, character2, character3);
        FightTeam fightTeam2 = new FightTeam("Fight Team Two", character4, character5, character6);
        FightSimulator.fight(fightTeam1, fightTeam2);
    }
}