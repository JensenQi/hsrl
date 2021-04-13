package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedObserver_56387 : Card() {
    override val id = 56387
    override val name = "被禁锢的眼魔"
    override val description = "<b>休眠</b>两回合。唤醒时，对所有敌方随从造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "两个回合之后，让你们都好看。"
    override val artist = "Melvin Chan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60e4625551271eb39642fb8aa036604aef399bd457891e68196a08be6c3af196.png"
}
