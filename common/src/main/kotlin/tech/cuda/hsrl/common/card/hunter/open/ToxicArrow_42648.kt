package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ToxicArrow_42648 : Card() {
    override val id = 42648
    override val name = "剧毒箭矢"
    override val description = "对一个随从造成 2点伤害，如果 它依然存活，则获得<b>剧毒</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "熬过痛苦，你就会更狠毒。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1671d9a95445e127d04d29654c28df3349779d0c4494188e08fec81d9ce7a7ff.png"
}
