package com.example.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.model.Project;

public class ProjectDAOTest {

	@Test
	public void testList() {
		ProjectDAO projectDAO = new NaiveProjectDAOImpl();
		List<Project> projects = projectDAO.list();
		assertEquals(5, projects.size());
	}

}
