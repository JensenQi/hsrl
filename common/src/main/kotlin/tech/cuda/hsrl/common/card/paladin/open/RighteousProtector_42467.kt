package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RighteousProtector_42467 : Card() {
    override val id = 42467
    override val name = "正义保护者"
    override val description = "<b>嘲讽</b> <b>圣盾</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "本来想起名叫烈日保护者，但这里实在是太冷了。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b360d9d054053f5eb37f0babaeb0d5024e6f345c356811fd85b96b8eedc5a9b.png"
}
