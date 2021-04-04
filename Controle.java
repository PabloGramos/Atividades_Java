class Controle {
    int canal = 1;
    int volume = 25;
    
    void Pcanal(int increment) {
        if((canal + 1) == 11)
            canal = 1;
        else{
            canal = canal + 1;
        }
    }
    void Vcanal(int decrement){
        if((canal - 1) == 0)
            canal = 10;
        else{
            canal = canal - decrement;
        }
    }
    void mais_volume(int increment) {
        if((volume + 1) == 101)
            volume = volume;
        else{
            volume = volume + increment;
        }
    }
    void menos_volume(int decrement){
        if((volume - 1) == -1)
            volume = volume;
        else{
            volume = volume - decrement;
        }
    }
    void desligar(){
        System.out.println("Desligando...");
    }
    
    void imprimeStatus() {
        System.out.println("\n==============================");
        System.out.println("Canal: " + canal + "/ Volume: " + volume);
        System.out.println("==============================");
    }
    
    
    void programacao(){
        if(canal == 1) {
            System.out.println("            |  /        ");
            System.out.println("            | /         ");
            System.out.println("            |/          ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|         SBT          |");
            System.out.println("|        Chaves        |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 2) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|         RECOR        |");
            System.out.println("|        Gênesis       |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 3) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|          FOX         |");
            System.out.println("|       Os Simpsons    |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 4) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|         Globo        |");
            System.out.println("|   Jornal Nacional    |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 5) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|         Band         |");
            System.out.println("|    Jornal da Band    |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 6) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|         ESPN         |");
            System.out.println("|      NBA ao Vivo     |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 7) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|         VIVA         |");
            System.out.println("|    O rei do gado     |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 8) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|       TV SENADO      |");
            System.out.println("|    Briga na câmara   |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 9) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|       TV CULTURA     |");
            System.out.println("|  Os sete monstrinhos |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
        if(canal == 10) {
            System.out.println("            |  /       ");
            System.out.println("            | /        ");
            System.out.println("            |/         ");
            System.out.println("|======================|");
            System.out.println("|                      |");
            System.out.println("|       NOVO TEMPO     |");
            System.out.println("|  Na mira da verdade  |");
            System.out.println("|                      |");
            System.out.println("|                      |");
            System.out.println("|======================|");
        }
    }
}


    
    
    
    
    
    