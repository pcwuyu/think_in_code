cars = 100
space_in_a_car = 4.0
drivers = 30
passenger = 90
cars_not_driven = cars - drivers
cars_driven = drivers
carpool_capactity = cars_driven * space_in_a_car
average_passengers_pre_car = passenger / cars_driven

print "There are", cars, "cars available."
print "There are only", drivers, "drives available."
print "There will be", cars_not_driven, "empty cars today."
print "We can transport", carpool_capactity, "people today."
print "We have", passenger, "to carpool today."
print "We need to put about", average_passengers_pre_car, "in each car."
