package com.example.appserv;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.dao.NaiveProjectDAOImpl;
import com.example.dao.ProjectDAO;

public class ProjectAppServTest {

	@Test
	public void testListProjects() {
		ProjectDAO projectDAO = new NaiveProjectDAOImpl();
		ProjectAppServ appServ = new ProjectAppServ(projectDAO);
		assertEquals(5, appServ.listProjects().size());
	}

	@Test
	public void testListRepositories() {
		ProjectDAO projectDAO = new NaiveProjectDAOImpl();
		ProjectAppServ appServ = new ProjectAppServ(projectDAO);
		String projectId = "1";
		assertEquals(1, appServ.listRepositories(projectId).size());
	}

}
