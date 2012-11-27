package cn.itcast.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {

	private String username;
	private String phoneNumber;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String update(){
		ActionContext.getContext().put("message", "update success!");
		return "message";
	}
	
	public String save(){
		ActionContext.getContext().put("message", "save success!");
		return null;
	}
/*	@Override
	public void validate() {
		if(this.username == null || "".equals(this.username.trim())){
			this.addFieldError("username", "username is null");
		}
		
		if(this.phoneNumber == null || "".equals(this.phoneNumber.trim())){
			this.addFieldError("phoneNumber", "phoneNumber is null!");
		}else{
			if(!Pattern.compile("^1[358]\\d{9}$").matcher(this.phoneNumber).matches()){
				this.addFieldError("phoneNumber", "phoneNumber's format has mistakes!");
			}
		}
		
		
	}
	
	*/
	
	
	
}
