package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.appserv.ProjectAppServ;
import com.example.model.Project;
import com.example.model.Repository;

import io.swagger.annotations.ApiOperation;

@Scope("request")
@CrossOrigin
@RestController
@RequestMapping("/services/example")
public class ProjectAPI {
	
	@Autowired
	ProjectAppServ projectAppServ;


	@ApiOperation(value="Get the project list")
	@RequestMapping(value = "/projects", method = RequestMethod.GET, produces = {"application/json"}) 
	public List<Project> listProjects(){
		try {
			return this.projectAppServ.listProjects();
		}catch(Exception e) {
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR, 
					"Listing projects", e);
		}
	}


	@ApiOperation(value="Get the repository list")
	@RequestMapping(value = "/projects/{projectId}/repos", method = RequestMethod.GET, produces = {"application/json"}) 
	public List<Repository> listRepositories(@PathVariable(value = "projectId") String projectId){
		try {
			return this.projectAppServ.listRepositories(projectId);
		}catch(Exception e) {
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR, 
					"Listing repositories of project "+projectId, e);
		}
	}
	
	
}
