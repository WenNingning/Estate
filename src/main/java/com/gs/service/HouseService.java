package com.gs.service;

import java.util.List;

import com.gs.common.bean.Pager4EasyUI;
import com.gs.pojo.Building;
import com.gs.pojo.Buildings;
import com.gs.pojo.House;
import com.gs.pojo.Sale;

public interface HouseService extends BaseService<String, House> {
	public List<House> list(String buildings_id);
	public int count2(String buildings_id);
	public void updatestatus(String id,String status);
	public List findAgency(String id,int pageSize,int pageNumber);
	public Buildings find(String name);
	public List<House> findHouse(String id,int pageSize,int pageNumber,String name,String buildings_name);
	public int findcount(String agency_id,String name,String buildings_name);
	public List<House> builds(String buildings_id,int first,int last);
	
	//manager start
	public List<House> housepager(int pageNumber,int pageSize);
	public int housecount(int pageNumber,int pageSize);
	//manager end
	public List<Buildings> findBuildings(String agency_id);
	public List<House> findHouse(String agency_id);
	
	public List<House> search(int pageNumber,int pageSize,String searchText,String agency_id);
	public int searchcount(String searchText,String agency_id);
}
