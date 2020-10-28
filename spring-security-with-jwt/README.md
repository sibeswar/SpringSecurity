
# Authentication request
URL :  localhost:8080/authenticate
Method : Post
Payload:
            {
                "userName"  : "Sibeswar",
                "password"  : "password"        
            }


# 
URL : localhost:8080
Method : Get
Header : 
Authorization:Bearer <Paste JWT token from Authentication response>