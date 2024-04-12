import os
import requests
from bs4 import BeautifulSoup
import re

# Array of URLs
urls = [
    'https://www.makaan.com/ahmedabad/arkiton-life-space-luxe-in-bopal-3178597',
    'https://www.makaan.com/ahmedabad/keshav-narayan-group-akshar-ocean-pearl-in-ambli-3177719',
    'https://www.makaan.com/ahmedabad/vishwa-developers-ahmedabad-opulence-in-naryanpura-2050295',
    'https://www.makaan.com/ahmedabad/satyam-developers-sarjan-in-changodar-644664',
    'https://www.makaan.com/ahmedabad/navkar-buildcon-ahmedabad-sunflower-in-shilaj-3181179',
    'https://www.makaan.com/ahmedabad/kailash-buildcon-the-willows-in-hathijan-3125193',
    'https://www.makaan.com/ahmedabad/elite-group-tagad-elite-mercury-in-tragad-3180253',
    'https://www.makaan.com/ahmedabad/shivam-builders-pvt-ltd-rajvi-opal-in-memnagar-2014517',
    'https://www.makaan.com/ahmedabad/dr-infrastructure-praharsh-platinium-in-shela-3083175',
    'https://www.makaan.com/ahmedabad/parshwa-buildcon-venue-82-in-shilaj-3083278',
    'https://www.makaan.com/ahmedabad/anmol-construction-ahmedabad-solitaire-vista-in-gota-3051853',
    'https://www.makaan.com/ahmedabad/raj-infra-ahmedabad-sangath-palm-in-chandkheda-1836022',
    'https://www.makaan.com/ahmedabad/marutinandan-developers-ahmedabad-sahajanand-harmony-in-vatva-3171254'
]

try:
    for index, url in enumerate(urls):
        # Send a GET request to the webpage
        response = requests.get(url)
        
        # Check if the request was successful
        if response.status_code == 200:
            # Parse the HTML content of the page
            soup = BeautifulSoup(response.text, 'html.parser')

            # Find divs with class 'tic' and figures with class 'ic c1', 'ic c2', 'ic c3'
            divs_tic = soup.find_all('div', class_='tic')
            figures_ic_c1 = soup.find_all('figure', class_='ic c1')
            figures_ic_c2 = soup.find_all('figure', class_='ic c2')
            figures_ic_c3 = soup.find_all('figure', class_='ic c3')
            
            # Extract image URLs from 'data-sourcemodule' attribute for each type
            image_urls = []
            for elements in [divs_tic, figures_ic_c1, figures_ic_c2, figures_ic_c3]:
                for element in elements:
                    data_sourcemodule = element.get('data-sourcemodule')
                    if data_sourcemodule:
                        image_urls.append(data_sourcemodule)
            
            # Extract the part of URL before '.jpeg' and download images
            for i, image_url in enumerate(image_urls):
                # Extract the part of URL before '.jpeg'
                image_name = re.search(r'(.+?\.jpeg)', image_url).group(1)
                
                # Download the image
                image_response = requests.get(image_name)
                if image_response.status_code == 200:
                    # Create a directory to save the images
                    directory_name = f'images_{index}'
                    if not os.path.exists(directory_name):
                        os.makedirs(directory_name)
                    
                    # Save the image
                    with open(os.path.join(directory_name, f'image_{i+1}.jpeg'), 'wb') as f:
                        f.write(image_response.content)
                        print(f'Downloaded image {i+1} for URL {url}')
                else:
                    print(f'Failed to download image {i+1} for URL {url}')

            print(f'All images downloaded successfully for URL {url}')
        else:
            print(f'Failed to retrieve the webpage for URL {url}')

except Exception as e:
    print('An error occurred:', e)
