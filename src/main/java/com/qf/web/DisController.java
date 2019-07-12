package com.qf.web;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.bean.Airqualityindex;
import com.qf.bean.District;
import com.qf.service.AirService;
import com.qf.service.DisService;
import com.qf.util.num;
import com.sun.tools.internal.jxc.gen.config.Classes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DisController {

    @Resource
    private AirService airService;

    @Resource
    private DisService disService;


    //主页展示
    @RequestMapping("/getair")
    public String selectall(ModelMap map, @RequestParam(defaultValue = "1") int index, String district) {
        PageInfo<Airqualityindex> pageInfo = airService.selectall(index, num.PAGESIZE, district);
        List<District> list = disService.selectAll();
        map.addAttribute("pi",list);
        map.addAttribute("pu", pageInfo);
        map.addAttribute("disname", district);
        return "show";
    }


    //查询分类列表
    @RequestMapping("/toadd")
    public String toadd(ModelMap map){
        List<District> districts = disService.selectAll();
        map.addAttribute("list",districts);
        return "add";
    }



    //添加
    @RequestMapping("/add")
    public void addknow(Airqualityindex airqualityindex, HttpServletResponse response){
        airqualityindex.setLastmodtime(new Date());
        int i = airService.insert(airqualityindex);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            if(i>0){
                out.print("<script>alert('新增成功');location.href='getair'</script>");
            }else{
                out.print("<script>alert('新增失败');location.href='toadd'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //跳转更新
    @RequestMapping("/toup")
    public String selectall(ModelMap map, int id) {
        Airqualityindex sone = airService.sone(id);
        List<District> list = disService.selectAll();
        map.addAttribute("list", list);
        map.addAttribute("air", sone);
        return "update";
    }
    //更新
    @RequestMapping("/update")
    public void  update(HttpServletResponse response , ModelMap map, Airqualityindex airqualityindex) {
        airqualityindex.setLastmodtime(new Date());
        int i = airService.update(airqualityindex);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            if(i>0){
                out.print("<script>alert('更新成功');location.href='getair'</script>");
            }else{
                out.print("<script>alert('更新失败');location.href='getair'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //删除
    @RequestMapping("/delete")
    public void  update(HttpServletResponse response ,int id) {
        int i = airService.delect(id);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            if(i>0){
                out.print("<script>alert('删除成功');location.href='getair'</script>");
            }else{
                out.print("<script>alert('删除失败');location.href='getair'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
