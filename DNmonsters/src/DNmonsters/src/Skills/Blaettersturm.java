package DNmonsters.src.Skills;

import DNmonsters.src.Monster;
import DNmonsters.src.Skill;

/**
 * Created by kevinschroeder on 08.06.14.
 */
public class Blaettersturm extends Skill{
    public Blaettersturm(){
        super("Blättersturm",2,0.2,7,95);
    }
    @Override
    public void attack(Monster m1,Monster m2){
        int quantity=(int)(Math.random()*5+5);
        int c=1;
        while(c<=quantity){
            if (super.dodge(m1, m2)==false)
            {
                int abzug=(int)((dmg+m1.stats.get_eledmg()*scale+Math.random()*2-1)*super.mult(7,m2));
                m2.stats.set_life(-abzug);
            c++;
            }
        }
    }
}
