document.writeln('Hello, world!');

Function.prototype.method = function (name, func) {
  this.prototype[name] = func;
  return this;
};

var stooge = {
  "first-name": "Jerome",
  "last-name": "Howard"
};

stooge['middle-name'] = 'Lester';
stooge.nickname = 'Curly';

var flight = {
  airline: "Oceanic",
  number: 815,
  departure: {
    IATA: "SYD",
    time: "2004-09-22 14:55",
    city: "Sydney"
  },
  arrival: {
    IATA: "LAX",
    time: "2004-09-23 10:42",
    city: "Los Angeles"
  }
};

var status = flight.status || "unknown";

if (typeof Object.create !== 'function') {
  Object.create = function (o) {
    var F = function () {};
    F.prototype = o;
    return new F();
  };
}

var another_flight = Object.create(flight);
var another_stooge = Object.create(stooge);
another_stooge['first-name'] = 'jo';


var name;
for (name in another_stooge) {
  if (typeof another_stooge[name] !== 'function') {
    if (another_stooge.hasOwnProperty(name)) {
      document.writeln(name + ': ' + another_stooge[name]);
    }
  }
}

var i;
var properties = [
  'first-name',
  'middle-name',
  'last-name',
  'profession'
];

for (i = 0; i < properties.length; i += 1) {
  document.writeln(properties[i] + ': ' + another_stooge[properties[i]]);
}

var MYAPP = {};

MYAPP.test = {
  "a": 1,
  "b": "two"
};

MYAPP.another_test = {
  "c": 3,
  "p": "o"
};
