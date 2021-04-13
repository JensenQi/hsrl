package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RighteousProtector_69705 : Card() {
    override val id = 69705
    override val name = "正义保护者"
    override val description = "<b>嘲讽</b> <b>圣盾</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "本来想起名叫烈日保护者，但这里实在是太冷了。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8f357e6d44968d9723f554747e5c5297a62e3bcc57d9ab614dd5fd8d170ccab.png"
}
