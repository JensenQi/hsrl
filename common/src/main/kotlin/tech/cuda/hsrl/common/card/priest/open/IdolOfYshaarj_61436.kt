package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IdolOfYshaarj_61436 : Card() {
    override val id = 61436
    override val name = "亚煞极神像"
    override val description = "召唤一个你牌库中的随从的10/10复制。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "闭口无舌，能言七首；低语无声，回响不休。"
    override val artist = "Agatha Zhou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/96336dd926b84560fc7dcb87c306af737972d0e601bc51b77830dabbd829d5ee.png"
}
