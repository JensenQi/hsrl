package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Swashburglar_39698 : Card() {
    override val id = 39698
    override val name = "吹嘘海盗"
    override val description = "<b>战吼：</b>随机将一张另一职业的卡牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Karazhan
    override val background = "只要两杯朗姆酒，他就能吹上一整天！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a32b845792518072609b4e281e85f71a571cdee86cf1a1af340aa48b8e8665e.png"
}
