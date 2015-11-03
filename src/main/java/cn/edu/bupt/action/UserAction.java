package cn.edu.bupt.action;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.edu.bupt.model.User;
import cn.edu.bupt.service.UserService;

@Controller("userAction")
public class UserAction {
	@Autowired
	private UserService userService;
	private User user;
	
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user = user;
	}
	
	public String reg(){
		user.setId(UUID.randomUUID().toString());
		user.setRegtime(new Date());
		try{
			userService.addUser(user);
			ServletActionContext.getContext().getSession().put("user", user);
			ServletActionContext.getContext().getSession().put("msg", "ע��ɹ��ˣ�����ȥ��¼��");
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			ServletActionContext.getContext().getSession().put("msg", "ע��ʧ����");
			return "error";
		}
	}
	
}
