class ProfessorHorista extends Professor {

    private int horas_trabalhadas;

    private double valor_hora;

    public ProfessorHorista(String nome , int horas_trabalhadas , double valor_hora){
           
        super(nome , "HORISTA");

        this.horas_trabalhadas = horas_trabalhadas;

        this.valor_hora = valor_hora;
    } 
    
    @Override
    public double calcularvalor(){
        return horas_trabalhadas * valor_hora;
    }    
}
