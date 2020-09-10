package alunoFatec;
public class TestePessoa {

    public static void main(String[] args) {	
        Pessoa Humano1 = new Pessoa("Lucas",'M');
        
        Humano1.setNome("Lucas");
        Humano1.setNacionalidade("brasileiro");
        Humano1.setAltura(170);
        Humano1.setPeso(58);
        Humano1.ficha();
        Humano1.time("São Paulo");
        Humano1.goat("Messi");
        
        Pessoa Humano2 = new Pessoa("Calebe",'M');
        
        Humano2.setNome("Calebe");
        Humano2.setNacionalidade("brasileiro");
        Humano2.setAltura(177);
        Humano2.setPeso(82);
        Humano2.ficha();
        Humano2.time("Palmeiras");
        Humano2.goat("Cristiano Ronaldo");
	} 
}
