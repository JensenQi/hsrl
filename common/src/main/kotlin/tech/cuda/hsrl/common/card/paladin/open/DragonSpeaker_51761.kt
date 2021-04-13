package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonSpeaker_51761 : Card() {
    override val id = 51761
    override val name = "龙语者"
    override val description = "<b>战吼：</b>使你手牌中的所有龙牌获得+3/+3。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他的演讲听起来很冗余。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e181fd0b2c879d8bab28c1fdf94584ba9abb6c2fc6cea48ae13449ff2d835e63.png"
}
