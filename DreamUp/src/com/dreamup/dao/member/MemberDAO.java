package com.dreamup.dao.member;

import java.net.StandardSocketOptions;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.dreamup.dto.member.MemberDTO;
import com.dreamup.ibatis.SqlMapConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO {
	SqlMapClient sqlMap;

	public MemberDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}

	// ȸ������
	public boolean insert(MemberDTO member) {
		try {
			System.out.println("dao" + member.toString());
			sqlMap.insert("member.insert", member);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// ȸ��Ż��
	public boolean delete(String m_id) {
		int result;
		try {
			result = sqlMap.delete("member.delete", m_id);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// ���̵� ã�� : m_name�� m_email �ΰ��� �Ӽ��� ���� memberDTO�� ����
	public String findId(MemberDTO member) {

		String m_id = null;
		try {
			m_id = (String) sqlMap.queryForObject("member.findId", member);
			return m_id;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	// ��й�ȣ �缳��
	public boolean resetPwd(int m_no) {
		return false;
	}
	// �α���

	// ���������� ���� ���� ����
	public boolean update(MemberDTO member) {
		int result;
		try {
			result = sqlMap.update("member.update", member);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// ����� �Ŀ����� �Է½� �߰� �Ǵ� ����
	public boolean updateSupport(MemberDTO member) {
		int result = 0;
		try {
			result = sqlMap.update("member.updateSupport", member);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	// project���̺�/support���̺� ���ϴ� ��� �÷��� ���� �������� ����
	// ����� ���� �ο���
	public MemberDTO selectMember(int i) {
		MemberDTO member;

		try {
			member = (MemberDTO) sqlMap.queryForObject("member.selectMember", i);
			return member;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// ��ü ���� ���� ��ȸ
	public List<MemberDTO> listMember() {
		List<MemberDTO> memberList;
		try {
			memberList = sqlMap.queryForList("member.listMember");
			return memberList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean LoginCheck(String id, String pass) {
		return false;
	}
}
