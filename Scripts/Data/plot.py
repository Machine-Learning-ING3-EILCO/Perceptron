# from the code of Fabien Teytaud

import sys
import matplotlib.path as mpath
import matplotlib.patches as mpatches
import matplotlib.pyplot as plt
import numpy as np

nomFichier = sys.argv[1]

a = 0
b = 0

if len(sys.argv) > 2:
	a= float(sys.argv[2])
	b= float(sys.argv[3])



fichier = open(nomFichier,"r")

lesLignes = fichier.readlines()
fichier.close()

xclasse1 = []
yclasse1 = []
xclasse2 = []
yclasse2 = []

for uneLigne in lesLignes:
    split = uneLigne.split()

    if int(split[2]) > 0:
        xclasse1.append(float(split[0]))
        yclasse1.append(float(split[1]))
    else:
        xclasse2.append(float(split[0]))
        yclasse2.append(float(split[1]))


plt.xlim(0, 8)
plt.ylim(0, 8)
plt.plot(xclasse1, yclasse1, 'bo', xclasse2, yclasse2, 'rx')


def f(x): return (a*x+b)



plt.plot([f(x) for x in range(11)])



plt.show()

# to export the plot in pdf or png (uncomment line with "Agg"
#plt.savefig("ex1.pdf")
#plt.savefig("ex1.png")
