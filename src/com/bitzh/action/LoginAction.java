package com.bitzh.action;


import com.bitzh.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private User user;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception{
        if(this.username.equals("admin") && this.password.equals("123123")){
            Map session = ActionContext.getContext().getSession();
            session.put("login", username);
            return SUCCESS;
        }else{
            return LOGIN;
        }
    }
    public String checkLogin(){
        if(this.username.equals("admin") && this.password.equals("123123")){
            return SUCCESS;
        }else{
            return LOGIN;
        }
    }
}
