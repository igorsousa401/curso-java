package estruturasControle;

public class Continue2 {
 
    public static void main(String[] args) {
        
        externo:  for(int i = 0; i < 3; i++) {
    
                for(int k = 0; k < 3; k++) {
                    if(i == 1) {
                        continue externo;
                    }
                    System.out.printf("[%d %d]", i, k);
                }
    
                System.out.println();
    
                
            }
    
            System.out.println("FIM!!!");
        }
}
