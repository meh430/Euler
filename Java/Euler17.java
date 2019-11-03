public class Euler17
{
    //get the length of the string and figure out if later
	public static void main(String[] args) {
		/*one - 3
		 *two - 3
		  three - 5
		  four - 4
		  five - 4
		  six - 3
		  seven - 5
		  eight - 5
		  nine - 4
		  ten - 3
		  eleven - 6
		  twelve - 6
		  thirteen - 8
		  fourteen - 8
		  fifteen - 7
		  sixteen - 7
		  seventeen - 9
		  eighteen - 8
		  nineteen - 8
		  twenty - 6
		  thirty - 6
		  forty - 5
		  fifty - 5
		  sixty - 5
		  seventy - 7
		  eighty - 6
		  ninety - 6
		  hundred - 7
		  and - 3
		  one-thousand - 11
		 */

		 //total for all of them
		 int realTotal = 0;
		 //total for one number
		 int numTotal = 0;
		 String number = "";
		 String digit = "";
		 int numberLength = 0;
		 for (int i = 1; i < 1000; i++) {
			numTotal = 0;
	        number = Integer.toString(i);
			numberLength = number.length();
			
			//single digit
			if (number.length() == 1) {
				if (number.equals("1")) {
					realTotal += 3;
				} else if (number.equals("2")) {
					realTotal += 3;
				} else if (number.equals("3")) {
						realTotal += 5;
				} else if (number.equals("4")) {
					realTotal += 4;
				} else if (number.equals("5")) { 	
					realTotal += 4;
				} else if (number.equals("6")) {
					realTotal += 3;
				} else if (number.equals("7")) {
					realTotal += 5;
				} else if (number.equals("8")) {
					realTotal += 5;
				} else if (number.equals("9")) {
					realTotal += 4;
				}
			} else if (number.length() == 2) {
				digit = number.substring(0, 1);
				//the tens
				if (digit.equals("1")) {
					if (number.substring(1, 2).equals("0")) {
						numTotal += 3;
					} else if (number.substring(1, 2).equals("1")) {
						numTotal += 6;
					} else if (number.substring(1, 2).equals("2")) {
						numTotal += 6;
					} else if (number.substring(1, 2).equals("3")) {
						numTotal += 8;
					} else if (number.substring(1, 2).equals("4")) {
						numTotal += 8;
					} else if (number.substring(1, 2).equals("5")) {
						numTotal += 7;
					} else if (number.substring(1, 2).equals("6")) {
						numTotal += 7;
					} else if (number.substring(1, 2).equals("7")) {
						numTotal += 9;
					} else if (number.substring(1, 2).equals("8")) {
						numTotal += 8;
					} else if (number.substring(1, 2).equals("9")) {
						numTotal += 8;
					}
				} else {
					//all the other tens
					if (digit.equals("2")) {
						numTotal += 6;
					} else if (digit.equals("3")) {
						numTotal += 6;
					} else if (digit.equals("4")) {
						numTotal += 5;
					} else if (digit.equals("5")) {
						numTotal += 5;
					} else if (digit.equals("6")) {
						numTotal += 5;
					} else if (digit.equals("7")) {
						numTotal += 7;
					} else if (digit.equals("8")) {
						numTotal += 6;
					} else if (digit.equals("9")) {
						numTotal += 6;
					}

					//change, the second digit or the ones
					if (number.substring(1, 2).equals("1")) {
						numTotal += 3;
					} else if (number.substring(1, 2).equals("2")) {
						numTotal += 3;
					} else if (number.substring(1, 2).equals("3")) {
						numTotal += 5;
					} else if (number.substring(1, 2).equals("4")) {
						numTotal += 4;
					} else if (number.substring(1, 2).equals("5")) {
						numTotal += 4;
					} else if (number.substring(1, 2).equals("6")) {
						numTotal += 3;
					} else if (number.substring(1, 2).equals("7")) {
						numTotal += 5;
					} else if (number.substring(1, 2).equals("8")) {
						numTotal += 5;
					} else if (number.substring(1, 2).equals("9")) {
						numTotal += 4;
					}
					
				}//close else
				realTotal += numTotal;
			} else if (number.length() == 3) {
				digit = number.substring(0, 1);
				if (digit.equals("1")) {
					numTotal += 3;
				} else if (digit.equals("2")) {
					numTotal += 3;
				} else if (digit.equals("3")) {
					numTotal += 5;
				} else if (digit.equals("4")) {
					numTotal += 4;
				} else if (digit.equals("5")) {
					numTotal += 4;
				} else if (digit.equals("6")) {
					numTotal += 3;
				} else if (digit.equals("7")) {
					numTotal += 5;	
				} else if (digit.equals("8")) {
					numTotal += 5;
				} else if (digit.equals("9")) {
					numTotal += 4;
				} 
				numTotal += 7;

				if (number.substring(1, 2).equals("1")) {
					if (number.substring(2, 3).equals("0")) {
						numTotal += 3;
					} else if (number.substring(2, 3).equals("1")) {
						numTotal += 6;
					} else if (number.substring(2, 3).equals("2")) {
						numTotal += 6;
					} else if (number.substring(2, 3).equals("3")) {
						numTotal += 8;
					} else if (number.substring(2, 3).equals("4")) {
						numTotal += 8;
					} else if (number.substring(2, 3).equals("5")) {
						numTotal += 7;
					} else if (number.substring(2, 3).equals("6")) {
						numTotal += 7;
					} else if (number.substring(2, 3).equals("7")) {
						numTotal += 9;
					} else if (number.substring(2, 3).equals("8")) {
						numTotal += 8;
					} else if (number.substring(2, 3).equals("9")) {
						numTotal += 8;
					}
				} else {
					//other tens
					if (number.substring(1, 2).equals("2")) {
						numTotal += 6;
					} else if (number.substring(1, 2).equals("3")) {
						numTotal += 6;
					} else if (number.substring(1, 2).equals("4")) {
						numTotal += 5;
					} else if (number.substring(1, 2).equals("5")) {
						numTotal += 5;
					} else if (number.substring(1, 2).equals("6")) {
						numTotal += 5;
					} else if (number.substring(1, 2).equals("7")) {
						numTotal += 7;
					} else if (number.substring(1, 2).equals("8")) {
						numTotal += 6;
					} else if (number.substring(1, 2).equals("9")) {
						numTotal += 6;
					} 

					//change, the second digit or the ones
					if (number.substring(2, 3).equals("1")) {
						numTotal += 3;
					} else if (number.substring(2, 3).equals("2")) {
						numTotal += 3;
					} else if (number.substring(2, 3).equals("3")) {
						numTotal += 5;
					} else if (number.substring(2, 3).equals("4")) {
						numTotal += 4;
					} else if (number.substring(2, 3).equals("5")) {
						numTotal += 4;
					} else if (number.substring(2, 3).equals("6")) {
						numTotal += 3;
					} else if (number.substring(2, 3).equals("7")) {
						numTotal += 5;
					} else if (number.substring(2, 3).equals("8")) {
						numTotal += 5;
					} else if (number.substring(2, 3).equals("9")) {
						numTotal += 4;
					}

				}//close else
				realTotal += numTotal;
			}//close three digits
		 }//first for

		realTotal += 11;
		realTotal += (99*9*3);
		System.out.println(numTotal);
		System.out.println(realTotal);
	}//main
}//class



/*
for (int j = 0; j < number.length(); j++) {
					digit = number.substring(j, j + 1);
					if (digit.equals("1")) {
						numTotal += 3;
					} else if (digit.equals("2")) {
						numTotal += 3;
					} else if (digit.equals("3")) {
						numTotal += 5;
					} else if (digit.equals("4")) {
						numTotal += 4;
					} else if (digit.equals("5")) {
						numTotal += 4;
					} else if (digit.equals("6")) {
						numTotal += 3;
					} else if (digit.equals("7")) {
						numTotal += 5;
					} else if (digit.equals("8")) {
						numTotal += 5;
					} else if (digit.equals("9")) {
						numTotal += 4;
					} else if (digit.equals("10")) {
						numTotal += 3;
					}
				}//close for
				*/
