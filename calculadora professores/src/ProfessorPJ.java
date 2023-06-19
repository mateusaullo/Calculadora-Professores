public class ProfessorPJ extends Professor{

   private int salarioigual;
    

   public ProfessorPJ(String nome,int salarioigual) {
    super(nome,"PJ");

    this.salarioigual = salarioigual;
   }
   @Override
   public double calcularvalor(){
        return salarioigual;
   }
}
