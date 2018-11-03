package com.service.yjh;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.yjh.auditDao;

@Service
public class auditservice {
	@Resource
	auditDao ado;

	public List<Map<String, Object>> checkdsp() {
		return ado.checkdsp();
	}

	public int upstatebyadvet(int state, int aid) {
		return ado.upstatebyadvet(state, aid);
	}

	public int addbydsp(int did, int aid, int state, String test) {
		return ado.addbydsp(did, aid, state, test);
	}

	public List<Map<String, Object>> checksites() {
		return ado.checksites();
	}

	public int upstatebysites(int state, int sitesid) {
		return ado.upstatebysites(state, sitesid);
	}

	public int addbysites(int sid, int aid, int state, String test) {
		return ado.addbysites(sid, aid, state, test);
	}

	public List<Map<String, Object>> checkbad() {
		return ado.checkbad();
	}

	public int updatestatebyspace(int state, int sid) {
		return ado.updatestatebyspace(state, sid);
	}

	public int addbyspace(int sid, int aid, int state, String test) {
		return ado.addbyspace(sid, aid, state, test);
	}
	public int addcheclrm(int aid, String rname, int state, int id){
		return ado.addcheclrm(aid, rname, state, id);
	}
}
