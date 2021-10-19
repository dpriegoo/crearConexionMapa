package crearConexion;

public class conexion {
	String host;
	String port;
	String dbname;
	String username;
	String userpass;
	
	public conexion(String host, String port, String dbname, String username, String userpass) {
		super();
		this.host = host;
		this.port = port;
		this.dbname = dbname;
		this.username = username;
		this.userpass = userpass;
	}
	public conexion() {
		// TODO Auto-generated constructor stub
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getDbname() {
		
		return dbname;
	}
	public void setDbname(String dbname) {
		if(this.dbname==null) {
			this.dbname="ORCL";
		} else
		this.dbname = dbname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "conexion [host=" + host + ", port=" + port + ", dbname=" + dbname + ", username=" + username
				+ ", userpass=" + userpass + "]";
	}
	
	
	
}
