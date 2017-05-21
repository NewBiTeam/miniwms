package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class BrandDetails {
	private Integer id; // 品牌id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String name; // 名称
	private Integer companyId; // 公司id

	private CompanyDetails companyDetails; //公司
	private List<StockItem> stockItemList; //商品

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<StockItem> getStockItemList() {
		return stockItemList;
	}

	public void setStockItemList(List<StockItem> stockItemList) {
		this.stockItemList = stockItemList;
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

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
