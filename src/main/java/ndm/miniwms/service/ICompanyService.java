package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface ICompanyService {
	public List<CompanyDetails> all();

	public void update(CompanyDetails companyDetails);

	public void add(CompanyDetails companyDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<CompanyDetails> selectTab(TableModel model);
}
