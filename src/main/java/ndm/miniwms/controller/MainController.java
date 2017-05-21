package ndm.miniwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.service.ILoginService;
import ndm.miniwms.vo.Message;

@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	@Resource
	private ILoginService loginService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> login(CompanyUser companyUser, HttpSession session) {
		CompanyUser user = loginService.select(companyUser);
		if (user == null) {
//			response.setStatus(401);
			return new ResponseEntity<Message>(HttpStatus.UNAUTHORIZED);
		} else {
			session.setAttribute("user", user);
		}
		return new ResponseEntity<Message>(new Message(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/logout")
	@ResponseBody
	public void logout(HttpSession session) {
		session.removeAttribute("user");
	}

}
