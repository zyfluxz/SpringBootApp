var mongoose = require('mongoose')
mongoose.connect('mongodb://mongo:27017/MSnode',()=>{
    console.log('db connect')
});

