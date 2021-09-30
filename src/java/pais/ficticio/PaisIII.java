package pais.ficticio;

import classe.acessoria.Acessorio;
import java.text.DecimalFormat;


public class PaisIII extends Home {
    
    DecimalFormat df = new DecimalFormat();
    
    private String crescPopulacional, taxaDeGravidezNaAdolescencia;
    private float indiceDeMortalidade, indiceDeMortalidadeInfantil, indiceDaNatalidade, popFeminina, popIdosa, popJovem, popMasculina;
    private float espectativaDeVidaFeminina, espectativaDeVidaMasculina, espectativaDeVidaGeral, popUrbana;
    private float alfabetizacaoFeminina, alfabetizacaoMasculina, taxaDeAlfabetizacao;
    private byte popAdulta;

    public String getCrescPopulacional() {
        return crescPopulacional;
    }

    public void setCrescPopulacional(String crescPopulacional) {
        this.crescPopulacional = crescPopulacional;
    }

    public String getTaxaDeGravidezNaAdolescencia() {
        return taxaDeGravidezNaAdolescencia;
    }

    public void setTaxaDeGravidezNaAdolescencia(String taxaDeGravidezNaAdolescencia) {
        this.taxaDeGravidezNaAdolescencia = taxaDeGravidezNaAdolescencia;
    }

    public float getIndiceDeMortalidade() {
        return indiceDeMortalidade;
    }

    public void setIndiceDeMortalidade(float indiceDeMortalidade) {
        this.indiceDeMortalidade = indiceDeMortalidade;
    }

    public float getIndiceDeMortalidadeInfantil() {
        return indiceDeMortalidadeInfantil;
    }

    public void setIndiceDeMortalidadeInfantil(float indiceDeMortalidadeInfantil) {
        this.indiceDeMortalidadeInfantil = indiceDeMortalidadeInfantil;
    }

    public float getIndiceDaNatalidade() {
        return indiceDaNatalidade;
    }

    public void setIndiceDaNatalidade(float indiceDaNatalidade) {
        this.indiceDaNatalidade = indiceDaNatalidade;
    }

    public float getPopFeminina() {
        return popFeminina;
    }

    public void setPopFeminina(float popFeminina) {
        this.popFeminina = popFeminina;
    }

    public float getPopIdosa() {
        return popIdosa;
    }

    public void setPopIdosa(float popIdosa) {
        this.popIdosa = popIdosa;
    }

    public float getPopJovem() {
        return popJovem;
    }

    public void setPopJovem(float popJovem) {
        this.popJovem = popJovem;
    }

    public float getPopMasculina() {
        return popMasculina;
    }

    public void setPopMasculina(float popMasculina) {
        this.popMasculina = popMasculina;
    }

    public float getEspectativaDeVidaFeminina() {
        return espectativaDeVidaFeminina;
    }

    public void setEspectativaDeVidaFeminina(float espectativaDeVidaFeminina) {
        this.espectativaDeVidaFeminina = espectativaDeVidaFeminina;
    }

    public float getEspectativaDeVidaMasculina() {
        return espectativaDeVidaMasculina;
    }

    public void setEspectativaDeVidaMasculina(float espectativaDeVidaMasculina) {
        this.espectativaDeVidaMasculina = espectativaDeVidaMasculina;
    }

    public float getEspectativaDeVidaGeral() {
        return espectativaDeVidaGeral;
    }

    public void setEspectativaDeVidaGeral(float espectativaDeVidaGeral) {
        this.espectativaDeVidaGeral = espectativaDeVidaGeral;
    }

    public float getPopUrbana() {
        return popUrbana;
    }

    public void setPopUrbana(float popUrbana) {
        this.popUrbana = popUrbana;
    }

    public float getAlfabetizacaoFeminina() {
        return alfabetizacaoFeminina;
    }

    public void setAlfabetizacaoFeminina(float alfabetizacaoFeminina) {
        this.alfabetizacaoFeminina = alfabetizacaoFeminina;
    }

    public float getAlfabetizacaoMasculina() {
        return alfabetizacaoMasculina;
    }

    public void setAlfabetizacaoMasculina(float alfabetizacaoMasculina) {
        this.alfabetizacaoMasculina = alfabetizacaoMasculina;
    }

    public float getTaxaDeAlfabetizacao() {
        return taxaDeAlfabetizacao;
    }

    public void setTaxaDeAlfabetizacao(float taxaDeAlfabetizacao) {
        this.taxaDeAlfabetizacao = taxaDeAlfabetizacao;
    }

    public byte getPopAdulta() {
        return popAdulta;
    }

    public void setPopAdulta(byte popAdulta) {
        this.popAdulta = popAdulta;
    }

    public PaisIII() {
        this.crescPopulacional = "0.12";
        this.indiceDeMortalidade = 5.25f;
        this.indiceDeMortalidadeInfantil = 1.44f;
        this.indiceDaNatalidade = 5.37f;
        this.popAdulta = 66;
        this.popFeminina = 49.5f;
        this.popIdosa = 16.3f;
        this.popJovem = 17.7f;
        this.popMasculina = 50.5f;
        this.popUrbana = 90.8f;
        this.alfabetizacaoFeminina = 98.8f;
        this.alfabetizacaoMasculina = 99.3f;
        this.taxaDeGravidezNaAdolescencia = "6 por 1.000 mulheres";
    }
    
    public String demografia(){
        
        this.setEspectativaDeVidaFeminina(83.7f);
        this.setEspectativaDeVidaMasculina(80.4f);
        this.setEspectativaDeVidaGeral(Acessorio.espectativaDeVidaGeral(this.getEspectativaDeVidaFeminina(), this.getEspectativaDeVidaMasculina()));
        this.setTaxaDeAlfabetizacao(Acessorio.taxaDeAlfabetizacao(this.getAlfabetizacaoFeminina(), this.getAlfabetizacaoMasculina()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>DEMOGRAFIA</th>";
        msg += "    <tr>";
        msg += "        <th>Índice de crescimento populacional anual (%)</th>";
        msg += "        <td>" + this.getCrescPopulacional() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Índice de mortalidade</th>";
        msg += "        <td>" + this.getIndiceDeMortalidade() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Índice de mortalidade infantil</th>";
        msg += "        <td>" + this.getIndiceDeMortalidadeInfantil() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Índice de natalidade</th>";
        msg += "        <td>" + this.getIndiceDaNatalidade() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Taxa de gravidez na adolescencia</th>";
        msg += "        <td>" + this.getTaxaDeGravidezNaAdolescencia() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>POPULAÇÃO POR SEXO</th>";
        msg += "    <tr>";
        msg += "        <th>População feminina</th>";
        msg += "        <td>" + this.getPopFeminina() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>População masculina</th>";
        msg += "        <td>" + this.getPopMasculina() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>ALFABETIZAÇÃO</th>";
        msg += "    <tr>";
        msg += "        <th>Taxa de alfabetização(total)</th>";
        msg += "        <td><strong>" + this.getTaxaDeAlfabetizacao() + " %</strong></td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Alfabetização masculina</th>";
        msg += "        <td>" + this.getAlfabetizacaoMasculina() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Alfabetização feminina</th>";
        msg += "        <td>" + this.getAlfabetizacaoFeminina() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>FAIXA ETÁRIA</th>";
        msg += "    <tr>";
        msg += "        <th>população de 0 - 18 anos</th>";
        msg += "        <td>" + this.getPopJovem() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>população de 19 - 60 anos</th>";
        msg += "        <td>" + this.getPopAdulta() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>população acima de 60 anos</th>";
        msg += "        <td>" + this.getPopIdosa() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>ESPECTATIVA DE VIDA</th>";
        msg += "    <tr>";
        msg += "        <th>Espectativa de vida</th>";
        msg += "        <td><strong>" + this.getEspectativaDeVidaGeral() + "</strong></td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Espectativa de vida feminina</th>";
        msg += "        <td>" + this.getEspectativaDeVidaFeminina() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Espectativa de vida masculina</th>";
        msg += "        <td>" + this.getEspectativaDeVidaMasculina() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>URBANIZAÇÃO</th>";
        msg += "    <tr>";
        msg += "        <th>População urbana (%)</th>";
        msg += "        <td>" + this.getPopUrbana() + "</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
