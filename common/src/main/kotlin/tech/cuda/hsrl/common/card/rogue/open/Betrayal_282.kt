package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Betrayal_282 : Card() {
    override val id = 282
    override val name = "背叛"
    override val description = "使一个敌方随从对其相邻的随从 造成等同于其攻击力的伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "每个人都有背叛的价码。拿侏儒打比方的话，长毛绒玩具和一小点儿巧克力就能让他们就范。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8209afaeafdbc8b8ca943d6de9eda05d40113f48e43b21415073438f50e53363.png"
}
