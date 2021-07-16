var viaggio = document.getElementById('viaggio'); //mi prendo il contenitore della lista viaggi
		
	const URL = "api/viaggi/pagamento/?id="; //rotta api del nostro controller
		
		fetch(URL)			//chiamata API che restituisce un JSON
			.then(pippa => pippa.json())		//dico a javascript che questo è un json e di restituirmi un array di oggetti
			.then(viaggicosavuoi => {

				for(let viaggio of viaggicosavuoi){
					//creo div che mi servono
					let divEs = document.createElement('div');
					let div8 = document.createElement('div');
					let div4 = document.createElement('div');
					let destinazione = document.createElement('h1');
					let descrizione = document.createElement('p');
					

					//aggiungo titolo e foto
					destinazione.innerHTML= viaggio.destinazione;
					div8.appendChild(destinazione);
					descrizione.innerHTML = viaggio.descrizione;
					div8.appendChild(descrizione);
					div4.innerHTML= "<img src='img/caponord.jpg' alt='immagine' class='imgpiccola'>";

					console.log(viaggio.destinazione);
					//aggiungere classi bootstrap a div8/div4
					div8.classList.add("col-sm-8");
					div4.classList.add("col-sm-4");
					divEs.classList.add("row");

					//metto div8/4 dentro div esterno
					divEs.appendChild(div8);
					divEs.appendChild(div4);

					//metto div esterno dentro elenco
					elenco.appendChild(divEs);

                }

			});
