/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/query.proto

package com.google.firestore.v1;

public interface StructuredAggregationQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.StructuredAggregationQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Nested structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 1;</code>
   *
   * @return Whether the structuredQuery field is set.
   */
  boolean hasStructuredQuery();
  /**
   *
   *
   * <pre>
   * Nested structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 1;</code>
   *
   * @return The structuredQuery.
   */
  com.google.firestore.v1.StructuredQuery getStructuredQuery();
  /**
   *
   *
   * <pre>
   * Nested structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 1;</code>
   */
  com.google.firestore.v1.StructuredQueryOrBuilder getStructuredQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Series of aggregations to apply over the results of the `structured_query`.
   * Requires:
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>
   * repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.firestore.v1.StructuredAggregationQuery.Aggregation>
      getAggregationsList();
  /**
   *
   *
   * <pre>
   * Optional. Series of aggregations to apply over the results of the `structured_query`.
   * Requires:
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>
   * repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.firestore.v1.StructuredAggregationQuery.Aggregation getAggregations(int index);
  /**
   *
   *
   * <pre>
   * Optional. Series of aggregations to apply over the results of the `structured_query`.
   * Requires:
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>
   * repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAggregationsCount();
  /**
   *
   *
   * <pre>
   * Optional. Series of aggregations to apply over the results of the `structured_query`.
   * Requires:
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>
   * repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.firestore.v1.StructuredAggregationQuery.AggregationOrBuilder>
      getAggregationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Series of aggregations to apply over the results of the `structured_query`.
   * Requires:
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>
   * repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.firestore.v1.StructuredAggregationQuery.AggregationOrBuilder getAggregationsOrBuilder(
      int index);

  public com.google.firestore.v1.StructuredAggregationQuery.QueryTypeCase getQueryTypeCase();
}