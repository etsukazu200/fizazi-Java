class Person  {
	String name;
	String sex;
	
	int age;
	
	public Person(String nom,int agee,String sex){
		
		name=nom;
		age=agee;
		this.sex=sex; ///distinguer entre 2 variable de méme nom l'une de l'atribu et l'autre de l'argument on utilise la réference de l'objet this (moi méme )
		
		
	}
	
	public void manger(Tarte sweat){
		affiche();
		sweat.affiche(); //// appel d'une fonction qui existe dans une autre classe par un objet de méme  type (Tarte)  objet.fonction()/
	}
	
	public void affiche(){ 
			String civilite=null;
			if ( sex=="femme"){
				civilite=" Madamme";
				
			}
			else {
				civilite="Monsieur";
			}
			System.out.println( civilite+" "+name+" "+sex+" de "+age+" "+ " ans dit que le gateaux est delecieux"  );  //ajouter les espaces par + " "
	}
	
}