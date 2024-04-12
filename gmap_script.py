from geopy.geocoders import Nominatim

def reverse_geocode(latitude, longitude):
    geolocator = Nominatim(user_agent="reverse_geocode")
    location = geolocator.reverse((latitude, longitude), exactly_one=True)
    address = location.raw['address']
    street_name = address.get('road', '')
    postal_code = address.get('postcode', '')
    return street_name, postal_code

# Example coordinates
coordinates = [
    (22.99821,72.66789),  # New York City
    (34.0522, -118.2437)  # Los Angeles
]

for lat, lng in coordinates:
    street_name, postal_code = reverse_geocode(lat, lng)
    print(f"Street Name: {street_name}, Postal Code: {postal_code}")
