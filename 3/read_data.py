import xml.etree.ElementTree as ET 
def get_user_details(user_id): 
    tree = ET.parse(r'C:\Users\miray\OneDrive\Desktop\WT-Lab\3\user.xml') 
    root = tree.getroot() 
    for user in root.findall('user'): 
        if user.get('id') == user_id: 
            name = user.find('name').text 
            email = user.find('email').text 
            return f"Name: {name}, Email: {email}" 
    return "User not found" 
user_id = input("Enter a user ID: ") 
print(get_user_details(user_id)) 
