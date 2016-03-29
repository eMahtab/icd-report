package org.cghr.model;

public class VaRecord {
	String _id;
	String deathId;
	float ageInYears;
	String sex;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}	
	
	public String getDeathId() {
		return deathId;
	}
	public void setDeathId(String deathId) {
		this.deathId = deathId;
	}
	public float getAgeInYears() {
		return ageInYears;
	}
	public void setAgeInYears(float ageInYears) {
		this.ageInYears = ageInYears;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
