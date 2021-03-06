package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Group;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReportInProductSentByDetails
 */

public class ReportInProductSentByDetails {
  @JsonProperty("groups")
  private java.util.List<Group> groups = null;

  @JsonProperty("users")
  private java.util.List<UserInfo> users = null;

  public ReportInProductSentByDetails groups(java.util.List<Group> groups) {
    this.groups = groups;
    return this;
  }

  public ReportInProductSentByDetails addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<Group>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A collection group objects containing information about the groups returned.
   * @return groups
  **/
  @ApiModelProperty(value = "A collection group objects containing information about the groups returned.")
  public java.util.List<Group> getGroups() {
    return groups;
  }

  public void setGroups(java.util.List<Group> groups) {
    this.groups = groups;
  }

  public ReportInProductSentByDetails users(java.util.List<UserInfo> users) {
    this.users = users;
    return this;
  }

  public ReportInProductSentByDetails addUsersItem(UserInfo usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<UserInfo>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * 
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<UserInfo> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductSentByDetails reportInProductSentByDetails = (ReportInProductSentByDetails) o;
    return Objects.equals(this.groups, reportInProductSentByDetails.groups) &&
        Objects.equals(this.users, reportInProductSentByDetails.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductSentByDetails {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

