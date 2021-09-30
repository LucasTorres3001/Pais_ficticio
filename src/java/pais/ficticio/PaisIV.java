package pais.ficticio;

import classe.acessoria.Acessorio;
import java.text.DecimalFormat;



public class PaisIV extends Home {
    
    DecimalFormat df = new DecimalFormat();
    
    private float crescDoPIB, desemprego, popAbaixoDaLinhadaPobreza;
    private byte forcaDeTrabalhoNaAgricultura, forcaDeTrabalhoNaIndustria, pibAgricultura, pibIndustria, pibComercioServicos;
    private byte forcaDeTrabalhoNaConstrucaoCivil, forcaDeTrabalhoNoComercioServicos;
    private double forcaDeTrabalhoTotal;

    public float getCrescDoPIB() {
        return crescDoPIB;
    }

    public void setCrescDoPIB(float crescDoPIB) {
        this.crescDoPIB = crescDoPIB;
    }

    public float getDesemprego() {
        return desemprego;
    }

    public void setDesemprego(float desemprego) {
        this.desemprego = desemprego;
    }

    public float getPopAbaixoDaLinhadaPobreza() {
        return popAbaixoDaLinhadaPobreza;
    }

    public void setPopAbaixoDaLinhadaPobreza(float popAbaixoDaLinhadaPobreza) {
        this.popAbaixoDaLinhadaPobreza = popAbaixoDaLinhadaPobreza;
    }

    public byte getPibAgricultura() {
        return pibAgricultura;
    }

    public void setPibAgricultura(byte pibAgricultura) {
        this.pibAgricultura = pibAgricultura;
    }

    public byte getPibIndustria() {
        return pibIndustria;
    }

    public void setPibIndustria(byte pibIndustria) {
        this.pibIndustria = pibIndustria;
    }

    public byte getPibComercioServicos() {
        return pibComercioServicos;
    }

    public void setPibComercioServicos(byte pibComercioServicos) {
        this.pibComercioServicos = pibComercioServicos;
    }

    public byte getForcaDeTrabalhoNaAgricultura() {
        return forcaDeTrabalhoNaAgricultura;
    }

    public void setForcaDeTrabalhoNaAgricultura(byte forcaDeTrabalhoNaAgricultura) {
        this.forcaDeTrabalhoNaAgricultura = forcaDeTrabalhoNaAgricultura;
    }

    public byte getForcaDeTrabalhoNaIndustria() {
        return forcaDeTrabalhoNaIndustria;
    }

    public void setForcaDeTrabalhoNaIndustria(byte forcaDeTrabalhoNaIndustria) {
        this.forcaDeTrabalhoNaIndustria = forcaDeTrabalhoNaIndustria;
    }

    public byte getForcaDeTrabalhoNaConstrucaoCivil() {
        return forcaDeTrabalhoNaConstrucaoCivil;
    }

    public void setForcaDeTrabalhoNaConstrucaoCivil(byte forcaDeTrabalhoNaConstrucaoCivil) {
        this.forcaDeTrabalhoNaConstrucaoCivil = forcaDeTrabalhoNaConstrucaoCivil;
    }

    public byte getForcaDeTrabalhoNoComercioServicos() {
        return forcaDeTrabalhoNoComercioServicos;
    }

    public void setForcaDeTrabalhoNoComercioServicos(byte forcaDeTrabalhoNoComercioServicos) {
        this.forcaDeTrabalhoNoComercioServicos = forcaDeTrabalhoNoComercioServicos;
    }

    public double getForcaDeTrabalhoTotal() {
        return forcaDeTrabalhoTotal;
    }

    public void setForcaDeTrabalhoTotal(double forcaDeTrabalhoTotal) {
        this.forcaDeTrabalhoTotal = forcaDeTrabalhoTotal;
    }
    
    public PaisIV() {
        this.desemprego = 3.6f;
        this.forcaDeTrabalhoNaAgricultura = 4;
        this.forcaDeTrabalhoNaConstrucaoCivil = 6;
        this.forcaDeTrabalhoNaIndustria = 18;
        this.forcaDeTrabalhoNoComercioServicos = 72;
        this.pibAgricultura = 3;
        this.pibComercioServicos = 69;
        this.pibIndustria = 28;
        this.popAbaixoDaLinhadaPobreza = 5.7f;
    }
    
    public String economia(){
        
        this.setForcaDeTrabalhoTotal(Acessorio.forcaDeTrabalhoTotal(this.getPopulacao()));
        this.setCrescDoPIB(1.3f);
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>ECONOMIA</th>";
        msg += "    <tr>";
        msg += "        <th>Crescimento do PIB</th>";
        msg += "        <td>" + this.getCrescDoPIB() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>População abaixo da linha da pobreza</th>";
        msg += "        <td>" + this.getPopAbaixoDaLinhadaPobreza() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Desempregado</th>";
        msg += "        <td>" + this.getDesemprego() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>PIB por setor</th>";
        msg += "    <tr>";
        msg += "        <th>Agricultura</th>";
        msg += "        <td>" + this.getPibAgricultura() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Indústria</th>";
        msg += "        <td>" + this.getPibIndustria() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Comércio e Serviços</th>";
        msg += "        <td>" + this.getPibComercioServicos() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>FORÇA DE TRABALHO POR OCUPAÇÃO</th>";
        msg += "    <tr>";
        msg += "        <th>Agricultura</th>";
        msg += "        <td>" + this.getForcaDeTrabalhoNaAgricultura() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Indústria</th>";
        msg += "        <td>" + this.getForcaDeTrabalhoNaIndustria() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Construção civil</th>";
        msg += "        <td>" + this.getForcaDeTrabalhoNaConstrucaoCivil() + " %</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Comércio e Serviços</th>";
        msg += "        <td>" + this.getForcaDeTrabalhoNoComercioServicos() + " %</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>FORÇA DE TRABALHO TOTAL</th>";
        msg += "    <tr>";
        msg += "        <td colspan='2'>" + df.format(this.getForcaDeTrabalhoTotal()) + " milhões</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
