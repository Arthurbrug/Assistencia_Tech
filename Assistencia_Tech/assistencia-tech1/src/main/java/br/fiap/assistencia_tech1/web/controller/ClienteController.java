package br.fiap.assistencia_tech1.web.controller;

import br.fiap.assistencia_tech1.dominio.Cliente;
import br.fiap.assistencia_tech1.service.ClienteService;
import br.fiap.assistencia_tech1.web.dto.ClienteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody ClienteDTO clienteDTO){
        return service.salvar(clienteDTO);
    }
}
