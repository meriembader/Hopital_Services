const mongoose =require('mongoose');

const commandeSchema = mongoose.Schema({
    idM: {
        type: [String],
        required: true,
        unique: true,
        
    },
    totalQty: {
        type: [String],
        required: true,
        
    },
    totalprice: {
        type: [String],
        required: true,
    
    },
    name: {
        type: [String],
        required: true,
    },
   

})

var commandedata=mongoose.model('commandedata',commandeSchema);
module.exports= commandedata;