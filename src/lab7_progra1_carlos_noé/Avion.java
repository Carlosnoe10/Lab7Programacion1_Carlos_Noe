
package lab7_progra1_carlos_noé;


public class Avion {
    public String ModelAir;
    public String nameAir;
    public String CodeAir;
    public int AnioFab;
    public int CapPas;
    public int WeiAir;
    
        public Avion(String ModelAir, String nameAir, String CodeAir, int AnioFab, int CapPas, int WeiAir ){
        this.ModelAir= ModelAir;
        this.nameAir= nameAir;
        this.CodeAir= CodeAir;
        this.AnioFab= AnioFab;
        this.CapPas= CapPas;
        this.WeiAir= WeiAir;
        
        }

    @Override
    public String toString() {
        return "Avion{" + "ModelAir=" + ModelAir + ", nameAir=" + nameAir + ", CodeAir=" + CodeAir + ", AnioFab=" + AnioFab + ", CapPas=" + CapPas + ", WeiAir=" + WeiAir + '}';
    }

    public String getModelAir() {
        return ModelAir;
    }

    public void setModelAir(String ModelAir) {
        this.ModelAir = ModelAir;
    }

    public String getNameAir() {
        return nameAir;
    }

    public void setNameAir(String nameAir) {
        this.nameAir = nameAir;
    }

    public String getCodeAir() {
        return CodeAir;
    }

    public void setCodeAir(String CodeAir) {
        this.CodeAir = CodeAir;
    }

    public int getAnioFab() {
        return AnioFab;
    }

    public void setAnioFab(int AnioFab) {
        this.AnioFab = AnioFab;
    }

    public int getCapPas() {
        return CapPas;
    }

    public void setCapPas(int CapPas) {
        this.CapPas = CapPas;
    }

    public int getWeiAir() {
        return WeiAir;
    }

    public void setWeiAir(int WeiAir) {
        this.WeiAir = WeiAir;
    }
    
        
public static void State(int num){
    if (num==1) {
        System.out.println("despegando,");
    }else if(num==2){
        System.out.println("aterrizando,");
    
    }else if(num==3){
        System.out.println("estacionado.");
}else{
    
}
    
}     
}

