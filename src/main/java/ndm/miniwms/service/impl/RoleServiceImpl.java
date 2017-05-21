package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ndm.miniwms.dao.CompanyRoleMapper;
import ndm.miniwms.dao.RoleHasMenuMapper;
import ndm.miniwms.pojo.CompanyRole;
import ndm.miniwms.pojo.RoleHasMenu;
import ndm.miniwms.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService{

	@Resource
	CompanyRoleMapper companyRoleMapper;

	@Resource
	RoleHasMenuMapper roleHasMenuMapper;
	
	@Override
	public List<CompanyRole> all() {
		return companyRoleMapper.all();
	}

	@Override
	public CompanyRole selectById(Integer id) {
		return companyRoleMapper.selById(id);
	}
	
	@Override
	public int delById(Integer id) {
		int s = companyRoleMapper.delById(id);
		if(s==1){
			return 1;
		}else{
			return 0;
		}
	}
	
	@Override
	public int update(CompanyRole companyRole) {
		int s=companyRoleMapper.update(companyRole);
		if(s==1){
			return 1;
		}else{
			return 0;
		}
	}

	@Override
	public int add(CompanyRole companyRole) {
		int s=companyRoleMapper.add(companyRole);
		if(s==1){
			return 1;
		}else{
			return 0;
		}
	}

	//删除role_has_menu表中role_id的*
	@Override
	public int delByRoleId(Integer id) {
		int s=roleHasMenuMapper.delByRoleId(id);
		if(s==1){
			return 1;
		}else{
			return 0;
		}
	}

	//往role_has_menu表中添加menuList
	@Override
	public int addRoleMenu(CompanyRole companyRole) {
		int s=0;
		for (int i = 0; i < companyRole.getMenuList().size(); i++) {
			RoleHasMenu rhm=new RoleHasMenu();
			rhm.setRoleId(companyRole.getId());
			rhm.setMenuId(companyRole.getMenuList().get(i).getId());
			s=roleHasMenuMapper.add(rhm);
		}
		if(s==1){
			return 1;
		}else{
			return 0;
		}
	}
	
}
