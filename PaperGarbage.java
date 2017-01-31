public class PaperGarbage extends Garbage {
  boolean isSqueezed;
  public PaperGarbage(String garbageName, boolean isSqueezed) {
    super(garbageName);
    this.isSqueezed = isSqueezed;
  }
  public boolean isSqueezed() {
    return this.isSqueezed;
  }

  public void squeeze() {
    this.isSqueezed = true;
  }
}
