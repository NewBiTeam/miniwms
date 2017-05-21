package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.SysMenu;

public interface SysMenuMapper {

	List<SysMenu> all();
	
	int delById(Integer id);
	
	int update(SysMenu sysMenu);
	
	int add(SysMenu sysMenu);
}
