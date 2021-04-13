package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnidentifiedShield_45775 : Card() {
    override val id = 45775
    override val name = "未鉴定的盾牌"
    override val description = "获得5点护甲值。在你手牌中时获得额外效果。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "狗头人盯着这个包裹看了好久。“啊哈！”他说道，“这是一面盾牌。”"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8dc79c24a33e83531b95b800c22e95a34d211b9a07fa82c23aa6192490bdbd62.png"
}
