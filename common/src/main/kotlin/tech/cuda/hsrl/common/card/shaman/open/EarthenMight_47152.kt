package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthenMight_47152 : Card() {
    override val id = 47152
    override val name = "大地之力"
    override val description = "使一个随从获得+2/+2。如果该随从是元素，则随机将一张元素牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "下雨天施法效果会减半。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/313dd460a909f34d41f63c5cbed367a24efe5ae436347dceb39c26cfef855243.png"
}
