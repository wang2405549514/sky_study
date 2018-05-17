<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://cdn.bootcss.com/vue/2.2.2/vue.min.js"></script>
    <title>Document</title>
</head>
<body>
<div id="app">
    <p>{{message}}</p>
    <input type="text" v-model="message">
</div>
<table>
    <tr>
        <td>name</td>
        <td>age</td>
    </tr>
    <tr>
        <td>${student.name}</td>
        <td>${student.age}</td>
    </tr>

</table>


<script>
    new Vue({
        el: '#app',
        data: {
            message: 'Hello world!!'
        }
    })

</script>
</body>
</html>
</body>
</html>