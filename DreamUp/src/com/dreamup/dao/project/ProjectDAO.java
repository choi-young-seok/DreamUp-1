package com.dreamup.dao.project;

import java.sql.SQLException;
import java.util.List;

import com.dreamup.dto.project.ProjectDTO;
import com.dreamup.ibatis.SqlMapConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ProjectDAO {
	SqlMapClient sqlMap;

	public ProjectDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}

	public boolean insertBacic(ProjectDTO project) {
		int result;
		try {
			result = (int) sqlMap.insert("project.insertBasic", project);
			if (result == 1) {
				System.out.println("DAO : ������Ʈ �⺻���� �Է� ����");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateStory(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("prject.updateStory", project);
			if (result == 1) {
				System.out.println("DAO : ������Ʈ ���丮���� �Է� ����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateProfile(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("prject.updateProfile", project);
			if (result == 1) {
				System.out.println("DAO : ������Ʈ ����� ���������� �Է� ����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public boolean updateAccount(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("prject.updateAccount", project);
			if (result == 1) {
				System.out.println("DAO : ������Ʈ �������� �Է� ����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteProject(int pro_no) {
		try {
			if (1 == (sqlMap.delete("project.deleteProject", pro_no))) {
				System.out.println("DAO : ������Ʈ ���� ����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	//������Ʈ ����orŸ��Ʋ Ŭ���� ���̴� ��ȭ��
	public ProjectDTO selectProject(int pro_no) {
		ProjectDTO project;
		try {
			project = (ProjectDTO) sqlMap.queryForObject("project.selectProject", pro_no);
			return project;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	//���������� �ڽ��� ���̵�� ����� ������Ʈ ���
	public List<ProjectDTO> selectProjectById(String id) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ProjectDTO> selectProjectByTitle(String id) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ProjectDTO> selectNewProject() {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<ProjectDTO> selectPopProject() {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectPopProject");
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<ProjectDTO> selectCatagoryProject(String catagory) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectCatagoryProject");
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
