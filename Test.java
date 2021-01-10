class Test{ 
int age; 
int nbrePersonne=3;

                         // String[] name
 public static void main(String name[] ){                // fonction main du classe principal


Tarte foretNoir=new Tarte("foretNoir",2,3);// appel au constructeur qui  prend 2 argument et initialise l'objet de type tarte
Tarte chocolatRoyale=new Tarte(1,4); // 

       chocolatRoyale.ajoutSucreChocolat(0,4); /// appel d'une fonction avec 2 argument dans une objet "tarte"
	   //chocolatRoyale.affiche();                 //// appel d'une fonction sans argument
	   
	   
	   chocolatRoyale=new Tarte("chocolatRoyale");
	   
	   ///chocolatRoyale.affiche();///
	  chocolatRoyale.ajoutSucreChocolat(1,2);
	  //chocolatRoyale.affiche();
	  
	  Tarte foretBlanche=new Tarte("foretBlanche",2,3);
	  //foretBlanche.affiche();
	  
	  
	 Person mangeurTarte=new Person("tibari",18,"homme"); ////////
	  
	  mangeurTarte.manger(foretNoir); ///// on fait l'appel d'une fonction avec le réference qu'on a crée avec le constructeur // 
 
      mangeurTarte.manger(foretBlanche);                                              ////	  reference.fonction(argument);
	  
     Person mangeuseTarte=new Person("fati",18,"femme");
     mangeuseTarte.manger(chocolatRoyale);
	 
     TarteFactory four=new TarteFactory();

                Tarte cacke =four.fabriquer(); 
                 cacke.affiche();	
         Tarte[] kikat=four.fabriquer(8);
		 for( int i=0;i<8;i++){
			 
			 kikat[i].affiche();
		 }

				 
}     
                                                              
           
      

}
