class Car:
    'this is car class'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model+ " is moving")
    
    def stop(self):
         print(self.manufacturer + " " + self.model+ " is stopped")
    

car1 = Car("Maruti", "WagonR", "2015", "Automatic", "white")

car1.accelerate()
car1.stop()