package vg.microservicecloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vg.springcloud.entities.Dept;
import vg.springcloud.service.DeptService;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }



    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    @ResponseBody
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @ResponseBody
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    @ResponseBody
    public List<Dept> list()
    {
        return service.list();
    }

}
