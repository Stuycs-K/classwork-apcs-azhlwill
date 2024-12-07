public class Spearman extends Adventurer{
    private int special;
    private int specialMax;

    public Spearman(String name, int hp){
        super(name,hp);
        special = 6;
        specialMax = 10;
    }

    public String getSpecialName(){
        return "Pierce Stab";
    }

    public int getSpecial(){
        return special;
    }

    public void setSpecial(int n){
        if (n < 0){
            special = 0;
        }
        else if (n > specialMax){
            special = specialMax;
        }
        else{
            special = n;
        }
    }

    public int getSpecialMax(){
        return specialMax;
    }

    public String attack(Adventurer other){
        int damageAmt = 5;
        other.applyDamage(damageAmt);
        return getName() + " stabs " + other.getName() + " with a spear, dealing " + damageAmt + " damage.";
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
        if (getHP() + healAmt > getmaxHP()){
            healAmt = getmaxHP() - getHP();
        }
        setHP(getHP() + healAmt);
        return getName() + " heals themselves for " + healAmt + " HP.";
    }

    public String specialAttack(Adventurer other){
        if (special >= 3){
            int damageAmt = 8;
            other.applyDamage(damageAmt);
            special -= 3;
            return getName() + " uses special attack " + getSpecialName() + " on " + other.getName() + ", dealing " + damageAmt + " damage.";
        }
        else{
            return getName() + " does not have enough energy for " + getSpecialName();
        }
        
    }
}

