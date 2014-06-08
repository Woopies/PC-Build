package DNmonsters.src.Monsters;

import DNmonsters.src.Monster;

/**
 * Created by kevinschroeder on 08.06.14.
 */
public class Yggdrasil extends Monster {
    public Yggdrasil(int level){
        super("Yggdrasil",level,150,150,20,30,22,28,20,0,100,5,"Flora","Lux");
    }
    @Override
    public void level_up(){
        int i=this.stats.get_exp();
		this.stats.set_lifemax((int)0.1*this.stats.get_lifemax()+(int)(Math.random()*(10-7)+7));
		this.stats.set_physdmg((int)(Math.random()*(3-1)+1));
		this.stats.set_physdeff((int)(Math.random()*(4-2)+2));
		this.stats.set_eledmg((int)(Math.random()*(3-1)+1));
		this.stats.set_eledeff((int)(Math.random()*(4-2)+2));
		this.stats.set_speed((int)(Math.random()*(4-2)+2));
		this.stats.reset_exp();
		this.stats.set_exp(i-this.stats.get_expnext());
		this.stats.set_expnext((int)(this.stats.get_expnext()*(Math.random()+1)));
    }
}
