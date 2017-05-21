package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockIn {
	private Integer id; // 鍏ュ簱鍗昳d
	private Date created; // 鍒涘缓鏃堕棿
	private Date modified; // 淇敼鏃堕棿
	private Integer supplierId; // 渚涘簲鍟唅d
	private Date date; // 棰勮鍏ュ簱
	private boolean status; // 鐘舵��
	private Integer companyId; // 鍏徃id
	private Integer userId; // 鍒涘缓浜篿d
	private String billnumber; // 璁㈠崟缂栧彿
	private String description; // 澶囨敞
	private String customerBillnumber; // 瀹㈡埛璁㈠崟缂栧彿

	private SupplierDetails supplierDetails;//渚涘簲鍟�
	private List<StockInventory> stockInventoryList;//搴撳瓨
	private	List<StockInEntries> stockInEntriesList;//鍏ュ簱鍗曟槑缁�
	private CompanyDetails companyDetails;//鍏徃
	private CompanyUser companyUser;//鐢ㄦ埛

	public SupplierDetails getSupplierDetails() {
		return supplierDetails;
	}

	public void setSupplierDetails(SupplierDetails supplierDetails) {
		this.supplierDetails = supplierDetails;
	}

	public List<StockInventory> getStockInventoryList() {
		return stockInventoryList;
	}

	public void setStockInventoryList(List<StockInventory> stockInventoryList) {
		this.stockInventoryList = stockInventoryList;
	}

	public List<StockInEntries> getStockInEntriesList() {
		return stockInEntriesList;
	}

	public void setStockInEntriesList(List<StockInEntries> stockInEntriesList) {
		this.stockInEntriesList = stockInEntriesList;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public CompanyUser getCompanyUser() {
		return companyUser;
	}

	public void setCompanyUser(CompanyUser companyUser) {
		this.companyUser = companyUser;
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

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getBillnumber() {
		return billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerBillnumber() {
		return customerBillnumber;
	}

	public void setCustomerBillnumber(String customerBillnumber) {
		this.customerBillnumber = customerBillnumber;
	}

}
