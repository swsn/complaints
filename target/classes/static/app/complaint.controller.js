/**
 * Created by amjadalmutairi on 9/3/16.
 */

/**
 * Request Mapping Reference ^^ NO NEED TO REFER To THE BACKEND :) ^^
 * LINK :  https://docs.google.com/document/d/1RFYeE97ERVbB34vcxGK49WR2rWfi5isgB-XfP6nUjrY/edit?usp=sharing
 * **/
var myApp = angular.module('myApp', ['ngStorage', 'ngRoute']);

/* ................... Controller 1 ................ */
myApp.controller('complaintListController' , function ($scope , $localStorage , $http )
{
    var nc = this ;
    nc.complaints = [] ;

    init();
    function init()
    {
        getAllComplaints();
    }

    function getAllComplaints()
    {
        var url = "/complaints/getAllOrderById/";
        var complaintRequest = $http.get(url);
        complaintRequest.then(function (response) {

            nc.complaints = response.data;
        });
    }

    $scope.currentComplaint = function (id)
    {

        var url = "/complaints/findByComplaintId/"+id;
        var Request = $http.get(url);
          Request.then(function (response) {
            $localStorage.complaint  = response.data;

        });
    }

    $scope.currentProject = function (id) {

        var url = "/projects/findById/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {
            $localStorage.project  = response.data;

        });
    }

    $scope.currentEmployee = function (id) {

        var url = "/employees/findById/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {
            $localStorage.employee  = response.data;

        });
    }

    $scope.getVisitor =  function (id)
    {
        var url = "/visitors/findById/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {
            $localStorage.visitor  = response.data;

        });
    }

    $scope.getComments = function (id) {

        var url = "/comments/findByComplaintID/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {

            $localStorage.comments = response.data;

        });
    }

    $scope.getStatus = function (id) {

        var url = "/status/findByComplaintId/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {

            $localStorage.status = response.data;

        });
    }

} );

/* ................... Controller 2 ................ */
myApp.controller('complaintSummeryController' , function ($scope , $localStorage , $http) {
    init();

    var date = new Date();
    var hour = date.getHours();
    var minutes = date.getMinutes();
    var seconds = date.getSeconds();
    var milliseconds = date.getMilliseconds();
    var day = date.getDate();
    var month = date.getMonth();
    var year = date.getFullYear();
    var strDate = year + "-" + month + "-" + day + " " + hour + ":" + minutes + ":" + seconds + "." + milliseconds;

    function init() {

        $scope.complaint = $localStorage.complaint;
        $scope.project = $localStorage.project;
        $scope.employee = $localStorage.employee;
        $scope.visitor = $localStorage.visitor;
        $scope.comments = $localStorage.comments;
        $scope.status = $localStorage.status;
    }


    $scope.addNewComment = function (complaintId, EmployeeID, content) {

        var url = "/comments/insert?complaintId=" + complaintId + "&employeeId=" + EmployeeID + "&date=" + strDate + "&content=" + content;
        var Request = $http.get(url);
        Request.then(function (response) {

            $localStorage.comments = response.data;
            $scope.comments = $localStorage.comments;
        });
    }

    $scope.closeComplaint = function (id) {

        var url = "/complaints/closeComplaint/" + id;
        var Request = $http.get(url);
        Request.then(function (response) {

            $localStorage.complaint = response.data;

        });
    }

    $scope.setStatus = function (complaintId, employeeId, value) {

        var flag = false;
        if (value) {
            if (confirm("?هل أنت متأكد من قبول الشكوى")) {

                flag = true;
            }
        }
        else {
            if (confirm("?هل أنت متأكد من رفض الشكوى")) {
                flag = true;
            }
        }


        if (flag) {
            var url = "/status/insert?complaintId=" + complaintId + "&employeeId=" + employeeId + "&value=" + value + "&date=" + strDate;
            ;
            var Request = $http.get(url);
            Request.then(function (response) {

                $localStorage.status = response.data;

            });
        }

        if(flag)
        {
            $scope.getStatus(complaintId);
        }
    }

    $scope.getStatus = function (id) {

        var url = "/status/findByComplaintId/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {

            $localStorage.status = response.data;
            $scope.status = $localStorage.status ;

        });
    }

    $scope.Employee = function (id) {

        var url = "/employees/findById/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {
           $scope.employee1 = response.data ;
        });

    }

    $scope.TheStatus = function (index) {

        return $scope.status[index];
    }

    $(document).ready(function() {
        $('#LockButton').bind('click', function () {

        });

        $('#addComment').bind('click', function () {

        });

    });

});

/* ................... Controller 3 ................ */
myApp.controller('TableController' , function ($scope , $localStorage , $http )
{
    init();


    function init(){

        $scope.complaint = $localStorage.complaint;
        $scope.project = $localStorage.project;
        $scope.employee = $localStorage.employee;
        $scope.visitor = $localStorage.visitor;
        $scope.comments = $localStorage.comments;
        $scope.status = $localStorage.status;
    }

});

/* ................... Controller 4 ................ */
myApp.controller('newComplaintController' , function ($scope , $localStorage , $http , $filter)
{
    init();

    function init(){
        currentEmployee(12345674);
        employeeProjectId(12345674);
    }

    function currentEmployee  (id) {

        var url = "/employees/findById/" + id;
        var Request = $http.get(url);
        Request.then(function (response) {
            $localStorage.employee = response.data;
            $scope.employee =  $localStorage.employee ;

        });

    }

     function currentProject(id) {

        var url = "/projects/findById/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {
            $localStorage.project  = response.data;
            $scope.project = $localStorage.project ;

        });
    }

    function employeeProjectId(id) {

        var url = "/worksOn/findProjectOfEmployeeId/"+id;
        var Request = $http.get(url);
        Request.then(function (response) {
            $localStorage.projectId = response.data;
            $scope.projectId =  $localStorage.projectId ;
            currentProject($scope.projectId);
        });
    }

    $scope.currentDate = function()
    {
        var date = $filter('date')(new Date(), 'yyyy-MM-dd')

        return date;
    }

    var date = new Date();
    var hour = date.getHours();
    var minutes = date.getMinutes() ;
    var seconds = date.getSeconds() ;
    var milliseconds = date.getMilliseconds() ;
    var day = date.getDate() ;
    var month = date.getMonth() ;
    var year = date.getFullYear();
    var strDate = year+"-"+month+"-"+day+" "+hour+":"+minutes+":"+seconds+"."+milliseconds ;

    $scope.insertNewComplaint = function (title,content,type,employeeID,projectID) {

        var url = "/complaints/insert?title="+title+"&content="+content+"&date="+strDate+"&type="+type+"&isOpen="+true+"&byVisitor="+false+"&employeeID="+employeeID+"&visitorPhoneNumber="+'0506804510'+"&projectId="+projectID ;
        var Request = $http.get(url);
        Request.then(function (response) {
            $localStorage.complaints  = response.data;
            $scope.complaints = $localStorage.complaints ;

        });
    }





});




myApp.controller('branchComplaintList' , function ($scope , $localStorage , $http , $filter){


    var br= this;
    br.complsint=[];
    br.findByBranchNotByBM = findByBranchNotByBM ;

    init();

   function  init ()
    {
        findByBranchNotByBM(12345673);
    }

    function findByBranchNotByBM(id)
    {
        var url = "/complaints/findByBranchNotByBM/"+id;
        var complaintRequest = $http.get(url);
        complaintRequest.then(function (response) {

            br.complaints = response.data;
        });
    }


});


myApp.directive('noSpecialChar', function() {
    return {
        require: 'ngModel',
        restrict: 'A',
        link: function(scope, element, attrs, modelCtrl) {
            modelCtrl.$parsers.push(function(inputValue) {
                if (inputValue == null)
                    return ''
                cleanInputValue = inputValue.replace(/[^\w\s]/gi, '');
                if (cleanInputValue != inputValue) {
                    modelCtrl.$setViewValue(cleanInputValue);
                    modelCtrl.$render();
                }
                return cleanInputValue;
            });
        }
    }
});
