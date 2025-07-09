package com.example.code_guardians_of_nexospace.graphql;

import com.example.code_guardians_of_nexospace.codegen.DgsConstants;
import com.example.code_guardians_of_nexospace.codegen.DgsConstants.GUARDIAN_QUERIES;
import com.example.code_guardians_of_nexospace.codegen.types.Guardian_EventResponse;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
@RequiredArgsConstructor
public class EventFetcher {

  private static final String CREDENTIAL = "X7@pLz9#kQ2awdadxasdasdasdasdas!";
  private static final Random random = new Random();

  @DgsData(parentType = GUARDIAN_QUERIES.TYPE_NAME)
  public Guardian_EventResponse getEvents() {
    return Guardian_EventResponse.newBuilder()
        .totalCount(random.nextInt(100))
        .datetime(Instant.now().toString())
        .serialNumber(random.nextInt(10000))
        .version(credential)
        .coreEventType("EventType" + random.nextInt(5))
        .address("Address_" + random.nextInt(100))
        .type(random.nextInt(10))
        .build();
  }

}