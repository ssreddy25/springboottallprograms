package jdbcjaxwsrpctype;

public class Employeee {
	
	private int eid;
	private String ename;
	private String elast;
	private String email;
	private String epwd;
	private String econpwd;
	private String ephone;
	private String edate;
	private String eaddres;
	private String egender;
	
	
	public Employeee(){}


	public Employeee(int eid, String ename, String elast, String email, String epwd, String econpwd, String ephone,
			String edate, String eaddres, String egender) {
		
		this.eid = eid;
		this.ename = ename;
		this.elast = elast;
		this.email = email;
		this.epwd = epwd;
		this.econpwd = econpwd;
		this.ephone = ephone;
		this.edate = edate;
		this.eaddres = eaddres;
		this.egender = egender;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getElast() {
		return elast;
	}


	public void setElast(String elast) {
		this.elast = elast;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEpwd() {
		return epwd;
	}


	public void setEpwd(String epwd) {
		this.epwd = epwd;
	}


	public String getEconpwd() {
		return econpwd;
	}


	public void setEconpwd(String econpwd) {
		this.econpwd = econpwd;
	}


	public String getEphone() {
		return ephone;
	}


	public void setEphone(String ephone) {
		this.ephone = ephone;
	}


	public String getEdate() {
		return edate;
	}


	public void setEdate(String edate) {
		this.edate = edate;
	}


	public String getEaddres() {
		return eaddres;
	}


	public void setEaddres(String eaddres) {
		this.eaddres = eaddres;
	}


	public String getEgender() {
		return egender;
	}


	public void setEgender(String egender) {
		this.egender = egender;
	}


	@Override
	public String toString() {
		return "Employeee [eid=" + eid + ", ename=" + ename + ", elast=" + elast + ", email=" + email + ", epwd=" + epwd
				+ ", econpwd=" + econpwd + ", ephone=" + ephone + ", edate=" + edate + ", eaddres=" + eaddres
				+ ", egender=" + egender + "]";
	}
	
	
	

}
