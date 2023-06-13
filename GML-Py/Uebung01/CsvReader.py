import csv

with open('uebung01.csv', 'r') as file:
    csv_reader = csv.reader(file, delimiter='"')
    for row in csv_reader:
        print(row)
