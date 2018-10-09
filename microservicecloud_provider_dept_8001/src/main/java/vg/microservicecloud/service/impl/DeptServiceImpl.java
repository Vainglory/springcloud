package vg.microservicecloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vg.microservicecloud.dao.DeptDao;
import vg.springcloud.entities.Dept;
import vg.springcloud.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
  @Autowired
  private DeptDao dao ;
  
  @Override
  public boolean add(Dept dept)
          
  {
    boolean b = false;
    int insert = dao.insert(dept);
    if(insert>0){
      b = true;
    }
    return b;
  }
 
  @Override
  public Dept get(Long id)
  {
    Dept dept = new Dept();
    dept.setDeptno(id);
    Dept dept1 = dao.selectOne(dept);
    return dept1;
  }
 
  @Override
  public List<Dept> list()
  {
    return dao.selectAll();
  }
 
}