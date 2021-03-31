class Celular {
    String power = "";
    int carga = 0;
    int armazenamento = 400;
    
    void estado_power(int newValue) {
        if(newValue == 0)
            power = "Ligado";
        else{
            power = "Desligado";
            System.out.println("Celular está desligado e não tem como utilizar.");
            System.exit(0);
        }
    }
    void carga_atual(int newValue) {
        carga = newValue;
    }
    void mudar_carga(int increment) {
        if(increment == 0)
            carga = 100;
    }
    void baixar_app(int increment) {
        armazenamento = armazenamento + increment;
    }
    void usar_app(int decrement) {
        carga = carga - (decrement * 2);
    }
    void armazenamento_atual(int newValue) {
        armazenamento = newValue;
    }
    
    void imprimeStatus1() {
        System.out.println("Atualmente está com " + carga +"% de carga e " + armazenamento + "Mb de memoria utilizada.");
    }
    void imprimeStatus2() {
        if(carga < 0){
            System.out.println("Atualmente está descarregado, com "+armazenamento+"Mb de memoria utilizada ");
        }
        else{
            System.out.println("Atualmente está " +
            power + ", carga de " +
            carga + "%, " + "memoria utilizada " + armazenamento + "Mb");
        }
    }
}