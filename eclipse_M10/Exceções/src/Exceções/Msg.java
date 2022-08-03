package Exceções;

public class Msg {
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		String msg1 = null;
		String msg2 = "teste";
		String msg3 = "Isto é um teste muito importante";
		
		MsgOther m = new MsgOther();
		m.erroMsg(msg3);
	}
}
