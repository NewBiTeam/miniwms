package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.CompanyDetailsMapper;
import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.service.ICompanyService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class CompanyServiceImpl implements ICompanyService{

	@Resource
	private CompanyDetailsMapper companyMapper;
	
	@Override
	public List<CompanyDetails> all() {
		return companyMapper.all();
	}

	@Override
	public void update(CompanyDetails companyDetails) {
		companyMapper.update(companyDetails);
	}

	@Override
	public void add(CompanyDetails companyDetails) {
		companyMapper.add(companyDetails);
	}

	@Override
	public void delete(Integer id) {
		companyMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		companyMapper.selectById(id);
	}

	@Override
	public Pagination<CompanyDetails> selectTab(TableModel model) {
		PageHelper.startPage(model.getPageNum(), model.getLength());
	    List<CompanyDetails> list = companyMapper.selectTab();
	    //��PageInfo�Խ�����а�װ
	    PageInfo<CompanyDetails> page = new PageInfo<CompanyDetails>(list);
	    //����PageInfoȫ������
	    Pagination<CompanyDetails> companyPage = new Pagination<CompanyDetails>();
	    companyPage.setDraw(model.getDraw());
	    companyPage.setData(list);
	    companyPage.setRecordsFiltered((int)page.getTotal());
	    companyPage.setRecordsTotal((int)page.getTotal());
        return companyPage;
	}
	
}
