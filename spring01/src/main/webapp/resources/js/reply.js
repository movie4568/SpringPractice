console.log("Reply Modual.....");
var replyService=(function(){
	
	function add(reply,callback){
		console.log("reply...");
	}
	//return{name:"hong"}	 
	return {add:add} 
})();