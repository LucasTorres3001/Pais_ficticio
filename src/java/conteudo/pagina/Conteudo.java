package conteudo.pagina;

import pais.ficticio.PaisI;
import pais.ficticio.PaisII;
import pais.ficticio.PaisIII;
import pais.ficticio.PaisIV;
import pais.ficticio.PaisIX;
import pais.ficticio.PaisV;
import pais.ficticio.PaisVI;
import pais.ficticio.PaisVII;
import pais.ficticio.PaisVIII;
import pais.ficticio.PaisX;
import pais.ficticio.PaisXI;
import pais.ficticio.PaisXII;



public class Conteudo {
    
    PaisI paisI = new PaisI();
    PaisII paisII = new PaisII();
    PaisIII paisIII = new PaisIII();
    PaisIV paisIV = new PaisIV();
    PaisV paisV = new PaisV();
    PaisVI paisVI = new PaisVI();
    PaisVII paisVII = new PaisVII();
    PaisVIII paisVIII = new PaisVIII();
    PaisIX paisIX = new PaisIX();
    PaisX paisX = new PaisX();
    PaisXI paisXI = new PaisXI();
    PaisXII paisXII = new PaisXII();
    
    public String conteudo(){
        
        String msg = "";
        
        msg += paisI.apresentacao();
        msg += paisII.composicaoEtnica();
        msg += paisIII.demografia();
        msg += paisIV.economia();
        msg += paisV.educacao();
        msg += paisVI.energia();
        msg += paisVII.esportes();
        msg += paisVIII.militar();
        msg += paisIX.others();
        msg += paisX.subdivisoes();
        msg += paisXI.transportes();
        msg += paisXII.violencia();
        
        return msg;
    }
}
