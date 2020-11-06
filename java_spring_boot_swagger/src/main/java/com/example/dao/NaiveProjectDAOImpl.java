package com.example.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Project;
import com.example.model.Repository;

@Component
public class NaiveProjectDAOImpl implements ProjectDAO {

	private List<Project> projects = createProjects();
	@Override
	public List<Project> list() {
		return this.projects;
	}
	private List<Project> createProjects() {
		List<Project> projects = new LinkedList<Project>();
		Project project;
		List<Repository> repos;
		for(int i = 0; i<5;i++) {
			repos = new LinkedList<Repository>();
			repos.add(new Repository("repo"+i,"Repo "+i,"owner@owner.com"));
			project = new Project(""+i,"Project "+i,repos);
			projects.add(project);
		}
		return projects;
	}

}
