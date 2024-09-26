
//js for create text effect in h1

const text = document.getElementsByTagName('h1')[0].innerText;
document.getElementsByTagName('h1')[0].innerText = '';
let i = 0;
let innerText = '';
let textEffect = setInterval(() => {
    if (i === text.length) {
        return clearInterval(textEffect);
    }
    innerText += text[i];

    document.getElementsByTagName('h1')[0].innerText = innerText;
    i++;
}, 100);


// js for img effect when hover
const img = document.getElementsByTagName('img')[0];
img.addEventListener('mouseenter', () => {
    img.style.transform = 'scale(1.2)';
});
img.addEventListener('mouseleave', () => {
    img.style.transform = 'scale(1)';
});

