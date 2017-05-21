package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class Warehouse {
	private Integer id; // 仓库id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String name; // 名称
	private String address; // 地址
	private String description; // 描述
	private String contactName; // 联系人名称
	private String contactTel; // 联系人号码
	private String contactFax; // 联系人传真
	private String contactEmail; // 联系人邮箱
	private String contactQq; // 联系人QQ
	private String contactMsn; // 联系人Skype
	private String contactDesc; // 联系人描述
	
	private CompanyDetails companyDetails;//公司
	private List<LocationDetails> locationDetailsList; //创库库位
	
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<LocationDetails> getLocationDetailsList() {
		return locationDetailsList;
	}

	public void setLocationDetailsList(List<LocationDetails> locationDetailsList) {
		this.locationDetailsList = locationDetailsList;
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

}
