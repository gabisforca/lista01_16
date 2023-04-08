import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double metrosquadrados;
    double precototal;
    double quantidadedelatas;
    
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos metros quadrados serão pintados?");
     metrosquadrados = teclado.nextDouble();
    
    // passo 3: calcular
    quantidadedelatas = Math.ceil (metrosquadrados / 54d);   
    precototal = quantidadedelatas * 80;
    
    //passo 4: exibir 
    System.out.println("Quantidades de latas necessárias :" + quantidadedelatas);
    System.out.println("Preço total a ser pago R$ " + precototal);
    
  
  }
}