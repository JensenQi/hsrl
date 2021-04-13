package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Toxmonger_47256 : Card() {
    override val id = 47256
    override val name = "毒药贩子"
    override val description = "每当你使用一张法力值消耗为（1）的随从牌，使其获得<b>剧毒</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "并非所有的蜘蛛都有毒，所有的药水都没毒。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/92e61f758b4f8e7d9e92479dd4c2ea2bc1c7b8a26077b33ea0e84c2cec3f4e7c.png"
}
