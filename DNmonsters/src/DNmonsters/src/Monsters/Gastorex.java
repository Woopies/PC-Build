package DNmonsters.src.Monsters;

import DNmonsters.src.Monster;

/**
 * Created by kevinschroeder on 08.06.14.
 */
public class Gastorex extends Monster {
    public Gastorex(int level){
        super("Gastorex",level,90,90,35,20,30,20,120,4,100,15,"Aves","Terra");
    }

    @Override
    public void level_up(){
        int i=this.stats.get_exp();
		this.stats.set_lifemax((int)0.1*this.stats.get_lifemax()+(int)(Math.random()*(2)+1));
		this.stats.set_physdmg((int)(Math.random()*(2)+3));
		this.stats.set_physdeff((int)(Math.random()*(2)+1));
		this.stats.set_eledmg((int)(Math.random()*(3-1)+1));
		this.stats.set_eledeff((int)(Math.random()*(4-2)+2));
		this.stats.set_speed((int)(Math.random()*(4-2)+2));
		this.stats.reset_exp();
		this.stats.set_exp(i-this.stats.get_expnext());
		this.stats.set_expnext((int)(this.stats.get_expnext()*(Math.random()+1)));
    }
}
