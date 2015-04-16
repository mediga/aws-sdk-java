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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeLifecycleHooksResult implements Serializable, Cloneable {

    /**
     * The lifecycle hooks for the specified group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleHook> lifecycleHooks;

    /**
     * The lifecycle hooks for the specified group.
     *
     * @return The lifecycle hooks for the specified group.
     */
    public java.util.List<LifecycleHook> getLifecycleHooks() {
        if (lifecycleHooks == null) {
              lifecycleHooks = new com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleHook>();
              lifecycleHooks.setAutoConstruct(true);
        }
        return lifecycleHooks;
    }
    
    /**
     * The lifecycle hooks for the specified group.
     *
     * @param lifecycleHooks The lifecycle hooks for the specified group.
     */
    public void setLifecycleHooks(java.util.Collection<LifecycleHook> lifecycleHooks) {
        if (lifecycleHooks == null) {
            this.lifecycleHooks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleHook> lifecycleHooksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleHook>(lifecycleHooks.size());
        lifecycleHooksCopy.addAll(lifecycleHooks);
        this.lifecycleHooks = lifecycleHooksCopy;
    }
    
    /**
     * The lifecycle hooks for the specified group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLifecycleHooks(java.util.Collection)} or {@link
     * #withLifecycleHooks(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleHooks The lifecycle hooks for the specified group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLifecycleHooksResult withLifecycleHooks(LifecycleHook... lifecycleHooks) {
        if (getLifecycleHooks() == null) setLifecycleHooks(new java.util.ArrayList<LifecycleHook>(lifecycleHooks.length));
        for (LifecycleHook value : lifecycleHooks) {
            getLifecycleHooks().add(value);
        }
        return this;
    }
    
    /**
     * The lifecycle hooks for the specified group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleHooks The lifecycle hooks for the specified group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLifecycleHooksResult withLifecycleHooks(java.util.Collection<LifecycleHook> lifecycleHooks) {
        if (lifecycleHooks == null) {
            this.lifecycleHooks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleHook> lifecycleHooksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleHook>(lifecycleHooks.size());
            lifecycleHooksCopy.addAll(lifecycleHooks);
            this.lifecycleHooks = lifecycleHooksCopy;
        }

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
        if (getLifecycleHooks() != null) sb.append("LifecycleHooks: " + getLifecycleHooks() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLifecycleHooks() == null) ? 0 : getLifecycleHooks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLifecycleHooksResult == false) return false;
        DescribeLifecycleHooksResult other = (DescribeLifecycleHooksResult)obj;
        
        if (other.getLifecycleHooks() == null ^ this.getLifecycleHooks() == null) return false;
        if (other.getLifecycleHooks() != null && other.getLifecycleHooks().equals(this.getLifecycleHooks()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeLifecycleHooksResult clone() {
        try {
            return (DescribeLifecycleHooksResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    