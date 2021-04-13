package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PalmReading_61282 : Card() {
    override val id = 61282
    override val name = "解读手相"
    override val description = "<b>发现</b>一张法术牌。使你手牌中所有法术牌的法力值消耗减少（1）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "未来运势，触手可知。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22d5b6c71760b80142f28f037fbcfa9c934f485815aa40651a21f28b537bceb0.png"
}
