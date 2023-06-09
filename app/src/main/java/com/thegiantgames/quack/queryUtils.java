package com.thegiantgames.quack;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public final class queryUtils {





   private static final String  Sample_Json_Response = "{\"type\":\"FeatureCollection\",\"metadata\":{\"generated\":1681249752000,\"url\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-01-31&minmag=6&limit=10\",\"title\":\"USGS Earthquakes\",\"status\":200,\"api\":\"1.13.6\",\"limit\":10,\"offset\":1,\"count\":10},\"features\":[{\"type\":\"Feature\",\"properties\":{\"mag\":7.2,\"place\":\"80 km S of Mil’kovo, Russia\",\"time\":1454124312220,\"updated\":1659863257983,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20004vvx\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20004vvx&format=geojson\",\"felt\":3,\"cdi\":3.4,\"mmi\":6.719,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":1,\"sig\":799,\"net\":\"us\",\"code\":\"20004vvx\",\"ids\":\",pt16030050,at00o1qxho,us20004vvx,gcmt20160130032510,iscgem612141669,atlas20160130032512,\",\"sources\":\",pt,at,us,gcmt,iscgem,atlas,\",\"types\":\",cap,dyfi,finite-fault,general-text,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":0.958,\"rms\":1.19,\"gap\":17,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 7.2 - 80 km S of Mil’kovo, Russia\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[158.5463,53.9776,177]},\"id\":\"us20004vvx\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6.1,\"place\":\"151 km SE of Kokopo, Papua New Guinea\",\"time\":1453777820750,\"updated\":1651605541336,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20004uks\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20004uks&format=geojson\",\"felt\":null,\"cdi\":null,\"mmi\":4.1,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":0,\"sig\":572,\"net\":\"us\",\"code\":\"20004uks\",\"ids\":\",gcmt20160126031023,us20004uks,iscgem612141578,\",\"sources\":\",gcmt,us,iscgem,\",\"types\":\",associate,cap,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":1.537,\"rms\":0.74,\"gap\":25,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.1 - 151 km SE of Kokopo, Papua New Guinea\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[153.2454,-5.2952,26]},\"id\":\"us20004uks\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6.3,\"place\":\"49 km NNE of Al Hoceïma, Morocco\",\"time\":1453695722730,\"updated\":1659862959959,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10004gy9\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004gy9&format=geojson\",\"felt\":120,\"cdi\":6.2,\"mmi\":5.551,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":0,\"sig\":685,\"net\":\"us\",\"code\":\"10004gy9\",\"ids\":\",us10004gy9,gcmt20160125042203,iscgem608278395,atlas20160125042202,\",\"sources\":\",us,gcmt,iscgem,atlas,\",\"types\":\",cap,dyfi,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":2.201,\"rms\":0.92,\"gap\":20,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.3 - 49 km NNE of Al Hoceïma, Morocco\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-3.6818,35.6493,12]},\"id\":\"us10004gy9\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":7.1,\"place\":\"47 km ESE of Pedro Bay, Alaska\",\"time\":1453631429557,\"updated\":1651605539991,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/ak01613v15nv\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=ak01613v15nv&format=geojson\",\"felt\":1816,\"cdi\":7.2,\"mmi\":7.461,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":1,\"sig\":1496,\"net\":\"ak\",\"code\":\"01613v15nv\",\"ids\":\",ak12496371,at00o1gd6r,us10004gqp,gcmt20160124103030,iscgem612141445,ak01613v15nv,atlas20160124103030,\",\"sources\":\",ak,at,us,gcmt,iscgem,ak,atlas,\",\"types\":\",associate,cap,dyfi,finite-fault,general-text,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,trump-shakemap,\",\"nst\":null,\"dmin\":null,\"rms\":1.05,\"gap\":null,\"magType\":\"mw\",\"type\":\"earthquake\",\"title\":\"M 7.1 - 47 km ESE of Pedro Bay, Alaska\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-153.3392,59.6204,125.6]},\"id\":\"ak01613v15nv\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6.6,\"place\":\"203 km SW of La Cruz de Loreto, Mexico\",\"time\":1453399617650,\"updated\":1659862753243,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10004g4l\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004g4l&format=geojson\",\"felt\":11,\"cdi\":2.7,\"mmi\":3.92,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":1,\"sig\":673,\"net\":\"us\",\"code\":\"10004g4l\",\"ids\":\",pt16021050,at00o1bebo,us10004g4l,gcmt20160121180659,iscgem612141385,\",\"sources\":\",pt,at,us,gcmt,iscgem,\",\"types\":\",cap,dyfi,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":2.413,\"rms\":0.98,\"gap\":74,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.6 - 203 km SW of La Cruz de Loreto, Mexico\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-106.9337,18.8239,10]},\"id\":\"us10004g4l\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6.7,\"place\":\"52 km SE of Shizunai-furukawach?, Japan\",\"time\":1452741933640,\"updated\":1659416784448,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10004ebx\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004ebx&format=geojson\",\"felt\":50,\"cdi\":5.3,\"mmi\":6.108,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":1,\"sig\":717,\"net\":\"us\",\"code\":\"10004ebx\",\"ids\":\",us10004ebx,at00o0xauk,pt16014050,gcmt20160114032534,iscgem608169794,atlas20160114032533,\",\"sources\":\",us,at,pt,gcmt,iscgem,atlas,\",\"types\":\",associate,cap,dyfi,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":0.281,\"rms\":0.98,\"gap\":22,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.7 - 52 km SE of Shizunai-furukawach?, Japan\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[142.781,41.9723,46]},\"id\":\"us10004ebx\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6.1,\"place\":\"14 km WNW of Charagua, Bolivia\",\"time\":1452741928270,\"updated\":1659416841575,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10004ebw\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004ebw&format=geojson\",\"felt\":2,\"cdi\":2.5,\"mmi\":2.21,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":0,\"sig\":573,\"net\":\"us\",\"code\":\"10004ebw\",\"ids\":\",us10004ebw,gcmt20160114032528,iscgem608169793,\",\"sources\":\",us,gcmt,iscgem,\",\"types\":\",cap,dyfi,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":5.492,\"rms\":1.04,\"gap\":16,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.1 - 14 km WNW of Charagua, Bolivia\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-63.3288,-19.7597,582.56]},\"id\":\"us10004ebw\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6.2,\"place\":\"74 km NW of Rumoi, Japan\",\"time\":1452532083920,\"updated\":1659862084480,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10004djn\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004djn&format=geojson\",\"felt\":8,\"cdi\":3.6,\"mmi\":3.8,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":0,\"sig\":594,\"net\":\"us\",\"code\":\"10004djn\",\"ids\":\",us10004djn,gcmt20160111170803,iscgem611838631,\",\"sources\":\",us,gcmt,iscgem,\",\"types\":\",cap,dyfi,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":1.139,\"rms\":0.96,\"gap\":33,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.2 - 74 km NW of Rumoi, Japan\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[141.0867,44.4761,238.81]},\"id\":\"us10004djn\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6.5,\"place\":\"227 km SE of Sarangani, Philippines\",\"time\":1452530285900,\"updated\":1651599562536,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10004dj5\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004dj5&format=geojson\",\"felt\":3,\"cdi\":2.7,\"mmi\":6.398,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":1,\"sig\":651,\"net\":\"us\",\"code\":\"10004dj5\",\"ids\":\",gcmt20160111163807,pt16011050,at00o0srjp,us10004dj5,iscgem608168789,atlas20160111163805,\",\"sources\":\",gcmt,pt,at,us,iscgem,atlas,\",\"types\":\",associate,cap,dyfi,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":3.144,\"rms\":0.72,\"gap\":22,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.5 - 227 km SE of Sarangani, Philippines\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[126.8621,3.8965,13]},\"id\":\"us10004dj5\"},\n" +
            "{\"type\":\"Feature\",\"properties\":{\"mag\":6,\"place\":\"Pacific-Antarctic Ridge\",\"time\":1451986454620,\"updated\":1651605529960,\"tz\":null,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10004bgk\",\"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004bgk&format=geojson\",\"felt\":0,\"cdi\":1,\"mmi\":0,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":0,\"sig\":554,\"net\":\"us\",\"code\":\"10004bgk\",\"ids\":\",gcmt20160105093415,us10004bgk,iscgem612141026,\",\"sources\":\",gcmt,us,iscgem,\",\"types\":\",associate,cap,dyfi,losspager,moment-tensor,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":30.75,\"rms\":0.67,\"gap\":71,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 6.0 - Pacific-Antarctic Ridge\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-136.2603,-54.2906,10]},\"id\":\"us10004bgk\"}],\"bbox\":[-153.3392,-54.2906,10,158.5463,59.6204,582.56]}";


        public queryUtils(){

        }

    public static ArrayList<quake_details> extractEarthquakes(){


        ArrayList<quake_details> earthquakes = new ArrayList<>();


        try {

            JSONObject root = new JSONObject(Sample_Json_Response);
            JSONArray  features = root.getJSONArray("features");
            for (int i = 0 ; i < features.length() ; i++){
            JSONObject currentEarthquake =  features.getJSONObject(i);
            JSONObject properties = currentEarthquake.getJSONObject("properties");
            Double mag = properties.getDouble("mag");
            String place = properties.getString("place");


            long times = properties.getLong("time");


           // quake_details earthquake = new quake_details(mag , place ,time);
                //earthquakes.add(earthquake)

            earthquakes.add(new quake_details(mag , place , times));


            }

        }
        catch (JSONException e){


            Log.e("QueryUtils", "Problem parsing the earthquake JSON results", e);
        }
        return earthquakes;
    }


    public static ArrayList<String> urls(){

        ArrayList<String> urls = new ArrayList<>();

       try {
           JSONObject root = new JSONObject(Sample_Json_Response);
           JSONArray  features = root.getJSONArray("features");
           for (int i = 0 ; i < features.length() ; i++){
               JSONObject currentEarthquake =  features.getJSONObject(i);
               JSONObject properties = currentEarthquake.getJSONObject("properties");
               String url = properties.getString("url");

               urls.add(url);
       }

    } catch (JSONException e) {
           e.printStackTrace();
       }
        return urls;

    }
}
