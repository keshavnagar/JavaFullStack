dekho apan ek kam karenge yaha par 

jaisa ki hamen pahle likha tha vo bole to : 

@RestController

	@GetMapping("/root")
	public String apiRoot(){
		return "hello root";
	}

line number 5 se 14 tak 

to ise hata denge kyuki apan api aise nahi likhnege 

we will actually divide our application into saparete layers there will be service layer , data access layer , and api layer to me apne second commit me us code ko hatara hu 