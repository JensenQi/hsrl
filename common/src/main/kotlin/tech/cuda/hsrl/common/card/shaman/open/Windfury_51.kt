package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Windfury_51 : Card() {
    override val id = 51
    override val name = "风怒"
    override val description = "使一个随从获得<b>风怒</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "比起“地怒”或是“火怒”，萨满们更喜欢使用“风怒”，因为它更轻巧，更飘逸。"
    override val artist = "Justin Sweet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ac46c7983e6bda81cf84e860ebef9fc49ed1afa9fc79fd9a8a5a0ce687d10ba7.png"
}
