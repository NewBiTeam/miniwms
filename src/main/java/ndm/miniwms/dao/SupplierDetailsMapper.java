package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.SupplierDetails;

public interface SupplierDetailsMapper {
	List<SupplierDetails> all();

	int delById(Integer id);

	int update(SupplierDetails supplierDetails);

	int add(SupplierDetails supplierDetails);

	SupplierDetails selectById(Integer id);

	List<SupplierDetails> selectTab();
	
	
}
