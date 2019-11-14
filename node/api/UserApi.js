var express = require("express");
var router = express.Router();
var User = require("../models/user");

router.post("/", (req, res) => {
  var user = new User(req.body);
  user.save((err, user) => {
    if (err) res.send(err);
    else res.send(user);
  });
});
router.get("/", (req, res) => {
    User.find((err, user) => {
    if (err) res.send(err);
    if (!user) res.status(404).send();
    else res.json(user);
  });
});
router.get("/:id", (req, res) => {
  var id = req.params.id;
  User.findById(id).exec((err, user) => {
    if (err) res.status(400).send(err);
    if (!user) res.status(404).send();
    else res.json(user._id);
  });
});
router.delete("/:id", (req, res) => {
  var id = req.params.id;
  User.findByIdAndRemove(id, (err, user) => {
    if (err) res.send;
    else res.send("Todo Supprimée");
  });
});
router.put("/:id", (req, res) => {
    User.findById(req.params.id).exec((err, user) => {
    if (!err) {
     
        User.updateOne(user, req.body, (err, user) => {
          if (!err) res.send(user);
          else res.send(err);
        });
    
    } else res.send(err);
  });
});


module.exports = router;
