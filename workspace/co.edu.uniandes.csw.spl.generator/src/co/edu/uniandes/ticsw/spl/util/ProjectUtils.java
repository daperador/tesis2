package co.edu.uniandes.ticsw.spl.util;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.uml2.uml.Class;


public class ProjectUtils {
	

	private final String[] webPaths = { "src/test/java", //$NON-NLS-1$
			"src/test/resources", //$NON-NLS-1$
			"src/main/java", //$NON-NLS-1$
			"src/main/resources", //$NON-NLS-1$
			"src/main/webapp" //$NON-NLS-1$
	};

	private final String[] jarPaths = { "src/test/java", //$NON-NLS-1$
			"src/test/resources", //$NON-NLS-1$
			"src/main/java", //$NON-NLS-1$
			"src/main/resources" };

	public final static File workspaceDir = ResourcesPlugin.getWorkspace().getRoot().getLocation().makeAbsolute().toFile();
	
	
	public void genWebProject(String dir, String projectName) throws CoreException{
		File projectDir = new File(dir, projectName);
		projectDir.mkdirs();
		addToProjectStructure(projectDir, webPaths);
	}
	
	public void genJarProject(String dir, String projectName) throws CoreException{
		File projectDir = new File(dir, projectName);
		projectDir.mkdirs();
		addToProjectStructure(projectDir, jarPaths);		
	}
	
	public String toLabel(String lowerCamelCaseString){
		if(lowerCamelCaseString == null){
			return "";
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < lowerCamelCaseString.length(); i++) {
			Character ch = lowerCamelCaseString.charAt(i);
			if(i==0){
				result.append(Character.toUpperCase(ch));
			} else if(Character.isUpperCase(ch)){
				result.append(" ").append(ch);
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}
//	/**
//	 * 
//	 * @param cls
//	 * @throws CoreException
//	 */
//	public void genCRUDDirectory(Class cls) throws CoreException {
//		File projectDir = new File(workspaceDir, cls.getName().toLowerCase() + ".service.subsystem.web");
//		projectDir.mkdirs();
//		addToProjectStructure(projectDir, webPaths);
//		projectDir = new File(workspaceDir, cls.getName().toLowerCase() + ".service.subsystem");
//		projectDir.mkdirs();
//		addToProjectStructure(projectDir, jarPaths);
//		projectDir = new File(workspaceDir, cls.getName().toLowerCase() + ".web");
//		projectDir.mkdir();
//		addToProjectStructure(projectDir, webPaths);
//	}

//	/**
//	 * 
//	 * @param cls
//	 * @throws CoreException
//	 */
//	public void genMasterDirectory(Class cls) throws CoreException {
//		File projectDir = new File(workspaceDir, cls.getName().toLowerCase() + ".master.service.subsystem");
//		projectDir.mkdir();
//		addToProjectStructure(projectDir, webPaths);
//	}
//	
	/**
	 * Create a folder structure with a parent root, overlay, and a few child
	 * folders.
	 * 
	 * @param newProject
	 * @param paths
	 * @throws CoreException
	 */
	private static void addToProjectStructure(File root, String[] paths) throws CoreException {
		for (String path : paths) {
			File nFile = new File(root, path);
			nFile.mkdirs();
		}
	}
	
	/**
	 * 
	 * @param cls
	 * @throws CoreException
	 */
	public void genWebProductDirectory() throws CoreException {
		File projectDir = new File(workspaceDir, "web-product");
		projectDir.mkdirs();
		addToProjectStructure(projectDir, webPaths);
	}

}
