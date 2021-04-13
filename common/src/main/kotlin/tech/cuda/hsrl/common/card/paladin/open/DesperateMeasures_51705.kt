package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DesperateMeasures_51705 : Card() {
    override val id = 51705
    override val name = "孤注一掷"
    override val description = "<b>双生法术</b> 随机施放一个圣骑士<b>奥秘</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "明明是孤注一掷，却可以使用两次。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee6f900fd4d15d0c02a996c61a492c8ffc6a48ebd89d5994fe72a8f0ac250200.png"
}
