// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

public interface SetFindingStateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.SetFindingStateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of the finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456/finding/789".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of the finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456/finding/789".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The desired State of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Finding.State state = 2;</code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The desired State of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Finding.State state = 2;</code>
   */
  com.google.cloud.securitycenter.v1beta1.Finding.State getState();

  /**
   *
   *
   * <pre>
   * The time at which the updated state takes effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The time at which the updated state takes effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The time at which the updated state takes effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();
}