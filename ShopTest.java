import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {

    @Test
    public void Testbuy(Computer comp, String newOS) {
        /*  We can test for if an old computer can be re-added to the inventory?
        if comp is in inventory:
        throwRuntimeException "This computer is already in inventory!"
        */ 
    if (inventory.contains(comp)){
        throw new RuntimeException("Computer is already in inventory");
    }
    }

    @Test
    public void Testsell(Computer comp){
        // We can test if a computer is not in the inventory
        if(!inventory.contains(comp)){
            throw new RuntimeException("We don't have this computer!");
        }
    }
    
    @Test
    public void Testrefurbish(Computer comp, String newOS){
        // We can test if the OS is new by using the year made
    }
    
}
