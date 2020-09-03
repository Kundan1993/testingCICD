package pojo;

import java.util.List;

public class AddNorms {
	
	private String visibility;
	private List<String> name;
	private List<String> properties;
	private List<String> subNorms;
	private List<String> access;
	
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(AN_Name1_transalation nametrans) {
		this.name = (List<String>) nametrans;
	}
	public List<String> getProperties() {
		return properties;
	}
	public void setProperties(List<String> properties) {
		this.properties = properties;
	}
	public List<String> getSubNorms() {
		return subNorms;
	}
	public void setSubNorms(List<String> subNorms) {
		this.subNorms = subNorms;
	}
	public List<String> getAccess() {
		return access;
	}
	public void setAccess(List<String> access) {
		this.access = access;
	}
	

}
