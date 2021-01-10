class Test{ 
int age; 
int nbrePersonne=3;

                         // String[] name
 public static void main(String name[] ){                // fonction main du classe principal


Tarte foretNoir=new Tarte("foretNoir",2,3);// appel au constructeur qui  prend 2 argument et initialise l'objet de type tarte
Tarte chocolatRoyale=new Tarte(1,4); // 

       chocolatRoyale.ajoutSucreChocolat(0,4); /// appel d'une fonction avec 2 argument dans une objet "tarte"
	   //chocolatRoyale.affiche();                 //// appel d'une fonction sans argument
	   
	   
	   chocolatRoyale=new Tarte("fati");
	   
	   ///chocolatRoyale.affiche();///
	  chocolatRoyale.ajoutSucreChocolat(1,2);
	  //chocolatRoyale.affiche();
	  
	  Tarte foretBlanche=new Tarte("foretBlanche",2,3);
	  //foretBlanche.affiche();
	  
	  
	 Person mangeurTarte=new Person("jilali",18); ////////
	  
	  mangeurTarte.manger(foretNoir); ///// on fait l'appel d'une fonction avec le réference qu'on a crée avec le constructeur // 
 
      mangeurTarte.manger(foretBlanche);                                              ////	  reference.fonction(argument); 


                                                      
}     
                                                              
           
      

}
