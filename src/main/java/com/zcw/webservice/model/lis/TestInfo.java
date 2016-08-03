package com.zcw.webservice.model.lis;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Title: .IntelliJ IDEA
 * Description:检验信息
 *
 * @Author:zhou
 * @Date:2016/8/3 10:07
 * @Version:
 */
public class TestInfo {

    @JSONField(name = "Barcode")
    private String barcode;

    @JSONField(name = "PatientTypeCode")
    private String patientTypeCode;

    @JSONField(name = "PatientTypeName")
    private String patientTypeName;

    @JSONField(name = "PatientCode")
    private String patientCode;

    @JSONField(name = "PatientName")
    private String patientName;

    @JSONField(name = "PatientSex")
    private String patientSex;

    @JSONField(name = "PatientAge")
    private String patientAge;

    @JSONField(name = "PatientAgeUnit")
    private String patientAgeUnit;

    @JSONField(name = "DepartmentCode")
    private String departmentCode;

    @JSONField(name = "DepartmentName")
    private String departmentName;

    @JSONField(name = "InpatientAreaCode")
    private String inpatientAreaCode;

    @JSONField(name = "InpatientAreaName")
    private String inpatientAreaName;

    @JSONField(name = "BedNo")
    private String bedNo;

    @JSONField(name = "DoctorCode")
    private String doctorCode;

    @JSONField(name = "DoctorName")
    private String doctorName;

    @JSONField(name = "SpecimenTypeCode")
    private String specimenTypeCode;

    @JSONField(name = "SpecimenTypeName")
    private String specimenTypeName;

    @JSONField(name = "ApplyDate")
    private String applyDate;

    @JSONField(name = "CollectDate")
    private String collectDate;

    @JSONField(name = "CollectAccount")
    private String collectAccount;

    @JSONField(name = "ChargeTypeCode")
    private String chargeTypeCode;

    @JSONField(name = "ChargeTypeName")
    private String chargeTypeName;

    @JSONField(name = "Diagnosis")
    private String diagnosis;

    @JSONField(name = "SignDate")
    private String signDate;

    @JSONField(name = "SignerAccount")
    private String signerAccount;

    @JSONField(name = "InspectItemCode")
    private String inspectItemCode;

    @JSONField(name = "InspectItemName")
    private String inspectItemName;

    @JSONField(name = "Remark")
    private String remark;


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getPatientTypeCode() {
        return patientTypeCode;
    }

    public void setPatientTypeCode(String patientTypeCode) {
        this.patientTypeCode = patientTypeCode;
    }

    public String getPatientTypeName() {
        return patientTypeName;
    }

    public void setPatientTypeName(String patientTypeName) {
        this.patientTypeName = patientTypeName;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientAgeUnit() {
        return patientAgeUnit;
    }

    public void setPatientAgeUnit(String patientAgeUnit) {
        this.patientAgeUnit = patientAgeUnit;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getInpatientAreaCode() {
        return inpatientAreaCode;
    }

    public void setInpatientAreaCode(String inpatientAreaCode) {
        this.inpatientAreaCode = inpatientAreaCode;
    }

    public String getInpatientAreaName() {
        return inpatientAreaName;
    }

    public void setInpatientAreaName(String inpatientAreaName) {
        this.inpatientAreaName = inpatientAreaName;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecimenTypeCode() {
        return specimenTypeCode;
    }

    public void setSpecimenTypeCode(String specimenTypeCode) {
        this.specimenTypeCode = specimenTypeCode;
    }

    public String getSpecimenTypeName() {
        return specimenTypeName;
    }

    public void setSpecimenTypeName(String specimenTypeName) {
        this.specimenTypeName = specimenTypeName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(String collectDate) {
        this.collectDate = collectDate;
    }

    public String getCollectAccount() {
        return collectAccount;
    }

    public void setCollectAccount(String collectAccount) {
        this.collectAccount = collectAccount;
    }

    public String getChargeTypeCode() {
        return chargeTypeCode;
    }

    public void setChargeTypeCode(String chargeTypeCode) {
        this.chargeTypeCode = chargeTypeCode;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getChargeTypeName() {
        return chargeTypeName;
    }

    public void setChargeTypeName(String chargeTypeName) {
        this.chargeTypeName = chargeTypeName;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getSignerAccount() {
        return signerAccount;
    }

    public void setSignerAccount(String signerAccount) {
        this.signerAccount = signerAccount;
    }

    public String getInspectItemCode() {
        return inspectItemCode;
    }

    public void setInspectItemCode(String inspectItemCode) {
        this.inspectItemCode = inspectItemCode;
    }

    public String getInspectItemName() {
        return inspectItemName;
    }

    public void setInspectItemName(String inspectItemName) {
        this.inspectItemName = inspectItemName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
