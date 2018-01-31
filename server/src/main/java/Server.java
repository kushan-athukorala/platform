public class Server {
  private Common common = new Common();
  public void serve() {
    System.out.println("Serving");
    common.comms();
  }
}
