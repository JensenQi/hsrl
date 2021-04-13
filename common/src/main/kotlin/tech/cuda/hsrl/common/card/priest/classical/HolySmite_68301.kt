package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolySmite_68301 : Card() {
    override val id = 68301
    override val name = "神圣惩击"
    override val description = "造成 2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "这和多么虔诚没有关系，每个人都需要时不时有人鞭策一下。"
    override val artist = "Steve Ellis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/afae4e1e81b1f686e00fa737c7f0a7a1d48f8cd5781839001bffe192b42e50ba.png"
}
