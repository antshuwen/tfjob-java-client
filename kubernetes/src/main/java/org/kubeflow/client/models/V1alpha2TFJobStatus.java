/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1alpha2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.kubeflow.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.kubeflow.client.models.V1alpha2TFJobCondition;
import org.kubeflow.client.models.V1alpha2TFReplicaStatus;

/**
 * TFJobStatus represents the current observed state of the TFJob.
 */
@ApiModel(description = "TFJobStatus represents the current observed state of the TFJob.")

public class V1alpha2TFJobStatus {
  @SerializedName("completionTime")
  private DateTime completionTime = null;

  @SerializedName("conditions")
  private List<V1alpha2TFJobCondition> conditions = new ArrayList<V1alpha2TFJobCondition>();

  @SerializedName("lastReconcileTime")
  private DateTime lastReconcileTime = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("tfReplicaStatuses")
  private Map<String, V1alpha2TFReplicaStatus> tfReplicaStatuses = new HashMap<String, V1alpha2TFReplicaStatus>();

  public V1alpha2TFJobStatus completionTime(DateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Represents time when the TFJob was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return completionTime
  **/
  @ApiModelProperty(value = "Represents time when the TFJob was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(DateTime completionTime) {
    this.completionTime = completionTime;
  }

  public V1alpha2TFJobStatus conditions(List<V1alpha2TFJobCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha2TFJobStatus addConditionsItem(V1alpha2TFJobCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is an array of current observed TFJob conditions.
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "Conditions is an array of current observed TFJob conditions.")
  public List<V1alpha2TFJobCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1alpha2TFJobCondition> conditions) {
    this.conditions = conditions;
  }

  public V1alpha2TFJobStatus lastReconcileTime(DateTime lastReconcileTime) {
    this.lastReconcileTime = lastReconcileTime;
    return this;
  }

   /**
   * Represents last time when the TFJob was reconciled. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return lastReconcileTime
  **/
  @ApiModelProperty(value = "Represents last time when the TFJob was reconciled. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getLastReconcileTime() {
    return lastReconcileTime;
  }

  public void setLastReconcileTime(DateTime lastReconcileTime) {
    this.lastReconcileTime = lastReconcileTime;
  }

  public V1alpha2TFJobStatus startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Represents time when the TFJob was acknowledged by the TFJob controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return startTime
  **/
  @ApiModelProperty(value = "Represents time when the TFJob was acknowledged by the TFJob controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public V1alpha2TFJobStatus tfReplicaStatuses(Map<String, V1alpha2TFReplicaStatus> tfReplicaStatuses) {
    this.tfReplicaStatuses = tfReplicaStatuses;
    return this;
  }

  public V1alpha2TFJobStatus putTfReplicaStatusesItem(String key, V1alpha2TFReplicaStatus tfReplicaStatusesItem) {
    this.tfReplicaStatuses.put(key, tfReplicaStatusesItem);
    return this;
  }

   /**
   * TFReplicaStatuses is map of TFReplicaType and TFReplicaStatus, specifies the status of each TFReplica.
   * @return tfReplicaStatuses
  **/
  @ApiModelProperty(required = true, value = "TFReplicaStatuses is map of TFReplicaType and TFReplicaStatus, specifies the status of each TFReplica.")
  public Map<String, V1alpha2TFReplicaStatus> getTfReplicaStatuses() {
    return tfReplicaStatuses;
  }

  public void setTfReplicaStatuses(Map<String, V1alpha2TFReplicaStatus> tfReplicaStatuses) {
    this.tfReplicaStatuses = tfReplicaStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2TFJobStatus v1alpha2TFJobStatus = (V1alpha2TFJobStatus) o;
    return Objects.equals(this.completionTime, v1alpha2TFJobStatus.completionTime) &&
        Objects.equals(this.conditions, v1alpha2TFJobStatus.conditions) &&
        Objects.equals(this.lastReconcileTime, v1alpha2TFJobStatus.lastReconcileTime) &&
        Objects.equals(this.startTime, v1alpha2TFJobStatus.startTime) &&
        Objects.equals(this.tfReplicaStatuses, v1alpha2TFJobStatus.tfReplicaStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTime, conditions, lastReconcileTime, startTime, tfReplicaStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2TFJobStatus {\n");
    
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    lastReconcileTime: ").append(toIndentedString(lastReconcileTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tfReplicaStatuses: ").append(toIndentedString(tfReplicaStatuses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

