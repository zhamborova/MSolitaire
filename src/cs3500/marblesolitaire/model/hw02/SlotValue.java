package cs3500.marblesolitaire.model.hw02;

public enum SlotValue {
  invalid(" "), empty("_"), peg("O");

  String value;

  SlotValue(String s) {
    this.value = s;
  }

  public String getValue() {
    return this.value;
  }
}
