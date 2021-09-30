package pais.ficticio;

import classe.acessoria.Acessorio;
import classificação.proficiencia.Classificacao;
import java.util.Calendar;



public class PaisIX extends Home {
    
    private int numeroDeCelulares, usuariosDeInternet;
    private float indiceDeProficienciaEmIngles, porcentagemDaPop_celulares, porcentagemDaPop_internet;
    private byte porcentagemDaPopQuePossuiSmartphone;

    public int getNumeroDeCelulares() {
        return numeroDeCelulares;
    }

    public void setNumeroDeCelulares(int numeroDeCelulares) {
        this.numeroDeCelulares = numeroDeCelulares;
    }

    public int getUsuariosDeInternet() {
        return usuariosDeInternet;
    }

    public void setUsuariosDeInternet(int usuariosDeInternet) {
        this.usuariosDeInternet = usuariosDeInternet;
    }

    public float getIndiceDeProficienciaEmIngles() {
        return indiceDeProficienciaEmIngles;
    }

    public void setIndiceDeProficienciaEmIngles(float indiceDeProficienciaEmIngles) {
        this.indiceDeProficienciaEmIngles = indiceDeProficienciaEmIngles;
    }

    public float getPorcentagemDaPop_celulares() {
        return porcentagemDaPop_celulares;
    }

    public void setPorcentagemDaPop_celulares(float porcentagemDaPop_celulares) {
        this.porcentagemDaPop_celulares = porcentagemDaPop_celulares;
    }

    public float getPorcentagemDaPop_internet() {
        return porcentagemDaPop_internet;
    }

    public void setPorcentagemDaPop_internet(float porcentagemDaPop_internet) {
        this.porcentagemDaPop_internet = porcentagemDaPop_internet;
    }

    public byte getPorcentagemDaPopQuePossuiSmartphone() {
        return porcentagemDaPopQuePossuiSmartphone;
    }

    public void setPorcentagemDaPopQuePossuiSmartphone(byte porcentagemDaPopQuePossuiSmartphone) {
        this.porcentagemDaPopQuePossuiSmartphone = porcentagemDaPopQuePossuiSmartphone;
    }

    public PaisIX() {
        this.indiceDeProficienciaEmIngles = 69.65f;
    }
    
    public String others(){
        
        short ano_atual = (short) Calendar.getInstance().get(Calendar.YEAR);
        
        this.setPorcentagemDaPop_celulares(149.5f);
        this.setNumeroDeCelulares(Acessorio.numeroDeCelulares(this.getPopulacao(), this.getPorcentagemDaPop_celulares()));
        this.setPorcentagemDaPopQuePossuiSmartphone((byte) 92);
        this.setPorcentagemDaPop_internet(95.7f);
        this.setUsuariosDeInternet(Acessorio.usuariosDeInternet(this.getPopulacao(), this.getPorcentagemDaPop_internet()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>NÚMERO DE USUÁRIOS DE INTERNET</th>";
        msg += "    <tr>";
        msg += "        <th>Usuários de internet</th>";
        msg += "        <td>" + this.getUsuariosDeInternet() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Porcentagem da população</th>";
        msg += "        <td>" + this.getPorcentagemDaPop_internet() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>NÚMERO DE CELULRAES EM USO</th>";
        msg += "    <tr>";
        msg += "        <th>Número de celulares</th>";
        msg += "        <td>" + this.getNumeroDeCelulares() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>População</th>";
        msg += "        <td>" + this.getPopulacao() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>% da população</th>";
        msg += "        <td>" + this.getPorcentagemDaPop_celulares() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>PENETRAÇÃO DE SMARTPHONES</th>";
        msg += "    <tr>";
        msg += "        <th>% da população que possui smartphones</th>";
        msg += "        <td>" + this.getPorcentagemDaPopQuePossuiSmartphone() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>ÍNDICE DE PROFICIÊNCIA EM INGLÊS</th>";
        msg += "    <tr>";
        msg += "        <th>Pontuação " + ano_atual + "</th>";
        msg += "        <td>" + this.getIndiceDeProficienciaEmIngles() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Classificação da proficiência</th>";
        msg += "        <td>" + Classificacao.proficiencia(this.getIndiceDeProficienciaEmIngles()) + "</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
