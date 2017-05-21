package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockOut {
	private Integer id; // 閸戝搫绨遍崡鏄砫
	private Date created; // 閸掓稑缂撻弮鍫曟？
	private Date modified; // 娣囶喗鏁奸弮鍫曟？
	private Integer consigneeId; // 閺�鎯版彛娴滅d
	private Date date; // 妫板嫯顓搁崙鍝勭氨
	private String status; // 閻樿埖锟斤拷
	private Integer companyId; // 閸忣剙寰僫d
	private Integer userId; // 閸掓稑缂撴禍绡縟
	private String billnumber; // 鐠併垹宕熺紓鏍у娇
	private String description; // description
	private String customerBillnumber; // 瀹㈡埛璁㈠崟缂栧彿

	private List<StockEntries> stockEntriesList;//搴撳瓨鍙樻洿璁板綍
	private List<StockOutEntries> stockOutEntriesList;//鍑哄簱鍗曟潯鐩�
	private ConsigneeDetails consigneeDetails;//鏀惰揣浜�
	private CompanyDetails companyDetails;//鍏徃
	private CompanyUser companyUser;//鐢ㄦ埛/鍒涘缓浜�

	public List<StockEntries> getStockEntriesList() {
		return stockEntriesList;
	}

	public void setStockEntriesList(List<StockEntries> stockEntriesList) {
		this.stockEntriesList = stockEntriesList;
	}

	public List<StockOutEntries> getStockOutEntriesList() {
		return stockOutEntriesList;
	}

	public void setStockOutEntriesList(List<StockOutEntries> stockOutEntriesList) {
		this.stockOutEntriesList = stockOutEntriesList;
	}

	public ConsigneeDetails getConsigneeDetails() {
		return consigneeDetails;
	}

	public void setConsigneeDetails(ConsigneeDetails consigneeDetails) {
		this.consigneeDetails = consigneeDetails;
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

	public Integer getConsigneeId() {
		return consigneeId;
	}

	public void setConsigneeId(Integer consigneeId) {
		this.consigneeId = consigneeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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
