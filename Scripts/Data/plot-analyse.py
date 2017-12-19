# from the code of Fabien Teytaud

import sys
import matplotlib.path as mpath
import matplotlib.patches as mpatches
import matplotlib.pyplot as plt
import numpy as np

nomFichier = sys.argv[1]


fichier = open(nomFichier,"r")

lesLignes = fichier.readlines()
fichier.close()

xclasse1 = []
yclasse1 = []
maxX = 0.0

for uneLigne in lesLignes:
    split = uneLigne.split()
    xclasse1.append(float(split[0]))
    yclasse1.append(float(split[1]))
    if(maxX<float(split[0])) : 
	maxX = float(split[0])
	 



plt.xlim(0, maxX)
plt.ylim(0, 1)
plt.plot(xclasse1, yclasse1)



plt.show()

# to export the plot in pdf or png (uncomment line with "Agg"
#plt.savefig("ex1.pdf")
#plt.savefig("ex1.png")
