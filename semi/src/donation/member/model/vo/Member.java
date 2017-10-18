package donation.member.model.vo;

import java.sql.Date;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberNo;
	private String memberNik;
	private String memberAddress;
	private String memberEmail;
	private String memberPhone;
	private Date signupDate;
	private String connection;
	public Member() {
		super();
	}
	public Member(String memberId, String memberPwd, String memberName, String memberNo, String memberNik,
			String memberAddress, String memberEmail, String memberPhone, Date signupDate, String connection) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberNo = memberNo;
		this.memberNik = memberNik;
		this.memberAddress = memberAddress;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.signupDate = signupDate;
		this.connection = connection;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberNik() {
		return memberNik;
	}
	public void setMemberNik(String memberNik) {
		this.memberNik = memberNik;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public Date getSignupDate() {
		return signupDate;
	}
	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	
	@Override
	public String toString(){
		return this.memberId + "," + this.memberPwd + "," + this.memberName + "," 
			    + this.memberNo + "," + this.memberNik + "," + this.memberAddress + ","
				+ this.memberEmail + "," + this.memberPhone + "," + this.signupDate + "," + this.connection;
	}
	
		
}
