package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dinosize_41130 : Card() {
    override val id = 41130
    override val name = "巨化术"
    override val description = "将一个随从的攻击力和生命值变为10。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "可免费升级套餐里的薯条跟可乐。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c3f04926643f3cc8efedfff9b614d0cb2ea16e41b60fea757af72534e8f811ba.png"
}
