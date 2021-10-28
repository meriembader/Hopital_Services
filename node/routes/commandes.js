const express = require("express");

const  commande = require("../controllers/commandes"); 

const router = express.Router();

router.get('/', commande.getCommandes);

router.post('/', commande.createcommande);
router.patch('/:id', commande.updatecommande);
router.delete('/:id', commande.deletecommande);

module.exports=router;