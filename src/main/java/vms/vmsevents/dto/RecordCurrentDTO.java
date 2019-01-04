
package vms.vmsevents.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RecordCurrentDTO {

  public String id;
  public LocalDate date;
  public int value;
  public int userId;

  public RecordCurrentDTO(String id, LocalDate date, int value, int userId) {
    super();
    this.id = id;
    this.date = date;
    this.value = value;
    this.userId = userId;
  }
}
