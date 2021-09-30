package pais.ficticio;

import java.text.DecimalFormat;



public class PaisII extends Home {
    
    DecimalFormat df = new DecimalFormat();
    
    private String popAmerindia;
    private float popAmarela, popBranca, popMulata, popNegra;
    private float cabeloBranco, cabeloCastanho, cabeloLoiro, cabeloPreto, ruivos;
    private float olhosCastanhos, olhosCinzas, olhosAzuisVerdes, olhosPretos;

    public String getPopAmerindia() {
        return popAmerindia;
    }

    public void setPopAmerindia(String popAmerindia) {
        this.popAmerindia = popAmerindia;
    }

    public float getPopAmarela() {
        return popAmarela;
    }

    public void setPopAmarela(float popAmarela) {
        this.popAmarela = popAmarela;
    }

    public float getPopBranca() {
        return popBranca;
    }

    public void setPopBranca(float popBranca) {
        this.popBranca = popBranca;
    }

    public float getPopMulata() {
        return popMulata;
    }

    public void setPopMulata(float popMulata) {
        this.popMulata = popMulata;
    }

    public float getPopNegra() {
        return popNegra;
    }

    public void setPopNegra(float popNegra) {
        this.popNegra = popNegra;
    }

    public float getCabeloBranco() {
        return cabeloBranco;
    }

    public void setCabeloBranco(float cabeloBranco) {
        this.cabeloBranco = cabeloBranco;
    }

    public float getCabeloCastanho() {
        return cabeloCastanho;
    }

    public void setCabeloCastanho(float cabeloCastanho) {
        this.cabeloCastanho = cabeloCastanho;
    }

    public float getCabeloLoiro() {
        return cabeloLoiro;
    }

    public void setCabeloLoiro(float cabeloLoiro) {
        this.cabeloLoiro = cabeloLoiro;
    }

    public float getCabeloPreto() {
        return cabeloPreto;
    }

    public void setCabeloPreto(float cabeloPreto) {
        this.cabeloPreto = cabeloPreto;
    }

    public float getRuivos() {
        return ruivos;
    }

    public void setRuivos(float ruivos) {
        this.ruivos = ruivos;
    }

    public float getOlhosCastanhos() {
        return olhosCastanhos;
    }

    public void setOlhosCastanhos(float olhosCastanhos) {
        this.olhosCastanhos = olhosCastanhos;
    }

    public float getOlhosCinzas() {
        return olhosCinzas;
    }

    public void setOlhosCinzas(float olhosCinzas) {
        this.olhosCinzas = olhosCinzas;
    }

    public float getOlhosAzuisVerdes() {
        return olhosAzuisVerdes;
    }

    public void setOlhosAzuisVerdes(float olhosAzuisVerdes) {
        this.olhosAzuisVerdes = olhosAzuisVerdes;
    }

    public float getOlhosPretos() {
        return olhosPretos;
    }

    public void setOlhosPretos(float olhosPretos) {
        this.olhosPretos = olhosPretos;
    }

    public PaisII() {
        this.popAmarela = 8.6f;
        this.popAmerindia = "0.1";
        this.popBranca = 80.4f;
        this.popMulata = 9.55f;
        this.popNegra = 1.35f;
    }
    
    public String composicaoEtnica(){
        
        this.setCabeloCastanho(42.4f);
        this.setCabeloPreto(22.6f);
        this.setCabeloBranco(17.3f);
        this.setCabeloLoiro(14.5f);
        this.setRuivos(3.2f);
        this.setOlhosCastanhos(50.6f);
        this.setOlhosCinzas(20.4f);
        this.setOlhosAzuisVerdes(18.4f);
        this.setOlhosPretos(10.6f);
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>COR DA PELE</th>";
        msg += "    <tr>";
        msg += "        <th>Amarelos</th>";
        msg += "        <td>" + this.getPopAmarela() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Ameríndios</th>";
        msg += "        <td>" + this.getPopAmerindia() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Brancos</th>";
        msg += "        <td>" + this.getPopBranca() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Negros</th>";
        msg += "        <td>" + this.getPopNegra() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Pardos(cafuzo e mulato)</th>";
        msg += "        <td>" + this.getPopMulata() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>COR DO CABELO</th>";
        msg += "    <tr>";
        msg += "        <th>Cabelos castanhos(claro e escuro)</th>";
        msg += "        <td>" + this.getCabeloCastanho() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Cabelos preto</th>";
        msg += "        <td>" + this.getCabeloPreto() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Cabelos brancos</th>";
        msg += "        <td>" + this.getCabeloBranco() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Cabelos loiros</th>";
        msg += "        <td>" + this.getCabeloLoiro() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Cabelos ruivos</th>";
        msg += "        <td>" + this.getRuivos() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>COR DOS OLHOS</th>";
        msg += "    <tr>";
        msg += "        <th>Olhos castanhhos(claro e escuro)</th>";
        msg += "        <td>" + this.getOlhosCastanhos() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Olhos cinza</th>";
        msg += "        <td>" + this.getOlhosCinzas() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Olhos azuis e verdes</th>";
        msg += "        <td>" + this.getOlhosAzuisVerdes() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Olhos preto</th>";
        msg += "        <td>" + this.getOlhosPretos() + " %</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
