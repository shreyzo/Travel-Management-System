
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class AddPControllerTest {

  AddPController addPController;

    @BeforeAll
    static void beforeAll() {
        System.out.println("This needs to run before all");
    }

    @BeforeEach
    void init() {
        addPController = new AddPController();
    }

    @AfterEach
    void cleanup() {
       System.out.println("Cleaning up..");
   }
  
    void T05_001() {
        AddPController cn = new AddPController();
        Packages pc = new Packages();
        pc.set("12/12/2019", "Manali", "9890465730", "12/1/2020","Famous for its lake", "30", (float)-22.8, 14990 );
        assertEquals(false, cn.checkValidity(pc), "Price invalid");
      }
    @Test
    void T05_002() {
        AddPController cn = new AddPController();
        Packages pc = new Packages();
        pc.set("12/12/2019", "Manali", "9890465730", "12/1/2020","Famous for its lake", "30", (float)28022, 14990 );
        assertEquals(true, cn.checkValidity(pc), "Price invalid");
      }
    @Test
    void T05_003() {
        AddPController cn = new AddPController();
        Packages pc = new Packages();
        pc.set("12/12/2019", "Manali", "9890465730", "12/1/2020","Famous for its lake", "30", (float)9999999999, 14990 );
        assertEquals(false, cn.checkValidity(pc), "Price invalid");
      }
    @Test
    void T05_004() {
          AddPController cn = new AddPController();
          Packages pc = new Packages();
          pc.set("12/12/2019", "Manali", "02101393", "12/1/2020","Famous for its lake", "30", (float)-22.8, 14990 );
          assertEquals(false, cn.checkValidity(pc), "Checks for valid contact number");
      }
    @Test
    void T05_005() {
          AddPController cn = new AddPController();
          Packages pc = new Packages();
          pc.set("12/12/2019", "Manali", "9876897789", "12/1/2020","Famous for its lake", "30", (float)-22.8, 14990 );
          assertEquals(true, cn.checkValidity(pc), "Checks for valid contact number");
        }
    @Test
    void T05_006() {
          AddPController cn = new AddPController();
          Packages pc = new Packages();
          pc.set("12/12/2019", "Manali", "99919031009", "12/1/2020","Famous for its lake", "30", (float)-22.8, 14990 );
          assertEquals(false, cn.checkValidity(pc), "Checks for valid contact number");
        }
    @Test
    void T05_007() {
          AddPController cn = new AddPController();
          Packages pc = new Packages();
          pc.set("12/12/2019", "Manali", "99919031009", "12/1/2020","Famous for its lake", "30", (float)-22.8, 999 );
          assertEquals(false, cn.checkValidity(pc), "Checks if price is valid");
          }
    @Test
    void T05_008() {
          AddPController cn = new AddPController();
          Packages pc = new Packages();
          pc.set("12/12/2019", "Manali", "99919031009", "12/1/2020","Famous for its lake", "30", (float)-22.8, 1000 );
          assertEquals(false, cn.checkValidity(pc), "Checks if price is valid");
          }
    @Test
    void T05_009() {
          AddPController cn = new AddPController();
          Packages pc = new Packages();
          pc.set("12/12/2019", "Manali", "99919031009", "12/1/2020","Famous for its lake", "30", (float)-22.8, 1001);
          assertEquals(true, cn.checkValidity(pc), "Checks if price is valid");
          }
}
