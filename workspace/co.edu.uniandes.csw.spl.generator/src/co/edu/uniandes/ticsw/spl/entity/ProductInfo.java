package co.edu.uniandes.ticsw.spl.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String version="1.0.0";
	private String commonVersion="1.1.5";
	private String splGeneratorVersion="1.0.0";
	private String splRepository="http://spl.uniandes.edu.co:8081/nexus/content/repositories/releases/";
	private String projectName;
	private String groupName;
	private String path;
	private List<String> selectedClasses = new ArrayList<String>();
	private List<String> selectedAssociations = new ArrayList<String>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the commonVersion
	 */
	public String getCommonVersion() {
		return commonVersion;
	}

	/**
	 * @param commonVersion
	 *            the commonVersion to set
	 */
	public void setCommonVersion(String commonVersion) {
		this.commonVersion = commonVersion;
	}

	/**
	 * @return the selectedClasses
	 */
	public List<String> getSelectedClasses() {
		return selectedClasses;
	}

	/**
	 * @param selectedClasses the selectedClasses to set
	 */
	public void setSelectedClasses(List<String> selectedClasses) {
		this.selectedClasses = selectedClasses;
	}

	/**
	 * @return the selectedAssociations
	 */
	public List<String> getSelectedAssociations() {
		return selectedAssociations;
	}

	/**
	 * @param selectedAssociations the selectedAssociations to set
	 */
	public void setSelectedAssociations(List<String> selectedAssociations) {
		this.selectedAssociations = selectedAssociations;
	}
	
	public String getSplRepository() {
		return splRepository;
	}
	
	public void setSplRepository(String splRepository) {
		this.splRepository = splRepository;
	}

	
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return name;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductInfo other = (ProductInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getSplGeneratorVersion() {
		return splGeneratorVersion;
	}

	public void setSplGeneratorVersion(String splGeneratorVersion) {
		this.splGeneratorVersion = splGeneratorVersion;
	}

}
