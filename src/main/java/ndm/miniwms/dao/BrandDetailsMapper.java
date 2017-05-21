package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.BrandDetails;

public interface BrandDetailsMapper {
	List<BrandDetails> all();

	int delById(Integer id);

	int update(BrandDetails branddetails);

	int add(BrandDetails branddetails);
	
	BrandDetails selectById(Integer id);

	List<BrandDetails> selectTab();
}
