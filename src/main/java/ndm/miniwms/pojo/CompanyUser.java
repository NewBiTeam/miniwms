package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class CompanyUser {
	private Integer id; // 用户id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String username; // 名称
	private String password; // 密码
	private String address; // 地址
	private String tel; // 电话
	private String cname; // 别名
	private Integer companyId; // 公司id

	private CompanyDetails companyDetails; //公司
	private List<Warehouse> warehouseList; //仓库
	private List<CustomizeReport> customizeReportList; //自定义报表
	private List<StockCheck> stockCheckList; //盘点
	private List<StockIn> stockInList; //入库单
	private List<StockEntries> stockEntriesList; //库存变更记录
	private List<StockOut>  stockOutsList; //出库单
	private List<StockInventory> stockInventoryList;//库存
	
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<Warehouse> getWarehouseList() {
		return warehouseList;
	}

	public void setWarehouseList(List<Warehouse> warehouseList) {
		this.warehouseList = warehouseList;
	}

	public List<CustomizeReport> getCustomizeReportList() {
		return customizeReportList;
	}

	public void setCustomizeReportList(List<CustomizeReport> customizeReportList) {
		this.customizeReportList = customizeReportList;
	}

	public List<StockCheck> getStockCheckList() {
		return stockCheckList;
	}

	public void setStockCheckList(List<StockCheck> stockCheckList) {
		this.stockCheckList = stockCheckList;
	}

	public List<StockIn> getStockInList() {
		return stockInList;
	}

	public void setStockInList(List<StockIn> stockInList) {
		this.stockInList = stockInList;
	}

	public List<StockEntries> getStockEntriesList() {
		return stockEntriesList;
	}

	public void setStockEntriesList(List<StockEntries> stockEntriesList) {
		this.stockEntriesList = stockEntriesList;
	}

	public List<StockOut> getStockOutsList() {
		return stockOutsList;
	}

	public void setStockOutsList(List<StockOut> stockOutsList) {
		this.stockOutsList = stockOutsList;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
