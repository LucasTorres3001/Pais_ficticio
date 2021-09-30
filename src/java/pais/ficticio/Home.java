package pais.ficticio;

import classe.acessoria.Acessorio;



public abstract class Home {
    
    //-------------------------------------------------------------------------------- * DEMOGRÁFICOS * ----------------------------------------------------------------------------------
    private long populacao;
    private float densidade;
    
    //-------------------------------------------------------------------------------- * ECONÔMICOS * ----------------------------------------------------------------------------------
    private float pibPerCapita_PPC, pibPerCapita_nominal;
    private double pibNominal, pibPPC;
    
    //-------------------------------------------------------------------------------- * GEOGRÁFICOS * ----------------------------------------------------------------------------------
    private double area;
    
    
    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public float getDensidade() {
        return densidade;
    }

    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }

    public double getPibNominal() {
        return pibNominal;
    }

    public void setPibNominal(double pibNominal) {
        this.pibNominal = pibNominal;
    }

    public double getPibPPC() {
        return pibPPC;
    }

    public void setPibPPC(double pibPPC) {
        this.pibPPC = pibPPC;
    }

    public float getPibPerCapita_PPC() {
        return pibPerCapita_PPC;
    }

    public void setPibPerCapita_PPC(float pibPerCapita_PPC) {
        this.pibPerCapita_PPC = pibPerCapita_PPC;
    }

    public float getPibPerCapita_nominal() {
        return pibPerCapita_nominal;
    }

    public void setPibPerCapita_nominal(float pibPerCapita_nominal) {
        this.pibPerCapita_nominal = pibPerCapita_nominal;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Home() {
        
        this.area = 8513172.769;
        this.densidade = 4.64f;
        this.pibPerCapita_nominal = 30960.32f;
        this.pibPerCapita_PPC = Acessorio.pibPerCapitaPPC(this.pibPerCapita_nominal);
        this.populacao = Acessorio.populacao(this.densidade, this.area);
    }
}
