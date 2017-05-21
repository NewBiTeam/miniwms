package ndm.miniwms.service.impl;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReadStatus;
import org.jxls.reader.XLSReader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.xml.sax.SAXException;

import ndm.miniwms.dao.BrandDetailsMapper;
import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.dao.CompanyDetailsMapper;
import ndm.miniwms.dao.CompanyUserMapper;
import ndm.miniwms.dao.ConsigneeDetailsMapper;
import ndm.miniwms.dao.LocationDetailsMapper;
import ndm.miniwms.dao.SupplierDetailsMapper;
import ndm.miniwms.dao.WarehouseMapper;
import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.pojo.Warehouse;
import ndm.miniwms.service.IBatchImportService;
import ndm.miniwms.vo.BrandVO;
import ndm.miniwms.vo.CategoryVO;
import ndm.miniwms.vo.CompanyVO;
import ndm.miniwms.vo.ConsigneeVO;
import ndm.miniwms.vo.LocationVO;
import ndm.miniwms.vo.SupplierVO;
import ndm.miniwms.vo.UserVO;
import ndm.miniwms.vo.WarehouseVO;

@Service
public class BatchImportServiceImpl implements IBatchImportService{

	@Resource
	private BrandDetailsMapper brandMapper;
	
	@Resource
	private CompanyDetailsMapper companyMapper;
	
	@Resource
	private SupplierDetailsMapper supplierMapper;
	
	@Resource
	private ConsigneeDetailsMapper consigneeMapper;
	
	@Resource
	private LocationDetailsMapper locationMapper;
	
	@Resource
	private CompanyUserMapper userMapper;
	
	@Resource
	private WarehouseMapper warehouseMapper;
	
	@Resource
	private CategoryDetailsMapper categoryMapper;
	
	@Override
	public void addBrand(MultipartFile brand){
		String xmlConfig ="/doc/Brand.xml";
		InputStream inputXML = new BufferedInputStream(getClass().getResourceAsStream(xmlConfig));  
		XLSReader mainReader=null;
		try {
			mainReader = ReaderBuilder.buildFromXML( inputXML );
			BufferedInputStream bis =new BufferedInputStream(brand.getInputStream());
			List<BrandVO> brandVOs =new ArrayList<>();
			Map<String, Object>  beans = new HashMap<String, Object>();	
			beans.put("brandVOs", brandVOs);
			XLSReadStatus readStatus = mainReader.read( bis, beans);
			for(BrandVO b: brandVOs){
				BrandDetails brandDetails = new BrandDetails();
				brandDetails.setName(b.getName());
				brandMapper.add(brandDetails);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	@Override
	public void addCompany(MultipartFile company) {
		String xml = "/doc/Company.xml";
		InputStream XML = new BufferedInputStream(getClass().getResourceAsStream(xml));
		XLSReader mainReader = null;
		try {
			mainReader = ReaderBuilder.buildFromXML(XML);
			BufferedInputStream bis =  new  BufferedInputStream(company.getInputStream());
			List<CompanyVO> companyVOs = new ArrayList<CompanyVO>();
			Map<String , Object> beans = new HashMap<String , Object>();
			beans.put("companyVOs", companyVOs);
			XLSReadStatus readStatus = mainReader.read(bis, beans);
			for(CompanyVO companyVO : companyVOs){
				CompanyDetails companys = new CompanyDetails();
				companys.setName(companyVO.getName());
				companys.setAnothername(companyVO.getAnothername());
				companys.setAddress(companyVO.getAddress());
				companys.setDescription(companyVO.getDescription());
				companys.setContactName(companyVO.getContactName());
				companys.setContactTel(companyVO.getContactTel());
				companys.setContactFax(companyVO.getContactFax());
				companys.setContactEmail(companyVO.getContactEmail());
				companys.setContactQq(companyVO.getContactQq());
				companys.setContactMsn(companyVO.getContactMsn());
				companys.setContactDesc(companyVO.getContactDesc());
				companyMapper.add(companys);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addSupplier(MultipartFile supplier) {
		String xml = "/doc/Supplier.xml";
		InputStream XML = new BufferedInputStream(getClass().getResourceAsStream(xml));
		XLSReader mainReader = null;
		try {
			mainReader = ReaderBuilder.buildFromXML(XML);
			BufferedInputStream bis  = new BufferedInputStream(supplier.getInputStream());
			List<SupplierVO> supplierVOs = new ArrayList<SupplierVO>();
			Map<String , Object> beans = new HashMap<String , Object>();
			beans.put("supplierVOs", supplierVOs);
			XLSReadStatus readStatus = mainReader.read(bis, beans);
			for(SupplierVO supplierVO : supplierVOs){
				SupplierDetails suppliers = new SupplierDetails();
				suppliers.setName(supplierVO.getName());
				suppliers.setAddress(supplierVO.getAddress());
				suppliers.setDescription(supplierVO.getDescription());
				suppliers.setContactName(supplierVO.getContactName());
				suppliers.setContactTel(supplierVO.getContactTel());
				suppliers.setContactFax(supplierVO.getContactFax());
				suppliers.setContactEmail(supplierVO.getContactEmail());
				suppliers.setContactQq(supplierVO.getContactQq());
				suppliers.setContactMsn(supplierVO.getContactMsn());
				suppliers.setContactDesc(supplierVO.getContactDesc());
				supplierMapper.add(suppliers);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addCategory(MultipartFile category) {
		String xml = "/doc/Category.xml";
		InputStream XML = new BufferedInputStream(getClass().getResourceAsStream(xml));
		XLSReader mainReader = null;
		try {
			mainReader = ReaderBuilder.buildFromXML(XML);
			BufferedInputStream bis = new BufferedInputStream(category.getInputStream());
			List<CategoryVO> categoryVOs = new ArrayList<CategoryVO>();
			Map<String, Object> beans = new HashMap<String , Object>();
			beans.put("categoryVOs", categoryVOs);
			XLSReadStatus read = mainReader.read(bis, beans);
			for(CategoryVO categoryVos : categoryVOs ){
				CategoryDetails categorys = new CategoryDetails();
				categorys.setName(categoryVos.getName());
				categorys.setDescription(categoryVos.getDescription());
				categoryMapper.add(categorys);
			}
		} catch (IOException | SAXException | InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addConsignee(MultipartFile consignee) {
		String xml = "/doc/Consignee.xml";
		InputStream XML = new BufferedInputStream(getClass().getResourceAsStream(xml));
		XLSReader mainReader = null;
		try {
			mainReader = ReaderBuilder.buildFromXML(XML);
			BufferedInputStream bis = new BufferedInputStream(consignee.getInputStream());
			List<ConsigneeVO> consigneeVO = new ArrayList<ConsigneeVO>();
			Map<String, Object> beans = new HashMap<>();
			beans.put("consigneeVOs", consigneeVO);
			XLSReadStatus read = mainReader.read(bis, beans);
			for(ConsigneeVO consigneeVo: consigneeVO){
				ConsigneeDetails consignees = new ConsigneeDetails();
				consignees.setName(consigneeVo.getName());
				consignees.setAddress(consigneeVo.getAddress());
				consignees.setDescription(consigneeVo.getDescription());
				consignees.setContactName(consigneeVo.getContactName());
				consignees.setContactTel(consigneeVo.getContactTel());
				consignees.setContactFax(consigneeVo.getContactFax());
				consignees.setContactEmail(consigneeVo.getContactEmail());
				consignees.setContactQq(consigneeVo.getContactQq());
				consignees.setContactMsn(consigneeVo.getContactMsn());
				consignees.setContactDesc(consigneeVo.getContactDesc());
				consigneeMapper.add(consignees);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addUser(MultipartFile user) {
		String xml = "/doc/User.xml";
		InputStream XML = new BufferedInputStream(getClass().getResourceAsStream(xml));
		XLSReader mainReader = null;
		try {
			mainReader = ReaderBuilder.buildFromXML(XML);
			BufferedInputStream bis = new BufferedInputStream(user.getInputStream());
			List<UserVO> userVO = new ArrayList<>();
			List<CompanyDetails> companyDetails = companyMapper.all();
			Map<String , Object> beans = new HashMap<>();
			beans.put("userVOs", userVO);
			XLSReadStatus read = mainReader.read(bis, beans);
			for(UserVO userVos : userVO){
				CompanyUser users = new CompanyUser();
				users.setUsername(userVos.getUsername());
				users.setPassword(userVos.getPassword());
				users.setAddress(userVos.getAddress());
				users.setTel(userVos.getTel());
				users.setCname(userVos.getCname());
				for(CompanyDetails company : companyDetails){
					if(company.getName().equals(userVos.getCompanyName())){
						users.setCompanyId(company.getId());
						break;
					}
				}
				userMapper.add(users);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addLocation(MultipartFile location) {
		String xml = "/doc/Location.xml";
		InputStream XML = new BufferedInputStream(getClass().getResourceAsStream(xml));
		XLSReader mainReader = null;
		try {
			mainReader  = ReaderBuilder.buildFromXML(XML);
			BufferedInputStream bis = new BufferedInputStream(location.getInputStream());
			List<LocationVO> locationVO = new ArrayList<>();
			List<CompanyDetails> companyDetails = companyMapper.all();
			List<Warehouse> warehouse = warehouseMapper.all();
			Map<String , Object> beans = new HashMap<>();
			beans.put("locationVOs", locationVO);
			XLSReadStatus read = mainReader.read(bis, beans);
			for(LocationVO locationVo : locationVO){
				LocationDetails locations = new LocationDetails();
				locations.setName(locationVo.getName());
				locations.setXCoord(locationVo.getXCoord());
				locations.setYCoord(locationVo.getYCoord());
				locations.setZCoord(locationVo.getZCoord());
				
				for(CompanyDetails company : companyDetails){
					if(company.getName().equals(locationVo.getCompanyName())){
						locations.setCompanyId(company.getId());
						break;
					}
				}
				
				for(Warehouse warehouses : warehouse){
					if(warehouses.getName().equals(locationVo.getWarehouseName())){
						locations.setCompanyId(warehouses.getId());
						break;
					}
				}
				locationMapper.add(locations);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addWarehouse(MultipartFile warehouse) {
		String xml = "/doc/Warehouse.xml";
		InputStream XML = new BufferedInputStream(getClass().getResourceAsStream(xml));
		XLSReader mainReader = null;
		try {
			mainReader = ReaderBuilder.buildFromXML(XML);
			BufferedInputStream bis = new BufferedInputStream(warehouse.getInputStream());
			List<WarehouseVO> warehouseVO = new ArrayList<>();
			Map<String, Object> beans = new HashMap<>();
			beans.put("warehouseVOs", warehouseVO);
			XLSReadStatus read = mainReader.read(bis, beans);
			for(WarehouseVO warehouseVo : warehouseVO){
				Warehouse warehouses = new Warehouse();
				warehouses.setName(warehouseVo.getName());
				warehouses.setAddress(warehouseVo.getAddress());
				warehouses.setDescription(warehouseVo.getDescription());
				warehouses.setContactName(warehouseVo.getContactName());
				warehouses.setContactTel(warehouseVo.getContactTel());
				warehouses.setContactFax(warehouseVo.getContactFax());
				warehouses.setContactEmail(warehouseVo.getContactEmail());
				warehouses.setContactQq(warehouseVo.getContactQq());
				warehouses.setContactMsn(warehouseVo.getContactMsn());
				warehouses.setContactDesc(warehouseVo.getContactDesc());
				warehouseMapper.add(warehouses);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
