package alunoFatec;

public class Profissional {
    public String trabalho;
    public String nome;
    private String area;
    private String cargo;
    private String contrato;
    private float salario;

    public void ficha(){
        System.out.println("________________________________");
        System.out.println("Profissão: " + this.getNome());
        System.out.println("Área: " + this.getArea());
        System.out.println("Função: " + this.getCargo());
        System.out.println("Contrato: " + this.getContrato());
        System.out.println("Salário: R$ " + this.getSalario());
        
    }
    public void Trabalhar(String tr){
        System.out.println("Trabalhando: " +tr);
    }
    
    public void Descansar(String ds){
        System.out.println("Fim do período de Trabalho: " +ds);
        
    }
    public void Ferias(int fe){
        System.out.println("Dias para iniciar férias: " + fe + " dias");
        System.out.println("________________________________");
    }

    public Profissional(String at) {
        this.trabalho = at;
        System.out.println("Trabalha: " + at);
    }

    public String getTrabalho() {
       return trabalho;
    }

    public void setTrabalho(String ativo) {
        this.trabalho = ativo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String funcao) {
        this.cargo = funcao;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String tipo_contrato) {
        this.contrato = tipo_contrato;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
