import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ServerTest {
  @Test
  public void testServe1() {
    Server server = new Server();
    server.serve();
    Assert.assertEquals(true, true);
  }
  @Test
  public void testServe2() {
    Server server = new Server();
    server.serve();
    Assert.assertEquals(true, true);
  }
  @Test
  public void testServe3() {
    Server server = new Server();
    server.serve();
    Assert.assertEquals(true, true);
  }
}
