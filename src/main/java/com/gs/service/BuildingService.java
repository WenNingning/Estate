package com.gs.service;

import java.util.List;

import com.gs.common.bean.Pager4EasyUI;
import com.gs.pojo.Building;
import com.gs.pojo.Buildings;

public interface BuildingService extends BaseService<String, Building>{
	public int count(String buildings_id) ;
	public List<Building> queryByPager(int pageSize, int pageNumber, String buildings_id,String name,String status);
	public void updatestatus(String id,String status);
	public int count(String buildings_id,String name,String status); 
	public List<Buildings> findbuildings (String agency_id);
	public List<Building> findbuilding (String agency_id);
	
	public List<Building> search(int pageNumber,int pageSize,String searchText,String agency_id);
	public int searchcount(String searchText,String agency_id);
	
	public List<Building> builds(String buildings_id,int first,int last);
}
