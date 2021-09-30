package pais.ficticio;

import classe.acessoria.Acessorio;



public class PaisX extends Home {
    
    private short municipios, microrregioes, mesorregioes;
    private byte estados;

    public short getMunicipios() {
        return municipios;
    }

    public void setMunicipios(short municipios) {
        this.municipios = municipios;
    }

    public short getMicrorregioes() {
        return microrregioes;
    }

    public void setMicrorregioes(short microrregioes) {
        this.microrregioes = microrregioes;
    }

    public short getMesorregioes() {
        return mesorregioes;
    }

    public void setMesorregioes(short mesorregioes) {
        this.mesorregioes = mesorregioes;
    }

    public byte getEstados() {
        return estados;
    }

    public void setEstados(byte estados) {
        this.estados = estados;
    }
    
    public String subdivisoes(){
        
        this.setMunicipios(Acessorio.municipios(this.getPopulacao()));
        this.setMicrorregioes(Acessorio.microrregioes(this.getMunicipios()));
        this.setMesorregioes(Acessorio.mesorregioes(this.getMicrorregioes()));
        this.setEstados(Acessorio.estados(this.getMesorregioes()));
        
        String msg;
        
        
        msg = "<table>";
        msg += "    <th colspan='2'>SUBDIVISÕES</th>";
        msg += "    <tr>";
        msg += "        <th>Municipios</th>";
        msg += "        <td>" + this.getMunicipios() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Microrregiões</th>";
        msg += "        <td>" + this.getMicrorregioes() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Mesorregiões</th>";
        msg += "        <td>" + this.getMesorregioes() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Estados</th>";
        msg += "        <td>" + this.getEstados() + "</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
