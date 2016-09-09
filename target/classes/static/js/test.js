


/////
		
    var randomScalingFactor =function() {
        return (Math.random() > 0.5 ? 1.0 : 1.0) * Math.round(Math.random() * 100);
    };
    var randomColorFactor = function() {
        return Math.round(Math.random() * 255);
    };
    var randomColor = function() {
        return 'rgba(' + randomColorFactor() + ',' + randomColorFactor() + ',' + randomColorFactor() + ',.7)';
    };

    var barChartData = {
        labels: [ "مارس"],
        datasets: [{
            label: 'حيِاك',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الأحوال',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الديوان الملكي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'الإرشيف',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'طاقات',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'إيواء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'المرور',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	  var barChartData2 = {
       labels: [ "مارس"],
        datasets: [{
            label: 'حيِاك',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الأحوال',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الديوان الملكي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'الإرشيف',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'طاقات',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'إيواء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'المرور',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	  var barChartData3 = {
        labels: [ "مارس"],
        datasets: [{
            label: 'حيِاك',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الأحوال',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الديوان الملكي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'الإرشيف',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'طاقات',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'إيواء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'المرور',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	  var barChartData4 = {
      labels: [ "مارس"],
        datasets: [{
            label: 'حيِاك',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الأحوال',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الديوان الملكي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'الإرشيف',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'طاقات',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'إيواء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'المرور',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	  var barChartData5 = {
         labels: [ "مارس"],
        datasets: [{
            label: 'حيِاك',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الأحوال',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الديوان الملكي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'الإرشيف',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'طاقات',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'إيواء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'المرور',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	 var barChartData6 = {
        labels: [ "مارس"],
        datasets: [{
            label: 'حيِاك',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الأحوال',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الديوان الملكي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'الإرشيف',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'طاقات',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'إيواء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'المرور',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	 var barChartData7 = {
       labels: [ "مارس"],
        datasets: [{
            label: 'حيِاك',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الأحوال',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'الديوان الملكي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'الإرشيف',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'طاقات',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'إيواء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'المرور',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	
	
	 var barChartData12 = {
       labels: [ "مارس"],
        datasets: [{
            label: 'الجوادت',
            backgroundColor: "#282661",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'التكليف',
            backgroundColor: "#652f8f",
            yAxisID: "y-axis-2",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }, {
            label: 'طلب تعويض الوقت الإضافي',
            backgroundColor: "#8f298b",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'شكاوى',
            backgroundColor: "#0972b8",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'أفكار',
            backgroundColor: "#49cbf2",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'شراء',
            backgroundColor: "#7f8282",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        },
		{
            label: 'تعاميم',
            backgroundColor: "#414141",
            yAxisID: "y-axis-1",
            data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
        }
		]

    };
	
	
window.onload=function box11x(){box11();}
	
	
	window.onload=function box12(){
        var ctx = document.getElementById("canvas12").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 600,
                stacked: false,
                title:{
                    display:true,
                    text:""
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
		
	}
	
	function box11(){
        var ctx = document.getElementById("canvas").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 600,
                stacked: false,
                title:{
                    display:true,
                    text:""
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
		
	}
	
	
	//onload each component
	function box22()
	{
		///
		 var ctx = document.getElementById("canvas1").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData2, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 400,
                stacked: false,
                title:{
                    display:true,
                    text:" "
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
	}
		////
		 function box33(){
		 var ctx = document.getElementById("canvas2").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData3, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 400,
                stacked: false,
                title:{
                    display:true,
                    text:" "
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
		///
	}
function box44(){
		var ctx = document.getElementById("canvas3").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData4, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 400,
                stacked: false,
                title:{
                    display:true,
                    text:" "
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
		///
	}
function box55(){
		var ctx = document.getElementById("canvas4").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData5, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 400,
                stacked: false,
                title:{
                    display:true,
                    text:" "
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
		///
	}
function box66(){
		var ctx = document.getElementById("canvas5").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData6, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 400,
                stacked: false,
                title:{
                    display:true,
                    text:" "
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
		///
		
	}
	


	function box77(){
		 var ctx = document.getElementById("canvas6").getContext("2d");
        window.myBar = Chart.Bar(ctx, {
            data: barChartData7, 
            options: {
                responsive: true,
                hoverMode: 'label',
                hoverAnimationDuration: 400,
                stacked: false,
                title:{
                    display:true,
                    text:" "
                },
                scales: {
                    yAxes: [{
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "left",
                        id: "y-axis-1",
                    }, {
                        type: "linear", // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                        display: true,
                        position: "right",
                        id: "y-axis-2",
                        gridLines: {
                            drawOnChartArea: false
                        }
                    }],
                }
            }
        });
	
    }
 
