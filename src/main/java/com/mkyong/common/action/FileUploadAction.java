package com.mkyong.common.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements SessionAware{

	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;
	
	private int counter;
	private int nbLines;
	
	Map<String, Object> session;

	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}

	public File getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}

	@SuppressWarnings("unchecked")
	public String execute()  throws Exception{
		List<String> lines = new ArrayList<String>();
		if(this.fileUpload!=null && this.fileUpload.exists()) {
			lines = FileUtils.readLines(fileUpload);
		}
		nbLines = lines.size();
		
		try {
			session.put("lines", lines);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String showLines() throws Exception {
		List<String> lines = (List<String>) session.get("lines");
		for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
			counter=i;
			nbLines = lines.size();
		}
		return SUCCESS;
	}
	
	public String display() {
		return NONE;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getNbLines() {
		return nbLines;
	}

	public void setNbLines(int nbLines) {
		this.nbLines = nbLines;
	}
	
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
}