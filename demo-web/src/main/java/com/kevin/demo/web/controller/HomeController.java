package com.kevin.demo.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm(Model model){
		//model.addAttribute("user", new User());
		return "/login.jsp";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	//public String login(String userName, String password,BindingResult bindingResult,RedirectAttributes redirectAttributes){
	public String login(String userName, String password){
		try {
			/*if(bindingResult.hasErrors()){
				return "/login";
			}*/
			//使用权限工具进行用户登录，登录成功后跳到shiro配置的successUrl中，与下面的return没什么关系！
			SecurityUtils.getSubject().login(new UsernamePasswordToken(userName, password));
			return "redirect:/user.jsp";
		} catch (AuthenticationException e) {
			//redirectAttributes.addFlashAttribute("message","用户名或密码错误");
			return "redirect:/login.jsp";
		}
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)  
    public String logout(RedirectAttributes redirectAttributes ){ 
		//使用权限管理工具进行用户的退出，跳出登录，给出提示信息
        SecurityUtils.getSubject().logout();  
        redirectAttributes.addFlashAttribute("message", "您已安全退出");  
        return "redirect:/login";
    } 
	
	@RequestMapping("/403")
	public String unauthorizedRole(){
		return "/403.jsp";
	}
}