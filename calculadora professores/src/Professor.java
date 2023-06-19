abstract class Professor {
    protected String nome;
    protected String regime;

    public Professor(String nome,String regime){
        this.nome=nome;
        this.regime=regime;
    }

    public abstract double calcularvalor();

    public void exibirvalor(String regime){
        double valor_receber = calcularvalor();

        System.out.println("\n====CALCULO DO SALARIO "+ regime +"====");
        System.out.println(" Nome do professor: " + nome);
        System.out.println(" Valor a receber: R$" + valor_receber +"\n");
    }
}
