package DNmonsters.src.Skills;

import DNmonsters.src.Monster;
import DNmonsters.src.Skill;

/**
 * Created by nicspeed on 08.06.2014.
 */
public class Stochern extends Skill{
    public Stochern(){
        super("Stochern",3,0.2,5,90);
    }
    @Override
    public void attack(Monster m1,Monster m2){
        int quantity=(int)(Math.random()*3+3);
        int c=1;
        while(c<=quantity){
            if (super.dodge(m1, m2)==false)
            {
                int abzug=(int)((dmg+m1.stats.get_eledmg()*scale+Math.random()*5-2)*super.mult(3,m2));
                    m2.stats.set_life(-abzug);
                c++;
            }
        }
    }
}

