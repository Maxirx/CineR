import java.sql.*;
public class IniSession {

	public String mail;
	public String password;
	public Coneccion_BD conn;
	
	public IniSession() {
		
	}
	public  IniSession(String mail, String password) {
		
		this.mail = mail;
		this.password = password;
		this.conn=new Coneccion_BD();
	}
	public String getmail() {
		return mail;
	}
	public void mail(String mail) {
		this.mail = mail;
	}
	public String getPass() {
		return password;
	}
	public void Pass(String password) {
		this.password = password;
	}
	
	public ResultSet ingresar() throws SQLException {
		
		String sql="select * from Usuarios where mail="+"'"+this.mail+"'"+ " and pass="+"'"+this.password+"'"+";";
		
		ResultSet rs=conn.RetornarConsulta(sql);
		
		return rs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
