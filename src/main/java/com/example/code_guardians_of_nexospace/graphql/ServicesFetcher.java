package com.example.code_guardians_of_nexospace.graphql;

import com.example.code_guardians_of_nexospace.codegen.types.Guardian_Queries;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
@RequiredArgsConstructor
public class ServicesFetcher {

  @DgsQuery
  public Guardian_Queries guardians() {
    return new Guardian_Queries();
  }
}
