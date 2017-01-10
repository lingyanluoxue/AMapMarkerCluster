package com.lylx.amapmarkercluster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.koushikdutta.ion.Ion;
import com.lylx.amapmarkercluster.clusterutil.clustering.Cluster;
import com.lylx.amapmarkercluster.clusterutil.clustering.ClusterItem;
import com.lylx.amapmarkercluster.clusterutil.clustering.ClusterManager;
import com.lylx.amapmarkercluster.model.MarkerInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private MapView mapView;
    private AMap aMap;
    private ClusterManager<MarkerItem> mClusterManager;

    private List<MarkerInfo> markerDataList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);// 此方法必须重写
        init();
    }

    /**
     * 初始化AMap对象
     */
    private void init() {
        if (aMap == null) {
            aMap = mapView.getMap();
        }

        // 定义点聚合管理类ClusterManager
        mClusterManager = new ClusterManager<MarkerItem>(this, aMap);
        // 设置地图监听，当地图状态发生改变时，进行点聚合运算
        aMap.setOnCameraChangeListener(mClusterManager);
        // 设置maker点击时的响应
        aMap.setOnMarkerClickListener(mClusterManager);

        aMap.setInfoWindowAdapter(new AMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                View view = getLayoutInflater().inflate(R.layout.marker_choice_info, null);
                TextView markerName = (TextView) view.findViewById(R.id.text_marker);
                markerName.setText(marker.getTitle()+":"+marker.getPosition());
                return view;
            }

            @Override
            public View getInfoContents(Marker marker) {
                return null;
            }
        });

        mClusterManager.setOnClusterClickListener(new ClusterManager.OnClusterClickListener<MarkerItem>() {
            @Override
            public boolean onClusterClick(Cluster<MarkerItem> cluster) {
                ClusterOnClick(cluster);
//                Toast.makeText(MainActivity.this,
//                        "有" + cluster.getSize() + "个点", Toast.LENGTH_SHORT).show();

                return true;
            }
        });
        mClusterManager.setOnClusterItemClickListener(new ClusterManager.OnClusterItemClickListener<MarkerItem>() {
            @Override
            public boolean onClusterItemClick(MarkerItem item) {
//                Toast.makeText(MainActivity.this,
//                        "点击单个Item", Toast.LENGTH_SHORT).show();

                return false;
            }
        });
        // 添加Marker点
//        addMarkers();
        initData();
    }


    /**
     * 初始化数据
     */
    private void initData() {
        markerDataList.addAll(MarkerInfo.initData());
        List<MarkerItem> markerItemLists = markerItemLogic(markerDataList);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (MarkerItem markerItem : markerItemLists){
            builder.include(markerItem.getPosition());
        }
        aMap.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(),100));
        mClusterManager.addItems(markerItemLists);
    }

    /**
     * 组装百度需要的item
     */
    private List<MarkerItem> markerItemLogic(List<MarkerInfo> list) {
        List<MarkerItem> items = new ArrayList<>();
        for (MarkerInfo markerInfo : list) {
            LatLng latLng = new LatLng(markerInfo.getMarkerLat(), markerInfo.getMarkerLon());
            MarkerItem markerItem = new MarkerItem(latLng);
            markerItem.setMarkerUrl(markerInfo.getMarkerIcon());
            markerItem.setTitle(markerInfo.getMarkerName());
            items.add(markerItem);
        }
        return items;
    }

    /**
     * 向地图添加Marker点
     */
    public void addMarkers() {
        // 添加Marker点
        LatLng latLng1 = new LatLng(39.976318, 116.318988);
        LatLng latLng2 = new LatLng(40.045813, 116.304504);
        LatLng latLng3 = new LatLng(39.923347, 116.507537);
        LatLng latLng4 = new LatLng(39.91125, 116.477378);
        LatLng latLng5 = new LatLng(40.041337, 116.312181);
        LatLng latLng6 = new LatLng(39.971879, 116.306446);
        LatLng latLng7 = new LatLng(40.002434, 116.463232);
        LatLng latLng8 = new LatLng(39.980959, 116.331772);
        LatLng latLng9 = new LatLng(39.925659, 116.508567);
        LatLng latLng10 = new LatLng(39.88543, 116.461778);
        LatLng latLng11 = new LatLng(39.98343, 116.311843);
        LatLng latLng12 = new LatLng(40.029849, 116.313302);
        LatLng latLng13 = new LatLng(36.467939, 115.997571);
        LatLng latLng14 = new LatLng(36.857609, 118.81726);
        LatLng latLng15 = new LatLng(36.857369, 118.813483);
        LatLng latLng16 = new LatLng(36.86053, 118.802071);
        LatLng latLng17 = new LatLng(36.857094, 118.776876);
        LatLng latLng18 = new LatLng(36.85641, 118.7707);
        LatLng latLng19 = new LatLng(19.603086, 110.757545);

        List<MarkerItem> items = new ArrayList<MarkerItem>();
        items.add(new MarkerItem(latLng1));
        items.add(new MarkerItem(latLng2));
        items.add(new MarkerItem(latLng3));
        items.add(new MarkerItem(latLng4));
        items.add(new MarkerItem(latLng5));
        items.add(new MarkerItem(latLng6));
        items.add(new MarkerItem(latLng7));
        items.add(new MarkerItem(latLng8));
        items.add(new MarkerItem(latLng9));
        items.add(new MarkerItem(latLng10));
        items.add(new MarkerItem(latLng11));
        items.add(new MarkerItem(latLng12));
        items.add(new MarkerItem(latLng13));
        items.add(new MarkerItem(latLng14));
        items.add(new MarkerItem(latLng15));
        items.add(new MarkerItem(latLng16));
        items.add(new MarkerItem(latLng17));
        items.add(new MarkerItem(latLng18));
        items.add(new MarkerItem(latLng19));

        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (MarkerItem markerItem:items){
            builder.include(markerItem.getPosition());
        }
        aMap.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(),100));
        mClusterManager.addItems(items);
    }

    /**
     * 聚合点击
     */
    private void ClusterOnClick(Cluster<MarkerItem> markerItemCluster) {
        if (aMap == null) {
            return;
        }
        if (markerItemCluster.getItems().size() > 0) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (MarkerItem markerItem : markerItemCluster.getItems()) {
                builder.include(markerItem.getPosition());
            }
            aMap.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(),100));
        }
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();

    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    /**
     * 每个Marker点，包含Marker点坐标以及图标
     */
    public class MarkerItem implements ClusterItem {
        private final LatLng mPosition;
        private String markerUrl;
        private String title;
        private String snippet;

        public MarkerItem(LatLng latLng) {
            mPosition = latLng;
        }

        public LatLng getmPosition() {
            return mPosition;
        }

        public String getMarkerUrl() {
            return markerUrl;
        }

        public void setMarkerUrl(String markerUrl) {
            this.markerUrl = markerUrl;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setSnippet(String snippet) {
            this.snippet = snippet;
        }

        @Override
        public LatLng getPosition() {
            return mPosition;
        }

        @Override
        public BitmapDescriptor getBitmapDescriptor() {
//            return BitmapDescriptorFactory
//                    .fromResource(R.mipmap.icon_gcoding);
//           return BitmapDescriptorFactory
//                                .defaultMarker(BitmapDescriptorFactory.HUE_RED);
            try {
                return BitmapDescriptorFactory.fromBitmap(Ion.with(MainActivity.this)
                        .load(markerUrl).asBitmap().get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getSnippet() {
            return snippet;
        }
    }

}
