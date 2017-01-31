public class PlasticGarbage extends Garbage {
  boolean isClean;
  public PlasticGarbage(String garbageName, boolean isClean) {
    super(garbageName);
    this.isClean = isClean;
  }
  public boolean isClean() {
    return this.isClean;
  }
  public void clean() {
    this.isClean = true;
  }
}
