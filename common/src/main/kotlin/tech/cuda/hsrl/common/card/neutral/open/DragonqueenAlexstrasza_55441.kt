package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonqueenAlexstrasza_55441 : Card() {
    override val id = 55441
    override val name = "红龙女王阿莱克丝塔萨"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则随机将两张其他龙牌置入你的手牌，其法力值消耗为（0）点。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "依然能够带来生命与希望，但打起架来也毫不手软。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/651f3b9b0ae978b8cb8c01c38e199c9e99e8e7b5f439711eefb23365666f4e31.png"
}
