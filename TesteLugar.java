package alunoFatec;
public class TesteLugar {
     public static void main(String[] args) {	
       Lugar destino1 = new Lugar("Tromso");
        
        destino1.frase("Melhor lugar para ver a Aurora Boreal");
        
        destino1.setCidade("Tromso");
        destino1.setPais("Noruega");
        destino1.setClima("frio");
        destino1.isSeguro();
        destino1.cadastro();
        destino1.povo("72.000 habitantes");
        
       Lugar destino2 = new Lugar("Fairbanks");
        
        destino2.frase("Melhor lugar para ver a Aurora Boreal");
        
        destino2.setCidade("Fairbanks");
        destino2.setPais("Alaska");
        destino2.setClima("frio");
        destino2.isSeguro();
        destino2.cadastro();
        destino2.povo("31.000 habitantes");
     }   
}