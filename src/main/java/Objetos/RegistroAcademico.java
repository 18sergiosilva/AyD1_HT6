package Objetos;

public class RegistroAcademico {
    private int a�o;
    private String correlativo;
    
    public RegistroAcademico(int a�o, String correlativo){
        this.a�o = a�o;
        this.correlativo = correlativo;
    }

    public int getA�o() {
        return a�o;
    }

    public void setA�o(int a�o) {
        this.a�o = a�o;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
    
    public boolean cheequearCarnet(){
        String carnet = this.a�o+this.correlativo;
        boolean chequeoTama�o = carnet.length() == 9 && String.valueOf(this.a�o).length()==4;
        if(chequeoTama�o){
            try{
                int chequeoCorrelativo = Integer.parseInt(this.correlativo);
                if(a�o > 1900){
                    return true;
                }else{
                    throw new Exception("A�o no valido.");
                }
            }catch(Exception e){
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    
    
}
