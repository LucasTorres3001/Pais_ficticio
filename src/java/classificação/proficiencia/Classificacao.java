package classificação.proficiencia;



public class Classificacao {
    
    public static String proficiencia(float a){
        
        String msg = "";
        
        if(a < 0){
            msg += "Inválido! ... :/";
        }
        else if(a >= 0 && a < 48.5){
            msg += "Muito baixa";
        }
        else if(a >= 48.5 && a < 52.5){
            msg += "Baixa";
        }
        else if(a >= 52.5 && a < 57.5){
            msg += "Moderada";
        }
        else if(a >= 57.5 && a < 63){
            msg += "Alta";
        }
        else{
            if(a > 63){
                msg += "Muito alta";
            }
        }
        
        return msg;
    }
}
