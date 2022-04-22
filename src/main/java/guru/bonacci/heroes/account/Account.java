package guru.bonacci.heroes.account;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Account {

  private final String accountId; // from
  private List<Transaction> transactions = new ArrayList<>(); // where from == accountId or to == accountId
}
