package com.zcw.webservice.dao;

import com.alibaba.fastjson.JSON;
import com.zcw.webservice.common.Util;
import com.zcw.webservice.model.lis.TestInfo;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Title:LisInfoDao
 * Description:LIS系统DAO
 *
 * @Author:zhou
 * @Date:2016/8/2 10:06
 * @Version:
 */
@Repository
public class LisInfoDao {

    @Autowired
    private  JdbcTemplate lisJdbcTemplate;        //LIS系统连接池

    /**
     * 获取检验信息
     * @param barcode   //申请条码
     * @return
     */
    public String getTestInfo(String barcode){
        String sql ="select * from vw_testinfo_micro where Barcode ='" + barcode +"'";
        JSONArray jsonArray = new JSONArray();
        List<TestInfo> list = lisJdbcTemplate.query(sql, new BeanPropertyRowMapper<TestInfo>(TestInfo.class));
        return JSON.toJSONString(list);
    }
    /**
     * 细菌列表
     * @return
     */
    public String getBacteriaList() throws Exception{
        JSONArray jsonArray = new JSONArray();
        List<Map<String, Object>> list = lisJdbcTemplate.queryForList("SELECT dh, bh, mc, ywm FROM xj_xjzl");
        for(Map<String, Object> map:list){
            JSONObject obj = new JSONObject();
            obj.put("Code", Util.null2String(map.get("dh")));
            obj.put("Name",Util.null2String(map.get("mc")));
            obj.put("Alias",Util.null2String(map.get("ywm")));
            jsonArray.put(obj);
        }
        return jsonArray.toString();
    }
    /**
     * 药敏列表信息
     * @return
     */
    public String getDrugList()throws Exception{
        String sql = "SELECT dh, bh, mc, ywm FROM xj_ymzl";
        List<Map<String, Object>> list = lisJdbcTemplate.queryForList(sql);
        JSONArray jsonArray = new JSONArray();
        for(Map<String, Object> map:list){
            JSONObject obj = new JSONObject();
            obj.put("Code", Util.null2String(map.get("dh")));
            obj.put("Name",Util.null2String(map.get("mc")));
            obj.put("Alias",Util.null2String(map.get("ywm")));
            jsonArray.put(obj);
        }
        return jsonArray.toString();
    }

    /**
     * 检验目的列表信息
     * @return
     */
    public String getTestPurposeList()throws Exception{
        String sql = "SELECT t1.jymddh, t1.jymdmc, t1.jymdsf,t2.dh,t2.mc FROM xt_jymd t1 left join xt_bbzl t2 on t1.bbzl = t2.dh";
        List<Map<String, Object>> list = lisJdbcTemplate.queryForList(sql);
        JSONArray jsonArray = new JSONArray();
        for(Map<String, Object> map:list){
            JSONObject obj = new JSONObject();
            obj.put("Code", Util.null2String(map.get("jymddh")));
            obj.put("Name",Util.null2String(map.get("jymdmc")));
            obj.put("Fee",Util.null2String(map.get("jymdsf")));
            obj.put("SampleId",Util.null2String(map.get("dh")));
            obj.put("SampleName",Util.null2String(map.get("mc")));
            jsonArray.put(obj);
        }
        return jsonArray.toString();
    }

    /**
     * 标本类型列表信息
     * @return
     */
    public String getSampleTypeList()throws Exception{
        String sql = "SELECT dh,mc FROM xt_bbzl";
        List<Map<String, Object>> list = lisJdbcTemplate.queryForList(sql);
        JSONArray jsonArray = new JSONArray();
        for(Map<String, Object> map:list){
            JSONObject obj = new JSONObject();
            obj.put("Code", Util.null2String(map.get("dh")));
            obj.put("Name",Util.null2String(map.get("mc")));
            jsonArray.put(obj);
        }
        return jsonArray.toString();
    }

    /**
     * 标本类型列表信息
     * @return
     */
    public String getPatientTypeList()throws Exception{
        String sql = "select dh,mc from v_xt_sjlb";
        List<Map<String, Object>> list = lisJdbcTemplate.queryForList(sql);
        JSONArray jsonArray = new JSONArray();
        for(Map<String, Object> map:list){
            JSONObject obj = new JSONObject();
            obj.put("Code", Util.null2String(map.get("dh")));
            obj.put("Name",Util.null2String(map.get("mc")));
            jsonArray.put(obj);
        }
        return jsonArray.toString();
    }
}

