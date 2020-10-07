package task_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Application {

	public static void main(String[] args) {

		List<Month> masMonths = Arrays.asList(Month.values()); 
		List<Seasons> masSeasons = Arrays.asList(Seasons.values());
		
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Ââåä³òü ì³ñÿöü: ");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = isMonthPresent(masMonths, month);

				if (!flag) {
					System.out.println("Òàêîãî ì³ñÿöÿ íå ³ñíóº...");
				}
				break;
			}
			case "2": {
				System.out.println("Ââåä³òü ïîðó ðîêó:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isMonthSeasonPresent(masMonths, season);

				if (!flag) {
					System.out.println("Òàêî¿ ïîðè ðîêó íå ³ñíóº...");
				}
				break;
			}
			case "3": {
				System.out.println("Ââåä³òü ê³ëüê³ñòü äí³â");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = isDaysPreset(masMonths, days);

				if (!flag) {
					System.out.println("Íå â³ðíî ââåäåí³ äàí³...");
				}
				break;
			}
			case "4": {
				System.out.println("Ââåä³òü ê³ëüê³ñòü äí³â");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = isDaysLess(masMonths, days);

				if (!flag) {
					System.out.println("Í æàëü, ì³ñÿö³â, â ÿêèõ ìåíøå äí³â, í³æ ââåäåíå ÷èñëî - íå ³ñíóº");
				}
				break;
			}
			case "5": {
				System.out.println("Ââåä³òü ê³ëüê³ñòü äí³â");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = isDaysOver(masMonths, days);

				if (!flag) {
					System.out.println("Í æàëü, ì³ñÿö³â, â ÿêèõ á³ëüøå äí³â, í³æ ââåäåíå ÷èñëî - íå ³ñíóº");
				}
				break;
			}
			case "6": {
				System.out.println("Ââåä³òü ïîðó ðîêó:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(masSeasons, season);

				if (flag) {
					
					int ordinal = 0;
					for (Seasons s: masSeasons) {
						if (s.name().equals(season)) {
							ordinal = s.ordinal();
						}
					}
					
					if (ordinal == masSeasons.size() - 1) {
						ordinal = 0;
						System.out.println(masSeasons.get(ordinal));
					} else {
						System.out.println(masSeasons.get(ordinal + 1));
					}
				}

				if (!flag) {
					System.out.println("Òàêî¿ ïîðè ðîêó íå ³ñíóº");
				}
				break;
			}
			case "7": {
				System.out.println("Ââåä³òü ïîðó ðîêó:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(masSeasons, season);

				if (flag) {
					
					int ordinal = 0;
					for (Seasons s: masSeasons) {
						if (s.name().equals(season)) {
							ordinal = s.ordinal();
						}
					}

					if (ordinal == 0) {
						ordinal = (masSeasons.size() - 1);
						System.out.println(masSeasons.get(ordinal));
					} else {
						System.out.println(masSeasons.get(ordinal - 1));
					}
				}

				if (!flag) {
					System.out.println("Òàêî¿ ïîðè ðîêó íå ³ñíóº");
				}
				break;
			}
			case "8": {
				allMonthEvenDays(masMonths);
				break;
			}
			case "9": {
				allMonthOddDays(masMonths);
				break;
			}
			case "10": {
				System.out.println("Ââåä³òü ì³ñÿöü: ");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = isMonthPresent(masMonths, month);

				if (flag) {
					for (Month m : masMonths) {
						if (m.name().equals(month)) {
							if (m.getDay() % 2 == 0) {
								System.out.println("Ì³ñÿöü ìàº ïàðíó ê³ëüê³ñòü äí³â");
							} else {
								System.out.println("Ì³ñÿöü ìàº íåïàðíó ê³ëüê³ñòü äí³â");
							}
						}
					}
				}

				if (!flag) {
					System.out.println("Òàêîãî ì³ñÿöÿ íå ³ñíóº...");
				}
				break;
			}
			}
		}

	}


	private static void allMonthOddDays(List<Month> masMonths) {
		for (Month m : masMonths) {
			if (m.getDay() % 2 != 0) {
				System.out.println(m.name());
			}
		}
	}

	private static void allMonthEvenDays(List<Month> masMonths) {
		for (Month m : masMonths) {
			if (m.getDay() % 2 == 0) {
				System.out.println(m.name());
			}
		}
	}

	private static boolean isSeasonPresent(List<Seasons> masSeasons, String season) {
		boolean flag = false;
		for (Seasons s : masSeasons) {
			if (s.name().equals(season)) {
				System.out.println("Òàêà ïîðà ðîêó ³ñíóº");
				flag = true;
			}
		}
		return flag;
	}


	private static boolean isDaysOver(List<Month> masMonths, int days) {
		boolean flag = false;
		for (Month m : masMonths) {
			if (m.getDay() > days) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}


	private static boolean isDaysLess(List<Month> masMonths, int days) {
		boolean flag = false;
		for (Month m : masMonths) {
			if (m.getDay() < days) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}


	private static boolean isDaysPreset(List<Month> masMonths, int days) {
		boolean flag = false;

		for (Month m : masMonths) {
			if (m.getDay() == days) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}


	private static boolean isMonthSeasonPresent(List<Month> masMonths, String season) {
		boolean flag = false;

		for (Month m : masMonths) {
			if (m.getSeasons().name().equals(season)) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}


	private static boolean isMonthPresent(List<Month> masMonths, String month) {
		boolean flag = false;

		for (Month m : masMonths) {
			if (m.name().equals(month)) {
				System.out.println("Òàêèé ì³ñÿöü ³ñíóº");
				flag = true;
			}
		}
		return flag;
	}

	static void menu() {
		System.out.println("Íàòèñí³òü 1, ùîá ïåðåâ³ðèòè ÷è ³ñíóº ì³ñÿöü:");
		System.out.println("Íàòèñí³òü 2, ùîá âèâåñòè âñ³ ì³ñÿö³ ç òàêîþ ïîðîþ ðîêó:");
		System.out.println("Íàòèñí³òü 3, ùîá âèâåñòè âñ³ ì³ñÿö³ ç ââåäåíîþ ê³ëüê³ñòþ äí³â:");
		System.out.println("Íàòèñí³òü 4, ùîá âèâåñòè âñ³ ì³ñÿö³ ç ìåíøîþ ê³ëüê³ñòþ äí³â:");
		System.out.println("Íàòèñí³òü 5, ùîá âèâåñòè âñ³ ì³ñÿö³ ç á³ëüøîþ ê³ëüê³ñòþ äí³â:");
		System.out.println("Íàòèñí³òü 6, ùîá âèâåñòè íàñòóïíó ïîðó ðîêó:");
		System.out.println("Íàòèñí³òü 7, ùîá âèâåñòè ïîïåðåäíþ ïîðó ðîêó:");
		System.out.println("Íàòèñí³òü 8, ùîá âèâåñòè âñ³ ì³ñÿö³, ÿê³ ìàþòü ïàðíó ê³ëüê³ñòü äí³â");
		System.out.println("Íàòèñí³òü 9, ùîá âèâåñòè âñ³ ì³ñÿö³, ÿê³ ìàþòü íåïàðíó ê³ëüê³ñòü äí³â");
		System.out.println("Íàòèñí³òü 10, ùîá ïåðåâ³ðèòè, ÷è ìàº ì³ñÿöü ïàðíó ê³ëüê³ñòü äí³â");
	}

	
}

