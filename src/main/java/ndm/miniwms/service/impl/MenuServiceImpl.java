package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ndm.miniwms.dao.SysMenuMapper;
import ndm.miniwms.pojo.SysMenu;
import ndm.miniwms.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService{

	@Resource
	SysMenuMapper sysMenuMapper;
	
	@Override
	public List<SysMenu> all() {
		return sysMenuMapper.all();
	}
	
}
