const express= require('express');
const mongoose= require('mongoose');
const eurekaHelper = require('./eureka-helper');
const app=express();

const port=9000;
const url= "mongodb+srv://foxward:foxward@cluster0.wfs0s.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";

mongoose.connect(url,{ useUnifiedTopology: true });
const con= mongoose.connection;
app.use(express.json());
try{
    con.on('open',() => {
        console.log('connected');
    })
}catch(error)
{
    console.log("Error: "+error);
}



const commandesrouter= require("./routes/commandes");
app.use('/api/commandes',commandesrouter)



app.listen(port, () =>{
    console.log('Server started');
})


eurekaHelper.registerWithEureka('commande-node', port);



