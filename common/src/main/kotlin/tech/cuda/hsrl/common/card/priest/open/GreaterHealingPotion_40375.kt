package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GreaterHealingPotion_40375 : Card() {
    override val id = 40375
    override val name = "强效治疗药水"
    override val description = "为一个友方角色恢复 12点 生命值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "富含各种电解质！"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57589fc008dafa5aea83880821df3f3fc94d92ebac8be378678e98c0665d1718.png"
}
