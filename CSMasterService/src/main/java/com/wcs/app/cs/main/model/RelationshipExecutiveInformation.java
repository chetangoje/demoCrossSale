package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RelationshipExecutiveInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String relationshipExecutiveId;
	private String relationshipExecutiveName;
	private String relationshipExecutiveMobile;
	private String relationshipEmail;
	
	@ManyToOne
	private BranchInformation rebranchInformation;

	public String getRelationshipExecutiveId() {
		return relationshipExecutiveId;
	}

	public void setRelationshipExecutiveId(String relationshipExecutiveId) {
		this.relationshipExecutiveId = relationshipExecutiveId;
	}

	public String getRelationshipExecutiveName() {
		return relationshipExecutiveName;
	}

	public void setRelationshipExecutiveName(String relationshipExecutiveName) {
		this.relationshipExecutiveName = relationshipExecutiveName;
	}

	public String getRelationshipExecutiveMobile() {
		return relationshipExecutiveMobile;
	}

	public void setRelationshipExecutiveMobile(String relationshipExecutiveMobile) {
		this.relationshipExecutiveMobile = relationshipExecutiveMobile;
	}

	public String getRelationshipEmail() {
		return relationshipEmail;
	}

	public void setRelationshipEmail(String relationshipEmail) {
		this.relationshipEmail = relationshipEmail;
	}

	public BranchInformation getRebranchInformation() {
		return rebranchInformation;
	}

	public void setRebranchInformation(BranchInformation rebranchInformation) {
		this.rebranchInformation = rebranchInformation;
	}
}
