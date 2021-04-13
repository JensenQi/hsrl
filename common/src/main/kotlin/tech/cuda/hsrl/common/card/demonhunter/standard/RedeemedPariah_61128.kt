package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RedeemedPariah_61128 : Card() {
    override val id = 61128
    override val name = "获救的流民"
    override val description = "在你使用一张<b>流放</b>牌后，获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "稻草可以救命，树枝也可以。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/46effc2ad46010b74b0a095a584f8592d7308d362558ca96ea89ba5cb0425b77.png"
}
