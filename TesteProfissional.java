package alunoFatec;

public class TesteProfissional {

    public static void main(String[] args) {
        Profissional prof1 = new Profissional("sim");
           prof1.setNome("Engenheiro");
           prof1.setArea("Hardware e Software");
           prof1.setCargo("Pesquisador");
           prof1.setContrato("p�blico");
           prof1.setSalario(10000);
           prof1.ficha();
           prof1.Trabalhar("Sim");
           prof1.Descansar("N�o");
           prof1.Ferias(5);
           
           //Nova Profissão
            Profissional prof2 = new Profissional("sim");
           prof2.setNome("Matem�tico");
           prof2.setArea("Mecanica Quantica");
           prof2.setCargo("Academico");
           prof2.setContrato("publico");
           prof1.setSalario(30000);
           prof1.ficha();
           prof1.Trabalhar("N�o");
           prof1.Descansar("Sim");
           prof1.Ferias(20);
           
    }
    
}
