class FightSimulator {
    static void fight(FightTeam fightTeam1, FightTeam fightTeam2) {
        double team2Energy = attack(fightTeam1, fightTeam2);
        double team1Energy = attack(fightTeam2, fightTeam1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Win Team " + fightTeam1.getName() + " with advantage " + energyDiff + " energy");
        } else if (energyDiff < 0) {
            System.out.println("Win Team " + fightTeam2.getName() + " with advantage " + (-energyDiff) + " energy");
        } else {
            System.out.println("Draw, Both teams get " + team1Energy + " energy");
        }
    }

    private static double attack(FightTeam attacker, FightTeam defender) {
        double energy = defender.energy();
        double attackPower = attacker.attack() - defender.defense();
        double apPower = attacker.apAttack() - defender.apDefence();

        energy -= Math.max(0, apPower);
        energy -= Math.max(0, attackPower);
        return energy;
    }
}