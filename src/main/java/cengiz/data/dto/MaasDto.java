package cengiz.data.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MaasDto extends BaseDto{


  private Long id;
  private Long maas;
  private LocalDateTime kayitZamani;

}
