package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class ConsigneeDetails {
	private Integer id; // 鏀惰揣浜篿d
	private Date created; // 鍒涘缓鏃堕棿
	private Date modified; // 淇敼鏃堕棿
	private String name; // 鍚嶇О
	private String address; // 鍦板潃
	private String description; // 鎻忚堪
	private String contactName; // 鑱旂郴浜哄悕绉�
	private String contactTel; // 鑱旂郴浜哄彿鐮�
	private String contactFax; // 鑱旂郴浜轰紶鐪�
	private String contactEmail; // 鑱旂郴浜洪偖绠�
	private String contactQq; // 鑱旂郴浜篞Q
	private String contactMsn; // 鑱旂郴浜篠kype
	private String contactDesc; // 鑱旂郴浜烘弿杩�
	private String companyId; // 鍏徃id
	private CompanyDetails companyDetails; //公司
	private List<StockOut> stockOutList;//出库单
	
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<StockOut> getStockOutList() {
		return stockOutList;
	}

	public void setStockOutList(List<StockOut> stockOutList) {
		this.stockOutList = stockOutList;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

}
