import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TabPessoaComponent } from './tab-pessoa.component';

describe('TabPessoaComponent', () => {
  let component: TabPessoaComponent;
  let fixture: ComponentFixture<TabPessoaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TabPessoaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TabPessoaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
