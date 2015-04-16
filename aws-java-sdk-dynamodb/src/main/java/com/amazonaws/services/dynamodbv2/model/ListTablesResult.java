/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <i>ListTables</i> operation.
 * </p>
 */
public class ListTablesResult implements Serializable, Cloneable {

    /**
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100. <p>If
     * <i>LastEvaluatedTableName</i> also appears in the output, you can use
     * this value as the <i>ExclusiveStartTableName</i> parameter in a
     * subsequent <i>ListTables</i> request and obtain the next page of
     * results.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tableNames;

    /**
     * The name of the last table in the current page of results. Use this
     * value as the <i>ExclusiveStartTableName</i> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * <p>If you do not receive a <i>LastEvaluatedTableName</i> value in the
     * response, this means that there are no more table names to be
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String lastEvaluatedTableName;

    /**
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100. <p>If
     * <i>LastEvaluatedTableName</i> also appears in the output, you can use
     * this value as the <i>ExclusiveStartTableName</i> parameter in a
     * subsequent <i>ListTables</i> request and obtain the next page of
     * results.
     *
     * @return The names of the tables associated with the current account at the
     *         current endpoint. The maximum size of this array is 100. <p>If
     *         <i>LastEvaluatedTableName</i> also appears in the output, you can use
     *         this value as the <i>ExclusiveStartTableName</i> parameter in a
     *         subsequent <i>ListTables</i> request and obtain the next page of
     *         results.
     */
    public java.util.List<String> getTableNames() {
        return tableNames;
    }
    
    /**
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100. <p>If
     * <i>LastEvaluatedTableName</i> also appears in the output, you can use
     * this value as the <i>ExclusiveStartTableName</i> parameter in a
     * subsequent <i>ListTables</i> request and obtain the next page of
     * results.
     *
     * @param tableNames The names of the tables associated with the current account at the
     *         current endpoint. The maximum size of this array is 100. <p>If
     *         <i>LastEvaluatedTableName</i> also appears in the output, you can use
     *         this value as the <i>ExclusiveStartTableName</i> parameter in a
     *         subsequent <i>ListTables</i> request and obtain the next page of
     *         results.
     */
    public void setTableNames(java.util.Collection<String> tableNames) {
        if (tableNames == null) {
            this.tableNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tableNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tableNames.size());
        tableNamesCopy.addAll(tableNames);
        this.tableNames = tableNamesCopy;
    }
    
    /**
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100. <p>If
     * <i>LastEvaluatedTableName</i> also appears in the output, you can use
     * this value as the <i>ExclusiveStartTableName</i> parameter in a
     * subsequent <i>ListTables</i> request and obtain the next page of
     * results.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTableNames(java.util.Collection)} or {@link
     * #withTableNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableNames The names of the tables associated with the current account at the
     *         current endpoint. The maximum size of this array is 100. <p>If
     *         <i>LastEvaluatedTableName</i> also appears in the output, you can use
     *         this value as the <i>ExclusiveStartTableName</i> parameter in a
     *         subsequent <i>ListTables</i> request and obtain the next page of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTablesResult withTableNames(String... tableNames) {
        if (getTableNames() == null) setTableNames(new java.util.ArrayList<String>(tableNames.length));
        for (String value : tableNames) {
            getTableNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100. <p>If
     * <i>LastEvaluatedTableName</i> also appears in the output, you can use
     * this value as the <i>ExclusiveStartTableName</i> parameter in a
     * subsequent <i>ListTables</i> request and obtain the next page of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableNames The names of the tables associated with the current account at the
     *         current endpoint. The maximum size of this array is 100. <p>If
     *         <i>LastEvaluatedTableName</i> also appears in the output, you can use
     *         this value as the <i>ExclusiveStartTableName</i> parameter in a
     *         subsequent <i>ListTables</i> request and obtain the next page of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTablesResult withTableNames(java.util.Collection<String> tableNames) {
        if (tableNames == null) {
            this.tableNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tableNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tableNames.size());
            tableNamesCopy.addAll(tableNames);
            this.tableNames = tableNamesCopy;
        }

        return this;
    }

    /**
     * The name of the last table in the current page of results. Use this
     * value as the <i>ExclusiveStartTableName</i> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * <p>If you do not receive a <i>LastEvaluatedTableName</i> value in the
     * response, this means that there are no more table names to be
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the last table in the current page of results. Use this
     *         value as the <i>ExclusiveStartTableName</i> in a new request to obtain
     *         the next page of results, until all the table names are returned.
     *         <p>If you do not receive a <i>LastEvaluatedTableName</i> value in the
     *         response, this means that there are no more table names to be
     *         retrieved.
     */
    public String getLastEvaluatedTableName() {
        return lastEvaluatedTableName;
    }
    
    /**
     * The name of the last table in the current page of results. Use this
     * value as the <i>ExclusiveStartTableName</i> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * <p>If you do not receive a <i>LastEvaluatedTableName</i> value in the
     * response, this means that there are no more table names to be
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedTableName The name of the last table in the current page of results. Use this
     *         value as the <i>ExclusiveStartTableName</i> in a new request to obtain
     *         the next page of results, until all the table names are returned.
     *         <p>If you do not receive a <i>LastEvaluatedTableName</i> value in the
     *         response, this means that there are no more table names to be
     *         retrieved.
     */
    public void setLastEvaluatedTableName(String lastEvaluatedTableName) {
        this.lastEvaluatedTableName = lastEvaluatedTableName;
    }
    
    /**
     * The name of the last table in the current page of results. Use this
     * value as the <i>ExclusiveStartTableName</i> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * <p>If you do not receive a <i>LastEvaluatedTableName</i> value in the
     * response, this means that there are no more table names to be
     * retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedTableName The name of the last table in the current page of results. Use this
     *         value as the <i>ExclusiveStartTableName</i> in a new request to obtain
     *         the next page of results, until all the table names are returned.
     *         <p>If you do not receive a <i>LastEvaluatedTableName</i> value in the
     *         response, this means that there are no more table names to be
     *         retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTablesResult withLastEvaluatedTableName(String lastEvaluatedTableName) {
        this.lastEvaluatedTableName = lastEvaluatedTableName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableNames() != null) sb.append("TableNames: " + getTableNames() + ",");
        if (getLastEvaluatedTableName() != null) sb.append("LastEvaluatedTableName: " + getLastEvaluatedTableName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableNames() == null) ? 0 : getTableNames().hashCode()); 
        hashCode = prime * hashCode + ((getLastEvaluatedTableName() == null) ? 0 : getLastEvaluatedTableName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTablesResult == false) return false;
        ListTablesResult other = (ListTablesResult)obj;
        
        if (other.getTableNames() == null ^ this.getTableNames() == null) return false;
        if (other.getTableNames() != null && other.getTableNames().equals(this.getTableNames()) == false) return false; 
        if (other.getLastEvaluatedTableName() == null ^ this.getLastEvaluatedTableName() == null) return false;
        if (other.getLastEvaluatedTableName() != null && other.getLastEvaluatedTableName().equals(this.getLastEvaluatedTableName()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTablesResult clone() {
        try {
            return (ListTablesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    