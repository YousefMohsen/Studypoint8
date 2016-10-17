<%-- 
    Document   : FrontPage
    Created on : 11-10-2016, 11:05:17
    Author     : Yousinho
--%>

<%@page import="domain.DomainFacade"%>
<%@page import="entity.Player"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/Frontpage.css" rel="stylesheet" type="text/css"/>
        
    <%   //get data from servlet
        DomainFacade df = new DomainFacade();
       List<Player> players = (List) df.getPlayers(); 
      
      

           %>

         
        
        
        <title>JSP Page</title>
    </head>
    <body>
        
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="index.html">Home</a></li>
      <li class="active"><a href="FrontPage.jsp">Se players</a></li>
      <li><a href="#">Page 2</a></li> 
      <li><a href="#">Page 3</a></li> 
    </ul>
  </div>
</nav>
            
        <div class="row top-buffer"> </div>
        
        
        </div>
  <div class="row">
      <div class="col-sm-3"></div>
  <div class="col-sm-6">
      <h2>Current players</h2>
             <form action="NewServlet" method="POST"> 
      <table class="table table-bordered">
    <thead>
      <tr>
        <th>Name</th>
        <th>Club</th>
        <th>Shirtnumber</th>
      </tr>
    </thead>
  
    <tbody>
        <% 
            
        for (Player pl : players) {
    %>  <form action="NewServlet" method="POST">
        
        
        
        <% 

            out.println("<tr>");
        out.println("<td>" + pl.getName()+"</td>");
        out.println("<td>" + pl.getClub()+"</td>");
        out.println("<td>" + pl.getShirtNumber()+"</td>");
        
        
        
        out.println("</tr>");
          %>     
 <input type="submit" class="btn btn-danger" value="X" name="id" />        

 <input type="hidden" name="deletePlayer" value=<%= pl.getId() %>>

<input type="hidden" name="origin" value="deletePlayer">

    </form>
        <%
        }
        

        
        
        %>
  


        <tr>
            <td> <input type="text" name="name" value="" /> </td>   
            <td> <input type="text" name="club" value="" /> </td>  
            <td> <input type="text" name="shirtNumber" value="" /> </td>  
        </tr>
         <tr>
<td> <input type="submit" value="Add Player" name="add"/> </td>   
         
        </tr>
      
      
    </tbody>
    
  </table>
<input type="hidden" name="origin" value="addPlayer">

          </form>

  
  
  </div>

  <div class="col-sm-3">
    
      
      </div>
</div>

        
        
        <script src="Scripts/toDelete.js" type="text/javascript"></script>
        
    </body>
</html>
