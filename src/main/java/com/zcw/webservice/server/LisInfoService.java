package com.zcw.webservice.server;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Title: .IntelliJ IDEA
 * Description:
 *
 * @Author:zhou
 * @Date:2016/8/2 1:02
 * @Version:
 */
@WebService
public interface LisInfoService {

    /**
     * 获取检验信息
     * @param barcode
     * @return
     */
    String getTestInfo(String barcode);

    /**
     * 获取细菌信息列表
     * @return
     */
    String getBacteriaList();

    /**
     * 获取检验目的列表
     * @return
     */
    String getTestPurposeList();

    /**
     * 获取药敏信息列表
     * @return
     */
    String getDrugList();

    /**
     * 获取标本各类信息列表
     * @return
     */
    String getSampleTypeList();

    /**
     * 获取病人类别信息列表
     * @return
     */
    String getPatientTypeList();

    /**
     * 获取病区信息列表
     * @return
     */
    String getWardList();

    /**
     * 获取科室信息列表
     * @return
     */
    String getDepartMentList();

    /**
     * 获取样本号
     * @return
     */
    String getSampleNo(String barcode);

}
