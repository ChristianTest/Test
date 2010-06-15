package kraus;

/**
 * Diese Klasse enthält das eigentliche Bufferobjekt.
 * @author Christian
 * @version 2010-05-04
 */
public class TextBuffer {
	private String buff;
	private String sender;
	private int users;
	private int recieve;
	public TextBuffer () {
		sender="";
		buff="";
		recieve=0;
	}
	public void add (String msg) {
		buff=buff+msg;
	}

	public String getbuff () {
		return buff;
	}
	public void setusers (int users) {
		this.users=users;
	}
	public void msgrecieved () {
		recieve++;
	}
	public void newMsg () {
		recieve=0;
	}
	public int getUser () {
		return users;
	}
	public void addUser () {
		users++;
	}
	public void setMsgSender (String msg, String sender) {
		buff=msg;
		this.sender=sender;
	}
	public boolean anynewMsg (String send) {
		if ((recieve < (users-1))&&(!send.equals(sender))) {
			return true;
		} else {
			return false;
		}
	}
}
