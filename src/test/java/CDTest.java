import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class CDTest {

  @Test
  public void CD_instantiatesCorrectly_true() {
    CD myCD = new CD("The Reverand Ace FuzzBall");
    assertEquals(true, myCD instanceof CD);
  }

  @Test
  public void CD_titleTest_String() {
    CD myCD = new CD("Blood, Sugar, Sex Magic");
    assertEquals("Blood, Sugar, Sex Magic", myCD.getTitle());
  }

  @Test
  public void CD_addmultipleCDS_true() {
    CD.clear();
    CD myCD1 = new CD("The best cd ever");
    CD myCD2 = new CD("The best cd ever again");
    assertTrue(CD.getCD().contains(myCD1));
    assertTrue(CD.getCD().contains(myCD2));
  }

  @Test
  public void CD_listOutCDS_array() {
    CD.clear();
    CD myCD1 = new CD("The best cd ever");
    CD myCD2 = new CD("The best cd ever again");
    assertEquals(CD.getCD().size(), 2);
  }

  @Test
  public void getId_CDSCreatedWIthID_1() {
    CD.clear();  // THIS TEST WILL FAIL WITHOUT THIS LINE!
    CD myCD1 = new CD("The best cd ever");
    CD myCD2 = new CD("The best cd ever again");
    assertEquals(1, myCD1.getId());
  }

}
