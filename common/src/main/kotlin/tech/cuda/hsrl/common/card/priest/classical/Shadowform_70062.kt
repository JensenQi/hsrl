package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowform_70062 : Card() {
    override val id = 70062
    override val name = "暗影形态"
    override val description = "你的英雄技能变为“造成2点伤害”，如果已经处于暗影形态下：改为“造成3点伤害”。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "当一道光亮照射在暗影牧师身上...他们的影子会投射在哪里？"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/337b9847603cb71ab120ea1be592af9be891d97d070eef991b818393da6d2eeb.png"
}
