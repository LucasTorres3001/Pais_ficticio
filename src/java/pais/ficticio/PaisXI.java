package pais.ficticio;

import classe.acessoria.Acessorio;
import java.text.DecimalFormat;



public class PaisXI extends Home {
    
    DecimalFormat df = new DecimalFormat();
    
    private short aeroportos_com_pistas_pavimentadas, aeroportos_com_pistas_nao_pavimentadas, aeroportos;
    private byte heliportos, portos;
    private double ciclovias, dutovias, extensaoDasFerrovias_km, extensaoDasFerroviasEletrificadas_km, hidrovias, rodovias_pavimentadas;
    private byte porcentagemDeFerroviasEletrificadas_km;
    private double rodovias_nao_pavimentadas, rodovias;

    public short getAeroportos_com_pistas_pavimentadas() {
        return aeroportos_com_pistas_pavimentadas;
    }

    public void setAeroportos_com_pistas_pavimentadas(short aeroportos_com_pistas_pavimentadas) {
        this.aeroportos_com_pistas_pavimentadas = aeroportos_com_pistas_pavimentadas;
    }

    public short getAeroportos_com_pistas_nao_pavimentadas() {
        return aeroportos_com_pistas_nao_pavimentadas;
    }

    public void setAeroportos_com_pistas_nao_pavimentadas(short aeroportos_com_pistas_nao_pavimentadas) {
        this.aeroportos_com_pistas_nao_pavimentadas = aeroportos_com_pistas_nao_pavimentadas;
    }

    public short getAeroportos() {
        return aeroportos;
    }

    public void setAeroportos(short aeroportos) {
        this.aeroportos = aeroportos;
    }

    public byte getHeliportos() {
        return heliportos;
    }

    public void setHeliportos(byte heliportos) {
        this.heliportos = heliportos;
    }

    public byte getPortos() {
        return portos;
    }

    public void setPortos(byte portos) {
        this.portos = portos;
    }

    public double getCiclovias() {
        return ciclovias;
    }

    public void setCiclovias(double ciclovias) {
        this.ciclovias = ciclovias;
    }

    public double getDutovias() {
        return dutovias;
    }

    public void setDutovias(double dutovias) {
        this.dutovias = dutovias;
    }

    public double getExtensaoDasFerrovias_km() {
        return extensaoDasFerrovias_km;
    }

    public void setExtensaoDasFerrovias_km(double extensaoDasFerrovias_km) {
        this.extensaoDasFerrovias_km = extensaoDasFerrovias_km;
    }

    public double getExtensaoDasFerroviasEletrificadas_km() {
        return extensaoDasFerroviasEletrificadas_km;
    }

    public void setExtensaoDasFerroviasEletrificadas_km(double extensaoDasFerroviasEletrificadas_km) {
        this.extensaoDasFerroviasEletrificadas_km = extensaoDasFerroviasEletrificadas_km;
    }

    public double getHidrovias() {
        return hidrovias;
    }

    public void setHidrovias(double hidrovias) {
        this.hidrovias = hidrovias;
    }

    public double getRodovias_pavimentadas() {
        return rodovias_pavimentadas;
    }

    public void setRodovias_pavimentadas(double rodovias_pavimentadas) {
        this.rodovias_pavimentadas = rodovias_pavimentadas;
    }

    public byte getPorcentagemDeFerroviasEletrificadas_km() {
        return porcentagemDeFerroviasEletrificadas_km;
    }

    public void setPorcentagemDeFerroviasEletrificadas_km(byte porcentagemDeFerroviasEletrificadas_km) {
        this.porcentagemDeFerroviasEletrificadas_km = porcentagemDeFerroviasEletrificadas_km;
    }

    public double getRodovias_nao_pavimentadas() {
        return rodovias_nao_pavimentadas;
    }

    public void setRodovias_nao_pavimentadas(double rodovias_nao_pavimentadas) {
        this.rodovias_nao_pavimentadas = rodovias_nao_pavimentadas;
    }

    public double getRodovias() {
        return rodovias;
    }

    public void setRodovias(double rodovias) {
        this.rodovias = rodovias;
    }

    public PaisXI() {
        this.heliportos = 72;
        this.portos = 35;
    }
    
    public String transportes(){
        
        this.setAeroportos(Acessorio.aeroportos(this.getPopulacao()));
        this.setAeroportos_com_pistas_nao_pavimentadas(Acessorio.aeroportosComPistasNaoPavimentadas(this.getAeroportos()));
        this.setAeroportos_com_pistas_pavimentadas(Acessorio.aeroportosComPistasPavimentadas(this.getAeroportos()));
        this.setExtensaoDasFerrovias_km(Acessorio.extensaoDaMalhaFerroviaria(this.getArea()));
        this.setPorcentagemDeFerroviasEletrificadas_km((byte) 96);
        this.setExtensaoDasFerroviasEletrificadas_km(Acessorio.ferroviasEletrificadas(this.getExtensaoDasFerrovias_km(), this.getPorcentagemDeFerroviasEletrificadas_km()));
        this.setRodovias(Acessorio.rodovias(this.getArea()));
        this.setRodovias_nao_pavimentadas(Acessorio.rodoviasNaoPavimentadas(this.getRodovias()));
        this.setRodovias_pavimentadas(Acessorio.rodoviasPavimentadas(this.getRodovias()));
        this.setHidrovias(Acessorio.hidrovias(this.getArea()));
        this.setDutovias(Acessorio.dutovias(this.getArea()));
        this.setCiclovias(Acessorio.ciclovias(this.getArea()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>INFRAESTRUTURA</th>";
        msg += "    <tr>";
        msg += "        <th>Dutovias</th>";
        msg += "        <td>" + df.format(this.getDutovias()) + " km</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Hidrovias</th>";
        msg += "        <td>" + df.format(this.getHidrovias()) + " km</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de portos</th>";
        msg += "        <td>" + this.getPortos() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de heliportos</th>";
        msg += "        <td>" + this.getHeliportos() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Extensão do sistema cicloviário</th>";
        msg += "        <td>" + df.format(this.getCiclovias()) + " km</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>AEROPORTOS</th>";
        msg += "    <tr>";
        msg += "        <th>Aeroportos</th>";
        msg += "        <td><strong>" + this.getAeroportos() + "</strong></td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de aeroportos pavimentados</th>";
        msg += "        <td>" + this.getAeroportos_com_pistas_pavimentadas() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de aeroportos não pavimentados</th>";
        msg += "        <td>" + this.getAeroportos_com_pistas_nao_pavimentadas() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>FERROVIAS</th>";
        msg += "    <tr>";
        msg += "        <th>Ferrovias eletrificadas</th>";
        msg += "        <td>" + df.format(this.getExtensaoDasFerroviasEletrificadas_km()) + " km</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Extensão da malha ferroviária</th>";
        msg += "        <td><strong>" + df.format(this.getExtensaoDasFerrovias_km()) + " km</strong></td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>RODOVIAS</th>";
        msg += "    <tr>";
        msg += "        <th>Rodovias pavimentadas</th>";
        msg += "        <td>" + df.format(this.getRodovias_pavimentadas()) + " km</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Rodovias não pavimentadas</th>";
        msg += "        <td>" + df.format(this.getRodovias_nao_pavimentadas()) + " km</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Extensão do sistema rodoviário</th>";
        msg += "        <td><strong>" + df.format(this.getRodovias()) + " km</strong></td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
