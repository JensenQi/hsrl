package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TotemicMight_68453 : Card() {
    override val id = 68453
    override val name = "图腾之力"
    override val description = "使你的图腾获得+2生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "禁止踩踏图腾。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2854ab9273efb8906165b17e96c35c8eff600a2be3d30b88aee17a93ce7aae0a.png"
}
