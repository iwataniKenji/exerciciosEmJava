public class Aluno extends Pessoa{

	private int ra;
	private String curso;

  // getters
	public int getRa(){
		return ra;
	}
	public String getCurso(){
		return curso;
	}

  // setters
	public void setRa(int ra){
		this.ra = ra;
	}
	public void setCurso(String curso){
		this.curso = curso;
	}
}