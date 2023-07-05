n=100;
l=2;
sinb=1;
for i=3:n
    a=l*sinb;
    l=l*2;
    sinb=sqrt(1-(sqrt(1-sinb*sinb))*0.5);
end
