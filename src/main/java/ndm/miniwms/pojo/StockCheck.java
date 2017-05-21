package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockCheck {
	private Integer id;// 鐩樼偣id
	private Date startAt;// 寮�濮嬫椂闂�
	private Date endAt;// 缁撴潫鏃堕棿
	private Integer companyId;// 鍏徃id
	private Integer operatorId;// 鎿嶄綔浜篿d
	private String description;// 璇存槑

	private List<StockCheckEntries> stockCheckEntriesList;//盘点明细
	private CompanyDetails companyDetails;//公司
	private CompanyUser companyUser;//用户

	public List<StockCheckEntries> getStockCheckEntriesList() {
		return stockCheckEntriesList;
	}

	public void setStockCheckEntriesList(List<StockCheckEntries> stockCheckEntriesList) {
		this.stockCheckEntriesList = stockCheckEntriesList;
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

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
