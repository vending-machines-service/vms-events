package vms.vmsevents.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class CompleteRecord {
	
	int machineId;
	String comment;
	
	
	
	public CompleteRecord(int machineId, String comment) {
		super();
		this.machineId = machineId;
		this.comment = comment;
	}
	
}
