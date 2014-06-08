package DNmonsters.src.Skills;

import DNmonsters.src.Monster;
import DNmonsters.src.Skill;

/**
 * Created by kevinschroeder on 08.06.14.
 */
public class Verwurzeln extends Skill {

    public Verwurzeln(){
        super("Verwurzeln",0,1.5,"eledeff",10,0);
    }
    @Override
    public void attack(Monster m1,Monster m2){
        m1.stats.set_reg((int)(10+m1.stats.get_eledeff()*scale));
        m1.stats.set_energy(-costs);
    }
}
