package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronfurGrizzly_1182 : Card() {
    override val id = 1182
    override val name = "铁鬃灰熊"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“瘦死的棕熊比兽人大。”"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3561001b66aae6105101509d089b442ae1b62295f0eefd270fe3caed6cfee975.png"
}
