const mongoose = require('mongoose');
const Schema = mongoose.Schema;

// Create Schema
const UserSchema = new Schema({
  Login: {
    type: String,
  },
  motdepasse: {
    type: String,
  }
});

module.exports = User = mongoose.model('User', UserSchema);