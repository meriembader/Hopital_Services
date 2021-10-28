const express= require('express');
const mongoose= require('mongoose');

const Commande= require('../models/commandedata.js');

const router= express.Router();

const getCommandes = async (req, res) => {
    try {
        const commande= await Commande.find();
        
        res.status(200).json(commande);
    } catch(error) {
      //  res.status(404).json({message: error.message});
    }
}

const createcommande =  async (req, res) => {
    console.log(req.body);
    const newcommande = new Commande({
        name:req.body.name,
        idM:req.body.idM,
        totalQty:req.body.totalQty,
        totalprice:req.body.totalprice,
        created_on:req.body.created_on

    })
    try {
        await newcommande.save();

        res.status(201).json(newcommande);

    } catch(error) {
        res.status(400).json({ message : error.message});
    }

}

const updatecommande = async (req, res) => {
    const idd= req.params.id;
    try{
        await Student.findOneAndUpdate({
            id: idd,
        },
        {   
            name:req.body.name,
            idM:req.body.idM,
            totalQty:req.body.totalQty,
            totalprice:req.body.totalprice,
            created_on:req.body.created_on
        }
        )
        res.status(202).json({idd: id});

    } catch (error) {
        res.status(401).json({message: error.message});
    }
    
}

const deletecommande = async (req, res) => {
    const idd= req.params.id;

    try {
        await Commande.findOneAndRemove({idd: id});
        res.status(203).json({roll:roll});

    }catch(error) {
        res.status(402).json({message: error.message});
    }
}

module.exports.getCommandes= getCommandes;
module.exports.createcommande= createcommande;
module.exports.updatecommande= updatecommande;
module.exports.deletecommande= deletecommande;