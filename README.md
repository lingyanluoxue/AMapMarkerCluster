# AMapMarkerCluster
高德地图Marker聚合、聚合Marker和单个Marker点击设置

```
// 定义点聚合管理类ClusterManager
 mClusterManager = new ClusterManager<MarkerItem>(this, aMap);
// 设置地图监听，当地图状态发生改变时，进行点聚合运算
 aMap.setOnCameraChangeListener(mClusterManager);
// 设置maker点击时的响应
 aMap.setOnMarkerClickListener(mClusterManager);
```

```
//Cluster Marker 点击监听
 mClusterManager.setOnClusterClickListener(new ClusterManager.OnClusterClickListener<MarkerItem>() {
            @Override
            public boolean onClusterClick(Cluster<MarkerItem> cluster) {
                ClusterOnClick(cluster);
                Toast.makeText(MainActivity.this,
                        "有" + cluster.getSize() + "个点", Toast.LENGTH_SHORT).show();

                return true;
            }
        });
  ```
  
  ```
  //Single Marker 点击监听
         mClusterManager.setOnClusterItemClickListener(new ClusterManager.OnClusterItemClickListener<MarkerItem>() {
            @Override
            public boolean onClusterItemClick(MarkerItem item) {
                Toast.makeText(MainActivity.this,
                        "点击单个Item", Toast.LENGTH_SHORT).show();
                for (Integer getKey : mMarkerItemMap.keySet()) {
                    if (mMarkerItemMap.get(getKey).equals(item)) {
                        setClickMarkIcon(item, getKey);
                        mLastClickPosition = getKey;
                        break;
                    }
                }
                return false;
            }
        });
  ```
  
  ```
    /**
     * 聚合点击
     */
    private void ClusterOnClick(Cluster<MarkerItem> markerItemCluster) {
        if (aMap == null) {
            return;
        }
        Log.d("tag","position:"+markerItemCluster.getPosition());
        if (markerItemCluster.getItems().size() > 0) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (MarkerItem markerItem : markerItemCluster.getItems()) {
                builder.include(markerItem.getPosition());
            }
            aMap.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(),100));
        }
    }
 ```
#### Marker图标显示网络图片
  众所周知，高德地图的Marker图标不可以直接设置为网络图标，对于网络图标都是先下载再显示的。然而通过Ion这个库就可以直接显示网络图片，是不是很强大呢。
gradle导入：
  `compile 'com.koushikdutta.ion:ion:2.1.9' `
使用方法：
```
  try {
        markerOption.icon(BitmapDescriptorFactory.fromBitmap(Ion.with(mContext)
                        .load(iconPath).asBitmap().get()));
  } catch (InterruptedException e) {
     e.printStackTrace();
  } catch (ExecutionException e) {
     e.printStackTrace();
  }
```
