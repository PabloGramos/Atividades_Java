class Celular {
    String power = "";
    int carga = 0;
    int armazenamento = 4;
    
    void estado_power(String newValue) {
        power = newValue;
    }
    void carga_atual(int newValue) {
        carga = newValue;
    }
    void baixar_app(int increment) {
        armazenamento = armazenamento + increment;
    }
    void usar_app(int decrement) {
        carga = carga - decrement;
    }
    void armazenamento_atual(int newValue) {
        carga = newValue;
    }
    
    void imprimeStatus() {
        System.out.println("Atualmente está " +
        power + ", carga de " +
        carga + "%, " + "memoria utilizada " + armazenamento + "Gb");
    }
}