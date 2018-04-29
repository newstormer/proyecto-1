import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import acm.graphics.*;
import acm.program.*;
public class proyecto extends GraphicsProgram implements ItemListener{
    private JComboBox combo1;
    private JComboBox combo2;
    public String asesinato(String fecha ,String edad ,String como_murio ,String asesino) {
    	
		return ("fecha de asesinato: "+fecha+ "\nfue asesinado a sus " + edad +" años " + como_murio + " \nasesino: " + asesino);
    
    	
    }
   
    public proyecto() {
    	 
    	
    	 UIManager.put("ComboBox.background", new ColorUIResource(247,106,106));
        combo1=new JComboBox();
        combo1.setFont(new Font("Serif", Font.BOLD, 20));
        combo1.setPreferredSize(new Dimension(500, 30));
        combo1.addItem("Escoje");
        combo1.addItem("Amazonas");
        combo1.addItem("Antioquia");
        combo1.addItem("Arauca");
        combo1.addItem("Atlantico");
        combo1.addItem("Bogotá D.C");
        combo1.addItem("Boyaca");
        combo1.addItem("Caldas");
        combo1.addItem("Caquetá");
        combo1.addItem("Cauca");
        combo1.addItem("Cesar");
        combo1.addItem("Choco");
        combo1.addItem("Cordoba");
        combo1.addItem("Cundinamarca");
        combo1.addItem("Guajira");
        combo1.addItem("Guania");
        combo1.addItem("Guaviare");
        combo1.addItem("Huila");
        combo1.addItem("Magdalena");
        combo1.addItem("Meta");
        combo1.addItem("Nariño");
        combo1.addItem("Norte De Santander");
        combo1.addItem("Putumayo");
        combo1.addItem("Quindio");
        combo1.addItem("Risaralda");
        combo1.addItem("San Andres Y Providencia");
        combo1.addItem("Santander");
        combo1.addItem("Sucre");
        combo1.addItem("Tolima");
        combo1.addItem("Valle Del Cauca");
        combo1.addItem("Vaupes");
        combo1.addItem("Vichada");
        
        
      
        combo1.addItemListener(this);}
           

    

    public void itemStateChanged(ItemEvent e) {
    	
        if (combo1.getSelectedItem()=="Amazonas") {
        	UIManager UI= new UIManager();
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
        	  
        	//String Leticia = "<html><body><b style= \"font-size:14;color:black;\">Leticia </b></body></body></html>";
        
        	Object[] municipiosAMAZONAS = {"Territorio","El Encanto","La Chorrera" ,"La Pedrera","La Victoria","Leticia" ,"Mirití-Paraná" ,"Puerto Alegría" ,"Puerto Nariño","Puerto Santander","Tarapacá"};

        	Object s = (Object)JOptionPane.showInputDialog(
        	                    combo1
        	                    ,
        	                    "Escoje Un Muncipio,Ciudad o Corregimiento territorial"
        	                    ,
        	                    "AMAZONAS",
        	                    JOptionPane.PLAIN_MESSAGE,
        	                    null, municipiosAMAZONAS,
        	                    "");
        
        
			if (s=="Leticia") {
				Object[] victimas1 = {"Lindo Mar Galindo Silva", "Jean Carlos Caceres Vergara", "Wilson Galeano Rodriguez"};
				String f = (String)JOptionPane.showInputDialog(
				                    combo1,
				                    "Estos son los asesinatos registrados en el 2017 en Leticia:",
				                    "LETICIA",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="Lindo Mar Galindo Silva") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("30/10/2017","22",", se le propinó una herida letal con un cuchillo a la altura del tórax","primo de 13 años"),
						    "Lindo Mar Galindo Silva",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Jean Carlos Caceres Vergara"){
					JOptionPane.showMessageDialog(combo1,
						    asesinato("01/07/2017", "41" ,", fue hallado con  multiples heridas a la altura de la cabeza y una herida en el flanco izquierdo, al parecer causadas con arma blanca","se desconoce"),
						    "Jean Carlos Caceres Vergara",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Wilson Galeano Rodriguez") {
					JOptionPane.showMessageDialog(combo1,
						    "*01/01/2017 se desconoce datos de la víctima y del asesino",
						    "Wilson Galeano Rodriguez",
						    JOptionPane.PLAIN_MESSAGE);}
			}
			
			if (s=="Puerto Nariño") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "Puerto Nariño",
					    JOptionPane.PLAIN_MESSAGE);
				}
			if(s=="El Encanto") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "El Encanto",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="La Chorrera") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "La Chorrera",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="La Pedrera") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "La Pedrera",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="La Victoria") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "La Victoria",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="Mirití-Paraná") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "Mirití-Paraná",
					    JOptionPane.PLAIN_MESSAGE);
				if (s=="Puerto Alegría") {
					Object[] victimas = {"Robinson Trujillo Cubillos"};
					String f = (String)JOptionPane.showInputDialog(
					                    combo1,
					                    "Estos son los asesinatos registrados en el 2017 en Puerto Alegría:",
					                    "PUERTO ALEGRIA",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    victimas,
					                "");
					if (f=="Robinson Trujillo Cubillos") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("06/11/2017","34",", con un arma blanca durante una discusión","Ismael Perdomo Ramírez(yerno)"),
							    "Robinson Trujillo Cubillos",
							    JOptionPane.PLAIN_MESSAGE);}
				}
				
			}
				if(s=="Puerto Santander") {
					Object[] victimas = {"Camilo Rodriguez Efaiteque","Ernesto Evelio Linares Villanueva","Jesús Eliezer Linares Valdés"};
					String f = (String)JOptionPane.showInputDialog(
					                    combo1,
					                    "Estos son los asesinatos registrados en el 2017 en Puerto Santander:",
					                    "PUERTO ALEGRIA",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    victimas,
					                "");
					if (f=="Camilo Rodriguez Efaiteque") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("23/01/2017","17",",se desconocen las causas del asesinato","Alezander Tafur Trochez"),
							    "Camilo Rodriguez Efaiteque",
							    JOptionPane.PLAIN_MESSAGE);}
					if (f=="Ernesto Evelio Linares Villanueva") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("19/10/2017","23","con un arma de fuego(la victima era venezolana)" , "parrillero(se desconoce)"),
							    "Ernesto Evelio Linares Villanueva",
							    JOptionPane.PLAIN_MESSAGE);}
					if (f=="Jesús Eliezer Linares Valdés") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("19/10/2017","23","con un arma de fuego(la vicitma era venezolana)" , "parrillero(se desconoce)"),
							    "Jesús Eliezer Linares Valdés",
							    JOptionPane.PLAIN_MESSAGE);}}
				if(s=="Tarapacá") {
					JOptionPane.showMessageDialog(combo1,
						    "No se registran asesinatos en el 2017",
						    "Tarapacá",
						    JOptionPane.PLAIN_MESSAGE);}
				}
			
        if (combo1.getSelectedItem()=="Antioquia") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
           Object[] municipiosAntioquia = {"Territorio","Abejorral","Abriaquí","Alejandría","Argelia De María","Amalfi" 
        		   ,"Amagá",".Anorí",".Andes",".Angelópolis",".Angostura",".Anzá",".Arboletes",".Armenia",
        		   ".Apartadó",".Barbosa",".Bello",".Belmira",".Betania",".Betulia",".Briceño",".Buriticá",".Caceres" 
        		   ,".Caicedo",".Caldas",".Campamento",".Cañasgordas",".Caracolí",".Caramanta",".Carolina Del Príncipe",
        		   ".Carepa",".Chigorodó",".Caucasia",".Cisneros",".Ciudad Bolívar",".Cocorná",".Concepción",".Concordia",
        		   ".Dabeiba",".Donmatías",".Ebejicó",".El Bagre",".El Carmen de Viboral",".El Peñol",".El Retiro",".El santuario", ".Entrerríos",
        		   ".Envigado" ,".Fredonia",".Frontino",".Giraldo",".Gómez Plata",".Granada",".Guadalupe",".Guatapé",
        		   ".Heliconia",".Hispania",".Itagüi",".Ituango",".Jardín",
        		   ".Jericó",".La ceja",".La estrella",".La pintada",".La Unión",
        		   ".Liborina",".Maceo",".Marinilla",".Medellin",".Montebello",".Murindó",".Mutatá",
        		   ".Nariño",".Nechí",".Necocli",".Olaya",".Peque",".Pueblorrico",".Puerto Berrío",
        		   ".Puerto Nare",".Puerto Triunfo",".Puerto Valdivia",".Nariño",".Nechí",".Remedios",
        		   ".Rionegro",".Sabanalarga",".Sabaneta",".Salgar",".San Andres De Cuerquita",".San Carlos",".San Francisco",
        		   ".San Jerónimo",".San José De La Montaña",".San Juan De Urabá",".San Luis",".San Pedro De Urabá",".San Pedro De Los Milagros",".San Rafael"
        		   ,".Santa barbara",".Santa Fe De Antioquia",".Santo Domingo",".San Rosa De Osos",".San Vicente",".Segovia",".Sonsón",".Sopetrán",".Támesis",
        		   "Tapartó",".Tarazá",".Tarso",".Titiribi",".Toledo",".Turbo",".Uramita",".Urrao",
        		   ".Remedios",".Valdivia",".Valparaíso",".Venecia","Vegachi",".Vigía Del Fuente",".Yalí","Yarumal",".Yolombó",".Yondó",".Zaragoza"};
          
        	String s = (String)JOptionPane.showInputDialog(
        	                    combo1,
        	                    "Escoje Un Muncipio,Ciudad o Corregimiento territorial"
        	                    ,
        	                    "Antioquia",
        	                    JOptionPane.PLAIN_MESSAGE,
        	                    null, municipiosAntioquia,
        	                    "");
        	
        
			if (s=="Abejorral") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "ABEJORRAL",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Abriaquí") {
				JOptionPane.showMessageDialog(combo1,
					    "Lleva 13 años sin homicidios , puedes creerlo?",
					    "ABRIAQUÍ",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Alejandría") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "ALEJANDRÍA",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Argelia De María") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "ARGELIA",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Amalfi") {
				Object[] victimas = {"Oscar Fernando Arboleda Villegas"};
				String f = (String)JOptionPane.showInputDialog(
				                    combo1,
				                    "Estos son los asesinatos registrados en el 2017 en Amalfi:",
				                    "AMALFI",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas,
				                "");
				if (f=="Oscar Fernando Arboleda Villegas") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("04/05/2017","58",", con un arma de fuego","el presunto asesino podria ser un vecino."),
						    "Oscar Fernando Arboleda Villegas",
						    JOptionPane.PLAIN_MESSAGE);}
			}
			if (s=="Amagá") { //lastimosamente faltaron como 5 casos sueltos
				Object[] victimas = {"","Anonimos","Francisco Javier López Palacios","Luisa Fernada Mejía"};
				String f = (String)JOptionPane.showInputDialog(
				                    combo1,
				                    "Estos son los asesinatos registrados en el 2017 en Amagá:",
				                    "AMAGÁ",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas,
				                "");
				if (f=="Luisa Fernada Mejía") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("19/12/2017","13",", por varias puñaladas en la espalda con un cuchillo","Juan Diego Zapata Martínez"),
						    "Luisa Fernanda Mejía",
						    JOptionPane.PLAIN_MESSAGE);}
				if (f=="Francisco Javier López Palacios") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("18/02/2017","25"," con un arma de fuego","Juan Daniel Flórez Cano"),
						    "Luisa Fernanda Mejía",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Anonimos") {
					JOptionPane.showMessageDialog(combo1,
						    "*Un hombre fue asesinado con una granada el 6 de junio de 2017",
						    "Anonimos",
						    JOptionPane.PLAIN_MESSAGE);}
			}
			if(s=="Medellin") {
				Object[] victimas= {"",""};
				String f =(String)JOptionPane.showInputDialog(combo1,"Estos son los asesinatos registrados en medellin en el 2017",
						"MEDELLIN", JOptionPane.PLAIN_MESSAGE,
						null, victimas,"");
				if (f=="") {
					JOptionPane.showMessageDialog(combo1, 
							asesinato("","","",""),"",JOptionPane.PLAIN_MESSAGE);
				}
					
				}
					
				
			}
        
        }
			
    
			
            
        
    
        
 
   
    public void nombre2(ItemEvent z) {
        if (combo2.getSelectedItem()=="Leticia") {
         println("hola mundo");
         
        }
    }
    
    public void actionPerformed(ActionEvent e) {
    
    	if(e.getActionCommand().equals("cerrar")) {
    		combo2.setVisible(false);
    	}
    	
    }
    public void run() {
      
    	GImage fondo = new GImage("fondo.jpg" );
    	add(fondo);
    	fondo.setSize(1500,1200);
    	//setBackground(Color.BLUE);
    	add(combo1,50,50);
    	// add(new JButton("cerrar"),NORTH);
    	addActionListeners();
  
       
  
        }    
}
    
