package lab7_progra1_carlos_noé;

import java.util.Scanner;
import java.util.Random;

public class Lab7_Progra1_Carlos_Noé {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner G2HOPE = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese 1. El calamar Pablo y Ingrese 2. Torre de control y 3. salida" );
        int menu = scanner.nextInt();
        if ((menu > 0) && (menu < 3)) {
            switch (menu) {
                case 1:
                    System.out.println("Ingrese el nombre de la seleccion: ");
                    String Team = G2HOPE.nextLine();
                        Seleccion Alemania= new Seleccion("Group E",  "Alemania" , "HansiFlick", "Primero", 26, 0, "Si");
                        Seleccion España= new Seleccion("Group E",  "España" , "LuisPrique", "Tercero", 26, 0, "Si");
                        Seleccion CostaRica= new Seleccion("Group E",  "CostaRica" , "LuisFernandoSuarez", "Cuarto", 26, 0, "No");
                        Seleccion Japon= new Seleccion("Group E",  "Japon" , "HajimeMoriyasu", "Segundo", 26, 0, "No");
                        Seleccion Belgica= new Seleccion("Group F",  "Belgica" , "RobertoMartínez", "Primero", 26, 0, "No");
                        Seleccion Marruecos= new Seleccion("Group F",  "Marruecos" , "WalidRegragui", "Tercero", 26, 0, "No");
                        Seleccion Canada= new Seleccion("Group F",  "Canada" , "JohnHerdman", "Cuarto", 26, 0, "No");
                        Seleccion Croacia= new Seleccion("Group F",  "Croacia" , "JohnHerdman", "Segundo", 26, 0, "No");
                    int Night = (Valid(Team));
                    if (Night!=1) {
                        break;
                    }else if(Night==8){
                        System.out.println("Seleccion invalida");
                    }
                     if (Team.equalsIgnoreCase("Alemania")) {
                         System.out.println(Alemania.getNameSelecc()+" Pertenece al "+Alemania.getNameGroup());
                         System.out.println(" Su director tecnico es "+Alemania.getNameDT());
                         System.out.println("Tiene "+Alemania.getPlayers()+" Jugadores convocados");
                         System.out.println( Alemania.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+Alemania.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ Alemania.getNameSelecc()+"--" );
                         
                    }else if(Team.equalsIgnoreCase("España")){
                         System.out.println(España.getNameSelecc()+"Pertenece al"+España.getNameGroup());
                         System.out.println("Su director tecnico es "+España.getNameDT());
                         System.out.println("Tiene "+España.getPlayers()+"Jugadores convocados");
                         System.out.println( España.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+España.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ España.getNameSelecc()+"--" );
                        
                    }else if(Team.equalsIgnoreCase("CostaRica")){
                         System.out.println(CostaRica.getNameSelecc()+"Pertenece al"+CostaRica.getNameGroup());
                         System.out.println("Su director tecnico es "+CostaRica.getNameDT());
                         System.out.println("Tiene "+CostaRica.getPlayers()+"Jugadores convocados");
                         System.out.println( CostaRica.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+CostaRica.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ CostaRica.getNameSelecc()+"--" );
                        
                    }else if(Team.equalsIgnoreCase("Japon")){
                         System.out.println(Japon.getNameSelecc()+"Pertenece al"+Japon.getNameGroup());
                         System.out.println("Su director tecnico es "+Japon.getNameDT());
                         System.out.println("Tiene "+Japon.getPlayers()+"Jugadores convocados");
                         System.out.println( Japon.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+Japon.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ Japon.getNameSelecc()+"--" );
   
                    }else if(Team.equalsIgnoreCase("Belgica")){
                         System.out.println(Belgica.getNameSelecc()+"Pertenece al"+Belgica.getNameGroup());
                         System.out.println("Su director tecnico es "+Belgica.getNameDT());
                         System.out.println("Tiene "+Belgica.getPlayers()+"Jugadores convocados");
                         System.out.println( Belgica.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+Belgica.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ Belgica.getNameSelecc()+"--" );
                        
                    }else if(Team.equalsIgnoreCase("Marruecos")){
                         System.out.println(Marruecos.getNameSelecc()+"Pertenece al"+Marruecos.getNameGroup());
                         System.out.println("Su director tecnico es "+Marruecos.getNameDT());
                         System.out.println("Tiene "+Marruecos.getPlayers()+"Jugadores convocados");
                         System.out.println( Marruecos.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+Marruecos.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ Marruecos.getNameSelecc()+"--" );
                        
                    }else if(Team.equalsIgnoreCase("Canada")){
                         System.out.println(Canada.getNameSelecc()+"Pertenece al"+Canada.getNameGroup());
                         System.out.println("Su director tecnico es "+Canada.getNameDT());
                         System.out.println("Tiene "+Canada.getPlayers()+"Jugadores convocados");
                         System.out.println( Canada.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+Canada.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ Canada.getNameSelecc()+"--" );
                                
                    }else{
                         System.out.println(Croacia.getNameSelecc()+"Pertenece al"+Croacia.getNameGroup());
                         System.out.println("Su director tecnico es "+Croacia.getNameDT());
                         System.out.println("Tiene "+Croacia.getPlayers()+"Jugadores convocados");
                         System.out.println( Croacia.getWinner()+"ha ganado el mundial");
                         System.out.println("Estaen la "+Croacia.getPlace()+ "Posicion del grupo");
                         System.out.println("--Se ha creado exitosament la seleccion"+ Croacia.getNameSelecc()+"--" );
                    }
                        System.out.println("Juega "+Japon.getNameSelecc()+" contra "+CostaRica.getNameSelecc());
                        Japon.setGoles();
                        CostaRica.setGoles();
                        System.out.println(Japon.getNameSelecc()+ " = " + Japon.getAmounGoals()+ " " +CostaRica.getNameSelecc()+" = "+ CostaRica.getAmounGoals());
                        if (Japon.getAmounGoals()> CostaRica.getAmounGoals()) {
                            System.out.println("Gana "+Japon.getNameSelecc());
                    }else if(Japon.getAmounGoals()== CostaRica.getAmounGoals()){
                            System.out.println("Empate");
                    }else{
                            System.out.println("Gana "+CostaRica.getNameSelecc());  
                    }
                        Belgica.setGoles();
                        Marruecos.setGoles();
                        System.out.println("Juega "+Belgica.getNameSelecc()+" contra "+Marruecos.getNameSelecc());
                        System.out.println(Belgica.getNameSelecc()+ " = " + Belgica.getAmounGoals()+ " " +Marruecos.getNameSelecc()+" = "+ Marruecos.getAmounGoals());
                        if (Belgica.getAmounGoals()> Marruecos.getAmounGoals()) {
                            System.out.println("Gana "+Belgica.getNameSelecc());
                    }else if(Belgica.getAmounGoals()== Marruecos.getAmounGoals()){
                            System.out.println("Empate");
                    }else{
                            System.out.println("Gana "+Marruecos.getNameSelecc());  
                    }
                        Croacia.setGoles();
                        Canada.setGoles();
                        System.out.println("Juega "+Croacia.getNameSelecc()+" contra "+Canada.getNameSelecc());
                        System.out.println(Croacia.getNameSelecc()+ " = " + Croacia.getAmounGoals()+ " " +Canada.getNameSelecc()+" = "+ Canada.getAmounGoals());
                        if (Croacia.getAmounGoals()> Canada.getAmounGoals()) {
                            System.out.println("Gana "+Croacia.getNameSelecc());
                    }else if(Croacia.getAmounGoals()== Canada.getAmounGoals()){
                            System.out.println("Empate");
                    }else{
                            System.out.println("Gana "+Canada.getNameSelecc());  
                    }
                        
                        España.setGoles();
                        Alemania.setGoles();
                        System.out.println("Juega "+España.getNameSelecc()+"contra"+Alemania.getNameSelecc());
                        System.out.println(España.getNameSelecc()+ " = " + España.getAmounGoals()+ " " +Alemania.getNameSelecc()+" = "+ Alemania.getAmounGoals());
                        if (España.getAmounGoals()> Alemania.getAmounGoals()) {
                            System.out.println("Gana "+España.getNameSelecc());
                    }else if(España.getAmounGoals()== Alemania.getAmounGoals()){
                            System.out.println("Empate");
                    }else{
                            System.out.println("Gana "+Alemania.getNameSelecc());  
                    }                        
                        
                        
                    break;
                case 2:
                    System.out.println("--Bienvenido al nuevo  sistema de torre de control--");
                    System.out.println("Ingrese el modelo del avion");
                    String numAvion1 = G2HOPE.nextLine();
                    G2HOPE=new Scanner(System.in);
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese el codigo");
                    G2HOPE=new Scanner(System.in);
                    String codAvion1 = scanner.next();
                    scanner=new Scanner(System.in);
                    G2HOPE=new Scanner(System.in);
                    System.out.println("Ingrese el anio de fabricacion");
                    G2HOPE=new Scanner(System.in);
                    int anioAvion = G2HOPE.nextInt();
                    G2HOPE=new Scanner(System.in);
                    System.out.println("Ingrese la capacidad de pasajeros");
                    int capAvion = scanner.nextInt();
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese el peso");
                    int pesoAvion = scanner.nextInt();
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese el nombre de la aerolinea");
                    String nameAvion = G2HOPE.nextLine();
                    G2HOPE=new Scanner(System.in);
                    System.out.println("--Se ha agregado el avion exitosamente--");
                    Avion Avion1 = new Avion(numAvion1,  nameAvion , codAvion1, anioAvion, capAvion, pesoAvion);
                    
                    
                    System.out.println("Ingrese el modelo del avion");
                    String numAvion12 = scanner.nextLine();
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese el codigo");
                    String codAvion12 = G2HOPE.nextLine();
                    G2HOPE=new Scanner(System.in);
                    System.out.println("Ingrese el anio de fabricacion");
                    G2HOPE=new Scanner(System.in);
                    int anioAvion2 = scanner.nextInt();
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese la capacidad de pasajeros");
                    int capAvion2 = scanner.nextInt();
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese el peso");
                    int pesoAvion2 = scanner.nextInt();
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese el nombre de la aerolinea");
                    String nameAvion2 = scanner.nextLine();
                    scanner=new Scanner(System.in);
                    System.out.println("--Se ha agregado el avion exitosamente--");
                    Avion Avion12 = new Avion(numAvion12,  nameAvion2 , codAvion12, anioAvion2, capAvion2, pesoAvion2);
                    
                    
                    System.out.println("Ingrese el modelo del avion");
                    String numAvion13 = scanner.nextLine();
                    System.out.println("Ingrese el codigo");
                    String codAvion13 = G2HOPE.nextLine();
                    G2HOPE=new Scanner(System.in);
                    System.out.println("Ingrese el anio de fabricacion");
                    G2HOPE=new Scanner(System.in);
                    scanner=new Scanner(System.in);
                    int anioAvion3 = scanner.nextInt();
                    System.out.println("Ingrese la capacidad de pasajeros");
                    scanner=new Scanner(System.in);
                    int capAvion3 = scanner.nextInt();
                    System.out.println("Ingrese el peso");
                    scanner=new Scanner(System.in);
                    int pesoAvion3 = scanner.nextInt();
                    System.out.println("Ingrese el nombre de la aerolinea");
                    scanner=new Scanner(System.in);
                    String nameAvion3 = scanner.nextLine();
                    System.out.println("--Se ha agregado el avion exitosamente--");
                    Avion Avion13 = new Avion(numAvion13,  nameAvion3 , codAvion13, anioAvion3, capAvion3, pesoAvion3);
                    
                    int estado;
                    scanner=new Scanner(System.in);
                    System.out.println("Desea cambiarle el estado del avion 1=si, 2=no");
                    int estade=G2HOPE.nextInt();
                    switch(estade){
                        case 1: 
                            System.out.println("Aviones Disponibles");
                            System.out.println("1."+Avion1.getModelAir());
                            System.out.println("2."+Avion12.getModelAir());
                            System.out.println("3."+Avion13.getModelAir());
                            System.out.println("Ingrese el numero del avion que desea cambiar el estado");
                            int Camb=G2HOPE.nextInt();
                                switch(Camb){
                                    case 1:
                                        System.out.println("1.Despegado");
                                        System.out.println("2.Aterrizado");
                                        System.out.println("3.Estacionado");
                                        estado=scanner.nextInt();
                                        if (estado==1) {
                                            System.out.println("--"+Avion1.getModelAir()+" esta despegando");
                                        }else if(estado==2){
                                            System.out.println("--"+Avion1.getModelAir()+" esta aterrizando");
                                        }else if(estado==3){
                                            System.out.println("--"+Avion1.getModelAir()+" esta estacionado");
                                        }
                                        else{
                                            System.out.println("Ingrese el numero correctamente"+"--"+Avion1.getModelAir()+" esta estacionado" );
                                        }
                                    case 2:
                                        System.out.println("1.Despegado");
                                        System.out.println("2.Aterrizado");
                                        System.out.println("3.Estacionado");
                                        estado=scanner.nextInt();
                                        if (estado==1) {
                                            System.out.println("--"+Avion12.getModelAir()+" esta despegando");
                                        }else if(estado==2){
                                            System.out.println("--"+Avion12.getModelAir()+" esta aterrizando");
                                        }else if(estado==3){
                                            System.out.println("--"+Avion12.getModelAir()+" esta estacionado");
                                        }
                                        else{
                                            System.out.println("Ingrese el numero correctamente"+"--"+Avion12.getModelAir()+" esta estacionado" );
                                        }
                                        case 3:
                                        System.out.println("1.Despegado");
                                        System.out.println("2.Aterrizado");
                                        System.out.println("3.Estacionado");
                                        estado=scanner.nextInt();
                                        if (estado==1) {
                                            System.out.println("--"+Avion13.getModelAir()+" esta despegando");
                                        }else if(estado==2){
                                            System.out.println("--"+Avion13.getModelAir()+" esta aterrizando");
                                        }else if(estado==3){
                                            System.out.println("--"+Avion13.getModelAir()+" esta estacionado");
                                        }
                                        else{
                                            System.out.println("Ingrese el numero correctamente"+"--"+Avion13.getModelAir()+" esta estacionado" );
                                        }    
                                        default: System.out.println("Ingrese la variable correctamente ");
                                            System.out.println("El numero no es valido");
                                        System.out.println("Desea cambiarle el estado del avion 1=si, 2=no");
                                        estade=G2HOPE.nextInt();
                                        break;
                    }
                        case 2:
                            break;
                            
                        default:
                            System.out.println("Ingrese un valor correcto");
                            
                    }        
            

                    break;
                case 3:
                    break;

            }
            System.out.println("Bienvenido");
            System.out.println("Ingrese 1.El calamar Pablo y Ingrese 2.Torre de control" );
            menu = scanner.nextInt();

        } else {
            System.out.println("Ingrese un Numerico de caracter entero o dentro del rango");
            
        }
    }

    
    
    
    public static int Valid(String Selecc1) {
        String Selecciones[] = new String[8];
        int Valid = 0;
        Selecciones[0] = "España";
        Selecciones[1] = "Alemania";
        Selecciones[2] = "CostaRica";
        Selecciones[3] = "Japon";
        Selecciones[4] = "Belgica";
        Selecciones[5] = "Croacia";
        Selecciones[6] = "Canada";
        Selecciones[7] = "Marruecos";
        System.out.println(Selecciones.length);
        for (int i = 0; i < Selecciones.length; i++) {
            if (Selecc1.equalsIgnoreCase(Selecciones[i])) {
                Valid = 1;
                return Valid;
            } else {
                Valid = 0;
            }

        }
        return Valid;
    }

}

