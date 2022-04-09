package tarea_4;
/**
 *
 * @author S@Mu 1º DAWN Noche
 */
public class Tarea_4 {

    public static void main(String[] args) throws Exception {       
    
        CCuenta cuenta1;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        cuenta1.operativa_cuenta(cuenta1);
    }
}
