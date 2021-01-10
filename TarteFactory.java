class TarteFactory{
	
	public TarteFactory(){
		
		
		
	}
	public Tarte fabriquer (){                                         // programme bricolage
		
		
		Tarte cacke=new Tarte("cackefactory",3,6); /// l'appel du constructeur consiste a lui donné des variable reel;
		return cacke;
		
	}
	
	
	public Tarte[] fabriquer (int nombre){    /// programme souhaité
	Tarte[] tablecacke=new Tarte[nombre];
		for ( int i=0;i<nombre;i++){
			
			Tarte kika=new Tarte("kika" +i ,5,8);
			tablecacke[i]=kika;
			
		}
		return tablecacke;
		///Tarte cacke=new Tarte("cackefactory",3,6); /// l'appel du constructeur consiste a lui donné des variable reel;
		///return cacke;
		
	}
	}