package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Betrayal_69854 : Card() {
    override val id = 69854
    override val name = "背叛"
    override val description = "使一个敌方随从对其相邻的随从 造成等同于其攻击力的伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "每个人都有背叛的价码。拿侏儒打比方的话，长毛绒玩具和一小点儿巧克力就能让他们就范。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/97a76cf3b696e13f1c8bd08f639cb64a13135956a5b979226e21326dc880d1f6.png"
}
