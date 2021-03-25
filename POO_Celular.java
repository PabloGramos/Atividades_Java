class Celular_Demo {
    public static void main (String [] args) {
        // Crie dois diferentes Objetos de Celular
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        
        // Invocar os métodos de todos esses objetos
        System.out.println("Celular 1");
        celular1.estado_power("Ligado");
        celular1.baixar_app(3);
        celular1.carga_atual(90);
        celular1.imprimeStatus();
        
        System.out.println("Celular 2");
        celular2.estado_power("Desligado");
        celular1.baixar_app(5);
        celular2.carga_atual(24);
        celular2.imprimeStatus();
    }
}