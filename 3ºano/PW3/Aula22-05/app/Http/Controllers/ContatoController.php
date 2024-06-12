<?php

namespace App\Http\Controllers;

use App\Models\Contato;
use Illuminate\Http\Request;

class ContatoController extends Controller
{
    public function index(Request $req){
        $contato = Contato::all(); // Busca todos os contato que estiverem no banco de dados
        return view('index')->with("contato", $contato); // Retorna para a view 'contato' após fazer a busca
    }

    // A função "adicionar" busca no banco de dados os campos do formulário repassados á ele
    public function adicionar(Request $req){
        $contato = new Contato;
        $contato->nome = $req->nome;
        $contato->telefone = $req->telefone;
        $contato->email = $req->email;
        $contato->save(); // Salva as informações na variável "contato"
        return redirect()->back(); // Retorna novamente para á mesma view onde esta função está localizada
    }

    // A função "editar" busca todas as ids requisitadas no banco de dados
    public function editar(Request $req){
        $contato = Contato::find($req->id);
        return view('editar')->with("contato", $contato); // Permite editar as informações da id específica na view 'editar'
    }

    // A função "atualizar" busca todas as ids requisitadas no banco de dados
    public function atualizar(Request $req){
        $contato = Contato::find($req->id);
        $contato->update( // A variável "contato" recebe a id e é atualizada as informações do banco de dados
            [
                "nome" => $req->nome,
                "telefone" => $req->telefone,
                "email" => $req->email
            ]
        );
        return redirect('/'); // Redireciona novamente para a mesma view
    }

    // A função "excluir" busca todas as ids requisitadas no banco de dados
    public function excluir(Request $req){
        $contato = Contato::find($req->id);
        $contato->delete(); // A variável "contato" recebe a id e é deletada do banco de dados
        return redirect()->back(); // Redireciona novamente para a mesma view
    }
}
