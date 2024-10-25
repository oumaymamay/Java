<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ninja Gold Game</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        #log {
            margin-top: 30px;
        }
    </style>
</head>
<body class="text-center bg-light">

<div class="container">
    <h1 class="mt-5">Ninja Gold Game</h1>
    <h3 class="mt-3">Current Gold: <span class="text-success">${gold}</span></h3>

    <div class="row mt-4">
        <!-- Farm Card -->
        <div class="col-md-3">
            <div class="card mb-4">
                <div class="card-body">
                    <h5 class="card-title">Farm</h5>
                    <p class="card-text">(Earns: 10 - 20 gold)</p>
                    <form action="/process_money" method="post">
                        <input type="hidden" name="location" value="farm">
                        <button type="submit" class="btn btn-primary">Find Gold</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- Cave Card -->
        <div class="col-md-3">
            <div class="card mb-4">
                <div class="card-body">
                    <h5 class="card-title">Cave</h5>
                    <p class="card-text">(Earns: 5 - 10 gold)</p>
                    <form action="/process_money" method="post">
                        <input type="hidden" name="location" value="cave">
                        <button type="submit" class="btn btn-secondary">Find Gold</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- House Card -->
        <div class="col-md-3">
            <div class="card mb-4">
                <div class="card-body">
                    <h5 class="card-title">House</h5>
                    <p class="card-text">(Earns: 2 - 5 gold)</p>
                    <form action="/process_money" method="post">
                        <input type="hidden" name="location" value="house">
                        <button type="submit" class="btn btn-success">Find Gold</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- Quest Card -->
        <div class="col-md-3">
            <div class="card mb-4">
                <div class="card-body">
                    <h5 class="card-title">Quest</h5>
                    <p class="card-text">(Earns/Takes: 0 - 50 gold)</p>
                    <form action="/process_money" method="post">
                        <input type="hidden" name="location" value="quest">
                        <button type="submit" class="btn btn-warning">Find Gold</button>
                    </form>
                </div>
            </div>
        </div>

 
    </div>

    <form action="/reset" method="post" class="mt-4">
        <button type="submit" class="btn btn-danger">Reset</button>
    </form>

    <div id="log" class="mt-4">
        <h3>Activity Log</h3>
        <ul class="list-group">
            <pre class="list-group-item">${activityLog}</pre>
        </ul>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>


