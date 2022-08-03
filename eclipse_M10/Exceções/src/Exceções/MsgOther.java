package Exce��es;

public class MsgOther extends Exception{
	private static final long serialVersionUID = 1L;
	
	public void erroMsg(String msg) {
		if(msg == null) {
			throw new IllegalArgumentException("A mensagem n�o pode ser null!!");
		}
		
		if(msg.length()<12) {
			throw new IllegalArgumentException("mensagem demasiado pequena!");
		}
	}
}
