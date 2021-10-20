package carApp;

import java.util.*;

public class MainApp {

	private static List<Car> carList = new ArrayList<Car>();
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		init();
		System.out.println("What brand of car do you have?");
		
		String brand = "";
		try {
			brand = scnr.nextLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		brand = brand.toLowerCase();
		
		switch(brand) {
			default:
				System.out.println("That car brand is good; unfortunately, we have no information on it.");
				break;
			case "volvo":
				askModel("Volvo");
				break;
			case "peugeot":
				askModel("Peugeot");
				break;
			case "ford":
				askModel("Ford");
				break;
			case "hyundai":
				askModel("Hyundai");
				break;
			case "toyota":
				askModel("Toyota");
				break;
			case "jaguar":
				askModel("Jaguar");
				break;
		}
	}
	
	public static void askModel(String brand) {
		System.out.println("\nPlease enter the model of your car. E.g. S60");
		String model = "";
		try {
			model = scnr.nextLine();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		model = model.toUpperCase();
		
		getDesc(brand, model);
	}

	public static void getDesc(String brand, String model) {
		int count = 0;
		
		for(Car c : carList) {
			if(c.getBrand().equals(brand) && c.getModel().equals(model)) {
				System.out.println("\n" + c.getDesc());
				count++;
			}
		}
		switch(count) {
			default:
				break;
			case 0:
				System.out.println("\nUnfortunately, we do not have any information on that specific car.");
				break;
		}
	}
	
	public static void init() {
		// Volvo Init
		carList.add(new Car("Volvo", "S60", "The first Volvo to be built in the United States, the S60 was unveiled during the inauguration of the company’s new South Carolina factory. It’s not only the first U.S.-built Volvo, but it’s also the brand’s first vehicle to be sold without a diesel engine. Although the Swedish company has some of the most efficient oil burners out there, its diesels will retire in a couple of years as Volvo wants to add electrification to all of its cars from 2019."));
		carList.add(new Car("Volvo", "S90", "Volvo first introduced the S90 name in 1996, when it renamed the 960 for certain markets. With Volvo discontinuing the 900 Series midsize in 1998, the 2014 Volvo S80 we know of today rolled in as the replacement for the S90. The S90 also marked the end of an era for Volvo, being the last rear-wheel-drive car wearing the Swedish company’s badge. The S80 continued the S90’s luxurious legacy over the course of two generations. The first series lived between 1998 and 2006, while the second-gen model will be discontinued after nearly a decade on the market. With 2016 just around the corner, Volvo revived the S90 nameplate for a redesigned, more upscale replacement of its range-topping sedan."));
		carList.add(new Car("Volvo", "XC60", "The Volvo XC60 has been around since 2008 and was updated for the 2014 model year. Nine years after its introduction to the market, Volvo decided it was time to usher in a new generation, and usher one in they did. The new-gen model comes complete with a new design inside and out, new safety systems that include steer assist and oncoming lane mitigation, and a new “CleanZone” climate control system that is said to remove harmful pollutants from the air outside of the cabin when the ventilation system is functioning. Volvo will offer the new XC60 with its T8 hybrid powertrain, the D4 and D5 diesel powertrains, and the T5 and T6 gasoline powertrains for a power range that stretches between 190 horsepower and as much as 407 horsepower. In the right configuration, this SUV can hit 62 mph in 5.3 seconds."));
		carList.add(new Car("Volvo", "XC90", "The 2020 Volvo XC90 is an updated version of the second-generation SUV. Unveiled in 2019, it features a mild exterior upgrade and adds new technology inside the cabin. The Swedish SUV carries over with the same engines, but it now includes an energy recovery braking system that enhances fuel economy. Additional safety equipment rounds out the XC90’s mid-cycle facelift, which keeps the crossover competitive against vehicles like the BMW X3 and the Mercedes-Benz GLC-Class."));
		carList.add(new Car("Volvo", "V90", "Discontinued in 1998 after only two years on the market, the V90 returned as Volvo’s flagship wagon in 2016. The new V90 is built on Volvo’s new Scaleable Production Architecture platform, which already underpins the XC90 SUV and the S90. As a result, the wagon also uses the same drivetrains as the S90, which in turn borrowed them from the XC90."));
		
		// Peugeot Init
		carList.add(new Car("Peugeot", "2008", "Launched in 2013, the Peugeot 2008 has been met with great enthusiasm. Praised for its affordable sticker, large trunk, classy interior, and competitive running costs, Peugeot’s first mini SUV sold more than 500,000 units globally as of February 2016. However, the 2008 received its fair share of criticism, especially for its somewhat odd looks and not so comfortable ride."));
		carList.add(new Car("Peugeot", "208", "The 208 comes with the choice of three different 1.2-litre petrols, a 1.5 diesel or pure-electric version. Unless you’re doing huge mileage then ignore the diesel and head straight for the 100hp 1.2 petrol, which is punchy, yet smooth and will return more than 50mpg if driven carefully. If you have the budget and the charging, though, the pure-electric e-208 is even punchier around town and more relaxed thanks to its silent operation."));
		carList.add(new Car("Peugeot", "3008", "Set to compete against the Nissan Qashqai and the likes, the new 3008 features a bold exterior design crafted around the company’s new styling language. The overhauled interior adopted the i-Cockpit technology and offers more room than ever before and a bunch of state-of-the-art gadgets. As with most Peugeots, the new 3008 comes with a plethora of gasoline and diesel engines covering both highly efficient and sporty needs. The mini SUV also features a standard Focal sound system, a first for the auto industry, and an array of fancy features you wouldn’t normally expect in this segment."));
		carList.add(new Car("Peugeot", "308", "Following the release of the five-door hatchback and the station wagon, Peugeot is now offering a sedan version of the 308. There is a catch, however. Much like the 307 before it, the 308 sedan is not intended for global use and was developed for the Chinese market only. It replaces the first-gen 308 and joins the 408, a long-wheelbase version of the 308 hatchback."));
		carList.add(new Car("Peugeot", "508", "With the current vogue for SUVs, Peugeot should be applauded for producing the stylish and sporty 508 Fastback. It’s not the roomiest car in its class by any means, but with its attractive looks and entertaining handling it should satisfy drivers who want a bit of fun from their family saloon. There’s a good range of engines that offer decent performance with reasonable fuel economy and relatively low emissions ratings, too, which should make the 508 attractive to company car drivers. Combine this with a well thought out interior that not only looks good and is well finished but is also laden with plenty of hi-tech equipment, and Peugeot could well be onto a winner in this competitive class."));
		
		// Ford Init
		carList.add(new Car("Ford", "BRONCO", "After being in production for over three decades, the Bronco went down in the history books as one of the most hardcore SUVs that mankind had ever seen. The SUV was developed as an off-roader to take on the Jeep CJ-5, and it succeeded to a large extent. However, the company decided to put down the model in 1996 to make way for a newer lineup. Purists and enthusiasts hoped the model would make a comeback, and after 20+ years, the moniker has come back from the ashes."));
		carList.add(new Car("Ford", "GT", "The 2017 Ford GT is sensational to drive on a circuit, boasting as much drama and speed as you’ll ever encounter from a car that’s licensed for use on the road. Designed in secret from a pure-bred Le Mans racer, it’s composed, brutal and exciting – but it’s not as refined as it could (or should) be on the road. Despite such reservations, though, you can’t help but fall in love with the latest GT. Its looks and engine are more than enough to win you over – even if ultimately it’s little more than a road-legal Le Mans car at heart."));
		carList.add(new Car("Ford", "EDGE", "The Ford Edge has been around since 2007 and its current generation debuted in 2015. But the second-generation Edge was getting a little, well, dull, so Ford has given the mid-size crossover a sharpening. This mid-cycle refresh for the 2019 model year brings revamped aesthetics, few minor changes to the interior, and a slew of active safety equipment. In fact, Ford is claiming the 2019 Edge comes with more standard driver assist features than any of its competition."));
		carList.add(new Car("Ford", "ESCAPE", "The 2020 Ford Escape is the fourth generation of the company’s popular compact crossover. Unveiled in 2019, it replaces a seven-year model that was becoming a bit long in the tooth. Some 200 pounds lighter than its predecessor, the 2020 Escape is heavily based on the 2019 Ford Focus inside and out and comes with a choice of three drivetrains. The world’s first hybrid SUV dating back to 2005, the 2020 Escape is now available in both hybrid and plug-in layouts."));
		carList.add(new Car("Ford", "FOCUS", "The fourth-generation Focus was released in 2018, the same year that its opponent here also made its debut. To lift it beyond its predecessor, Ford introduced much-improved technology, more interior space and, more recently, electrified drivetrains in the form of mild-hybrid tech."));
		
		// Hyundai Init
		carList.add(new Car("Hyundai", "ACCENT", "First introduced in 1994 as a replacement for the Hyundai Excel, the Accent has seen a total of four previous generations, selling under a variety of names across several markets worldwide. Also known as the Verna in India and China, the Solaris in Russia, and the Grand Avega in Indonesia, among other names, the Accent has always been a staple of the subcompact segment, offering both a sedan and hatchback body style. Measured against its peers, the Accent is known for offering solid features and a smooth, comfortable ride, as well as slick styling on later model years. Now, the Accent just broke cover at the Orange County International Auto Show, entering its fifth generation. With the changeover, Hyundai says it focused on sharpening the design and aesthetic, upgrading the technology for entertainment and safety purposes, increasing the efficiency of the powertrain, lowering NVH levels, and a increasing driver engagement."));
		carList.add(new Car("Hyundai", "I20", "Discontinued in 1998 after only two years on the market, the V90 returned as Volvo’s flagship waThe Hyundai i20 was released in 2007 as a replacement for the Hyundai Getz and to fill the gap between the i10 and i30. For 2015, Hyundai ushered in a new generation of the i20, featuring a number of enhancements over the previous model. Highlights include a larger trapezoidal grille that sits higher than before, leaving room for a small lip at the bottom of the fascia and new headlights that are connected via a small air inlet at the end of the hood. The side profile of the i20 carries on relatively unchanged, but the rear end got new taillights that wrap around the rear quarters and extend onto the rear hatch. The rear fascia also got a sportier look to round out the exterior. Overall, the i20 has a wheelbase that is 1.5-inches longer than the outgoing model, which means there is improved legroom in the front and rear. On top of that, the dashboard got a completely new layout. The i20 came available with a number of gasoline and diesel engines that range anywhere between 73 horsepower and 98 horsepower."));
		carList.add(new Car("Hyundai", "IONIQ", "The Ioniq 5 family hatchback represents a real shift forward in Hyundai’s ability to chase down premium electric rivals, helping to persuade EV buyers who are motivated by stylish design, great on-board tech and practical range and charging speeds, to invest in the Korean brand. With stunning looks and a sense of cool that sets it apart from the pack, the manufacturer has added to the Ioniq 5’s strong kerb appeal with competitive pricing, generous standard kit and advanced active safety systems. We named it our Car of the Year for 2021, so if you’re thinking of a new purchase and you have the means, then the Hyundai Ioniq 5 is one of the best cars you can buy. "));
		carList.add(new Car("Hyundai", "KONA", "The Hyundai Kona is a car that clearly uses its design to draw in buyers. It's not that rewarding to drive, with lifeless steering and not much dynamic polish, although Hyundai has attempted to address this shortcoming with revisions to the 2021 facelifted model's chassis and suspension set-up. The manufacturer has succeeded in improving the Kona's ride, particularly over pockmarked surfaces, but there's not as much passenger or luggage space on board as you'll find in some competitors."));
		carList.add(new Car("Hyundai", "EQUUS", "The Hyundai Equus (Korean: 현대 에쿠스) is a full-size, front-engine, rear-drive, four-door, five passenger luxury sedan manufactured and marketed by Hyundai from 1999 to 2016. The name \"equus\" is the Latin word for \"horse\""));
		
		// Toyota Init
		carList.add(new Car("Toyota", "CAMRY", "Initially launched as a four-door version of the Celica in 1979, the Camry became a stand-alone nameplate in 1982. Since then, it has evolved into one of the most reliable and popular sedans on the market, especially in the U.S., where Toyota has delivered more than 200,000 units a year since 1988 and in excess of 350,000 examples since 1996. Currently the best-selling passenger car in North America, the Camry drove into a new generation for the 2018 model year."));
		carList.add(new Car("Toyota", "PRIUS", "The Toyota Prius (Japanese:トヨタ・プリウス, Toyota Puriusu) is a car built by Toyota which has a hybrid drivetrain, combining an internal combustion engine with an electric motor. It was initially offered as a 4-door sedan; it has been produced only as a 5-door liftback since 2003."));
		carList.add(new Car("Toyota", "SUPRA", "The fifth generation of the Supra was unveiled at the January 2019 North American International Auto Show. The car is a collaboration between Toyota and BMW and is based on the Z4. The Supra is powered by two BMW-sourced engine options: a turbocharged 2.0-litre inline-four or a turbocharged 3.0-litre inline-six engine."));
		carList.add(new Car("Toyota", "MIRAI", "The Toyota Mirai (from Mirai (未来), Japanese for \"future\") is a mid-size hydrogen fuel cell vehicle (FCV) manufactured by Toyota, and represents one of the first FCV automobiles to be mass produced and sold commercially."));
		carList.add(new Car("Toyota", "YARIS", "The 2020 Toyota Yaris is the fourth-generation version of the company’s popular hatchback. Previewed by the 2019 Yaris Sedan, the hatchback sports the same front fascia and side body panels, but drops the deck lid in favor of a shorter tailgate design. Now more aggressive on the outside, the Yaris boasts a more upscale interior packed with new technology and revised upholstery. The 1.5-liter four-cylinder carries over from the outgoing model, but it mates to a new transmission."));
		
		// Jaguar Init
		carList.add(new Car("Jaguar", "XE", "The 2020 Jaguar XE is the facelift version of the compact sedan that the British company unveiled in 2015. Aimed at premium four-door cars like the BMW 3 Series, Mercedes-Benz C-Class, and Audi A4, the XE is the spiritual successor of the X-Type, discontinued in 2009. The 2020 Jaguar XE features a sportier exterior, a revised interior with new technology, and provides better value in certain trims."));
		carList.add(new Car("Jaguar", "XF", "The Jaguar XF (X260) is an executive car/mid-size luxury car manufactured and marketed by the Jaguar Cars brand of Jaguar Land Rover in sedan/saloon and station wagon/estate body styles. Following the first generation steel-bodied X250 XF introduced in 2007, the second-generation XF sedan/saloon debuted at the 2015 New York International Auto Show, noted for its aluminium bodywork"));
		carList.add(new Car("Jaguar", "XJ", "The Jaguar XJ is a series of full-size luxury cars produced by British automobile manufacturer Jaguar Cars (becoming Jaguar Land Rover in 2013) from 1968 to 2019. It was produced across five basic platform generations (debuting in 1968, 1986, 1994, 2003 and 2009) with various updated derivatives of each. From 1970 it was Jaguar's flagship four door model. The original model was the last Jaguar saloon to have had the input of Sir William Lyons, the company's founder, and the model has been featured in countless media and high-profile appearances."));
		carList.add(new Car("Jaguar", "E-PACE", "The Jaguar E-Pace (X540) is a front or all-wheel-drive, front-engine, five-door compact luxury crossover SUV produced by the British car manufacturer Jaguar Land Rover (JLR) under their Jaguar marque. It was officially revealed on 13 July 2017 and was the 2nd production Jaguar SUV."));
		carList.add(new Car("Jaguar", "F-TYPE", "The Jaguar F-Type (X152) is a series of two-door, two-seater grand tourers manufactured by British luxury car manufacturer Jaguar Land Rover under their Jaguar Cars marque since 2013.[3] The car's JLR D6a platform is based on a shortened version of the XK's platform. It is the so-called \"spiritual successor\" to the famous E-Type. The car was launched initially as a 2-door soft-top convertible, with a 2-door fastback coupé version launched in 2013."));
				
	}
	
}
