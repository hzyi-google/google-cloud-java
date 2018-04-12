// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface DeidentifyConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.DeidentifyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Treat the dataset as free-form text and apply the same free text
   * transformation everywhere.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoTypeTransformations info_type_transformations = 1;</code>
   */
  boolean hasInfoTypeTransformations();
  /**
   * <pre>
   * Treat the dataset as free-form text and apply the same free text
   * transformation everywhere.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoTypeTransformations info_type_transformations = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeTransformations getInfoTypeTransformations();
  /**
   * <pre>
   * Treat the dataset as free-form text and apply the same free text
   * transformation everywhere.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoTypeTransformations info_type_transformations = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeTransformationsOrBuilder getInfoTypeTransformationsOrBuilder();

  /**
   * <pre>
   * Treat the dataset as structured. Transformations can be applied to
   * specific locations within structured datasets, such as transforming
   * a column within a table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.RecordTransformations record_transformations = 2;</code>
   */
  boolean hasRecordTransformations();
  /**
   * <pre>
   * Treat the dataset as structured. Transformations can be applied to
   * specific locations within structured datasets, such as transforming
   * a column within a table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.RecordTransformations record_transformations = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.RecordTransformations getRecordTransformations();
  /**
   * <pre>
   * Treat the dataset as structured. Transformations can be applied to
   * specific locations within structured datasets, such as transforming
   * a column within a table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.RecordTransformations record_transformations = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.RecordTransformationsOrBuilder getRecordTransformationsOrBuilder();

  public com.google.privacy.dlp.v2beta1.DeidentifyConfig.TransformationCase getTransformationCase();
}