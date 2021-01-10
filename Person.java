class Person  {
	String name;
	int age;
	
	public Person(String nom,int agee){
		
		name=nom;
		age=agee;
		
		
	}
	
	public void manger(Tarte sweat){
	affiche();
	sweat.affiche(); //// appel d'une fonction qui existe dans une autre classe par un objet de méme  type (Tarte)  objet.fonction()/
	}
	public void affiche(){ 
	System.out.println( " Monsieur "+name+" de "+age+ " ans dit que le gateaux est delecieux"  );
	}
	
}