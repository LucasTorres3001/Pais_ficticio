package pais.ficticio;

import classe.acessoria.Acessorio;



public class PaisVII extends Home {
    
    private short qntdDeClubesDeBasquete, qntdDeClubesDeFutebol, qntdDeClubesDeVoleibol;

    public short getQntdDeClubesDeBasquete() {
        return qntdDeClubesDeBasquete;
    }

    public void setQntdDeClubesDeBasquete(short qntdDeClubesDeBasquete) {
        this.qntdDeClubesDeBasquete = qntdDeClubesDeBasquete;
    }

    public short getQntdDeClubesDeFutebol() {
        return qntdDeClubesDeFutebol;
    }

    public void setQntdDeClubesDeFutebol(short qntdDeClubesDeFutebol) {
        this.qntdDeClubesDeFutebol = qntdDeClubesDeFutebol;
    }

    public short getQntdDeClubesDeVoleibol() {
        return qntdDeClubesDeVoleibol;
    }

    public void setQntdDeClubesDeVoleibol(short qntdDeClubesDeVoleibol) {
        this.qntdDeClubesDeVoleibol = qntdDeClubesDeVoleibol;
    }
    
    public String esportes(){
        
        this.setQntdDeClubesDeBasquete(Acessorio.clubesDeBasquete(this.getPopulacao()));
        this.setQntdDeClubesDeFutebol(Acessorio.clubesDeFutebol(this.getPopulacao()));
        this.setQntdDeClubesDeVoleibol(Acessorio.clubesDeVoleibol(this.getPopulacao()));
        
        String msg;
        
        msg = "<table>";
        msg += "    <th colspan='2'>ESPORTES</th>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de clubes de basquete</th>";
        msg += "        <td>" + this.getQntdDeClubesDeBasquete() + " clubes</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de clubes de futebol</th>";
        msg += "        <td>" + this.getQntdDeClubesDeFutebol() + " clubes</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Qntd. de clubes de voleibol</th>";
        msg += "        <td>" + this.getQntdDeClubesDeVoleibol() + " clubes</td>";
        msg += "    </tr>";
        msg += "<table>";
        msg += "<hr/>";
        
        return msg;
    }
}
