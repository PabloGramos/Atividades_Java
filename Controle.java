class Controle {
    private int canal = 1;
    private int volume = 25;
    
    public Controle(){
        
    }

    public void setPcanal(int increment) {
        if((this.canal + 1) == 11)
            this.canal = 1;
        else{
            this.canal = this.canal + 1;
        }
    }
    public int getcanal(){
        return this.canal;
    }
    
    
    public void setVcanal(int decrement){
        if((this.canal - 1) == 0)
            this.canal = 10;
        else{
            this.canal = this.canal - decrement;
        }
    }
    
    
    public void setmais_volume(int increment) {
        if((this.volume + 1) == 101)
            this.volume = this.volume;
        else{
            this.volume = this.volume + increment;
        }
    }
    public int getvolume(){
        return this.volume;
    }
    
    
    public void setmenos_volume(int decrement){
        if((this.volume - 1) == -1)
            this.volume = this.volume;
        else{
            this.volume = this.volume - decrement;
        }
    }
    
    
    
    
    public void programacao(){
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
            System.out.println("|     TV Globinho      |");
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