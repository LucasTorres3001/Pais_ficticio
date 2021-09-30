package pais.ficticio;

import classe.acessoria.Acessorio;
import java.text.DecimalFormat;



public class PaisVIII extends Home {
    
    DecimalFormat df = new DecimalFormat();
    
    private double gastosMilitares_bi;
    private float qntdDeArmasACada100Residentes, porcentagemDoPIB_militar;
    private int militaresAtivos;

    public double getGastosMilitares_bi() {
        return gastosMilitares_bi;
    }

    public void setGastosMilitares_bi(double gastosMilitares_bi) {
        this.gastosMilitares_bi = gastosMilitares_bi;
    }

    public float getQntdDeArmasACada100Residentes() {
        return qntdDeArmasACada100Residentes;
    }

    public void setQntdDeArmasACada100Residentes(float qntdDeArmasACada100Residentes) {
        this.qntdDeArmasACada100Residentes = qntdDeArmasACada100Residentes;
    }

    public float getPorcentagemDoPIB_militar() {
        return porcentagemDoPIB_militar;
    }

    public void setPorcentagemDoPIB_militar(float porcentagemDoPIB_militar) {
        this.porcentagemDoPIB_militar = porcentagemDoPIB_militar;
    }

    public int getMilitaresAtivos() {
        return militaresAtivos;
    }

    public void setMilitaresAtivos(int militaresAtivos) {
        this.militaresAtivos = militaresAtivos;
    }

    public PaisVIII() {
        this.qntdDeArmasACada100Residentes = 93.4f;
    }
    
    public String militar(){
        
        this.setPibNominal(Acessorio.pibNominal(this.getPibPerCapita_nominal(), this.getPopulacao()));
        
        this.setMilitaresAtivos(Acessorio.militaresAtivos(this.getPopulacao()));
        this.setPorcentagemDoPIB_militar(4.6f);
        this.setGastosMilitares_bi(Acessorio.gastosMilitares(this.getPibNominal(), this.getPorcentagemDoPIB_militar()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>MILITAR</th>";
        msg += "    <tr>";
        msg += "        <th>Militares ativos</th>";
        msg += "        <td>" + this.getMilitaresAtivos() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Gastos ($ bi.)</th>";
        msg += "        <td>" + df.format(this.getGastosMilitares_bi()) + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>% do PIB</th>";
        msg += "        <td>" + this.getPorcentagemDoPIB_militar() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de armas de fogo a cada 100 residentes</th>";
        msg += "        <td>" + this.getQntdDeArmasACada100Residentes() + "</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
