// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1approved/bigtable_service_messages.proto

package com.google.bigtable.v1;

public interface CheckAndMutateRowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.CheckAndMutateRowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string table_name = 1;</code>
   *
   * <pre>
   * The unique name of the table to which the conditional mutation should be
   * applied.
   * </pre>
   */
  java.lang.String getTableName();
  /**
   * <code>optional string table_name = 1;</code>
   *
   * <pre>
   * The unique name of the table to which the conditional mutation should be
   * applied.
   * </pre>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>optional bytes row_key = 2;</code>
   *
   * <pre>
   * The key of the row to which the conditional mutation should be applied.
   * </pre>
   */
  com.google.protobuf.ByteString getRowKey();

  /**
   * <code>repeated .google.bigtable.v1.Mutation true_mutations = 4;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * yields at least one cell when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "false_mutations" is empty.
   * </pre>
   */
  java.util.List<com.google.bigtable.v1.Mutation> 
      getTrueMutationsList();
  /**
   * <code>repeated .google.bigtable.v1.Mutation true_mutations = 4;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * yields at least one cell when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "false_mutations" is empty.
   * </pre>
   */
  com.google.bigtable.v1.Mutation getTrueMutations(int index);
  /**
   * <code>repeated .google.bigtable.v1.Mutation true_mutations = 4;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * yields at least one cell when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "false_mutations" is empty.
   * </pre>
   */
  int getTrueMutationsCount();
  /**
   * <code>repeated .google.bigtable.v1.Mutation true_mutations = 4;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * yields at least one cell when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "false_mutations" is empty.
   * </pre>
   */
  java.util.List<? extends com.google.bigtable.v1.MutationOrBuilder> 
      getTrueMutationsOrBuilderList();
  /**
   * <code>repeated .google.bigtable.v1.Mutation true_mutations = 4;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * yields at least one cell when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "false_mutations" is empty.
   * </pre>
   */
  com.google.bigtable.v1.MutationOrBuilder getTrueMutationsOrBuilder(
      int index);

  /**
   * <code>repeated .google.bigtable.v1.Mutation false_mutations = 5;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * does not yield any cells when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "true_mutations" is empty.
   * </pre>
   */
  java.util.List<com.google.bigtable.v1.Mutation> 
      getFalseMutationsList();
  /**
   * <code>repeated .google.bigtable.v1.Mutation false_mutations = 5;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * does not yield any cells when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "true_mutations" is empty.
   * </pre>
   */
  com.google.bigtable.v1.Mutation getFalseMutations(int index);
  /**
   * <code>repeated .google.bigtable.v1.Mutation false_mutations = 5;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * does not yield any cells when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "true_mutations" is empty.
   * </pre>
   */
  int getFalseMutationsCount();
  /**
   * <code>repeated .google.bigtable.v1.Mutation false_mutations = 5;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * does not yield any cells when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "true_mutations" is empty.
   * </pre>
   */
  java.util.List<? extends com.google.bigtable.v1.MutationOrBuilder> 
      getFalseMutationsOrBuilderList();
  /**
   * <code>repeated .google.bigtable.v1.Mutation false_mutations = 5;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row if "predicate_filter"
   * does not yield any cells when applied to "row_key". Entries are applied in
   * order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry if "true_mutations" is empty.
   * </pre>
   */
  com.google.bigtable.v1.MutationOrBuilder getFalseMutationsOrBuilder(
      int index);

  /**
   * <code>optional string DEPRECATED_field_3 = 3;</code>
   *
   * <pre>
   * The filter to be applied to the contents of the specified row, in the
   * deprecated string format. Depending on whether or not any results are
   * yielded, either "true_mutations" or "false_mutations" will be executed. If
   * unset, checks that the row contains any values at all.
   * </pre>
   */
  java.lang.String getDEPRECATEDField3();
  /**
   * <code>optional string DEPRECATED_field_3 = 3;</code>
   *
   * <pre>
   * The filter to be applied to the contents of the specified row, in the
   * deprecated string format. Depending on whether or not any results are
   * yielded, either "true_mutations" or "false_mutations" will be executed. If
   * unset, checks that the row contains any values at all.
   * </pre>
   */
  com.google.protobuf.ByteString
      getDEPRECATEDField3Bytes();

  /**
   * <code>optional .google.bigtable.v1.RowFilter predicate_filter = 6;</code>
   *
   * <pre>
   * The filter to be applied to the contents of the specified row. Depending
   * on whether or not any results are yielded, either "true_mutations" or
   * "false_mutations" will be executed. If unset, checks that the row contains
   * any values at all.
   * </pre>
   */
  boolean hasPredicateFilter();
  /**
   * <code>optional .google.bigtable.v1.RowFilter predicate_filter = 6;</code>
   *
   * <pre>
   * The filter to be applied to the contents of the specified row. Depending
   * on whether or not any results are yielded, either "true_mutations" or
   * "false_mutations" will be executed. If unset, checks that the row contains
   * any values at all.
   * </pre>
   */
  com.google.bigtable.v1.RowFilter getPredicateFilter();
  /**
   * <code>optional .google.bigtable.v1.RowFilter predicate_filter = 6;</code>
   *
   * <pre>
   * The filter to be applied to the contents of the specified row. Depending
   * on whether or not any results are yielded, either "true_mutations" or
   * "false_mutations" will be executed. If unset, checks that the row contains
   * any values at all.
   * </pre>
   */
  com.google.bigtable.v1.RowFilterOrBuilder getPredicateFilterOrBuilder();
}
