package pais.ficticio;

import classe.acessoria.Acessorio;



public class PaisXII extends Home {
    
    private short vitimasTotais;
    private byte taxaDeHomicidio;

    public short getVitimasTotais() {
        return vitimasTotais;
    }

    public void setVitimasTotais(short vitimasTotais) {
        this.vitimasTotais = vitimasTotais;
    }

    public byte getTaxaDeHomicidio() {
        return taxaDeHomicidio;
    }

    public void setTaxaDeHomicidio(byte taxaDeHomicidio) {
        this.taxaDeHomicidio = taxaDeHomicidio;
    }

    public PaisXII() {
        this.taxaDeHomicidio = 63;
    }
    
    public String violencia(){
        
        this.setVitimasTotais(Acessorio.vitimas(this.getPopulacao(), this.getTaxaDeHomicidio()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>VIOLÊNCIA</th>";
        msg += "    <tr>";
        msg += "        <th>Taxa de homicídios</th>";
        msg += "        <td>0." + this.getTaxaDeHomicidio() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Vitimas totais</th>";
        msg += "        <td>" + this.getVitimasTotais() + "</td>";
        msg += "    </tr>";
        msg += "</table>";
        
        return msg;
    }
}
