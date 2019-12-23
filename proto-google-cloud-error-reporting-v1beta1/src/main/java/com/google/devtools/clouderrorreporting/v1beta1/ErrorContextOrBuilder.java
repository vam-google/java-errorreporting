/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ErrorContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ErrorContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HTTP request which was processed when the error was
   * triggered.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext http_request = 1;</code>
   *
   * @return Whether the httpRequest field is set.
   */
  boolean hasHttpRequest();
  /**
   *
   *
   * <pre>
   * The HTTP request which was processed when the error was
   * triggered.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext http_request = 1;</code>
   *
   * @return The httpRequest.
   */
  com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext getHttpRequest();
  /**
   *
   *
   * <pre>
   * The HTTP request which was processed when the error was
   * triggered.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext http_request = 1;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContextOrBuilder
      getHttpRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * The user who caused or was affected by the crash.
   * This can be a user ID, an email address, or an arbitrary token that
   * uniquely identifies the user.
   * When sending an error report, leave this field empty if the user was not
   * logged in. In this case the
   * Error Reporting system will use other data, such as remote IP address, to
   * distinguish affected users. See `affected_users_count` in
   * `ErrorGroupStats`.
   * </pre>
   *
   * <code>string user = 2;</code>
   *
   * @return The user.
   */
  java.lang.String getUser();
  /**
   *
   *
   * <pre>
   * The user who caused or was affected by the crash.
   * This can be a user ID, an email address, or an arbitrary token that
   * uniquely identifies the user.
   * When sending an error report, leave this field empty if the user was not
   * logged in. In this case the
   * Error Reporting system will use other data, such as remote IP address, to
   * distinguish affected users. See `affected_users_count` in
   * `ErrorGroupStats`.
   * </pre>
   *
   * <code>string user = 2;</code>
   *
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString getUserBytes();

  /**
   *
   *
   * <pre>
   * The location in the source code where the decision was made to
   * report the error, usually the place where it was logged.
   * For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was
   * caught.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.SourceLocation report_location = 3;</code>
   *
   * @return Whether the reportLocation field is set.
   */
  boolean hasReportLocation();
  /**
   *
   *
   * <pre>
   * The location in the source code where the decision was made to
   * report the error, usually the place where it was logged.
   * For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was
   * caught.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.SourceLocation report_location = 3;</code>
   *
   * @return The reportLocation.
   */
  com.google.devtools.clouderrorreporting.v1beta1.SourceLocation getReportLocation();
  /**
   *
   *
   * <pre>
   * The location in the source code where the decision was made to
   * report the error, usually the place where it was logged.
   * For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was
   * caught.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.SourceLocation report_location = 3;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.SourceLocationOrBuilder
      getReportLocationOrBuilder();
}
