<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
</main>
</div>
</div>
</div>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="resources/JS/jquery-3.3.1.min.js"></script>
<script src="resources/JS/jquery.min.js"></script>
<script src="resources/JS/custom.js"></script>
<script src="resources/JS/wow.min.js"></script>
<script src="resources/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
<script>
		new WOW().init();
	</script>>
<script src="resources/JS/popper.min.js"></script>
<!-- Icons -->
<script src="resources/JS/feather.min.js"></script>
<script>
      feather.replace()
    </script>

<!-- Graphs -->
<script src="resources/JS/Chart.min.js"></script>
<script>
      var ctx = document.getElementById("myChart");
      var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
          datasets: [{
            data: [100, 21345, 18483, 2555, 23489, 24092, 12034],
            lineTension: 0,
            backgroundColor: 'transparent',
            borderColor: '#007bff',
            borderWidth: 4,
            pointBackgroundColor: '#007bff'
          }]
        },
        options: {
          scales: {
            yAxes: [{
              ticks: {
                beginAtZero: false
              }
            }]
          },
          legend: {
            display: false,
          }
        }
      });
    </script>
</body>

    <script>
    $(document).ready(function() {
    	
    	$("#test").click(function() {
    		//alert();
    		$.post("ajax", 
    				{
    				x:"tao o day"
    				}
    				,function(data, status) {
    			alert("Data: " + data + "\nStatus: " + status);
    		});
    	});
    });
    </script>
			
</html>
