package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class CompanyDetails {
	private Integer id; // 公司id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String name; // 名称
	private String anothername; // 别名
	private String address; // 地址
	private String email; // 邮箱
	private String description; // 描述
	private Integer issystem; // 是否是主公司
	private String contactName; // 联系人名称
	private String contactTel; // 联系人号码
	private String contactFax; // 联系人传真
	private String contactEmail; // 联系人邮箱
	private String contactQq; // 联系人QQ
	private String contactMsn; // 联系人Skype
	private String contactDesc; // 联系人描述
	private String skuPrev; // SKU前缀

	private List<LocationDetails> locationDetailsList; // 公司库位
	private List<CompanyUser> companyUserList; // 公司用户
	private List<CompanyRole> companyRoleList; // 公司角色
	private List<BrandDetails> brandDetailsList; // 公司品牌
	private List<SupplierDetails> supplierDetailsList; //公司供应商
	private List<ConsigneeDetails> consigneeDetailsList; //公司收货人
	private List<StockItem> stockItemList; //公司商品
	private List<StockIn> stockInList; //公司入库单
	private List<StockOut> stockOutList; //公司出库单
	private List<CustomizeReport>  customizeReportList; //公司自定义报表
	private List<StockEntries> stockEntriesList; //公司库存变更
	private List<StockCheck> stockCheckList; //公司盘点
	private List<StockInventory> stockInventoryList; //库存
	
	public List<LocationDetails> getLocationDetailsList() {
		return locationDetailsList;
	}

	public void setLocationDetailsList(List<LocationDetails> locationDetailsList) {
		this.locationDetailsList = locationDetailsList;
	}

	public List<CompanyUser> getCompanyUserList() {
		return companyUserList;
	}

	public void setCompanyUserList(List<CompanyUser> companyUserList) {
		this.companyUserList = companyUserList;
	}

	public List<CompanyRole> getCompanyRoleList() {
		return companyRoleList;
	}

	public void setCompanyRoleList(List<CompanyRole> companyRoleList) {
		this.companyRoleList = companyRoleList;
	}

	public List<BrandDetails> getBrandDetailsList() {
		return brandDetailsList;
	}

	public void setBrandDetailsList(List<BrandDetails> brandDetailsList) {
		this.brandDetailsList = brandDetailsList;
	}

	public List<SupplierDetails> getSupplierDetailsList() {
		return supplierDetailsList;
	}

	public void setSupplierDetailsList(List<SupplierDetails> supplierDetailsList) {
		this.supplierDetailsList = supplierDetailsList;
	}

	public List<ConsigneeDetails> getConsigneeDetailsList() {
		return consigneeDetailsList;
	}

	public void setConsigneeDetailsList(List<ConsigneeDetails> consigneeDetailsList) {
		this.consigneeDetailsList = consigneeDetailsList;
	}

	public List<StockItem> getStockItemList() {
		return stockItemList;
	}

	public void setStockItemList(List<StockItem> stockItemList) {
		this.stockItemList = stockItemList;
	}

	public List<StockIn> getStockInList() {
		return stockInList;
	}

	public void setStockInList(List<StockIn> stockInList) {
		this.stockInList = stockInList;
	}

	public List<StockOut> getStockOutList() {
		return stockOutList;
	}

	public void setStockOutList(List<StockOut> stockOutList) {
		this.stockOutList = stockOutList;
	}

	public List<CustomizeReport> getCustomizeReportList() {
		return customizeReportList;
	}

	public void setCustomizeReportList(List<CustomizeReport> customizeReportList) {
		this.customizeReportList = customizeReportList;
	}

	public List<StockEntries> getStockEntriesList() {
		return stockEntriesList;
	}

	public void setStockEntriesList(List<StockEntries> stockEntriesList) {
		this.stockEntriesList = stockEntriesList;
	}

	public List<StockCheck> getStockCheckList() {
		return stockCheckList;
	}

	public void setStockCheckList(List<StockCheck> stockCheckList) {
		this.stockCheckList = stockCheckList;
	}

	public List<StockInventory> getStockInventoryList() {
		return stockInventoryList;
	}

	public void setStockInventoryList(List<StockInventory> stockInventoryList) {
		this.stockInventoryList = stockInventoryList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnothername() {
		return anothername;
	}

	public void setAnothername(String anothername) {
		this.anothername = anothername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIssystem() {
		return issystem;
	}

	public void setIssystem(Integer issystem) {
		this.issystem = issystem;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getContactFax() {
		return contactFax;
	}

	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactQq() {
		return contactQq;
	}

	public void setContactQq(String contactQq) {
		this.contactQq = contactQq;
	}

	public String getContactMsn() {
		return contactMsn;
	}

	public void setContactMsn(String contactMsn) {
		this.contactMsn = contactMsn;
	}

	public String getContactDesc() {
		return contactDesc;
	}

	public void setContactDesc(String contactDesc) {
		this.contactDesc = contactDesc;
	}

	public String getSkuPrev() {
		return skuPrev;
	}

	public void setSkuPrev(String skuPrev) {
		this.skuPrev = skuPrev;
	}

}
