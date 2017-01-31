import java.util.ArrayList;
public class Dustbin {
  String color;
  ArrayList<PaperGarbage> paperContent;
  ArrayList<PlasticGarbage> plasticContent;
  ArrayList<Garbage> houseWasteContent;
  public Dustbin(String color) {
    this.color = color;
    this.paperContent = new ArrayList<PaperGarbage> ();
    this.plasticContent = new ArrayList<PlasticGarbage> ();
    this.houseWasteContent = new ArrayList<Garbage> ();
  }
  public void throwOutGarbage(Object garbage) throws DustbinContentException {
    if(garbage instanceof PaperGarbage) {
      if(((PaperGarbage)garbage).isSqueezed()) {
        this.paperContent.add((PaperGarbage)garbage);
      } else {
        throw new DustbinContentException();
      }
    } else if(garbage instanceof PlasticGarbage) {
      if(((PlasticGarbage)garbage).isClean()) {
        this.plasticContent.add((PlasticGarbage)garbage);
      } else {
        throw new DustbinContentException();
      }
    } else if(garbage instanceof Garbage) {
      this.houseWasteContent.add((Garbage)garbage);
    } else {
      throw new DustbinContentException();
    }
  }
  public PaperGarbage[] getPaperContent() {
    return this.paperContent.toArray(new PaperGarbage[0]);
  }
  public PlasticGarbage[] getPlasticContent() {
    return this.plasticContent.toArray(new PlasticGarbage[0]);
  }
  public Garbage[] getHouseWasteContent() {
    return this.houseWasteContent.toArray(new Garbage[0]);
  }
  public void emptyContents() {
    this.paperContent.clear();
    this.plasticContent.clear();
    this.houseWasteContent.clear();
  }
}
