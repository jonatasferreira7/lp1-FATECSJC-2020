package alunoFatec;

public class TesteAlunosFatec {

    public static void main(String[] args) {
        AlunoFatecSJC a = new AlunoFatecSJC("sim");
        a.setNome("Jo�o");
        a.setCurso("ADS");
        a.setCPF("369.846.099-51");
        a.ficha();
        a.distrito("S�o Jos� dos Campos");
        
        //Novo Aluno
        AlunoFatecSJC b = new AlunoFatecSJC("sim");
        b.setNome("Maria");
        b.setCurso("BD");
        b.setCPF("404.564.589-89");
        b.ficha();
        b.distrito("S�o Jos� dos Campos");
        
    }
    
}
