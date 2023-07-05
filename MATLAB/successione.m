n = 100;
p = zeros(1,n)';

% Second algorithm
p(2)=1/3;
p(1)=1;
for i = 3:n
    p(i)=10/3*p(i-1)-p(i-2);
end

% First algorithm
% p(1)=1;
% for i = 2:n
%     p(i)=1/3*p(i-1);
% end