package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.CompanyRole;

public interface CompanyRoleMapper {
	List<CompanyRole> all();

	int delById(Integer id);

	int update(CompanyRole companyRole);

	int add(CompanyRole companyRole);
	
	public CompanyRole selById(Integer id);
}
