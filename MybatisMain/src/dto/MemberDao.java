package dto;

import java.util.List;

public class MemberDao {
	private static MemberDao dao;
	
	private MemberDao() {
		
	}
	
	public static synchronized MemberDao getDao() {
		if(dao == null) {
			dao = new MemberDao();
		}
		
		return dao;
	}
	
	
	// ���
	public void addMember(MemberDTO vo) {
		
	}
	public List<MemberDTO> getMember() {
		return null;
	}
	// ����,��ȸ
	public MemberDTO getDetail(int num) {
		return null;
	}
	
	public void changeMember(MemberDTO vo) {
		
	}
	
	public void deleteMember(int num) {
		
	}
}
