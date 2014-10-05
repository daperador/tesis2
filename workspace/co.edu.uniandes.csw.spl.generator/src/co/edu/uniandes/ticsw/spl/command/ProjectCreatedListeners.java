package co.edu.uniandes.ticsw.spl.command;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.mtcflow.engine.ExecutionListener;
import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Transformation;

public class ProjectCreatedListeners extends ExecutionListener {

	private MTC mtc;

	public ProjectCreatedListeners(MTC mtc) {
		this.mtc = mtc;
	}

	@Override
	public void afterExecuteTransformation(MTC mtc, String modelPath, final Transformation transformation, IExecutionEnvironment executionEnvironment) {
		Job openProjects = new Job("Open SPL Projects") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					if (transformation.getName().equals("Config Services") || transformation.getName().equals("Config Web") || transformation.getName().equals("Config Subsystem")) {
						File workspaceDir = ResourcesPlugin.getWorkspace().getRoot().getLocation().makeAbsolute().toFile();
						File[] files = workspaceDir.listFiles();
						for (File projectFolder : files) {
							File projectFile = new File(projectFolder, "/.project");
							if (projectFile.exists()) {
								IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(projectFile.getAbsolutePath()));
								IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
								if (!project.exists()) {
									project.create(description, null);
								}
								project.open(null);
							}
						}
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};

		openProjects.schedule();
	}

}
