package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhispersOfEvil_54872 : Card() {
    override val id = 54872
    override val name = "怪盗低语"
    override val description = "将一张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "拉祖尔女士的低语助眠频道就要开播啦！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d0aa77ed95c0040f20e56509d04683fb02de8183713aa35054b933b497bef1c.png"
}
