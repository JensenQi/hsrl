package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ParachuteBrigand_55401 : Card() {
    override val id = 55401
    override val name = "空降歹徒"
    override val description = "在你使用一张海盗牌后，从你的手牌中召唤该随从。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "蹲在手牌里，等着蹭最便宜的航班。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f69b1acf96de7f1f06da32d92976f11a4c92798c9c147c3d515e393cf721f019.png"
}
