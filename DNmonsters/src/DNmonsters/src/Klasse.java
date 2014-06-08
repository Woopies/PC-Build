package DNmonsters.src;

public class Klasse {
	private int klasse;
	public void set_Klasse(String s){
			if( s.equals("Lux")){
			 klasse=9;}
			else if (s.equals("Nox")){
				klasse=10;
			}
			else if(s.equals("Luxdubia")){
				klasse=11;
			}
			else if(s.equals("Pyro")){
				klasse=12;
			}
			else if(s.equals("Aqua")){
				klasse=13;
			}
			else if(s.equals("Aero")){
				klasse=14;
			}
			else if(s.equals("Terra")){
				klasse=15;
			}
			else if(s.equals("Toxi")){
				klasse=16;
			}
			else if(s.equals("Elektro")){
				klasse=17;
			}
			else if(s.equals("Kryo")){
				klasse=18;
			}
			if(s.equals("Mammalia")){
				klasse=1;
			}
			else if (s.equals("Reptilia")){
				klasse=2;
			}
			else if (s.equals("Aves")){
				klasse=3;
			}
			else if (s.equals("Arthropoda")){
				klasse=4;
			}
			else if (s.equals("Amphibia")){
				klasse=5;
			}
			else if(s.equals("Pisces")){
				klasse=6;
			}
			else if(s.equals("Flora")){
				klasse=7;
			}
			else if(s.equals("Mutant")){
				klasse=8;
			}
 }
	
	public int get_klasse(){
		return klasse;
	}
}
