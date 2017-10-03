public class clasecadena {
    private String cadena;
    public void clasecadena(){
        this.cadena = "";
    }
    public void setCadena(String cad){
        this.cadena = cad;
    }
    public void dimension(){
        System.out.println("El tamaño de la cadena es "+(this.cadena).length());
    }
    public void que_hay_en_la_cadena(int mm){
        int dig=0,lma=0,lmi=0,voc=0,let=0,simb=0;
        for(int i=0;i<this.cadena.length();++i){
            if(this.cadena.charAt(i)>='0' && this.cadena.charAt(i)<='9')dig++;
            if(this.cadena.charAt(i)>='A' && this.cadena.charAt(i)<='Z'){
                lma++; let++;
            }
            if(this.cadena.charAt(i)>='a' && this.cadena.charAt(i)<='z'){
                lmi++; let++;
            }else
             if(this.cadena.charAt(i)=='a' || this.cadena.charAt(i)=='e' || this.cadena.charAt(i)=='i' || this.cadena.charAt(i)=='o' || this.cadena.charAt(i)=='u')
                voc++;
             else if(this.cadena.charAt(i)=='A' || this.cadena.charAt(i)=='E' || this.cadena.charAt(i)=='I' || this.cadena.charAt(i)=='O' || this.cadena.charAt(i)=='U')
                      voc++;
                    else simb++;
        }
        if(mm==1)System.out.println("Hay "+dig +" digitos en la cadena");
        else if(mm==2)System.out.println("Hay "+ lma +" letras mayuscalas en la cadena");
        else if(mm==3)System.out.println("Hay "+ lmi +" letras minusculas en la cadena");
        else if(mm==4)System.out.println("Hay "+ voc +" vocales en la cadena");
        else if(mm==5)System.out.println("Hay "+ let +" letras en la cadena");
        else if(mm==6)System.out.println("Hay "+ simb +" simbolos en la cadena");
    }

}