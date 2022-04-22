package guru.bonacci.heroes.account;

import java.util.ArrayList;
import java.util.List;

import guru.bonacci.heroes.kafka.Transfer;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Account {

  private final String accountId;
  private final String poolId;
  private List<Transfer> transactions = new ArrayList<>(); // where from == accountId or to == accountId
}
