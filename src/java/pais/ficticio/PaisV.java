package pais.ficticio;

import classe.acessoria.Acessorio;
import java.text.DecimalFormat;



public class PaisV extends Home {
    
    DecimalFormat df = new DecimalFormat();
    
    private int popDeEstudantes, popDeEstudantesNasUnivPrivadas, popDeEstudantesNasUnivPublicas;
    private byte qntdDeUniversidadesPrivadas, qntdDeUniversidadesPublicas, qntdDeUniversidades_total;

    public int getPopDeEstudantes() {
        return popDeEstudantes;
    }

    public void setPopDeEstudantes(int popDeEstudantes) {
        this.popDeEstudantes = popDeEstudantes;
    }

    public int getPopDeEstudantesNasUnivPrivadas() {
        return popDeEstudantesNasUnivPrivadas;
    }

    public void setPopDeEstudantesNasUnivPrivadas(int popDeEstudantesNasUnivPrivadas) {
        this.popDeEstudantesNasUnivPrivadas = popDeEstudantesNasUnivPrivadas;
    }

    public int getPopDeEstudantesNasUnivPublicas() {
        return popDeEstudantesNasUnivPublicas;
    }

    public void setPopDeEstudantesNasUnivPublicas(int popDeEstudantesNasUnivPublicas) {
        this.popDeEstudantesNasUnivPublicas = popDeEstudantesNasUnivPublicas;
    }

    public byte getQntdDeUniversidadesPrivadas() {
        return qntdDeUniversidadesPrivadas;
    }

    public void setQntdDeUniversidadesPrivadas(byte qntdDeUniversidadesPrivadas) {
        this.qntdDeUniversidadesPrivadas = qntdDeUniversidadesPrivadas;
    }

    public byte getQntdDeUniversidadesPublicas() {
        return qntdDeUniversidadesPublicas;
    }

    public void setQntdDeUniversidadesPublicas(byte qntdDeUniversidadesPublicas) {
        this.qntdDeUniversidadesPublicas = qntdDeUniversidadesPublicas;
    }

    public byte getQntdDeUniversidades_total() {
        return qntdDeUniversidades_total;
    }

    public void setQntdDeUniversidades_total(byte qntdDeUniversidades_total) {
        this.qntdDeUniversidades_total = qntdDeUniversidades_total;
    }
    
    public String educacao(){
        
        this.setPopDeEstudantes(Acessorio.populacaoTotalDeEstudantes(this.getPopulacao()));
        this.setPopDeEstudantesNasUnivPrivadas(Acessorio.estudantesNasUnivPrivadas(this.getPopDeEstudantes()));
        this.setPopDeEstudantesNasUnivPublicas(Acessorio.estudantesNasUnivPublicas(this.getPopDeEstudantes()));
        this.setQntdDeUniversidadesPrivadas(Acessorio.universidadesPrivadas(this.getPopDeEstudantesNasUnivPrivadas()));
        this.setQntdDeUniversidadesPublicas(Acessorio.universidadesPublicas(this.getPopDeEstudantesNasUnivPublicas()));
        this.setQntdDeUniversidades_total(Acessorio.universidadesTotais(this.getQntdDeUniversidadesPrivadas(), this.getQntdDeUniversidadesPublicas()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>EDUCAÇÃO</th>";
        msg += "    <tr>";
        msg += "        <th>Nº de universidades públicas</th>";
        msg += "        <td>" + this.getQntdDeUniversidadesPublicas() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Nº de universidades privadas</th>";
        msg += "        <td>" + this.getQntdDeUniversidadesPrivadas() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>TOTAL DE UNIVERSIDADES</th>";
        msg += "    <tr>";
        msg += "        <td colspan='2'>" + this.getQntdDeUniversidades_total() + " universidades</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Estudantes nas universidades públicas</th>";
        msg += "        <td>" + this.getPopDeEstudantesNasUnivPublicas() + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Estudantes nas universidades privadas</th>";
        msg += "        <td>" + this.getPopDeEstudantesNasUnivPrivadas() + "</td>";
        msg += "    </tr>";
        msg += "    <th colspan='2'>POPULAÇÃO TOTAL DE ESTUDANTES</th>";
        msg += "    <tr>";
        msg += "        <td colspan='2'>" + this.getPopDeEstudantes() + " estudantes</td>";
        msg += "    </tr>";
        msg += "</table>";
        msg += "<hr/>";
        
        return msg;
    }
}
