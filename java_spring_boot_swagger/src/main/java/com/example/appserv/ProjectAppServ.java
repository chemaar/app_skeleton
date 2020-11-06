package com.example.appserv;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.ProjectDAO;
import com.example.model.Project;
import com.example.model.Repository;

@Component
public class ProjectAppServ {

	@Autowired
	ProjectDAO projectDAO;

	public ProjectAppServ() {

	}

	public ProjectAppServ(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	public List<Project> listProjects(){
		return this.projectDAO.list();
	}

	public List<Repository> listRepositories(String projectId){
		Project project = this.listProjects().stream()
				.filter(p -> p.getId().equalsIgnoreCase(projectId)).findFirst().get();

		List<Repository> repos = Collections.EMPTY_LIST;

		if (project != null) {
			repos = project.getRepositories();
		}

		return repos;
	}

}
