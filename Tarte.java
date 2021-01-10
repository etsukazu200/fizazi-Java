class Tarte {
	int quantiteSucre=1   ;  //// tt variabe commence par muniscule et la séparation  des noms se fait par majuscule
	int quantiteChocolat=4; /// toute classe contient un constructeur qui initialise la classe , ( phase d'initialisation )
	int age;
	String name;
	
	
	public Tarte(int sucre,int chocolat){
			
		ajoutSucreChocolat(sucre,chocolat);
			
	}
	
	public Tarte(String nom){                             // tout les constructeurs auront le mm nom de la classe "Tarte"
	
	name=nom;
	
	}
	public Tarte(String nom,int sucre,int chocolat){
		name=nom;
		quantiteSucre=sucre;
		quantiteChocolat=chocolat;
		
	}
	
	public void ajoutSucreChocolat(int a,int b){
		quantiteSucre=quantiteSucre+a;
		quantiteChocolat=quantiteChocolat+b;
			
	}
	
	public void affiche(){
		System.out.println(" sucre:"+quantiteSucre+" "+"chocolat:"+quantiteChocolat+" "+"nom:"+name );

	}
		
}