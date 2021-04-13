package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheLynx_50660 : Card() {
    override val id = 50660
    override val name = "山猫之灵"
    override val description = "<b>潜行</b>一回合。每当你召唤一个野兽时，使其获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "这座神龛主要靠播放开罐头的声音为山猫提供力量。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/375935847e6452252f7e32863efbda76ba7a23d5bc38dd316e1b160e22afbb44.png"
}
