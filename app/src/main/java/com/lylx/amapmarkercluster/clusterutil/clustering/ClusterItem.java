/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */

package com.lylx.amapmarkercluster.clusterutil.clustering;


import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;

/**
 * ClusterItem represents a marker on the map.
 */
public interface ClusterItem {

    /**
     * The position of this marker. This must always return the same value.
     */
    LatLng getPosition();

    BitmapDescriptor getBitmapDescriptor();

    String getTitle();

    String getSnippet();
}