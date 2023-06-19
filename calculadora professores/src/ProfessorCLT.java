 class ProfessorCLT extends Professor{
    private double salario_mensal;


    public ProfessorCLT(String nome,double salario_mensal){
          super(nome , "CLT");

          this.salario_mensal=salario_mensal;
    }


    @Override
    public double calcularvalor() {
        return salario_mensal;
    }
        
    
}
