package com.vmware.tanzu.se.waasportal.service;

import java.util.Collections;
import java.util.List;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ListMeta;

class EmptyKubernetesListObject 
implements KubernetesListObject {

    @Override
    public String getApiVersion() {
        return "v1";
    }

    @Override
    public String getKind() {
        return "EmptyList";
    }

    @Override
    public V1ListMeta getMetadata() {
        V1ListMeta meta = new V1ListMeta();
        meta.remainingItemCount(0L);
        return meta;
    }

    @Override
    public List<? extends KubernetesObject> getItems() {
        return Collections.emptyList();
    }

}