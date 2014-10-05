package co.edu.uniandes.ticsw.spl.transformation;

import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;

public class AntCustomTransformation extends TransformationExecutor {

	/*
	 * public void executeTransformation(IExecutionInformation arg0) throws
	 * Exception { console.println("Start Ant"); File buildFile =
	 * locator.findFile("/ant/build.xml");
	 * console.println("El archivo: "+buildFile.getAbsolutePath()); File getFile
	 * = locator.findFile("/genProjects/default").getParentFile();
	 * console.println("El archivo: "+getFile.getAbsolutePath()); try { Project
	 * p = new Project(); p.setBaseDir(getFile.getParentFile());
	 * p.setUserProperty("linea", "csw.spl"); p.setUserProperty("artefacto",
	 * "user"); p.setUserProperty("baseDir", getFile.getAbsolutePath());
	 * p.init(); ProjectHelper helper = ProjectHelper.getProjectHelper();
	 * p.addReference("ant.projectHelper", helper); helper.parse(p, buildFile);
	 * p.executeTarget(p.getDefaultTarget()); } catch (Exception ex) {
	 * console.logException("ant stuff", ex); } /*console.println("After Ant");
	 * console.println("This is a message from a custom transformation named:" +
	 * transformation.getName()); console.println("The input models are:"); for
	 * (InputModel inModel : inputModels) {
	 * console.println(inModel.getModel().getName() + " at " +
	 * locator.getFile(inModel.getModel()).getAbsolutePath()); }
	 * console.println("The output models are:"); for (OutputModel outModel :
	 * outputModels) { console.println(outModel.getModel().getName() + " at " +
	 * locator.getFile(outModel.getModel()).getAbsolutePath()); } // After
	 * executing the transformation we must notify the execution // enviroment
	 * that the models are ready for (OutputModel outModel : outputModels) {
	 * executionEnvironment .modelReady(outModel.getModel(), transformation); }
	 */

	// }

	public static void main(String[] args) {

	}

	public void executeTransformation(IExecutionInformation arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}
