package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronfurGrizzly_68386 : Card() {
    override val id = 68386
    override val name = "铁鬃灰熊"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“瘦死的棕熊比兽人大。”"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/73c01514bfcabc6846c69f27c68b994bab7b75c8081cbb461dd5a5e6de6bac11.png"
}
