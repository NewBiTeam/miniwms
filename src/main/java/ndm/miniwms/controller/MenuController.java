package ndm.miniwms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.SysMenu;
import ndm.miniwms.service.impl.MenuServiceImpl;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Resource
	MenuServiceImpl menuService;
	
	
	@RequestMapping("/all")
	@ResponseBody
	public List<SysMenu> all(){
		return menuService.all();
	}
}
