class Main {
	private static clasedigito objNumero = new clasedigito();
	private static clasecaracter objcaracter = new clasecaracter();
	private static clasecadena objcadena = new clasecadena();
    public static void main (String[] args){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
         mostrar_menu();
         elegir_opcion();


    }
    public static void mostrar_menu(){

        System.out.print("\t[A] Cargar numero\n");
        System.out.print("\t[B] Verificar si es paridad par\n");
        System.out.print("\t[C] Verificar si es paridad impar\n");
        System.out.print("\t[D] Mostrar el digito mayor del numero\n");
        System.out.print("\t[E] Mostrar el digito menor del numero\n");
        System.out.print("\t[F] Cargar caracter\n");
        System.out.print("\t[G] Preguntar si el caracter es simbolo\n");
        System.out.print("\t[H] Devolver el numero del caracter en la tabla ASCII\n");
        System.out.print("\t[I] Cargar cadena\n");
        System.out.print("\t[J] Cuantos digitos hay en la cadena?\n");
        System.out.print("\t[K] Cuantas letras mayusculas hay en la cadena?\n");
        System.out.print("\t[L] Cuantas letras minusculas hay cadena?\n");
        System.out.print("\t[M] Cuantas vocales hay en la cadena?\n");
        System.out.print("\t[N] Cuantas letras hay en la cadena?\n");
        System.out.print("\t[O] Cuantos simbolos hay en la cadena?\n");
        System.out.print("\t[P] Mostrar dimension de la cadena\n");
        System.out.print("\t[Q] Salir\n");
    }
    public static void limpiar_pantalla (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void elegir_opcion (){
        //java.util.Scanner entrada = new java.util.Scanner(System.in);
        int iNum;
        int k;
        char cOpcion=get_letra("Elija una opcion: ");
        char car;
        int asciiValue=0,ok=0,po=1,digi=1,ma=2,mi=3,voca=4,letr=5,sim=6;
        String cad;
        switch(cOpcion){
            case 'A':
                iNum= get_int("Introduzca un numero: ");
                objNumero.setNumero(iNum);
                break;
            case 'B':objNumero.esparidadpar();break;
            case 'C':objNumero.esparidadimpar();break;
            case 'D':objNumero.mostrar_el_digito_mayor(ok);break;
            case 'E':objNumero.mostrar_el_digito_mayor(po);break;
            case 'F':car=get_char("Introduzca el caracter: ");asciiValue= (int) car; objcaracter.setCaracter(car);break;
            case 'G':objcaracter.essimbolo();break;
            case 'H':objcaracter.valor();break;
            case 'I':cad=get_string("Introduzca la cadena: ");objcadena.setCadena(cad);break;
            case 'J':objcadena.que_hay_en_la_cadena(digi);break;
            case 'K':objcadena.que_hay_en_la_cadena(ma);break;
            case 'L':objcadena.que_hay_en_la_cadena(mi);break;
            case 'M':objcadena.que_hay_en_la_cadena(voca);break;
            case 'N':objcadena.que_hay_en_la_cadena(letr);break;
            case 'O':objcadena.que_hay_en_la_cadena(sim);break;
            case 'P':objcadena.dimension();break;
            case 'Q':
                limpiar_pantalla();
                System.exit(0);
                break;
            default:
                System.out.print("ERROR:: Opción no disponible...");
            break;
        }
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        String sEntrada = entrada.next();
        main(null);
    }
    public static char get_letra (String msg){
        char cChar;
        do{
            java.util.Scanner TextEscanner = new java.util.Scanner(System.in);
            System.out.print(msg);
            String sEntrada = TextEscanner.next();
            sEntrada = sEntrada.toUpperCase();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<65 || (int)cChar>90);

        return cChar;
    }
    public static int get_int (String msg){
        java.util.Scanner iNumero = new java.util.Scanner(System.in);
        System.out.print(msg);
        int iNum = iNumero.nextInt();

        return iNum;
    }
     public static char get_char (String msg){
        char cChar;
        do{
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(msg);
            String sEntrada = entrada.next();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<0 || (int)cChar>127);

        return cChar;
    }
     public static String get_string (String msg){
        java.util.Scanner sCadena = new java.util.Scanner(System.in);
        System.out.print(msg);
        String sCad = sCadena.nextLine();

        return sCad;
}




}