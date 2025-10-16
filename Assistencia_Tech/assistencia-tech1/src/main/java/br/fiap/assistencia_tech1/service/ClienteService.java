package br.fiap.assistencia_tech1.service;

import br.fiap.assistencia_tech1.dominio.Cliente;
import br.fiap.assistencia_tech1.repository.ClienteRepository;
import br.fiap.assistencia_tech1.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvar(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setSenha(clienteDTO.getSenha());
        cliente.setTelefone(clienteDTO.getTelefone());
        return clienteRepository.save(cliente);
    }
}
