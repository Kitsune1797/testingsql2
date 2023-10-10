package holdSql;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class OnHold {
	private String OT_TRX_ID;
	private String CIF_NO;
	private String REF_NO;
	private String CHANNEL;
	private String TRX_TYPE;
	private String FROM_ACC_NO;
	private String TO_ACC_NO;
	private String CUSTOMER_AGE;
	private String TRX_CHECKSUM;
	private String TRX_AMT;
	private String TRX_DETAILS;
	private String CREATION_DATE;
	private String APP_REJ_DATE;
	private String APP_REJ_BY;
	private String TRX_EXE_DATE;
	private String REMARK;
	private String EBK_REF_NO;
	private String BENE_NAME;
	private String BENE_BANK;
	private String PROXY_TYPE;
	private String TRX_STATUS;


	public String getOT_TRX_ID() {
		return OT_TRX_ID;
	}
	public void setOT_TRX_ID(String oT_TRX_ID) {
		OT_TRX_ID = oT_TRX_ID;
	}
	public String getCIF_NO() {
		return CIF_NO;
	}
	public void setCIF_NO(String cIF_NO) {
		CIF_NO = cIF_NO;
	}
	public String getREF_NO() {
		return REF_NO;
	}
	public void setREF_NO(String rEF_NO) {
		REF_NO = rEF_NO;
	}
	public String getCHANNEL() {
		return CHANNEL;
	}
	public void setCHANNEL(String cHANNEL) {
		CHANNEL = cHANNEL;
	}
	public String getTRX_TYPE() {
		return TRX_TYPE;
	}
	public void setTRX_TYPE(String tRX_TYPE) {
		TRX_TYPE = tRX_TYPE;
	}
	public String getFROM_ACC_NO() {
		return FROM_ACC_NO;
	}
	public void setFROM_ACC_NO(String fROM_ACC_NO) {
		FROM_ACC_NO = fROM_ACC_NO;
	}
	public String getTO_ACC_NO() {
		return TO_ACC_NO;
	}
	public void setTO_ACC_NO(String tO_ACC_NO) {
		TO_ACC_NO = tO_ACC_NO;
	}
	public String getCUSTOMER_AGE() {
		return CUSTOMER_AGE;
	}
	public void setCUSTOMER_AGE(String cUSTOMER_AGE) {
		CUSTOMER_AGE = cUSTOMER_AGE;
	}
	public String getTRX_CHECKSUM() {
		return TRX_CHECKSUM;
	}
	public void setTRX_CHECKSUM(String tRX_CHECKSUM) {
		TRX_CHECKSUM = tRX_CHECKSUM;
	}
	public String getTRX_AMT() {
		return TRX_AMT;
	}
	public void setTRX_AMT(String tRX_AMT) {
		TRX_AMT = tRX_AMT;
	}
	public String getTRX_DETAILS() {
		return TRX_DETAILS;
	}
	public void setTRX_DETAILS(String tRX_DETAILS) {
		TRX_DETAILS = tRX_DETAILS;
	}
	public String getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(String cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public String getAPP_REJ_DATE() {
		return APP_REJ_DATE;
	}
	public void setAPP_REJ_DATE(String aPP_REJ_DATE) {
		APP_REJ_DATE = aPP_REJ_DATE;
	}
	public String getAPP_REJ_BY() {
		return APP_REJ_BY;
	}
	public void setAPP_REJ_BY(String aPP_REJ_BY) {
		APP_REJ_BY = aPP_REJ_BY;
	}
	public String getTRX_EXE_DATE() {
		return TRX_EXE_DATE;
	}
	public void setTRX_EXE_DATE(String tRX_EXE_DATE) {
		TRX_EXE_DATE = tRX_EXE_DATE;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getEBK_REF_NO() {
		return EBK_REF_NO;
	}
	public void setEBK_REF_NO(String eBK_REF_NO) {
		EBK_REF_NO = eBK_REF_NO;
	}
	public String getBENE_NAME() {
		return BENE_NAME;
	}
	public void setBENE_NAME(String bENE_NAME) {
		BENE_NAME = bENE_NAME;
	}
	public String getBENE_BANK() {
		return BENE_BANK;
	}
	public void setBENE_BANK(String bENE_BANK) {
		BENE_BANK = bENE_BANK;
	}
	public String getPROXY_TYPE() {
		return PROXY_TYPE;
	}
	public void setPROXY_TYPE(String pROXY_TYPE) {
		PROXY_TYPE = pROXY_TYPE;
	}
	public String getTRX_STATUS() {
		return TRX_STATUS;
	}
	public void setTRX_STATUS(String tRX_STATUS) {
		TRX_STATUS = tRX_STATUS;
	}
	
}
