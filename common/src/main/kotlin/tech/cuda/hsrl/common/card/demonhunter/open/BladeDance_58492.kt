package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladeDance_58492 : Card() {
    override val id = 58492
    override val name = "刃舞"
    override val description = "随机对三个敌方随从造成等同于你的英雄攻击力的伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "在舞厅清场时最稳妥的办法。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ef13d03f3cbb3be3eda18362597be2e8deb0dd88a401fbcf38aac0257f977059.png"
}
