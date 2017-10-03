public class clasedigito {
    private int numero;
    public void clasedigito(){
        this.numero = 0;
    }
    public void setNumero(int n){
        this.numero = n;
    }
    public int getNumero(){
        return this.numero;
    }
     public void esparidadpar(){
        int cont=0;
        int num= this.numero ;
        while(num!=0){
        	if(num%10==1)cont++;
        	num/=10;
        }
        if(cont%2!=0)System.out.print("No es paridad par\n");
        else System.out.print("Si es paridad par\n");
    }
    public void esparidadimpar(){
        int cont=0;
        int num= this.numero ;
        while(num!=0){
        	if(num%10==1)cont++;
        	num/=10;
        }
        if(cont%2!=0)System.out.print("Si es paridad impar\n");
        else System.out.print("No es paridad impar\n");
    }
    public void mostrar_el_digito_mayor(int ok){
        int ma=0,me=9;
        int iNum= this.numero ;
        while(iNum!=0){
            if(iNum%10>ma)ma=iNum%10;
            if(iNum%10<me)me=iNum%10;
            iNum/=10;
        }
        if(ok==1)System.out.println("El digito menor es "+ me);
        else System.out.println("El digito mayor es "+ ma);
    }
}