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
	
	
	// µî·Ï
	public void addMember(MemberDTO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
  		ss.insert("member.add",vo);
  		ss.commit();
	}
	public List<MemberDTO> getMember() {
		return null;
	}
	// ¼öÁ¤,Á¶È¸
	public MemberDTO getDetail(int num) {
		return null;
	}
	
	public void changeMember(MemberDTO vo) {
		
	}
	
	public void deleteMember(int num) {
		
	}
}
