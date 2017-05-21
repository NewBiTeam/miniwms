package ndm.miniwms.util;

import java.util.List;

import javax.annotation.Resource;

import ndm.miniwms.dao.BrandDetailsMapper;
import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.dao.CheckMapper;
import ndm.miniwms.dao.CompanyDetailsMapper;
import ndm.miniwms.dao.CompanyUserMapper;
import ndm.miniwms.dao.ConsigneeDetailsMapper;
import ndm.miniwms.dao.LocationDetailsMapper;
import ndm.miniwms.dao.StockItemMapper;
import ndm.miniwms.dao.SupplierDetailsMapper;
import ndm.miniwms.dao.WarehouseMapper;
import ndm.miniwms.exception.DuplicateNameException;
import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.pojo.StockItem;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.pojo.Warehouse;
import ndm.miniwms.vo.Message;

public class EntityCheckUtils {
	
	
	@Resource
	private CheckMapper checkMapper;

	public Message check(Warehouse warehouse) {
		Message message = new Message();
		if (warehouse.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;

	}

	/**
	 * 
	 * @param warehouse
	 * @return 1 名称不为空，2名称为空
	 */
	public Message check(Warehouse warehouse, Boolean flag) {
		if (flag) {
			Message message = check(warehouse);
			if (message.getCode() == 1) {
				if (checkMapper.selectWarehouseName(warehouse.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(warehouse);
		}

	}

	/**
	 * 
	 * @param warehouse
	 * @return 1 名称不为空，2名称为空
	 */
	public Message check(CompanyDetails companyDetails) {
		Message message = new Message();
		if (companyDetails.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(CompanyDetails companyDetails, Boolean flag) {
		if (flag) {
			Message message = check(companyDetails);
			if (message.getCode() == 1) {
				if (checkMapper.selectCompanyDetailsName(companyDetails.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(companyDetails);
		}
	}

	public Message check(SupplierDetails supplierDetails) {
		Message message = new Message();
		if (supplierDetails.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(SupplierDetails supplierDetails, Boolean flag) {
		if (flag) {
			Message message = check(supplierDetails);
			if (message.getCode() == 1) {
				if (checkMapper.selectSupplierDetailsName(supplierDetails.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		}else{
			return check(supplierDetails);
		}
	}
	
	public Message check(LocationDetails locationDetails) {
		Message message = new Message();
		if (locationDetails.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(LocationDetails locationDetails, Boolean flag) {
		if (flag) {
			Message message = check(locationDetails);
			if (message.getCode() == 1) {
				if (checkMapper.selectLocationDetailsName(locationDetails.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(locationDetails);
		}
	}

	public Message check(BrandDetails brandDetails) {
		Message message = new Message();
		if (brandDetails.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(BrandDetails brandDetails, Boolean flag) {
		if (flag) {
			Message message = check(brandDetails);
			if (message.getCode() == 1) {
				if (checkMapper.selectBrandDetailsName(brandDetails.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(brandDetails);
		}
	}

	public Message check(StockItem stockItem) {
		Message message = new Message();
		if (stockItem.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(StockItem stockItem, Boolean flag) {
		if (flag) {
			Message message = check(stockItem);
			if (message.getCode() == 1) {
				if (checkMapper.selectStockItemName(stockItem.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(stockItem);
		}
	}

	public Message check(ConsigneeDetails consigneeDetails) {
		Message message = new Message();
		if (consigneeDetails.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(ConsigneeDetails consigneeDetails, Boolean flag) {
		if (flag) {
			Message message = check(consigneeDetails);
			if (message.getCode() == 1) {
				if (checkMapper.selectConsigneeDetailsName(consigneeDetails.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(consigneeDetails);
		}
	}

	public Message check(CompanyUser companyUser) {
		Message message = new Message();
		if (companyUser.getUsername() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(CompanyUser companyUser, Boolean flag) {
		if (flag) {
			Message message = check(companyUser);
			if (message.getCode() == 1) {
				if (checkMapper.selectCompanyUserName(companyUser.getUsername()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(companyUser);
		}
	}

	public Message check(CategoryDetails categoryDetails) {
		Message message = new Message();
		if (categoryDetails.getName() != null) {
			message.setCode(1);
			message.setContent("名称不为空");
		} else {
			message.setCode(2);
			message.setContent("名称为空");
		}
		return message;
	}

	public Message check(CategoryDetails categoryDetails, Boolean flag) {
		if (flag) {
			Message message = check(categoryDetails);
			if (message.getCode() == 1) {
				if (checkMapper.selectCategoryDetailsName(categoryDetails.getName()) != null) {
					try {
						throw new DuplicateNameException();
					} catch (DuplicateNameException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return message;
		} else {
			return check(categoryDetails);
		}
	}
	
	/*
	 * @Resource private WarehouseMapper warehouseMapper;
	 * 
	 * @Resource private CompanyDetailsMapper companyDetailsMapper;
	 * 
	 * @Resource private SupplierDetailsMapper supplierDetailsMapper;
	 * 
	 * @Resource private LocationDetailsMapper locationDetailsMapper;
	 * 
	 * @Resource private BrandDetailsMapper brandDetailsMapper;
	 * 
	 * @Resource private StockItemMapper stockItemMapper;
	 * 
	 * @Resource private ConsigneeDetailsMapper consigneeDetailsMapper;
	 * 
	 * @Resource private CompanyUserMapper companyUserMapper;
	 * 
	 * @Resource private CategoryDetailsMapper categoryDetailsMapper;
	 */
	/**
	 * 
	 * @param warehouse
	 * @return 1 名称不为空，2名称为空
	 *//*
		 * public Message check(Warehouse warehouse) { Message message = new
		 * Message(); if (warehouse.getName() != null) { message.setCode(1);
		 * message.setContent("名称不为空"); } else { message.setCode(2);
		 * message.setContent("名称为空"); } return message;
		 * 
		 * }
		 */
	/**
	 * 
	 * @param warehouse
	 * @return 1 名称不为空，2名称为空
	 *//*
		 * public Message check(Warehouse warehouse, Boolean flag) { if (flag) {
		 * Message message = check(warehouse); if (message.getCode() == 1) {
		 * List<Warehouse> warehouses = warehouseMapper.all(); for(Warehouse
		 * warehouse2 : warehouses){ if(warehouse.getId() ==
		 * warehouse2.getId()){ continue; }
		 * if(warehouse.getName().equals(warehouse2.getName())){ try { throw new
		 * DuplicateNameException(); } catch (DuplicateNameException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } } } } return
		 * message; } else { return check(warehouse); }
		 * 
		 * }
		 * 
		 * /**
		 * 
		 * @param warehouse
		 * 
		 * @return 1 名称不为空，2名称为空
		 */
	/*
	 * public Message check(CompanyDetails companyDetails) { Message message =
	 * new Message(); if (companyDetails.getName() != null) {
	 * message.setCode(1); message.setContent("名称不为空"); } else {
	 * message.setCode(2); message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(CompanyDetails companyDetails, Boolean flag) { if
	 * (flag) { Message message = check(companyDetails); if (message.getCode()
	 * == 1) { List<CompanyDetails> companyDetailss =
	 * companyDetailsMapper.all(); for(CompanyDetails companyDetails2 :
	 * companyDetailss){ if(companyDetails.getId() == companyDetails2.getId()){
	 * continue; }
	 * if(companyDetails.getName().equals(companyDetails2.getName())){ try {
	 * throw new DuplicateNameException(); } catch (DuplicateNameException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(companyDetails); } }
	 * 
	 * public Message check(SupplierDetails supplierDetails) { Message message =
	 * new Message(); if (supplierDetails.getName() != null) {
	 * message.setCode(1); message.setContent("名称不为空"); } else {
	 * message.setCode(2); message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(SupplierDetails supplierDetails, Boolean flag) { if
	 * (flag) { Message message = check(supplierDetails); if (message.getCode()
	 * == 1) { List<SupplierDetails> supplierDetailss =
	 * supplierDetailsMapper.all(); for(SupplierDetails supplierDetails2 :
	 * supplierDetailss){ if(supplierDetails.getId() ==
	 * supplierDetails2.getId()){ continue; }
	 * if(supplierDetails.getName().equals(supplierDetails2.getName())){ try {
	 * throw new DuplicateNameException(); } catch (DuplicateNameException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(supplierDetails); } }
	 * 
	 * public Message check(LocationDetails locationDetails) { Message message =
	 * new Message(); if (locationDetails.getName() != null) {
	 * message.setCode(1); message.setContent("名称不为空"); } else {
	 * message.setCode(2); message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(LocationDetails locationDetails, Boolean flag) { if
	 * (flag) { Message message = check(locationDetails); if (message.getCode()
	 * == 1) { List<LocationDetails> locationDetailss =
	 * locationDetailsMapper.all(); for(LocationDetails locationDetails2 :
	 * locationDetailss){ if(locationDetails.getId() ==
	 * locationDetails2.getId()){ continue; }
	 * if(locationDetails.getName().equals(locationDetails2.getName())){ try {
	 * throw new DuplicateNameException(); } catch (DuplicateNameException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(locationDetails); } }
	 * 
	 * public Message check(BrandDetails brandDetails) { Message message = new
	 * Message(); if (brandDetails.getName() != null) { message.setCode(1);
	 * message.setContent("名称不为空"); } else { message.setCode(2);
	 * message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(BrandDetails brandDetails, Boolean flag) { if (flag)
	 * { Message message = check(brandDetails); if (message.getCode() == 1) {
	 * List<BrandDetails> brandDetailss = brandDetailsMapper.all();
	 * for(BrandDetails brandDetails2 : brandDetailss){ if(brandDetails.getId()
	 * == brandDetails2.getId()){ continue; }
	 * if(brandDetails.getName().equals(brandDetails2.getName())){ try { throw
	 * new DuplicateNameException(); } catch (DuplicateNameException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(brandDetails); } }
	 * 
	 * public Message check(StockItem stockItem) { Message message = new
	 * Message(); if (stockItem.getName() != null) { message.setCode(1);
	 * message.setContent("名称不为空"); } else { message.setCode(2);
	 * message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(StockItem stockItem, Boolean flag) { if (flag) {
	 * Message message = check(stockItem); if (message.getCode() == 1) {
	 * List<StockItem> stockItems = stockItemMapper.all(); for(StockItem
	 * stockItem2 : stockItems){ if(stockItem.getId() == stockItem2.getId()){
	 * continue; } if(stockItem.getName().equals(stockItem2.getName())){ try {
	 * throw new DuplicateNameException(); } catch (DuplicateNameException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(stockItem); } }
	 * 
	 * public Message check(ConsigneeDetails consigneeDetails) { Message message
	 * = new Message(); if (consigneeDetails.getName() != null) {
	 * message.setCode(1); message.setContent("名称不为空"); } else {
	 * message.setCode(2); message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(ConsigneeDetails consigneeDetails, Boolean flag) {
	 * if (flag) { Message message = check(consigneeDetails); if
	 * (message.getCode() == 1) { List<ConsigneeDetails> consigneeDetailss =
	 * consigneeDetailsMapper.all(); for(ConsigneeDetails consigneeDetails2 :
	 * consigneeDetailss){ if(consigneeDetails.getId() ==
	 * consigneeDetails2.getId()){ continue; }
	 * if(consigneeDetails.getName().equals(consigneeDetails2.getName())){ try {
	 * throw new DuplicateNameException(); } catch (DuplicateNameException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(consigneeDetails); } }
	 * 
	 * public Message check(CompanyUser companyUser) { Message message = new
	 * Message(); if (companyUser.getUsername() != null) { message.setCode(1);
	 * message.setContent("名称不为空"); } else { message.setCode(2);
	 * message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(CompanyUser companyUser, Boolean flag) { if (flag) {
	 * Message message = check(companyUser); if (message.getCode() == 1) {
	 * List<CompanyUser> companyUsers = companyUserMapper.all(); for(CompanyUser
	 * companyUser2 : companyUsers){ if(companyUser.getId() ==
	 * companyUser2.getId()){ continue; }
	 * if(companyUser.getUsername().equals(companyUser2.getUsername())){ try {
	 * throw new DuplicateNameException(); } catch (DuplicateNameException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(companyUser); } }
	 * 
	 * public Message check(CategoryDetails categoryDetails) { Message message =
	 * new Message(); if (categoryDetails.getName() != null) {
	 * message.setCode(1); message.setContent("名称不为空"); } else {
	 * message.setCode(2); message.setContent("名称为空"); } return message; }
	 * 
	 * public Message check(CategoryDetails categoryDetails, Boolean flag) { if
	 * (flag) { Message message = check(categoryDetails); if (message.getCode()
	 * == 1) { List<CategoryDetails> categoryDetailss =
	 * categoryDetailsMapper.all(); for(CategoryDetails categoryDetails2 :
	 * categoryDetailss){ if(categoryDetails.getId() ==
	 * categoryDetails2.getId()){ continue; }
	 * if(categoryDetails.getName().equals(categoryDetails2.getName())){ try {
	 * throw new DuplicateNameException(); } catch (DuplicateNameException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } } } } return
	 * message; } else { return check(categoryDetails); } }
	 */

	
}
