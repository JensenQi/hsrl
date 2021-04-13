package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DemonicProject_50432 : Card() {
    override val id = 50432
    override val name = "恶魔计划"
    override val description = "随机将每个玩家手牌中的一张随从牌变形成为一张 恶魔牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "每个人的心中都有一个恶魔。"
    override val artist = "J. Paick & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c7a44e5c36896bbdc9b024784dcccd6f3c974f47f14ac7f4eb7e050e0c9a51b.png"
}
