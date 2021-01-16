import java.util.ArrayList ;     //// l'importation de la classe  Arraylist  à partir du package java.util  

class TarteFactory{
	
	public TarteFactory(){
		
		
		
	}
	public Tarte fabriquer (){                                         // programme bricolage
		
		
		Tarte cacke=new Tarte("cackefactory",3,6); /// l'appel du constructeur consiste a lui donné des variable reel;
		return cacke;
		
	}
	
	
	public Tarte[] fabriquer (int nombre){    /// programme souhaité
	Tarte[] tablecacke=new Tarte[nombre];  //
		for ( int i=0;i<nombre;i++){
			
			Tarte kika=new Tarte("kika" +i ,5,8);
			tablecacke[i]=kika;
			
		}
		return tablecacke;
		///Tarte cacke=new Tarte("cackefactory",3,6); /// l'appel du constructeur consiste a lui donné des variable reel;
		///return cacke;	
	}
	 
	 public ArrayList<Tarte> fabrique(int nombre){  //// arraylist est une iste
		 
		 ArrayList<Tarte> listecacke=null;                    /// declaration d'une liste <type d'objet qu'on veut ds la liste >
		 listecacke=new ArrayList()  ;   //// crétiond'un objet de type  "ArrayType" ( liste )
		 
		 for ( int i=0;i<nombre;i++){
			 
			 Tarte hlwa=new Tarte(" TarteArrayList"+i,5,1  );
			 listecacke.add(hlwa) ; 
		 }
		 
	 return listecacke;}
	
	
	
	}