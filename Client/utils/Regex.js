escapeRegExp = function(string){
    return string.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
};
 

replaceAll = function(str, term, replacement) {
  return str.replace(new RegExp(escapeRegExp(term), 'g'), replacement);
};