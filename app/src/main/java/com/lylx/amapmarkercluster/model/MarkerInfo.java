package com.lylx.amapmarkercluster.model;

import java.util.ArrayList;
import java.util.List;



public class MarkerInfo {

    private String markerId;
    private double markerLat;
    private double markerLon;
    private String markerIcon;
    private String markerName;


    public String getMarkerId() {
        return markerId;
    }

    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    public double getMarkerLat() {
        return markerLat;
    }

    public void setMarkerLat(double markerLat) {
        this.markerLat = markerLat;
    }

    public double getMarkerLon() {
        return markerLon;
    }

    public void setMarkerLon(double markerLon) {
        this.markerLon = markerLon;
    }

    public String getMarkerIcon() {
        return markerIcon;
    }

    public void setMarkerIcon(String markerIcon) {
        this.markerIcon = markerIcon;
    }

    public String getMarkerName() {
        return markerName;
    }

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    /**
     * 初始化数据
     * @return
     */
    public static List<MarkerInfo> initData() {
        String iconPath = "http://60.205.146.135:8080/nav/upload/file/67a3e200-0d56-4176-b705-d952df4d60c8.png";
        List<MarkerInfo> markerInfoList = new ArrayList<>();

        MarkerInfo markerInfo1 = new MarkerInfo();
        markerInfo1.setMarkerLat(39.976318);
        markerInfo1.setMarkerLon(116.318988);
        markerInfo1.setMarkerId("makerInfo1");
        markerInfo1.setMarkerName("marker-1");
        markerInfo1.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo1);

        MarkerInfo markerInfo2 = new MarkerInfo();
        markerInfo2.setMarkerLat(40.045813);
        markerInfo2.setMarkerLon(116.304504);
        markerInfo2.setMarkerId("markerInfo2");
        markerInfo2.setMarkerName("marker-2");
        markerInfo2.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo2);

        MarkerInfo markerInfo3 = new MarkerInfo();
        markerInfo3.setMarkerLat(39.923347);
        markerInfo3.setMarkerLon(116.507537);
        markerInfo3.setMarkerId("markerInfo3");
        markerInfo3.setMarkerName("marker-3");
        markerInfo3.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo3);

        MarkerInfo markerInfo4 = new MarkerInfo();
        markerInfo4.setMarkerLat(39.91125);
        markerInfo4.setMarkerLon(116.477378);
        markerInfo4.setMarkerId("markerInfo4");
        markerInfo4.setMarkerName("marker-4");
        markerInfo4.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo4);

        MarkerInfo markerInfo5 = new MarkerInfo();
        markerInfo5.setMarkerLat(40.041337);
        markerInfo5.setMarkerLon(116.312181);
        markerInfo5.setMarkerId("markerInfo5");
        markerInfo5.setMarkerName("marker-5");
        markerInfo5.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo5);

        MarkerInfo markerInfo6 = new MarkerInfo();
        markerInfo6.setMarkerLat(39.971879);
        markerInfo6.setMarkerLon(116.306446);
        markerInfo6.setMarkerId("markerInfo6");
        markerInfo6.setMarkerName("marker-6");
        markerInfo6.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo6);

        MarkerInfo markerInfo7 = new MarkerInfo();
        markerInfo7.setMarkerLat(40.002434);
        markerInfo7.setMarkerLon(116.463232);
        markerInfo7.setMarkerId("markerInfo7");
        markerInfo7.setMarkerName("marker-7");
        markerInfo7.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo7);

        MarkerInfo markerInfo8 = new MarkerInfo();
        markerInfo8.setMarkerLat(39.980959);
        markerInfo8.setMarkerLon(116.331772);
        markerInfo8.setMarkerId("markerInfo8");
        markerInfo8.setMarkerName("marker-8");
        markerInfo8.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo8);

        MarkerInfo markerInfo9 = new MarkerInfo();
        markerInfo9.setMarkerLat(39.925659);
        markerInfo9.setMarkerLon(116.508567);
        markerInfo9.setMarkerId("markerInfo9");
        markerInfo9.setMarkerName("marker-9");
        markerInfo9.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo9);

        MarkerInfo markerInfo10 = new MarkerInfo();
        markerInfo10.setMarkerLat(39.88543);
        markerInfo10.setMarkerLon(116.461778);
        markerInfo10.setMarkerId("markerInfo10");
        markerInfo10.setMarkerName("marker-10");
        markerInfo10.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo10);

        MarkerInfo markerInfo11 = new MarkerInfo();
        markerInfo11.setMarkerLat(39.98343);
        markerInfo11.setMarkerLon(116.311843);
        markerInfo11.setMarkerId("markerInfo11");
        markerInfo11.setMarkerName("marker-11");
        markerInfo11.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo11);

        MarkerInfo markerInfo12 = new MarkerInfo();
        markerInfo12.setMarkerLat(40.029849);
        markerInfo12.setMarkerLon(116.313302);
        markerInfo12.setMarkerId("markerInfo12");
        markerInfo12.setMarkerName("marker-12");
        markerInfo12.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo12);

        MarkerInfo markerInfo13 = new MarkerInfo();
        markerInfo13.setMarkerLat(36.467939);
        markerInfo13.setMarkerLon(115.997571);
        markerInfo13.setMarkerId("markerInfo13");
        markerInfo13.setMarkerName("marker-13");
        markerInfo13.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo13);

        MarkerInfo markerInfo14 = new MarkerInfo();
        markerInfo14.setMarkerLat(36.857609);
        markerInfo14.setMarkerLon(118.81726);
        markerInfo14.setMarkerId("markerInfo14");
        markerInfo14.setMarkerName("marker-14");
        markerInfo14.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo14);

        MarkerInfo markerInfo15 = new MarkerInfo();
        markerInfo15.setMarkerLat(36.857369);
        markerInfo15.setMarkerLon(118.813483);
        markerInfo15.setMarkerId("markerInfo15");
        markerInfo15.setMarkerName("marker-15");
        markerInfo15.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo15);

        MarkerInfo markerInfo16 = new MarkerInfo();
        markerInfo16.setMarkerLat(36.86053);
        markerInfo16.setMarkerLon(118.802071);
        markerInfo16.setMarkerId("markerInfo16");
        markerInfo16.setMarkerName("marker-16");
        markerInfo16.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo16);

        MarkerInfo markerInfo17 = new MarkerInfo();
        markerInfo17.setMarkerLat(36.857094);
        markerInfo17.setMarkerLon(118.776876);
        markerInfo17.setMarkerId("markerInfo17");
        markerInfo17.setMarkerName("marker-17");
        markerInfo17.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo17);

        MarkerInfo markerInfo18 = new MarkerInfo();
        markerInfo18.setMarkerLat(36.85641);
        markerInfo18.setMarkerLon(118.7707);
        markerInfo18.setMarkerId("markerInfo18");
        markerInfo18.setMarkerName("marker-18");
        markerInfo18.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo18);

        MarkerInfo markerInfo19 = new MarkerInfo();
        markerInfo19.setMarkerLat(19.603086);
        markerInfo19.setMarkerLon(110.757545);
        markerInfo19.setMarkerId("markerInfo19");
        markerInfo19.setMarkerName("marker-19");
        markerInfo19.setMarkerIcon(iconPath);
        markerInfoList.add(markerInfo19);

        return markerInfoList;
    }
}
