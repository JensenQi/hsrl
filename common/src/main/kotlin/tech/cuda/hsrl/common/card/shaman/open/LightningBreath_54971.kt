package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningBreath_54971 : Card() {
    override val id = 54971
    override val name = "闪电吐息"
    override val description = "对一个随从造成 4点伤害。如果你的手牌中有龙牌，则同样对其相邻随从造成伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "配料表：一条巨龙，一件毛衣，还需要干燥的天气。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb4f889ce7f5cd05a886e8ff34ec00496cc1fe393b0f8a276ecc462ccda34ce3.png"
}
