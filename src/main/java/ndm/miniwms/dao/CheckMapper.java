package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.pojo.StockItem;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.pojo.Warehouse;

public interface CheckMapper {

	public List<CompanyDetails> selectCompanyDetailsName(String name);
	
	public List<Warehouse> selectWarehouseName(String name);

	public List<SupplierDetails> selectSupplierDetailsName(String name);
	
	public List<LocationDetails> selectLocationDetailsName(String name);
	
	public List<BrandDetails> selectBrandDetailsName(String name);
	
	public List<StockItem> selectStockItemName(String name);
	
	public List<ConsigneeDetails> selectConsigneeDetailsName(String name);
	
	public List<CompanyUser> selectCompanyUserName(String name);
	
	public List<CategoryDetails> selectCategoryDetailsName(String name);
}
