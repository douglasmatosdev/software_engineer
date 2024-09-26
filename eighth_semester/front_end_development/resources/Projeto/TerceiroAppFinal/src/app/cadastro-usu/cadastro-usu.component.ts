import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Usuario } from '../usuario';

@Component({
  selector: 'app-cadastro-usu',
  templateUrl: './cadastro-usu.component.html',
  styleUrls: ['./cadastro-usu.component.css']
})
export class CadastroUsuComponent implements OnInit {

  formUsu: FormGroup;
  servLogin: LoginService;

  constructor(private formBuilder: FormBuilder, servLogin: LoginService) {
    this.servLogin = servLogin;
    this.formUsu = this.formBuilder.group({
      nome:  ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      login: ['', [Validators.required]],
      senha: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  getError(campo: string): string {
    if(this.formUsu.get(campo)?.hasError('required'))
      return "Campo Obrigatório";
    if(this.formUsu.get(campo)?.hasError('email'))
      return "E-mail inválido";
    if(this.formUsu.get(campo)?.hasError('minlength')){
      const erro = this.formUsu.get(campo)?.errors?.['minlength'];
      return `Mínimo de ${erro.requiredLength} caracteres`;
    }
    return "Erro no campo";
  }

  addUsu(): void{
    const fdata = this.formUsu.getRawValue();
    const usuario = new Usuario(fdata.login,fdata.senha,fdata.nome,fdata.email);
    this.servLogin.addUser(usuario)
        .subscribe(_=>{
          console.log("Usuario adicionado");
        });
  }

  ngOnInit(): void {
  }

}
