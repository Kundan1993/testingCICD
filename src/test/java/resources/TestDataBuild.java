package resources;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TestDataBuild {
	
//	public AddNorms addNormspayload(String name) {
//		AddNorms adnorms = new AddNorms();
//		AN_Name1_transalation nametrans = new AN_Name1_transalation();
//		List<String> myListsetname =new ArrayList<String>();
//		myListsetname.add("4dc17542-c33a-11e9-8d58-0242ac100002");
//		myListsetname.add(name);
//		nametrans.setTranslations(myListsetname);
//		adnorms.setName(nametrans);
//		return adnorms;
//		
//	}
	DateFormat dform = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date obj = new Date();
	
	// Add template json body
	public String addNormspayload(String name) {
		String name_withdate = name+" "+dform.format(obj);
		return "{\n" + 
				"  \"name\": {\n" + 
				"    \"translations\": [\n" + 
				"      {\n" + 
				"        \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\",\n" + 
				"        \"name\": \""+name_withdate+"\"\n" + 
				"      }\n" + 
				"    ]\n" + 
				"  },\n" + 
				"  \"properties\": [\n" + 
				"    {\n" + 
				"      \"uuid\": \"5f05b7cb51ff4d0f00ce175e\",\n" + 
				"      \"name\": {\n" + 
				"        \"translations\": [\n" + 
				"          {\n" + 
				"            \"name\": \"JOINT799\",\n" + 
				"            \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\"\n" + 
				"          }\n" + 
				"        ]\n" + 
				"      },\n" + 
				"      \"valueType\": \"Number\",\n" + 
				"      \"unit\": \"5f05b7cb51ff4d0f00ce175e\"\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"subNorms\": [],\n" + 
				"  \"access\": {\n" + 
				"    \"creator\": {\n" + 
				"      \"roles\": [\n" + 
				"        {\n" + 
				"          \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"          \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"          \"name\": \"Template Designer\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"_id\": \"5efc553962338702f4d57a6e\",\n" + 
				"      \"uuid\": \"5e6a4e74-d95f-11e9-bfe8-0242ac100104\",\n" + 
				"      \"email\": \"alex@biancarobotics.com\",\n" + 
				"      \"status\": \"active\",\n" + 
				"      \"avatar\": null,\n" + 
				"      \"lang\": \"en\",\n" + 
				"      \"detail\": {\n" + 
				"        \"firstname\": \"Alex\",\n" + 
				"        \"lastname\": \"Alex\",\n" + 
				"        \"created\": {\n" + 
				"          \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        },\n" + 
				"        \"updated\": {\n" + 
				"          \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        }\n" + 
				"      },\n" + 
				"      \"created\": {\n" + 
				"        \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"updated\": {\n" + 
				"        \"date\": \"2019-09-17 15:25:24.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"_links\": {\n" + 
				"        \"self\": {\n" + 
				"          \"href\": \"https://joiningdevelop.azurewebsites.net/user/5e6a4e74-d95f-11e9-bfe8-0242ac100104\"\n" + 
				"        }\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"members\": [\n" + 
				"      {\n" + 
				"        \"level\": \"CAN_DELETE\",\n" + 
				"        \"user\": {\n" + 
				"          \"roles\": [\n" + 
				"            {\n" + 
				"              \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"              \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"              \"name\": \"Template Designer\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            }\n" + 
				"          ],\n" + 
				"          \"_id\": \"5efc553962338702f4d57a6e\",\n" + 
				"          \"uuid\": \"5e6a4e74-d95f-11e9-bfe8-0242ac100104\",\n" + 
				"          \"email\": \"alex@biancarobotics.com\",\n" + 
				"          \"status\": \"active\",\n" + 
				"          \"avatar\": null,\n" + 
				"          \"lang\": \"en\",\n" + 
				"          \"detail\": {\n" + 
				"            \"firstname\": \"Alex\",\n" + 
				"            \"lastname\": \"Alex\",\n" + 
				"            \"created\": {\n" + 
				"              \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"              \"timezone_type\": 3,\n" + 
				"              \"timezone\": \"UTC\"\n" + 
				"            },\n" + 
				"            \"updated\": {\n" + 
				"              \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"              \"timezone_type\": 3,\n" + 
				"              \"timezone\": \"UTC\"\n" + 
				"            }\n" + 
				"          },\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-17 15:25:24.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"_links\": {\n" + 
				"            \"self\": {\n" + 
				"              \"href\": \"https://joiningdevelop.azurewebsites.net/user/5e6a4e74-d95f-11e9-bfe8-0242ac100104\"\n" + 
				"            }\n" + 
				"          }\n" + 
				"        },\n" + 
				"        \"uuid\": \"\"\n" + 
				"      }\n" + 
				"    ],\n" + 
				"    \"owner\": {\n" + 
				"      \"roles\": [\n" + 
				"        {\n" + 
				"          \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"          \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"          \"name\": \"Template Designer\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"_id\": \"5efc553962338702f4d57a6e\",\n" + 
				"      \"uuid\": \"5e6a4e74-d95f-11e9-bfe8-0242ac100104\",\n" + 
				"      \"email\": \"alex@biancarobotics.com\",\n" + 
				"      \"status\": \"active\",\n" + 
				"      \"avatar\": null,\n" + 
				"      \"lang\": \"en\",\n" + 
				"      \"detail\": {\n" + 
				"        \"firstname\": \"Alex\",\n" + 
				"        \"lastname\": \"Alex\",\n" + 
				"        \"created\": {\n" + 
				"          \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        },\n" + 
				"        \"updated\": {\n" + 
				"          \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        }\n" + 
				"      },\n" + 
				"      \"created\": {\n" + 
				"        \"date\": \"2019-09-17 15:25:23.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"updated\": {\n" + 
				"        \"date\": \"2019-09-17 15:25:24.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"_links\": {\n" + 
				"        \"self\": {\n" + 
				"          \"href\": \"https://joiningdevelop.azurewebsites.net/user/5e6a4e74-d95f-11e9-bfe8-0242ac100104\"\n" + 
				"        }\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"visibility\": \"public\"\n" + 
				"  }\n" + 
				"}";
		
		
	}
	
	// Add record (http://localhost:3006/records/addRecords)
	public String addProperty(String name) {
//		System.out.println(dform.format(obj)); 
		String name_withdate = name+" "+dform.format(obj);
		return "{\n" + 
				"  \"name\": {\n" + 
				"    \"translations\": [\n" + 
				"      {\n" + 
				"        \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\",\n" + 
				"        \"name\": \""+name_withdate+"\"\n" + 
				"      }\n" + 
				"    ]\n" + 
				"  },\n" + 
				"  \"norm\": \"5f29421f1bc6290aa8b6bc4d\",\n" + 
				"  \"properties\": [\n" + 
				"    {\n" + 
				"      \"normProperty\": \"5f05b79e51ff4d0f00ce175d\",\n" + 
				"      \"name\": {\n" + 
				"        \"translations\": [\n" + 
				"          {\n" + 
				"            \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\",\n" + 
				"            \"name\": \"Gauge Ø\"\n" + 
				"          }\n" + 
				"        ]\n" + 
				"      },\n" + 
				"      \"value\": \"789\",\n" + 
				"      \"unit\": \"aaa2ba38-c97e-11e9-8aa2-0242ac100002\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"normProperty\": \"5f05b76c51ff4d0f00ce175c\",\n" + 
				"      \"name\": {\n" + 
				"        \"translations\": [\n" + 
				"          {\n" + 
				"            \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\",\n" + 
				"            \"name\": \"Material Grade\"\n" + 
				"          }\n" + 
				"        ]\n" + 
				"      },\n" + 
				"      \"value\": \"88\",\n" + 
				"      \"unit\": \"8819bad4-c3fc-11e9-9a34-0242ac100002\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"normProperty\": \"5f05b76c51ff4d0f00ce175c\",\n" + 
				"      \"name\": {\n" + 
				"        \"translations\": [\n" + 
				"          {\n" + 
				"            \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\",\n" + 
				"            \"name\": \"Interlayer Grade\"\n" + 
				"          }\n" + 
				"        ]\n" + 
				"      },\n" + 
				"      \"value\": \"88\",\n" + 
				"      \"unit\": \"8819bad4-c3fc-11e9-9a34-0242ac100002\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"normProperty\": \"5f05b76c51ff4d0f00ce175c\",\n" + 
				"      \"name\": {\n" + 
				"        \"translations\": [\n" + 
				"          {\n" + 
				"            \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\",\n" + 
				"            \"name\": \"Joint ID23\"\n" + 
				"          }\n" + 
				"        ]\n" + 
				"      },\n" + 
				"      \"value\": \"88\",\n" + 
				"      \"unit\": \"8819bad4-c3fc-11e9-9a34-0242ac100002\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"normProperty\": \"5f05b79e51ff4d0f00ce175d\",\n" + 
				"      \"name\": {\n" + 
				"        \"translations\": [\n" + 
				"          {\n" + 
				"            \"language\": \"4dc17542-c33a-11e9-8d58-0242ac100002\",\n" + 
				"            \"name\": \"Stack ID\"\n" + 
				"          }\n" + 
				"        ]\n" + 
				"      },\n" + 
				"      \"value\": \"88\",\n" + 
				"      \"unit\": \"aaa2ba38-c97e-11e9-8aa2-0242ac100002\"\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"access\": {\n" + 
				"    \"creator\": {\n" + 
				"      \"roles\": [\n" + 
				"        {\n" + 
				"          \"uuid\": \"dad85a42-d896-11e9-ae73-0242ac100104\",\n" + 
				"          \"azureId\": \"0d52ada8-5b9b-4a77-8b39-a111bdc5c26b\",\n" + 
				"          \"name\": \"Record Editor\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a1384-da0a-11e9-a763-0242ac100104\",\n" + 
				"          \"azureId\": \"5744bf4b-807d-4041-a177-3b5a6ddeb390\",\n" + 
				"          \"name\": \"Parth\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"          \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"          \"name\": \"Template Designer\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a16ae-da0a-11e9-b772-0242ac100104\",\n" + 
				"          \"azureId\": \"b9cd75ae-3c15-4096-acdd-22fb73b6b626\",\n" + 
				"          \"name\": \"InfoteQ + Bianca Robotics\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"_id\": \"5f2aa418e55e2b2614061da3\",\n" + 
				"      \"uuid\": \"ab53f964-da2d-11e9-b3ab-0242ac100104\",\n" + 
				"      \"email\": \"parth@varahitechnologies.com\",\n" + 
				"      \"status\": \"active\",\n" + 
				"      \"avatar\": null,\n" + 
				"      \"lang\": \"en\",\n" + 
				"      \"detail\": {\n" + 
				"        \"firstname\": \"Parth\",\n" + 
				"        \"lastname\": \"Pandya\",\n" + 
				"        \"created\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        },\n" + 
				"        \"updated\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        }\n" + 
				"      },\n" + 
				"      \"created\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"updated\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"_links\": {\n" + 
				"        \"self\": {\n" + 
				"          \"href\": \"https://joiningdevelop.azurewebsites.net/user/ab53f964-da2d-11e9-b3ab-0242ac100104\"\n" + 
				"        }\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"members\": [\n" + 
				"      {\n" + 
				"        \"level\": \"CAN_DELETE\",\n" + 
				"        \"user\": {\n" + 
				"          \"roles\": [\n" + 
				"            {\n" + 
				"              \"uuid\": \"dad85a42-d896-11e9-ae73-0242ac100104\",\n" + 
				"              \"azureId\": \"0d52ada8-5b9b-4a77-8b39-a111bdc5c26b\",\n" + 
				"              \"name\": \"Record Editor\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"uuid\": \"ed5a1384-da0a-11e9-a763-0242ac100104\",\n" + 
				"              \"azureId\": \"5744bf4b-807d-4041-a177-3b5a6ddeb390\",\n" + 
				"              \"name\": \"Parth\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"              \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"              \"name\": \"Template Designer\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"uuid\": \"ed5a16ae-da0a-11e9-b772-0242ac100104\",\n" + 
				"              \"azureId\": \"b9cd75ae-3c15-4096-acdd-22fb73b6b626\",\n" + 
				"              \"name\": \"InfoteQ + Bianca Robotics\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            }\n" + 
				"          ],\n" + 
				"          \"_id\": \"5f2aa418e55e2b2614061da3\",\n" + 
				"          \"uuid\": \"ab53f964-da2d-11e9-b3ab-0242ac100104\",\n" + 
				"          \"email\": \"parth@varahitechnologies.com\",\n" + 
				"          \"status\": \"active\",\n" + 
				"          \"avatar\": null,\n" + 
				"          \"lang\": \"en\",\n" + 
				"          \"detail\": {\n" + 
				"            \"firstname\": \"Parth\",\n" + 
				"            \"lastname\": \"Pandya\",\n" + 
				"            \"created\": {\n" + 
				"              \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"              \"timezone_type\": 3,\n" + 
				"              \"timezone\": \"UTC\"\n" + 
				"            },\n" + 
				"            \"updated\": {\n" + 
				"              \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"              \"timezone_type\": 3,\n" + 
				"              \"timezone\": \"UTC\"\n" + 
				"            }\n" + 
				"          },\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"_links\": {\n" + 
				"            \"self\": {\n" + 
				"              \"href\": \"https://joiningdevelop.azurewebsites.net/user/ab53f964-da2d-11e9-b3ab-0242ac100104\"\n" + 
				"            }\n" + 
				"          }\n" + 
				"        },\n" + 
				"        \"uuid\": \"\"\n" + 
				"      }\n" + 
				"    ],\n" + 
				"    \"owner\": {\n" + 
				"      \"roles\": [\n" + 
				"        {\n" + 
				"          \"uuid\": \"dad85a42-d896-11e9-ae73-0242ac100104\",\n" + 
				"          \"azureId\": \"0d52ada8-5b9b-4a77-8b39-a111bdc5c26b\",\n" + 
				"          \"name\": \"Record Editor\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a1384-da0a-11e9-a763-0242ac100104\",\n" + 
				"          \"azureId\": \"5744bf4b-807d-4041-a177-3b5a6ddeb390\",\n" + 
				"          \"name\": \"Parth\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"          \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"          \"name\": \"Template Designer\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a16ae-da0a-11e9-b772-0242ac100104\",\n" + 
				"          \"azureId\": \"b9cd75ae-3c15-4096-acdd-22fb73b6b626\",\n" + 
				"          \"name\": \"InfoteQ + Bianca Robotics\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"_id\": \"5f2aa418e55e2b2614061da3\",\n" + 
				"      \"uuid\": \"ab53f964-da2d-11e9-b3ab-0242ac100104\",\n" + 
				"      \"email\": \"parth@varahitechnologies.com\",\n" + 
				"      \"status\": \"active\",\n" + 
				"      \"avatar\": null,\n" + 
				"      \"lang\": \"en\",\n" + 
				"      \"detail\": {\n" + 
				"        \"firstname\": \"Parth\",\n" + 
				"        \"lastname\": \"Pandya\",\n" + 
				"        \"created\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        },\n" + 
				"        \"updated\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        }\n" + 
				"      },\n" + 
				"      \"created\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"updated\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"_links\": {\n" + 
				"        \"self\": {\n" + 
				"          \"href\": \"https://joiningdevelop.azurewebsites.net/user/ab53f964-da2d-11e9-b3ab-0242ac100104\"\n" + 
				"        }\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"visibility\": \"public\"\n" + 
				"  }\n" + 
				"}";
	}
	public String updateTemplate(String name) {
		String name_withdate = name+" "+dform.format(obj);
		System.out.println(name_withdate);
		return "{\n" + 
				"  \"name\": {\n" + 
				"    \"translations\": [\n" + 
				"      {\n" + 
				"        \"name\": \""+name_withdate+"\"\n" + 
				"      }\n" + 
				"    ]\n" + 
				"  },\n" + 
				"  \"properties\": [\n" + 
				"    {\n" + 
				"      \"uuid\": \"f66e4018-c97e-11e9-a09c-0242ac100002\",\n" + 
				"      \"name\": {\n" + 
				"        \"translations\": [\n" + 
				"          {\n" + 
				"            \"name\": \"Joint ID23\"\n" + 
				"          }\n" + 
				"        ]\n" + 
				"      },\n" + 
				"      \"unit\": \"f66f4738-c97e-11e9-9621-0242ac100002\",\n" + 
				"      \"valueType\": \"String\"\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"subNorms\": [],\n" + 
				"  \"access\": {\n" + 
				"    \"creator\": {\n" + 
				"      \"roles\": [\n" + 
				"        {\n" + 
				"          \"uuid\": \"dad85a42-d896-11e9-ae73-0242ac100104\",\n" + 
				"          \"azureId\": \"0d52ada8-5b9b-4a77-8b39-a111bdc5c26b\",\n" + 
				"          \"name\": \"Record Editor\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a1384-da0a-11e9-a763-0242ac100104\",\n" + 
				"          \"azureId\": \"5744bf4b-807d-4041-a177-3b5a6ddeb390\",\n" + 
				"          \"name\": \"Parth\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"          \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"          \"name\": \"Template Designer\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a16ae-da0a-11e9-b772-0242ac100104\",\n" + 
				"          \"azureId\": \"b9cd75ae-3c15-4096-acdd-22fb73b6b626\",\n" + 
				"          \"name\": \"InfoteQ + Bianca Robotics\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"_id\": \"5f2aa418e55e2b2614061da3\",\n" + 
				"      \"uuid\": \"ab53f964-da2d-11e9-b3ab-0242ac100104\",\n" + 
				"      \"email\": \"parth@varahitechnologies.com\",\n" + 
				"      \"status\": \"active\",\n" + 
				"      \"avatar\": null,\n" + 
				"      \"lang\": \"en\",\n" + 
				"      \"detail\": {\n" + 
				"        \"firstname\": \"Parth\",\n" + 
				"        \"lastname\": \"Pandya\",\n" + 
				"        \"created\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        },\n" + 
				"        \"updated\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        }\n" + 
				"      },\n" + 
				"      \"created\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"updated\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"_links\": {\n" + 
				"        \"self\": {\n" + 
				"          \"href\": \"https://joiningdevelop.azurewebsites.net/user/ab53f964-da2d-11e9-b3ab-0242ac100104\"\n" + 
				"        }\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"members\": [\n" + 
				"      {\n" + 
				"        \"level\": \"CAN_DELETE\",\n" + 
				"        \"user\": {\n" + 
				"          \"roles\": [\n" + 
				"            {\n" + 
				"              \"uuid\": \"dad85a42-d896-11e9-ae73-0242ac100104\",\n" + 
				"              \"azureId\": \"0d52ada8-5b9b-4a77-8b39-a111bdc5c26b\",\n" + 
				"              \"name\": \"Record Editor\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"uuid\": \"ed5a1384-da0a-11e9-a763-0242ac100104\",\n" + 
				"              \"azureId\": \"5744bf4b-807d-4041-a177-3b5a6ddeb390\",\n" + 
				"              \"name\": \"Parth\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"              \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"              \"name\": \"Template Designer\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"uuid\": \"ed5a16ae-da0a-11e9-b772-0242ac100104\",\n" + 
				"              \"azureId\": \"b9cd75ae-3c15-4096-acdd-22fb73b6b626\",\n" + 
				"              \"name\": \"InfoteQ + Bianca Robotics\",\n" + 
				"              \"created\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              },\n" + 
				"              \"updated\": {\n" + 
				"                \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"                \"timezone_type\": 3,\n" + 
				"                \"timezone\": \"UTC\"\n" + 
				"              }\n" + 
				"            }\n" + 
				"          ],\n" + 
				"          \"_id\": \"5f2aa418e55e2b2614061da3\",\n" + 
				"          \"uuid\": \"ab53f964-da2d-11e9-b3ab-0242ac100104\",\n" + 
				"          \"email\": \"parth@varahitechnologies.com\",\n" + 
				"          \"status\": \"active\",\n" + 
				"          \"avatar\": null,\n" + 
				"          \"lang\": \"en\",\n" + 
				"          \"detail\": {\n" + 
				"            \"firstname\": \"Parth\",\n" + 
				"            \"lastname\": \"Pandya\",\n" + 
				"            \"created\": {\n" + 
				"              \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"              \"timezone_type\": 3,\n" + 
				"              \"timezone\": \"UTC\"\n" + 
				"            },\n" + 
				"            \"updated\": {\n" + 
				"              \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"              \"timezone_type\": 3,\n" + 
				"              \"timezone\": \"UTC\"\n" + 
				"            }\n" + 
				"          },\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"_links\": {\n" + 
				"            \"self\": {\n" + 
				"              \"href\": \"https://joiningdevelop.azurewebsites.net/user/ab53f964-da2d-11e9-b3ab-0242ac100104\"\n" + 
				"            }\n" + 
				"          }\n" + 
				"        }\n" + 
				"      }\n" + 
				"    ],\n" + 
				"    \"owner\": {\n" + 
				"      \"roles\": [\n" + 
				"        {\n" + 
				"          \"uuid\": \"dad85a42-d896-11e9-ae73-0242ac100104\",\n" + 
				"          \"azureId\": \"0d52ada8-5b9b-4a77-8b39-a111bdc5c26b\",\n" + 
				"          \"name\": \"Record Editor\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:30:03.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a1384-da0a-11e9-a763-0242ac100104\",\n" + 
				"          \"azureId\": \"5744bf4b-807d-4041-a177-3b5a6ddeb390\",\n" + 
				"          \"name\": \"Parth\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"aec0907e-d895-11e9-b535-0242ac100104\",\n" + 
				"          \"azureId\": \"8c41ead6-1c65-471a-ab07-37e83d27a1f7\",\n" + 
				"          \"name\": \"Template Designer\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-16 15:21:40.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"uuid\": \"ed5a16ae-da0a-11e9-b772-0242ac100104\",\n" + 
				"          \"azureId\": \"b9cd75ae-3c15-4096-acdd-22fb73b6b626\",\n" + 
				"          \"name\": \"InfoteQ + Bianca Robotics\",\n" + 
				"          \"created\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          },\n" + 
				"          \"updated\": {\n" + 
				"            \"date\": \"2019-09-18 11:53:27.000000\",\n" + 
				"            \"timezone_type\": 3,\n" + 
				"            \"timezone\": \"UTC\"\n" + 
				"          }\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"_id\": \"5f2aa418e55e2b2614061da3\",\n" + 
				"      \"uuid\": \"ab53f964-da2d-11e9-b3ab-0242ac100104\",\n" + 
				"      \"email\": \"parth@varahitechnologies.com\",\n" + 
				"      \"status\": \"active\",\n" + 
				"      \"avatar\": null,\n" + 
				"      \"lang\": \"en\",\n" + 
				"      \"detail\": {\n" + 
				"        \"firstname\": \"Parth\",\n" + 
				"        \"lastname\": \"Pandya\",\n" + 
				"        \"created\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        },\n" + 
				"        \"updated\": {\n" + 
				"          \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"          \"timezone_type\": 3,\n" + 
				"          \"timezone\": \"UTC\"\n" + 
				"        }\n" + 
				"      },\n" + 
				"      \"created\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"updated\": {\n" + 
				"        \"date\": \"2019-09-18 16:02:09.000000\",\n" + 
				"        \"timezone_type\": 3,\n" + 
				"        \"timezone\": \"UTC\"\n" + 
				"      },\n" + 
				"      \"_links\": {\n" + 
				"        \"self\": {\n" + 
				"          \"href\": \"https://joiningdevelop.azurewebsites.net/user/ab53f964-da2d-11e9-b3ab-0242ac100104\"\n" + 
				"        }\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"visibility\": \"public\"\n" + 
				"  }\n" + 
				"}";
	}
	public String SignUp(String email, String fname, String lname) {
		Random rand = new Random();
		int rand_int = rand.nextInt(10000);
		String newemail = email+Integer.toString(rand_int);
//		System.out.println("New Email"+newemail);
		return "{\n" + 
				"    \"email\": \""+newemail+"@varahitechnologies.com\",\n" + 
				"    \"status\": \"active\",\n" + 
				"    \"avatar\": null,\n" + 
				"    \"lang\": \"en\",\n" + 
				"    \"detail\": {\n" + 
				"        \"firstname\": \""+fname+"\",\n" + 
				"        \"lastname\": \""+lname+"\"\n" + 
				"    },\n" + 
				"    \"role\": \"Approval team\"\n" + 
				"}";
	}
	public String SignIn(String email, String pwd) {
		return "{\n" + 
				"    \"email\": \""+email+"\",\n" + 
				"    \"password\": \""+pwd+"\"\n" + 
				"}";
	}
	public String SearchAPIs(String val1,String val2,String val3,String layer,String name1,String name2) {
		return "{\n" + 
				"    \"value\":[\""+val1+"\", \""+val2+"\",\""+val3+"\"],\n" + 
				"    \"layer\": [\""+layer+"\"],\n" + 
				"    \"name\": [\""+name1+"\",\""+name2+"\"]\n" + 
				"}";
	}
	

}
