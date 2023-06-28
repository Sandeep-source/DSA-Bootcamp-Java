```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>17-oop\code\src\com\kunal</title>
    <style>
        body{
            padding: 0px;
            margin: 0px;
        }
       .outer{
        display: grid;
        grid-template-columns: auto;
        grid-template-rows: auto 20% 10%;
        text-decoration: none;
        color: black;
        background-color: rgba(200, 200,200,.2);
        box-shadow: 1px 1px 5px #aaaaaa;
        border-radius: 5px;
       }
       .outer:hover{
        background-color: rgba(200, 200,200,.3);
        transform: scale(1.1);
        transition: .2s all;
       }
       .outer img{
        width: 200px;
        height: 200px;
        align-self: center;
       }
       .outer p{
        padding: 0px 0px 10px 10px;
        font-weight: bold;
       }
       #container{
               margin:0px 10% 0px 10%;
        }
        #home{
                padding:10px;
                margin: 10px;
                box-shadow: 2px 2px 5px #454545;
                border-radius: 2px;
                display: inline-block;
                text-decoration: none;
        }
        #grid-con{
            display: grid;
            grid-template-columns: auto auto auto auto;
            gap: 20px;
        }
    
        @media screen and (max-width:1000px) {
           #grid-con{
            grid-template-columns: auto auto auto;
           }
        }
        @media screen and (max-width:800px) {
            #grid-con{
            grid-template-columns: auto auto;
           }
        }
        .no-com{
            text-align: center;
            background-color: gray;
        }
        .com{
            text-align: center;
            background-color: seagreen;
            color: white;
        }
        .com::before{
            content: "✅ Completed";
        }
        .no-com::before{
            content: "🎯 Not Completed yet";
        }
    </style>
</head>
<body>
<div id="container">
<h3> Table of content </h3><br>
<a href="/../../../../../" id="home">Home</a>
<div id="grid-con">
   <div class="col mb-4">
                    <div><a href="abstractDemo"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">abstractDemo</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="access"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">access</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="cloning"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">cloning</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="collections"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">collections</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="enumExamples"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">enumExamples</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="exceptionHandling"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">exceptionHandling</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="generics"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">generics</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="interfaces"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">interfaces</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="introduction"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">introduction</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="packages"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">packages</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="properties"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">properties</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="readme"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/file.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">readme.md</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="singleton"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">singleton</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div><div class="col mb-4">
                    <div><a href="staticExample"><img class="rounded img-fluid shadow w-100 fit-cover" src="./../../../../../genstatic/folder.png" style="height: 250px;"></a>
                        <div class="py-4"><span class="badge bg-primary mb-2">Website</span>
                            <h4 class="fw-bold">staticExample</h4>
                            <p class="text-muted">Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
</div>
</div>
</div>
</body>
</html>
```