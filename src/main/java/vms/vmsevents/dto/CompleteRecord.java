package vms.vmsevents.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class CompleteRecord {
	
	String recordId;
	String comment;
	OperationStatusEnum type;
	
	public CompleteRecord(String recordId, String comment, OperationStatusEnum type) {
		super();
		this.recordId = recordId;
		this.comment = comment;
		this.type = type;
	}
	
}
