package DNmonsters.src;

public class Monster {
	public Stats stats;
	public int[] skills;
	public Klasse klasse[]=new Klasse[2];
    public String name;

    public Monster(String name,int level,int lifemax, int life, int physdmg, int physdeff, int eledmg, int eledeff,int speed, int dodge,int expnext,int precision,String Klasse1,String Klasse2){
        this.name=name;
        stats.set_eledeff(eledeff);
        stats.set_dodge(dodge);
        stats.set_eledmg(eledmg);
        stats.set_physdmg(physdmg);
        stats.set_precision(precision);
        stats.set_lifemax(lifemax);
        stats.set_life(life);
        stats.set_physdeff(physdeff);
        stats.set_speed(speed);
        klasse[1].set_Klasse(Klasse1);
        klasse[2].set_Klasse(Klasse2);
        int i=1;
        while (level>i){
            level_up();
            i++;
        }
    }
    public void level_up(){}
}
