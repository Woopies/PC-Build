package DNmonsters.src;

public class Skill {
	protected int dmg;
    protected double scale;
    protected int costs;
    protected String name;
    private int skillprecision;
    private double[][] tabelle;



    public Skill(String name,int dmg,double scale,int costs, int skillprecision){
        this.name=name;
        this.dmg=dmg;
        this.scale=scale;
        this.costs=costs;
        this.skillprecision=skillprecision;
        tabelle=new double[18][18];
        tabelle[0]= new double[]{1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 2};
        tabelle[1]= new double[]{2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5};
        tabelle[2]= new double[]{1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5};
        tabelle[3]= new double[]{1, 1, 1, 1, 1, 1, 2, 1, 0.5, 1, 2, 0.5, 1, 1, 1, 1, 1, 1};
        tabelle[4]= new double[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        tabelle[5]= new double[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        tabelle[6]= new double[]{1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 0.5, 2, 0.5, 2, 1, 1, 0.5};
        tabelle[7]= new double[]{1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1};
        tabelle[8]= new double[]{1, 1, 1, 1, 1, 1, 1, 2, 1, 0.5, 2, 1, 1, 1, 1, 2, 1, 1};
        tabelle[9]= new double[]{1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 1};
        tabelle[10]= new double[]{1, 1, 1, 1, 1, 1, 1, 1, 0.5, 2, 1, 1, 1, 1, 1, 0.5, 1, 1};
        tabelle[11]= new double[]{1, 0.5, 1, 2, 1, 1, 2, 2, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 1, 1};
        tabelle[12]= new double[]{1, 1, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 1, 2, 0.5, 1, 1, 2, 1, 1};
        tabelle[13]= new double[]{1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        tabelle[14]= new double[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1};
        tabelle[15]= new double[]{2, 1, 1, 0.5, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        tabelle[16]= new double[]{1, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 1, 1, 2, 2, 0, 1, 1, 1};
        tabelle[17]= new double[]{0.5, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 2, 1, 1, 1, 1, 0.5};


    }

	public void attack (Monster m1, Monster m2){
		
	}

    public double mult(int type, Monster m){
        double mult=1;
        mult=tabelle[type][m.klasse[0].get_klasse()]*tabelle[type][m.klasse[1].get_klasse()];
        return mult;
    }

    public boolean dodge(Monster m1, Monster m2){
        boolean dodge;
        int idodge;
        if ((m1.stats.get_speed()<m2.stats.get_speed()))
            idodge=(int)((m1.stats.get_precision()*0.1-m2.stats.get_dodge()+skillprecision)*0.9);
        else if ((m1.stats.get_speed()==m2.stats.get_speed()))
            idodge=((int)(m1.stats.get_precision()*0.1-m2.stats.get_dodge()+skillprecision));
        else
            idodge=(int)((m1.stats.get_precision()*0.1-m2.stats.get_dodge()+skillprecision)*1.1);
        int tester=(int)(Math.random()*100);
        if (idodge<tester)
            dodge=false;
        else
            dodge=true;
        return dodge;
    }
}
