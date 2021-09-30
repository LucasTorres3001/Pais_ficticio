package pais.ficticio;

import classe.acessoria.Acessorio;



public class PaisVI extends Home {
    
    private int consumoDeEletricidade, geracaoPorTodasAsFontes_GWh, producaoEletrica_GWh, totalRenovavel_GWh;
    private short energiaMediaPerCapita;
    private float renovaveisComoPorcentagemDaGeracaoTotal;

    public int getConsumoDeEletricidade() {
        return consumoDeEletricidade;
    }

    public void setConsumoDeEletricidade(int consumoDeEletricidade) {
        this.consumoDeEletricidade = consumoDeEletricidade;
    }

    public int getGeracaoPorTodasAsFontes_GWh() {
        return geracaoPorTodasAsFontes_GWh;
    }

    public void setGeracaoPorTodasAsFontes_GWh(int geracaoPorTodasAsFontes_GWh) {
        this.geracaoPorTodasAsFontes_GWh = geracaoPorTodasAsFontes_GWh;
    }

    public int getProducaoEletrica_GWh() {
        return producaoEletrica_GWh;
    }

    public void setProducaoEletrica_GWh(int producaoEletrica_GWh) {
        this.producaoEletrica_GWh = producaoEletrica_GWh;
    }

    public int getTotalRenovavel_GWh() {
        return totalRenovavel_GWh;
    }

    public void setTotalRenovavel_GWh(int totalRenovavel_GWh) {
        this.totalRenovavel_GWh = totalRenovavel_GWh;
    }

    public short getEnergiaMediaPerCapita() {
        return energiaMediaPerCapita;
    }

    public void setEnergiaMediaPerCapita(short energiaMediaPerCapita) {
        this.energiaMediaPerCapita = energiaMediaPerCapita;
    }

    public float getRenovaveisComoPorcentagemDaGeracaoTotal() {
        return renovaveisComoPorcentagemDaGeracaoTotal;
    }

    public void setRenovaveisComoPorcentagemDaGeracaoTotal(float renovaveisComoPorcentagemDaGeracaoTotal) {
        this.renovaveisComoPorcentagemDaGeracaoTotal = renovaveisComoPorcentagemDaGeracaoTotal;
    }
    
    public String energia(){
        
        this.setEnergiaMediaPerCapita(Acessorio.energiaMediaPerCapita());
        this.setConsumoDeEletricidade(Acessorio.consumoDeEletricidade(this.getPopulacao(), this.getEnergiaMediaPerCapita()));
        this.setRenovaveisComoPorcentagemDaGeracaoTotal(93.6f);
        this.setGeracaoPorTodasAsFontes_GWh(Acessorio.geracaoPorTodasAsFontes(this.getConsumoDeEletricidade()));
        this.setTotalRenovavel_GWh(Acessorio.totalRenovavel(this.getGeracaoPorTodasAsFontes_GWh(), this.getRenovaveisComoPorcentagemDaGeracaoTotal()));
        this.setProducaoEletrica_GWh(Acessorio.producaoEletrica(this.getGeracaoPorTodasAsFontes_GWh()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>CONSUMO DE ELETRICIDADE</th>";
        msg += "    <tr>";
        msg += "        <th>Consumo de eletricidade</th>";
        msg += "        <td>" + this.getConsumoDeEletricidade() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>População</th>";
        msg += "        <td>" + this.getPopulacao() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Energia média per capita(W)</th>";
        msg += "        <td>" + this.getEnergiaMediaPerCapita() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>PRODUÇÃO DE ELETRICIDADE</th>";
        msg += "    <tr>";
        msg += "        <th>Produção eletrica (GWh)</th>";
        msg += "        <td>" + this.getProducaoEletrica_GWh() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>PRODUÇÃO DE ELETRICIDADE RENOVÁVEL</th>";
        msg += "    <tr>";
        msg += "        <th>Renovaveis como % de geração total</th>";
        msg += "        <td>" + this.getRenovaveisComoPorcentagemDaGeracaoTotal() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Geração por todas as fontes (GWh)</th>";
        msg += "        <td>" + this.getGeracaoPorTodasAsFontes_GWh() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Total renovável (GWh)</th>";
        msg += "        <td>" + this.getTotalRenovavel_GWh() + "</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
