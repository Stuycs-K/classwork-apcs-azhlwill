public class Spearman extends Adventurer{
    private int energy;
    private int energyMax;

    public Spearman(String name, int hp){
        super(name,hp);
        energy = 6;
        energyMax = 10;
    }

    public String getSpecialName(){
        return "Energy";
    }

    public int getSpecial(){
        return energy;
    }

    public void setSpecial(int n){
        if (n < 0){
            energy = 0;
        }
        else if (n > energyMax){
            energy = energyMax;
        }
        else{
            energy = n;
        }
    }

    public int getSpecialMax(){
        return energyMax;
    }

    public String attack(Adventurer other){
        int damageAmt = 5;
        setSpecial(getSpecial() + 1);
        other.applyDamage(damageAmt);
        return getName() + " stabs " + other.getName() + " with a spear, dealing " + damageAmt + " damage while restoring 1 energy.";
    }

    public String support(Adventurer other){
        int healAmt = 4;
        if (other.getHP() + healAmt > other.getmaxHP()){
            healAmt = other.getmaxHP() - other.getHP(); // heals them to max but not over
        }
        other.setHP(other.getHP() + healAmt);
        return getName() + " heals " + other.getName() + " for " + healAmt + " HP.";
    }

    public String support(){
        int healAmt = 4;
        setSpecial(getSpecial() + 2);
        if (getHP() + healAmt > getmaxHP()){
            healAmt = getmaxHP() - getHP();
        }
        setHP(getHP() + healAmt);
        return getName() + " heals themselves for " + healAmt + " HP and restores 2 energy.";
    }

    public String specialAttack(Adventurer other){
        if (energy >= 3){
            int damageAmt = 8;
            other.applyDamage(damageAmt);
            energy -= 3;
            return getName() + " uses special attack " + getSpecialName() + " on " + other.getName() + ", dealing " + damageAmt + " damage.";
        }
        else{
            return getName() + " tries to use " + getSpecialName() + " on " + other.getName() + ", but does not have enough energy.";
        }

    }
}
