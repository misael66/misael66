public class clasecaracter {
    private int caracter;
    //public void claseCaracter(){
    //    this.caracter = ' ';
    //}
    public void setCaracter(char car){
        this.caracter = car;
    }
    public void essimbolo(){
        if((this.caracter>=48 && this.caracter<=57) || (this.caracter>=65 && this.caracter<=90)|| (this.caracter>=97 && this.caracter<=122))
            System.out.println("No es simbolo");
        else System.out.println("Es simbolo");
    }
    public void valor(){
        int valor=(int)this.caracter;
        System.out.println("El valor de este caracter es: " + valor);
    }






}