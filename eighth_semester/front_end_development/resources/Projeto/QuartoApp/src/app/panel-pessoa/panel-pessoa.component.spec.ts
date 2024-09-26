import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PanelPessoaComponent } from './panel-pessoa.component';

describe('PanelPessoaComponent', () => {
  let component: PanelPessoaComponent;
  let fixture: ComponentFixture<PanelPessoaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PanelPessoaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PanelPessoaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
