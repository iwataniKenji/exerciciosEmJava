// classe não concluída
public class Pessoa {
  private String name = "";

  public void setNome(String name) throws NameLengthException {
    int nameLength = name.length();

    if (nameLength >= 10 && nameLength <= 20) {
      this.name = name;
    } else {
      throw new NameLengthException();
    }
  }
}
