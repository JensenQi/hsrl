package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MagicCarpet_53173 : Card() {
    override val id = 53173
    override val name = "魔法飞毯"
    override val description = "在你使用一张法力值消耗为（1）的随从牌后，使其获得+1攻击力和<b>突袭</b>。"
    override var cost: Int? = 3
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "你总能看见一群小淘气坐在上面。"
    override val artist = "Tod Harris"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8eed5eb1fe668ac181298b63316ae50eecc23db04240154b3d0276e43e6beb23.png"
}
