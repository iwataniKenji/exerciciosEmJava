public class Professor extends Pessoa{

	private int codP;
	private String tituloP;

  // getters
	public int getCodP(){
		return codP;
	}
  public String getTituloP(){
		return tituloP;
	}

  // setters
	public void setCodP(int codP){
		this.codP = codP;
	}
	public void setTituloP(String tituloP){
		this.tituloP = tituloP;
	}
}