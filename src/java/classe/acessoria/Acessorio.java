package classe.acessoria;



public class Acessorio {
    
    public static short aeroportos(long a){
        return (short) (a / 29841);
    }
    
    public static short aeroportosComPistasPavimentadas(short a){
        return (short) ((a * 95) / 100);
    }
    
    public static short aeroportosComPistasNaoPavimentadas(short a){
        return (short) ((a * 5) / 100);
    }
    
    public static short anosDaIndependencia(short a, short A){
        return (short) (a - A);
    }
    
    public static double ciclovias(double a){
        return ((a * 125) / 10000);
    }
    
    public static short clubesDeBasquete(long a){
        return (short) (a / 225015);
    }
    
    public static short clubesDeFutebol(long a){
        return (short) (a / 36648);
    }
    
    public static short clubesDeVoleibol(long a){
        return (short) (a / 48576);
    }
    
    public static int consumoDeEletricidade(long a, short A){
        return (int) (((a * A) / 1141) * 10);
    }
    
    public static double dutovias(double a){
        return ((a * 9) / 100);
    }
    
    public static short energiaMediaPerCapita(){
        return (37 * 37);
    }
    
    public static float espectativaDeVidaGeral(float a, float A){
        return ((a + A) / 2);
    }
    
    public static byte estados(short a){
        return (byte) (a / 4);
    }
    
    public static int estudantesNasUnivPrivadas(int a){
        return ((a * 24) / 100);
    }
    
    public static int estudantesNasUnivPublicas(int a){
        return ((a * 76) / 100);
    }
    
    public static double extensaoDaMalhaFerroviaria(double a){
        return ((a * 348) / 10000);
    }
    
    public static double ferroviasEletrificadas(double a, byte A){
        return ((a * A) / 100);
    }
    
    public static double forcaDeTrabalhoTotal(long a){
        return (((a * 57) / 100)/ 1000);
    }
    
    public static double gastosMilitares(double A, float a){
        return ((a * A ) / 100);
    }
    
    public static int geracaoPorTodasAsFontes(int a){
        return (((a / 75) * 100) / 1000);
    }
    
    public static double hidrovias(double a){
        return ((a * 24) / 10000);
    }
    
    public static int militaresAtivos(long a){
        return (int) ((a * 94) / 10000);
    }
    
    public static short mesorregioes(short a){
        return (short) (a / 4);
    }
    
    public static short microrregioes(short a){
        return (short) (a / 8);
    }
    
    public static short municipios(long a){
        return (short) (a / 44121);
    }
    
    public static int numeroDeCelulares(long a, float A){
        return (int) ((a * A) / 100);
    }
    
    public static double pibBasePPC(float a, long A){
        return ((a * A) / 1000000000);
    }
    
    public static double pibNominal(float a, long A){
        return ((a * A) / 1000000000);
    }
    
    public static float pibPerCapitaPPC(float a){
        return ((a * 97) / 100);
    }
    
    public static int populacao(float a, double A){
        return (int) (a * A);
    }
    
    public static int populacaoTotalDeEstudantes(long a){
        return (int) ((a * 472) / 10000);
    }
    
    public static int producaoEletrica(int a){
        return a;
    }
    
    public static double rodovias(double a){
        return ((a * 981) / 10000);
    }
    
    public static double rodoviasNaoPavimentadas(double a){
        return ((a * 6) / 100);
    }
    
    public static double rodoviasPavimentadas(double a){
        return ((a * 94) / 100);
    }
    
    public static String statusIDH(short a){
        
        String msg = "";
        
        if(a < 0 || a >= 1000){
            msg += "inválido! ... :/";
        }
        else{
            if(a >= 0 && a < 550){
                msg += "baixo";
            }
            else if(a >= 550 && a <= 699){
                msg += "médio";
            }
            else if(a >= 700 && a <= 799){
                msg += "alto";
            }
            else{
                if(a >= 800 && a <= 999){
                    msg += "muito alto";
                }
            }
        }
        
        return msg;
    }
    
    public static float taxaDeAlfabetizacao(float a, float A){
        return ((a + A) / 2);
    }
    
    public static int totalRenovavel(int a, float A){
        return (int) ((a * A) / 100);
    }
    
    public static byte universidadesPrivadas(int a){
        return (byte) (a / 9729);
    }
    
    public static byte universidadesPublicas(int a){
        return (byte) (a / 25625);
    }
    
    public static byte universidadesTotais(byte a, byte A){
        return (byte) (a + A);
    }
    
    public static int usuariosDeInternet(long a, float A){
        return (int) ((a * A) / 100);
    }
    
    public static short vitimas(long a, byte A){
        return (short) ((((a * A) / 100000) / 100));
    }
}
