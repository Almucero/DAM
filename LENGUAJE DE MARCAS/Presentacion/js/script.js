const pedrito = document.getElementById('pedrito');
const pedrito2 = document.querySelector('#pedrito');
const boton = document.getElementById('botonazo');
const nombre = document.getElementById('nombre');

pedrito2.addEventListener('mouseover', () => {
    pedrito.style.boxShadow = '0 0px 50px black';
    pedrito.setAttribute('src', 'img/aguela.png');
});

pedrito2.addEventListener('mouseout', () => {
    pedrito.style.boxShadow = 'none';
    pedrito.setAttribute('src', 'img/pedrito.jpg');
});

boton.addEventListener('click', () => {
    nombre.style.color = 'red';
});

boton.addEventListener('dblclick', () => {
    nombre.style.color = 'black';
});