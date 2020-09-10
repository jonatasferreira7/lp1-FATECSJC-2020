package alunoFatec;


public class TesteCalcado {

    public static void main(String[] args) {
       Calcado cl1 = new Calcado(true);
       cl1.setTipo("Tenis");
       cl1.setMaterial("Borracha e Linha");
       cl1.setCor("Preto");
       cl1.setOcasiao("Esportivo");
       cl1.setCusto(200);
       cl1.ficha();
       
       cl1.Calcar("ok");
       cl1.Engraxar("não");
       cl1.Amarrar("ok");
       
       Calcado cl2 = new Calcado(true);
       cl2.setTipo("Sapato");
       cl2.setMaterial("Couro");
       cl2.setCor("Marrom");
       cl2.setOcasiao("Trabalho");
       cl2.setCusto(280);
       cl2.ficha();
       
       cl2.Calcar("ok");
       cl2.Engraxar("sim");
       cl2.Amarrar("não");
       
    }
    
}
