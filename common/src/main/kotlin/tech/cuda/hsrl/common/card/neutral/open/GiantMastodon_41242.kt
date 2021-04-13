package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GiantMastodon_41242 : Card() {
    override val id = 41242
    override val name = "巨型乳齿象"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 9
    override var health: Int? = 10
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "它直到如今还在为没能评上“乳齿年”而耿耿于怀。"
    override val artist = "Chanchai Luechaiwattanasopon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3a3f711d6b561deed99a3814918497c8087900fa685e1c970c776beb0412a1e0.png"
}
