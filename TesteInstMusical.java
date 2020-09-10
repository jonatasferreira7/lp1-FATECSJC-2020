package alunoFatec;

public class TesteInstMusical {

    public static void main(String[] args) {
        InstrumentoMusical i1 = new InstrumentoMusical("Eagle");
        i1.setNome("Saxofone");
        i1.setTipo("Sopro");
        i1.setMaterial("Metal");
        i1.setTom("Mib");
        i1.setValor(4000);
        i1.ficha();
        
        i1.afinar("Sim");
        i1.conserto("Não");
        i1.venda("Não");
        
        InstrumentoMusical i2 = new InstrumentoMusical("Tagima");
        i2.setNome("Violão");
        i2.setTipo("Cordas");
        i2.setMaterial("Madeira");
        i2.setTom("Sol");
        i2.setValor(5000);
        i2.ficha();
        
        i2.afinar("Sim");
        i2.conserto("Sim");
        i2.venda("Sim");
    }  
}
