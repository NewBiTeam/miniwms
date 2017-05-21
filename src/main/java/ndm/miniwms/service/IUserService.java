package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface IUserService {

	public List<CompanyUser> all();

	public void update(CompanyUser user);

	public void add(CompanyUser user);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<CompanyUser> selectTab(TableModel tm);
}
