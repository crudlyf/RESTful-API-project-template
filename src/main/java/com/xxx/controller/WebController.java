package com.xxx.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.beans.XXX;
import com.xxx.service.xxxService;

@RestController
public class WebController {
	
	@Autowired
	private xxxService xxxService;
	
	private static final String GET_XXX_DETAILS_URL = "/xxx/{xxx}";
	private static final String AUTHENTICATE_USER_URL = "/login";
	
	private static final String SESSION_LOGGEDIN_ATTRIBUTE = "loggedInUser";
	
	@RequestMapping(value = AUTHENTICATE_USER_URL, method = { RequestMethod.POST }, headers = "Accept=application/json")
	@ResponseBody
	public boolean getUserAuthentication(HttpSession session,@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {
		boolean authenticated = false;
				if(retailerService.getUserAuthentication(username, password)){
					HashMap<String, Boolean> user = new HashMap<String, Boolean>();
					user.put(username, true);
					session.setAttribute(SESSION_LOGGEDIN_ATTRIBUTE, user);
					authenticated = true;
				}
		return authenticated;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = GET_XXX_DETAILS_URL, method = { RequestMethod.GET }, headers = "Accept=application/json")
	@ResponseBody
	public Product getProductDetails(@PathVariable(value = "xxxId") final Long productId,
			HttpSession session, @RequestParam(value = "username", required = true) String username) {
		HashMap<String, Boolean> user = (HashMap<String, Boolean>) session.getAttribute(SESSION_LOGGEDIN_ATTRIBUTE);
		if(null!=user && user.get(username))				
		return xxxService.getxxxDetails(xxxId, username);
		else 
			return null;
	
		
	}
	
}