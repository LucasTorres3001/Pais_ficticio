package pais.ficticio;

import classe.acessoria.Acessorio;
import java.text.DecimalFormat;
import java.util.Calendar;




public class PaisI extends Home {
    
    DecimalFormat df = new DecimalFormat();
    
    private byte dia, coefGini;
    private String agua, mes, moeda;;
    private short ano, idh;

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getCoefGini() {
        return coefGini;
    }

    public void setCoefGini(byte coefGini) {
        this.coefGini = coefGini;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public short getIdh() {
        return idh;
    }

    public void setIdh(short idh) {
        this.idh = idh;
    }

    public PaisI() {
        this.agua = "0.65";
        this.ano = 1815;
        this.coefGini = 27;
        this.dia = 31;
        this.idh = 891;
        this.mes = "Janeiro";
    }
    
    public String apresentacao(){
        
        short anoAtual = (short) Calendar.getInstance().get(Calendar.YEAR);
        String[] climas = {"Equatorial", "árido", "semiárido", "subtropical oceânico", "subtropical de altitude", "subtropical úmido", "tropical savânico", "tropical monçônico"};
        
        this.setPibNominal(Acessorio.pibNominal(this.getPibPerCapita_nominal(), this.getPopulacao()));
        this.setPibPPC(Acessorio.pibBasePPC(this.getPibPerCapita_PPC(), this.getPopulacao()));
        this.setMoeda("Real");
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>INDEPENDÊNCIA</th>";
        msg += "    <tr>";
        msg += "        <td colspan='2'>" + this.getDia() + " de " + this.getMes() + " de " + this.getAno() + " (" + Acessorio.anosDaIndependencia(anoAtual, this.getAno()) + " anos)</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>ÁREA</th>";
        msg += "    <tr>";
        msg += "        <th>Total</th>";
        msg += "        <td>" + this.getArea() + " km<sup>2</sup></td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Água (%)</th>";
        msg += "        <td>" + this.getAgua() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>POPULAÇÃO</th>";
        msg += "    <tr>";
        msg += "        <th>Censo (" + anoAtual + ")</th>";
        msg += "        <td>" + this.getPopulacao() + " hab.</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Densidade</th>";
        msg += "        <td>" + this.getDensidade() + " hab./km<sup>2</sup></td>";
        msg += "    </tr>";
        msg += "        <th colspan='2'>PIB(base PPC)</th>";
        msg += "    <tr>";
        msg += "        <th>Total</th>";
        msg += "        <td>US$ " + df.format(this.getPibPPC()) + " bilhões</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Per capita</th>";
        msg += "        <td>US$ " + this.getPibPerCapita_PPC() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>PIB(nominal)</th>";
        msg += "    <tr>";
        msg += "        <th>Total</th>";
        msg += "        <td>US$ " + df.format(this.getPibNominal()) + " bilhões</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Per capita</th>";
        msg += "        <td>US$ " + this.getPibPerCapita_nominal() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Moeda</th>";
        msg += "        <td>" + this.getMoeda() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>I.D.H.</th>";
        msg += "    <tr>";
        msg += "        <td colspan='2'>0." + this.getIdh() + " - " + Acessorio.statusIDH(this.getIdh()) + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>Gini</th>";
        msg += "    <tr>";
        msg += "        <td colspan='2'>" + this.getCoefGini() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Clima</th>";
        msg += "        <td>" + climas[0] + ", " + climas[1] + ",<br>" + climas[2] + ", " + climas[3] + ",<br>" + climas[4] + ", " + climas[5] + ",<br>" + climas[6] + " e " + climas[7] + "</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
