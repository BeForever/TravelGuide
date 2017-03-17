<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script src="http://cache.amap.com/lbs/static/es5.min.js"></script>
    <script src="http://webapi.amap.com/maps?v=1.3&key=a7de736c21c683a64d24a247879d9ca7"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>

    <style type="text/css">
        #container {
            width: 25%;
            height: 25%;
        }
        
    </style>
</head>
<body>
<div id="container" style="margin-left: 85px;margin-top: 200px"></div>
<script>
    //创建地图,设定地图的中心点和级别
    var map = new AMap.Map('container', {
        resizeEnable: true,
        zoom:14,
        center: [125.2747, 43.820999]

    });
    //TODO  创建控件并添加
    //信息窗体的创建与设定
    var infowindow = new AMap.InfoWindow({
        offset: new AMap.Pixel(0, -30),
        size:new AMap.Size(230,0)
    });
    //点标记的创建与添加
    var marker = new AMap.Marker({
        position: [120.2, 30.3],
        map:map
    });

</script>
</body>
</html>
