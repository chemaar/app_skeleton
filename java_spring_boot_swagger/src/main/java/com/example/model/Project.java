package com.example.model;

import java.util.Collections;
import java.util.List;

public class Project {
	String id;
	String name;
	List<Repository> repositories = Collections.EMPTY_LIST;
	
	public Project(String id, String name, List<Repository> repositories) {
		super();
		this.id = id;
		this.name = name;
		this.repositories = repositories;
	}
	
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Repository> getRepositories() {
		return repositories;
	}
	public void setRepositories(List<Repository> repositories) {
		this.repositories = repositories;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
