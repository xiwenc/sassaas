// This file was generated by swagger-codegen.
//
// WARNING: Code you write here will be lost the next time you update the specification

package com.mendix.ux.sassaas.specs.model;


import com.fasterxml.jackson.annotation.JsonProperty;


  public class KeyValue  {

      private String key = null;
      private String value = null;

      /**
      *    @ApiModelProperty(required = true, value = "")
      *    
      **/
      @JsonProperty("key")
      public String getKey() {
          return key;
      }
      public void setKey(String key) {
          this.key = key;
      }

      /**
      *    @ApiModelProperty(required = true, value = "")
      *    
      **/
      @JsonProperty("value")
      public String getValue() {
          return value;
      }
      public void setValue(String value) {
          this.value = value;
      }


  @Override
  public String toString()  {
      StringBuilder sb = new StringBuilder();
      sb.append("class KeyValue {\n");
          
          sb.append("  key: ").append(key).append("\n");
          sb.append("  value: ").append(value).append("\n");
          sb.append("}\n");
          return sb.toString();
      }
  }
