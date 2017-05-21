package ndm.miniwms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ndm.miniwms.dao.LoginMapper;
import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.service.ILoginService;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Resource
	private LoginMapper dao;

	@Override
	public CompanyUser select(CompanyUser companyUser) {
		return dao.select(companyUser);
	}

}
