% First algorithm
%......input
n=3;
a=[2 3 4 1];
x=6;
% %...output : p
p=a(1);
%y=x;
% for i=1:n
%     p=p+a(i+1)*y;
%     y=y*x;
% end 

% Second algorithm
for i=1:n
    p=p*x+a(n-i);
end 