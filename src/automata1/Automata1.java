
package automata1;


public class Automata1 {
  public static void main(String[] args) {
        int [] input={1,1,1,1,0,0};
     
      int inicio = 1;
      int finalizar = 1;
      int actual = inicio;
      
      boolean fin = false;
      int contador = 0;
      while(fin==false){
          if (contador > input.length-1){
              fin = true;
              break;
              }
          
          if (actual==1){
             System.out.println("Entro al estado q0");
            if(input[contador]==0){
                actual=1;
            } else if(input[contador]==1){
                actual=2;
            }
            contador++;
            continue;
          }
          if (actual == 2){
              System.out.println("Entro al estado q1"); 
              if(input[contador]==1){
                  actual=2;
              }else if(input[contador]==0){
                  actual=1;
              }
              else{
                  break;
              }
             
           
              }
          
             
          contador++;
          continue;	
       
      }    	
   
   
      if(actual==finalizar){
          System.out.println("La cadena es correcta");
      }
      else{
         System.out.println("La cadena es incorrecta"); 
      }
       
   }
  
}