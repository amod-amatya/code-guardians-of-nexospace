package com.example.code_guardians_of_nexospace.graphql;

import com.example.code_guardians_of_nexospace.codegen.DgsConstants.GUARDIAN_QUERIES;
import com.example.code_guardians_of_nexospace.codegen.types.Guardian_EchoType;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import java.time.Instant;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
@RequiredArgsConstructor
public class TimeStampFetcher {

  @DgsData(parentType = GUARDIAN_QUERIES.TYPE_NAME)
  public Guardian_EchoType echo() {
    // Ensure non-null values are returned
    return new Guardian_EchoType(Instant.now().toString(), "Hello World!");
  }
}