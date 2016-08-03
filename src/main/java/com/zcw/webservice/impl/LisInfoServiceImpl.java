package com.zcw.webservice.impl;

import com.zcw.webservice.dao.HisInfoDao;
import com.zcw.webservice.dao.LisInfoDao;
import com.zcw.webservice.server.LisInfoService;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebService;
import java.util.List;

/**
 * Title:
 * Description:WEBSERVICE
 *
 * @Author:zhou
 * @Date:2016/8/2 1:06
 * @Version:
 */
@WebService(endpointInterface = "com.zcw.webservice.server.LisInfoService",serviceName = "lisInfoService")
public class LisInfoServiceImpl extends SpringBeanAutowiringSupport implements LisInfoService {

    @Autowired
    private LisInfoDao lisInfoDao ;

    @Autowired
    private HisInfoDao hisInfoDao ;

    /**
     * 获取检验信息
     * @param barcode
     * @return
     */
    public String getTestInfo(String barcode) {
        try {
            return lisInfoDao.getTestInfo(barcode);
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    /**
     * 获取细菌信息列表
     * @return
     */
    public String getBacteriaList() {
        try {
            return lisInfoDao.getBacteriaList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    /**
     * 获取检验目的列表
     * @return
     */
    public String getTestPurposeList() {
        try {
            return lisInfoDao.getTestPurposeList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    /**
     * 获取药敏信息列表
     * @return
     */
    public String getDrugList() {
        try {
            return lisInfoDao.getDrugList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    /**
     * 获取标本各类信息列表
     * @return
     */
    public String getSampleTypeList() {
        try {
            return lisInfoDao.getSampleTypeList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    /**
     * 病人类别信息
     * @return
     */
    public String getPatientTypeList() {
        try {
            return lisInfoDao.getPatientTypeList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    /**
     * 病区信息
     * @return
     */
    public String getWardList() {
        try {
            return hisInfoDao.getWardList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    /**
     * 科室信息
     * @return
     */
    public String getDepartMentList() {
        try {
            return hisInfoDao.getDepartmentList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }

    public String getSampleNo(String barcode) {
        try {
            return hisInfoDao.getDepartmentList();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\":\""+e.getMessage()+"\"}";
        }
    }
}
