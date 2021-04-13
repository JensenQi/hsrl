package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Windfury_68330 : Card() {
    override val id = 68330
    override val name = "风怒"
    override val description = "使一个随从获得<b>风怒</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "比起“地怒”或是“火怒”，萨满们更喜欢使用“风怒”，因为它更轻巧，更飘逸。"
    override val artist = "Justin Sweet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a647e07b7083c82a29b1472b7ee5940d6b988bf86f8cfb5eac4c4ed73b2a2597.png"
}
